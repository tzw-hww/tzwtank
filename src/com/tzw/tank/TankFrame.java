package com.tzw.tank;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {

    Dir dir;

    int x = 200,y=200;

    public TankFrame() throws HeadlessException {

        //设置窗口大小
        this.setSize(800,600);
        //不改变大小
        this.setResizable(false);
        //标题文字
        this.setTitle("tzw tank");
        //显示出来
        this.setVisible(true);
        //监听window 匿名内部类
        this.addWindowListener(new WindowAdapter() {
            //触发windows事件
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.addKeyListener(new MyKeyListener());
    }

    /**
     * 重写该方法，g为画笔
     * 该方法会自动调用，在屏幕最大化最小化的时候会自动调用。
     * 每次清屏，然后被调用
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        g.fillRect(x,y,50,50);

        switch(dir){
            case UP:
                y-=10;
                break;
            case DOWN:
                y+=10;
                break;
            case LEFT:
                x-=10;
                break;
            case RIGHT:
                x+=10;
                break;
            case UPANDRIGHT:
                y-=10;
                x+=10;
                break;
            case UPANDLEFT:
                y-=10;
                x-=10;
                break;
            case DOWNANDLEFT:
                y+=10;
                x-=10;
                break;
            case DOWNANDRIGHT:
                y+=10;
                x+=10;
                break;
            default:
                break;
        }



    }

    class MyKeyListener extends KeyAdapter{

        boolean BU = false;
        boolean BD = false;
        boolean BL = false;
        boolean BR = false;


        //根据keyCode指定键位
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode){
                case KeyEvent.VK_LEFT:
                    BL=true;
                    break;
                case KeyEvent.VK_RIGHT:
                    BR=true;
                    break;
                case KeyEvent.VK_UP:
                    BU=true;
                    break;
                case KeyEvent.VK_DOWN:
                    BD=true;
                    break;
                default:
                    break;
            }

            setTankdir();

        }

        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode){
                case KeyEvent.VK_LEFT:
                    BL=false;
                    break;
                case KeyEvent.VK_RIGHT:
                    BR=false;
                    break;
                case KeyEvent.VK_UP:
                    BU=false;
                    break;
                case KeyEvent.VK_DOWN:
                    BD=false;
                    break;
                default:
                    break;
            }
            setTankdir();
        }


        public void setTankdir(){
            if(BU){
                dir = Dir.UP;
            }
            if(BD){
                dir = Dir.DOWN;
            }
            if(BL){
                dir = Dir.LEFT;
            }
            if(BR){
                dir = Dir.RIGHT;
            }
            if(BU&&BL){
                dir = Dir.UPANDLEFT;
            }
            if(BU&&BR){
                dir = Dir.UPANDRIGHT;
            }
            if(BD&&BL){
                dir = Dir.DOWNANDLEFT;
            }
            if(BD&&BR){
                dir = Dir.DOWNANDRIGHT;
            }
        }


    }



    public void setDir(Dir dir){
        this.dir=dir;
    }

}
