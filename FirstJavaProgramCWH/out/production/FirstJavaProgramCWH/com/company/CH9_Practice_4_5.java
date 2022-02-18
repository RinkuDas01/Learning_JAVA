package com.company;

import java.awt.*;

class rectangle{
    private int width;
    private int height;

    public rectangle(int width, int height) {
        this.width = 4;
        this.height = 5;
    }

}
public class CH9_Practice_4_5 {
    public static void main(String[] args) {
        Rectangle myRectangle=new Rectangle(4,5);
        System.out.println(myRectangle.getWidth());
        System.out.println(myRectangle.getHeight());
    }
}
