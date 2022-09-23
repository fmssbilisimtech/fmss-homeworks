package JavaCourse.Week3.Exercises.list;

public class OneDimensionalArrays {
 /*   public static void main(String[] args) {
        double[] list=new double[5];
        list[0]=2;
        System.out.println(list[0]);

    }*/

    public static void main(String[] args) {
        int [][] matris =new int[3][4];
 //       System.out.println(matris.length);
 //       System.out.println(matris[0].length);

        int number=1;
        for (int i=0;i<matris.length;i++){
            for (int j=0;j<matris[i].length;j++){
                matris[i][j]=number++;
            }
        }

        for (int i=0;i<matris.length;i++){
            for (int j=0; j<matris[i].length;j++){
                System.out.println(matris[i][j] + " ");
            }
            System.out.println();
        }

    }
}
