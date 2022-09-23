package JavaCourse.Week3.Exercises.list;

public class forEach {
    public static void main(String[] args) {
        String[] arabalar = {"BMW", "Mercedes", "Ford", "Ferrari"};
        for (String i : arabalar) {
            System.out.println(i);
        }


// Çıktısı
// BMW
// Mercedes
// Ford
// Ferrari

        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int[] u : matris) {
            for (int elem : u) {
                System.out.println(elem);
            }
        }
    }





}
