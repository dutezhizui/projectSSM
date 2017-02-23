package com.seed.testThread;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by OL on 2017/2/21.
 */
public class TestReflect {
    public static void main(String[] args){
        try{
            String str1="abc";
            Class cls1=str1.getClass();
            Class cls2=String.class;
            Class cls3=Class.forName("com.seed.testThread.TestReflect");
            Method method=cls3.getMethod("ceshi");
            method.invoke(cls3.newInstance());
            System.err.println(cls3.newInstance().getClass().getClassLoader().getParent().getParent());

        }catch(Exception e){

        }

    }

    public void ceshi(){
        System.err.println("Reflect test!");
    }
}
