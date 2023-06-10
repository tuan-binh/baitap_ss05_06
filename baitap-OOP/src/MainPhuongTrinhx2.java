import Config.ConfigScanner;
import Controller.Controller;
import Modal.Phuongtrinhx2;

public class MainPhuongTrinhx2 {
    static Controller controller = new Controller();

    public static void main(String[] args) {
        System.out.print("Nhập vào a: ");
        int a = ConfigScanner.scanner().nextInt();
        System.out.print("Nhập vào b: ");
        int b = ConfigScanner.scanner().nextInt();
        System.out.print("Nhập vào c: ");
        int c = ConfigScanner.scanner().nextInt();


        if (controller.getDelta(a, b, c) < 0) {
            System.out.println("Phương trình vô nghiệm :((");
        } else {
            System.out.println("Delta = " + controller.getDelta(a, b, c));
            System.out.println("Nghiệm 1 = " + controller.getR1(a, b, c));
            System.out.println("Nghiệm 2 = " + controller.getR2(a, b, c));
        }
    }
}
