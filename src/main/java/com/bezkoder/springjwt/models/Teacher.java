package com.bezkoder.springjwt.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "teacher")
public class Teacher {
    static  int ids=1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "First_Name",length = 45)
    private String firstname;
    @Column(name = "Last_Name",length = 45)
    private String lastname;
    @Column(name = "DOB",length = 20)
    private String dob;
    @Column(name = "Contact")
    private long contact;
    @Column(name = "Deptid")
    private int deptid;
    @Column(name = "Gender",length = 10)
    private String gender;
    @Column(name = "AdhaarNo",length = 12)
    private long adhaarNo;
    @Column(name = "PlaceOfBirth",length = 15)
    private String placeOfBirth;
    @Column(name = "Pan",length = 15)
    private String pan;
    @Column(name = "Grade",length = 2)
    private char grade;
    @Column(name = "Address",length = 100)
    private String address;

    public Teacher() {
    }

    public Teacher(String firstname, String lastname, String dob, long contact, int deptid, String gender, long adhaarNo, String placeOfBirth, String pan, char grade, String address) {
//        this.id=ids++;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.contact = contact;
        this.deptid = deptid;
        this.gender = gender;
        this.adhaarNo = adhaarNo;
        this.placeOfBirth = placeOfBirth;
        this.pan = pan;
        this.grade = grade;
        this.address = address;
    }

    public static int getIds() {
        return ids;
    }

    public static void setIds(int ids) {
        Teacher.ids = ids;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getAdhaarNo() {
        return adhaarNo;
    }

    public void setAdhaarNo(long adhaarNo) {
        this.adhaarNo = adhaarNo;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
