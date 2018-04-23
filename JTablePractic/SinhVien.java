package gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maihoa
 */
public class SinhVien {
    private String MSSV;
    private String name;
    private String year;
    private String course;
    
    public SinhVien(){}
    public SinhVien(String MSSV, String Name, String Year, String Course)
    {
        this.MSSV = MSSV;
        this.name = Name;
        this.year = Year;
        this.course = Course;
    }
    public void setMSSV(String MSSV)
    {
        this.MSSV = MSSV;
    }
    public void setName(String Name)
    {
        this.name = Name;
    }
    public void setYear(String Year)
    {
        this.year = Year;
    }
    public void setCourse(String Course)
    {
        this.course = Course;
    }
    
    public String getMSSV()
    {
        return this.MSSV;
    }
    public String getName()
    {
        return this.name;
    }
    public String getYear()
    {
        return this.year;
    }
    public String getCourse()
    {
        return this.course;
    }
   
}
