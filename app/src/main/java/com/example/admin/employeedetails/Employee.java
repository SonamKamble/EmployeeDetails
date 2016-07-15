package com.example.admin.employeedetails;

import android.graphics.Bitmap;

/**
 * Created by ADMIN on 13/07/2016.
 */
public class Employee {
    private Bitmap bmp;
    private String name;
    private int age;

    public Employee(Bitmap b, String n, int k) {
        bmp = b;
        name = n;
        age = k;
    }

    public Bitmap getBitmap() {
        return bmp;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
