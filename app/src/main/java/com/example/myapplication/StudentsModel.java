package com.example.myapplication;

import java.io.Serializable;

public class StudentsModel implements Serializable {
    private String name;
    private String nim;
    private String email;
    private String phone;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public String getNim() {
        return nim;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
