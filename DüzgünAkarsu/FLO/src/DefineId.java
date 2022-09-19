import java.util.*;

public class DefineId {

    public static Set<Integer> idList ;

    public static int getDefineCustomerId(){
        idList = new HashSet<>();
        int y =0;
        boolean isUnique =true;

            y = (int) (Math.random()* 99)+1;
            isUnique = idList.add(y);

            while(!isUnique){
                y = (int) (Math.random()* 99)+1;
                isUnique = idList.add(y);
            }

        return y;

    }

    public static int getDefineShoseId(){
        idList = new HashSet<>();
        int y =0;
        boolean isUnique =true;

        y = (int) (Math.random()* 99)+1;
        isUnique = idList.add(y);

        while(!isUnique){
            y = (int) (Math.random()* 99)+1;
            isUnique = idList.add(y);
        }

        return y;

    }
}
