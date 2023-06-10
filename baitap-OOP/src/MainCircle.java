import Config.ConfigScanner;
import Controller.Controller;

public class MainCircle {
    static Controller controller = new Controller();

    public static void main(String[] args) {
        int choose;
        while (true) {
            System.out.println(">>================<< MENU >>================<<");
            System.out.println("1. Tính diện tích");
            System.out.println("2. Tính chu vi");
            System.out.println("3. Thoát");
            System.out.print("Mời bạn lựa chọn: ");
            choose = ConfigScanner.scanner().nextInt();
            switch (choose) {
                case 1:
//                    tính diện tích
                    handleGetAria();
                    break;
                case 2:
//                    tính chu vi
                    handleGetPerimeter();
                    break;
                case 3:
//                    Thoát chương trình
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Mời bạn lựa chọn lại 1 -> 3");
            }
        }
    }

    public static void handleGetAria() {
        System.out.print("Mời bạn nhập vào bán kính đường tròn: ");
        double r = ConfigScanner.scanner().nextDouble();
        double result = controller.getAria(r);
        System.out.println("Diện tích đường tròn là: " + result);
    }

    public static void handleGetPerimeter() {
        System.out.print("Mời bạn nhập vào bán kính đường tròn: ");
        double r = ConfigScanner.scanner().nextDouble();
        double result = controller.getPerimeter(r);
        System.out.println("Chu vi đường tròn là: " + result);
    }
}
