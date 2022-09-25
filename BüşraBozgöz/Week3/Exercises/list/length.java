package JavaCourse.Week3.Exercises.list;

public class length {
    static void printArray(int []arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void printArray(double []arr){
        for (double v : arr) {
            System.out.println(v);
        }
    }
    public static void main(String[] args) {
        int [] list=new int[10];
        for(int i=1;i<list.length;i++){
            list[i]=i*10;
            printArray(list);
        }

        double [] list2=new double[10];
        printArray(list2);





    }




    // we can define lists like this
    //int [] list={1,2,3,4,5,6,7,8,9}
    //for(int i=0; i<list.length;i++){
    // system.out.printlin(list[i])}

    // we can assign arrays to some methods



}
