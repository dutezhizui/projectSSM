package com.seed.designPattern.templatePattern;

/**
 * Created by OL on 2017/4/25.
 */
public class Client {
    public static void main(String args[]){
        Student student=new Student();
        student.prepareGoSchool();
        Teacher teacher=new Teacher();
        teacher.prepareGoSchool();
    }
}
