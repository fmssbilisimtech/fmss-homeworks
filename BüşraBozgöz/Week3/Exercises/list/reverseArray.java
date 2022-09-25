package JavaCourse.Week3.Exercises.list;

public class reverseArray {
    static int[] reverse(int[] list){
        int[] reverse =new int[list.length];
        for (int i=0,j=list.length-1;i<list.length;i++,j--){
            reverse[i]=list[i];
        }
        return reverse;
    }
    static void printArray(int []arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        int[] list1={1,2,3,4,5};
        int[] newList=reverse(list1);
        printArray(newList);

    }
}
