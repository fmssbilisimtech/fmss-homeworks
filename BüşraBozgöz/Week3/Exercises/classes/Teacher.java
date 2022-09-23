package JavaCourse.Week3.Exercises.classes;

public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name,String mpno, String branch){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;

    }
    void print(){
        System.out.println("name:"+name);
        System.out.println("mpno:"+mpno);
        System.out.println("branch:" +branch);
    }
}
