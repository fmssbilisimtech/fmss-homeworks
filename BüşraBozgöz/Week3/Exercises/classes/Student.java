package JavaCourse.Week3.Exercises.classes;

import JavaCourse.Week3.Exercises.classes.Course;

public class Student {
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPasse;

    Course c1;
    Course c2;
    Course c3;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.avarage=0.0;
        this.isPasse=false;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;

    }

    void addBulkExamNote(int note1,int note2,int note3) {
        if(note1>=0 && note1<=100){
            this.c1.note=note1;
        }
        if(note2>=0 && note2<=100){
            this.c2.note=note2;
        }
        if (note3>=0 && note3<=100){
            this.c3.note=note3;
        }
    }


    void isPasse(){
        this.avarage=(this.c1.note+this.c2.note+this.c3.note)/3.0;
        if (this.avarage>35){
            System.out.println("YOU ARE PASSE THIS COURSE !!");

        }else{
            System.out.println("YOU ARE FAIL :) SAD BUT TRUE");
        }
        printNote();
    }
    void printNote(){
        System.out.println(c1.name +"\tnote:\t" +c1.note);
        System.out.println(c2.name+ "\tnote:\t"+c2.note);
        System.out.println(c3.name+ "\tnote:\t"+c3.note);
        System.out.println("Your's courses avarages is:" + this.avarage);
    }

}
