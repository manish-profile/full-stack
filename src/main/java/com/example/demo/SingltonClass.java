package com.example.demo;

public class SingltonClass {

   public  static SingltonClass instans=new SingltonClass();

   private SingltonClass(){}

    public static  SingltonClass getInstance(){
       return instans;
    }
}
