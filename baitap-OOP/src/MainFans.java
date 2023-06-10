import Modal.Fans;

public class MainFans {
    public static void main(String[] args) {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;

        Fans fan1 = new Fans(FAST,true,10,"yellow");
        Fans fan2 = new Fans(MEDIUM,false,5,"blue");

        System.out.println("Quạt 1: " + fan1);
        System.out.println("Quạt 2: " + fan2);
    }
}
