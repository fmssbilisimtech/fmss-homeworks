package backend.thirdweek;

public class TekrarYap {
    private static int counter = 0;

    private static TekrarYap instance;

    private TekrarYap(){
        ++counter;
        System.out.println(counter);
    }

    public static TekrarYap getInstance(){
        //Lazy implementation
        if(instance == null)
            instance = new TekrarYap();

        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(){
                @Override
                public void run() {
                    TekrarYap.getInstance();
                }
            }.start();
        }
    }
}

