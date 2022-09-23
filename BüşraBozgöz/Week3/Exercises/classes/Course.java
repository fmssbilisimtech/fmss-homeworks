package JavaCourse.Week3.Exercises.classes;

public class Course {
    String name;
    String code;
    String prefix;
    int note;

    Teacher teacher;
    Course(String name, String code, String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note=0;
    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
            printTeacher();
        }else {
            System.out.println("The teacher is not suitable for the course");
        }
    }
    void printTeacher(){
        this.teacher.print();
    }
}
