package backend.thirdweek;

public class BillPugh {
    private BillPugh(){}

    public static class SingletonHelper{
        private final static BillPugh instance = new BillPugh();
    }

    public static BillPugh getInstance(){
        return SingletonHelper.instance;
    }

    public static void main(String[] args) {
        BillPugh instance1 = BillPugh.getInstance();

        BillPugh instance2 = BillPugh.getInstance();

        System.out.println(instance1 == instance2);
    }
}
