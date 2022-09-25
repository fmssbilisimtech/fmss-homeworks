package JavaCourse.Week3.Exercises.classes;

public class main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Busra","05370140702","Math");
        Teacher t2=new Teacher("Leman","1234","Literatur");
        Teacher t3= new Teacher("Serap","234","topo");

        Course mathematic=new Course("mathematics","209","Math");
        mathematic.addTeacher(t1);

        Course literatur= new Course("literatur","23","Literatur");
        literatur.addTeacher(t2);

        Course topollogy= new Course("topology","34","topo");
        topollogy.addTeacher(t3);


        Student s1=   new Student("Fahri","632","4",mathematic ,literatur,topollogy);
        s1.addBulkExamNote(75,100,26);
        s1.isPasse();

        Student s2= new Student("busra","17504242","4",mathematic,literatur,topollogy);
        s1.addBulkExamNote(100,100,100);
        s2.isPasse();


    }
}
