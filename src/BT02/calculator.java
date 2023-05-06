package Tranmai.JavaBasic.Variables.BT02;

public class calculator {
    public static int tinhTong(int a, int b) {
        return a + b;
    }
    public static float tinhTich(float a, float b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println(tinhTong(1,2));
        System.out.println(tinhTich(4,2));
    }
}
