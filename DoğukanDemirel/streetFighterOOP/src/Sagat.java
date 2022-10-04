public class Sagat implements fighter{
    public void lowKick() {
        System.out.println("Sagat Low kick atti");
    }

    @Override
    public void normalKick() {
        System.out.println("Sagat Normal kick atti");
    }

    @Override
    public void heavyKick() {

        System.out.println("Sagat Heavy kick atti");
    }

    @Override
    public void lowPunch() {

        System.out.println("Sagat Low punch atti");
    }

    @Override
    public void normalPunch() {
        System.out.println("Sagat Normal Punch atti");
    }

    @Override
    public void heavyPunch() {
        System.out.println("Sagat Heavy Punch  atti");
    }
}

