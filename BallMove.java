package com.haha.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author hhm
 * @version 1.0
 * 演示小球通过键盘控制上下左右的移动->讲解JAVA的事件控制
 */
public class BallMove extends JFrame{//窗口
    MyPanel mp=null;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();


    }

    //构造器
    public BallMove(){
        mp=new MyPanel();
        this.add(mp);//把面板加到窗口里
        this.setSize(400,300);
        //窗口JFrame对象可以监听键盘事件，即可以监听到面板上发生的键盘事件
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}

//面板，可以画出小球
//KeyListener是监听器，可以监听键盘事件
class MyPanel extends JPanel implements KeyListener {//Alt+Enter
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(10,10,20,20);//默认黑色
    }

    //有字符输出时，该方法就会触发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //当某个键按下，该方法会触发
    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println((char)e.getKeyCode()+"被按下");

        //根据用户按下的不同键，来处理小球的移动
    }

    //当某个键释放（松开），该方法会触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
