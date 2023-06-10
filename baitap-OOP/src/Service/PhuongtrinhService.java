package Service;

import Modal.Phuongtrinhx2;

public class PhuongtrinhService {
    private Phuongtrinhx2 phuongtrinh = new Phuongtrinhx2();

    public double getDelta(int a, int b, int c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getR1(int a, int b, int c) {
        return (-b + Math.sqrt(getDelta(a, b, c))) / 2 * a;
    }

    public double getR2(int a, int b, int c) {
        return (-b - Math.sqrt(getDelta(a, b, c))) / 2 * a;
    }
}
