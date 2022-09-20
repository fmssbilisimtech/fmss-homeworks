public class ChunLi implements fighter{
    public void lowKick() {
        System.out.println("ChunLi Low kick atti");
    }

    @Override
    public void normalKick() {
        System.out.println("ChunLi Normal kick atti");
    }

    @Override
    public void heavyKick() {

        System.out.println("ChunLi Heavy kick atti");
    }

    @Override
    public void lowPunch() {

        System.out.println("ChunLi Low punch atti");
    }

    @Override
    public void normalPunch() {
        System.out.println("ChunLi Normal Punch atti");
    }

    @Override
    public void heavyPunch() {
        System.out.println("ChunLi Heavy Punch  atti");
    }
}
