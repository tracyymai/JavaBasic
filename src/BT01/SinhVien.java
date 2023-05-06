package Tranmai.JavaBasic.Variables.BT01;

import java.sql.SQLOutput;

public class SinhVien {

    public static String ten = "Nguyen Van A";  //Bien static
    public void Name() {
        System.out.println("Ten : " + ten);
    }

    static int tuoi = 19;   //Bien instance
    public void Age() {

        System.out.println("Tuoi : " + tuoi);
    }

    public static void Industry() {
        String nganh = "IT";  //Bien local
        System.out.println("Nganh hoc : " + nganh);
    }


    public static void main(String[] args) {
        System.out.println("Ten : " + ten);
        System.out.println("Tuoi : " + tuoi);
        Industry();
        System.out.println("Lop : " + ThongTin.lop);
        System.out.println("STT : " + ThongTin.stt);
        System.out.println("Diem : " + ThongTin.diem);
    }
}
