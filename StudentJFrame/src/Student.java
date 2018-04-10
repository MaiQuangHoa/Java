/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maihoa
 */
public class Student {
    String hoTen, namSinh;
    boolean gioiTinh;

    public Student() {    }
    public Student(String HoTen, String NamSinh, boolean GioiTinh)
    {
        this.hoTen = HoTen;
        this.namSinh = NamSinh;
        this.gioiTinh = GioiTinh;
    }
    public String toString(int i)
    {
        String s = Integer.toString(i)+"---"+ hoTen +"---" +namSinh+"---";
        if(gioiTinh == true)
            s+="Nam\n";
        else
            s+="Nu\n";
        return s;
    }
}
