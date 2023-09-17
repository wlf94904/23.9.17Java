package com.haha.tankgame;

import javax.swing.*;
import java.awt.*;

/**
 * @author hhm
 * @version 1.0
 * 坦克大战的绘图区域
 */
public class MyPanel extends JPanel {
    //定义我的坦克
    Hero hero=null;
    public MyPanel(){
        hero=new Hero(100,100);//初始化自己坦克

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//填充矩形，默认黑色

        //画出坦克-封装方法
        drawTank(hero.getX(),hero.getY(),g,0,0);



    }
    //编写方法，画出坦克
    //x坦克左上角x坐标，y：坦克左上角y坐标，g：画笔，direct:方向（上下左右），type：坦克的类型
    public void drawTank(int x,int y,Graphics g,int direct,int type){
        //根据不同类型坦克，设置不同颜色
        switch(type){
            case 0://我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1://敌人的坦克
                g.setColor(Color.yellow);
                break;

        }

        //根据坦克方向，来绘制坦克
        switch(direct){
            case 0://向上
                g.fill3DRect(x,y,10,60,false);//画出坦克左边的轮子
                g.fill3DRect(x+30,y,10,60,false);//画出坦克右边的轮子
                g.fill3DRect(x+10,y+10,20,40,false);//画出坦克中间的盖子
                g.fillOval(x+10,y+20,20,20);//画出圆形盖子
                g.drawLine(x+20,y+30,x+20,y);//画出炮筒

                break;
            default:
                System.out.println("暂时没有处理");
        }

    }
}
