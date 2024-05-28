package com.bezkoder.springjwt.payload.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class SectionRequest {
    @NotBlank
    @Size(max = 30)
    private String classname;
//    @NotBlank
//    @Size(max = 40)
    private String teachername;
//    @NotBlank
//    @Size(max = 30)
    private  int year;

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
