import Calculator.Calculator;
import OOP.Category;
import OOP.Product;
import OOP.Rectangle;
import OOP.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Khởi tạo đỗi tượng :
////        System.out.println(s.getName());
////        System.out.println(s.getAge());
////        System.out.println(s.getMsv());
//        System.out.println(s);
        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập a: ");
//        double a = Double.parseDouble(sc.nextLine());
//        System.out.print("Nhập b: ");
//        double b = Double.parseDouble(sc.nextLine());
//        Calculator cal = new Calculator(a,b);
//        System.out.println("Tổng 2 số là: " + cal.add());
//        System.out.println("Hiệu 2 số là: " + cal.sub());
//        System.out.println("Tích 2 số là: " + cal.multi());
//        System.out.println("Thương 2 số là: " + cal.div());

//        System.out.print("Nhập vào số lượng hàng: ");
//        int n = Integer.parseInt(sc.nextLine());
//        Product[] listProducts = new Product[n];
//        Category category = new Category(1,"Jean");
//        for (int i = 0; i < listProducts.length; i++) {
//            System.out.print("Nhập vào id sản phẩm: ");
//            int id = Integer.parseInt(sc.nextLine());
//            System.out.print("Nhập vào tên sản phẩm: ");
//            String name = sc.nextLine();
//            System.out.print("Nhập vào giá sản phẩm: ");
//            double price = Double.parseDouble(sc.nextLine());
//            listProducts[i] = new Product(id,name,price,category);
//        }
//
//        for (int i = 0; i < listProducts.length; i++) {
//            listProducts[i].display();
//        }

//        System.out.print("Nhập vào số lượng sinh viên: ");
//        int n = Integer.parseInt(sc.nextLine());
//        Student[] listStudent = new Student[n];
//
//        for (int i = 0; i < listStudent.length; i++) {
//            System.out.print("Nhập vào ID sinh viên: ");
//            int id = Integer.parseInt(sc.nextLine());
//            System.out.print("Nhập vào tên sinh viên: ");
//            String name = sc.nextLine();
//            System.out.print("Nhập vào giới tinh của sinh viên: ");
//            boolean sex = sc.nextBoolean();
//            sc.nextLine();
//            System.out.print("Nhập vào tên lớp sinh viên: ");
//            String className = sc.nextLine();
//            System.out.print("Nhập vào tuổi của sinh viên: ");
//            int age = Integer.parseInt(sc.nextLine());
//            System.out.print("Nhập vào địa chỉ của sinh viên: ");
//            String address = sc.nextLine();
//            listStudent[i] = new Student(id,name,sex,className,age,address);
//        }
//
//        for (int i = 0; i < listStudent.length; i++) {
//            System.out.println(">--------------------------------<");
//            System.out.println(listStudent[i]);
//            System.out.println(">--------------------------------<");
//        }

        System.out.print("Nhập vào chiều dài: ");
        double width = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập vào chiều rộng: ");
        double height = Double.parseDouble(sc.nextLine());

        Rectangle rec = new Rectangle(width,height);
        System.out.println(rec);
        System.out.println("Aria: " + rec.getAria());
        System.out.println("Perimeter: : " + rec.getPerimeter());
    }
}
