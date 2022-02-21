package com.company;

class cylinder{
        private int radius;
        private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
        public double surfaceArea(){
            return (2* Math.PI*radius*radius)+(2* Math.PI*radius*height);
        }
        public double volume(){
            return (Math.PI*radius*radius*height);
        }
    }
    public class CH9_Practice {
        public static void main(String[] args) {
            //Problem-1,2,3
            cylinder myCylinder=new cylinder(12,9);
            //myCylinder.setHeight(12);
            System.out.println(myCylinder.getHeight());
            //myCylinder.setRadius(9);
            System.out.println(myCylinder.getRadius());

            System.out.println(myCylinder.surfaceArea());
            System.out.println(myCylinder.volume());



        }
    }

