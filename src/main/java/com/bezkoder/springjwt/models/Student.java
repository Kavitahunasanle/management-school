package com.bezkoder.springjwt.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "students")
public class Student {
    static  int ids=1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "First_Name",length = 45)
    private String firstname;
    @Column(name = "Last_Name",length = 45)
    private String lastname;
    @Column(name = "Father_Name",length = 45)
    private String fathername;
    @Column(name = "Mother_Name",length = 45)
    private String mothername;
    @Column(name = "Email",length = 45)
    private String email;
    @Column(name = "DOB", length = 15)
    private String dob;
    @Column(name = "Contact",length = 10)
    private String contact;
    @Column(name = "Religion",length = 45)
    private String religion;
    @Column(name = "Caste",length = 45)
    private String caste;
    @Column(name = "Gender",length = 10)
    private String gender;
    @Column(name = "AdhaarNo")
    private long adhaarNo;
    @Column(name = "Address",length = 100)
    private String address;
    @Column(name = "Satsid",length = 100)
    private String satsid;
    @Column(name = "School",length = 100)
    private String school;
    @Column(name = "Section",length = 100)
    private String section;


    public Student(){

    }

    public Student(String firstname, String lastname, String fathername, String mothername, String email, String dob, String contact, String religion, String caste, String gender, long adhaarNo, String address, String satsid, String school, String section) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.fathername = fathername;
        this.mothername = mothername;
        this.email = email;
        this.dob = dob;
        this.contact = contact;
        this.religion = religion;
        this.caste = caste;
        this.gender = gender;
        this.adhaarNo = adhaarNo;
        this.address = address;
        this.satsid = satsid;
        this.school = school;
        this.section = section;
    }

    public int getId() {
        return id;
    }

    public void setId(int id)  {
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

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getMothername() {
        return mothername;
    }

    public void setMothername(String mothername) {
        this.mothername = mothername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSatsid() {
        return satsid;
    }

    public void setSatsid(String satsid) {
        this.satsid = satsid;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Id: "+ this.id+"\nFirst Name: "+ this.firstname + "\nLast Name: "+this.lastname+"\nFather Name: "+this.fathername+"\nMother Name: "+this.mothername+"\nEmail: "+this.email+"\nDOB: "+this.dob+"\nContact: "+this.contact+"\nReligion: "
                +this.religion+"\nCaste: "+this.caste+"\nGender: "+this.gender+"\nAdhaar Number: "+this.adhaarNo+"\nAddress: "+this.address+"\nSatsId: "+this.satsid+"\nSchool: "+this.school+"\nSection: "+this.section;
    }
}
