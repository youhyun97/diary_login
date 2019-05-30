package com.androidtutorialshub.loginregister.model;

public class User {

    private int id;
    private String name;
    private String email;
    private String password;
    private String todo1;
    private String todo2;
    private String todo3;
    private String todo4;
    private String todo5;
    private String diary;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getTodo1() {return todo1;}
    public void setTodo1(String todo1) {
        this.todo1=todo1;
    }

    public String getTodo2() {return todo2;}
    public void setTodo2(String todo2) {
        this.todo2=todo2;
    }

    public String getTodo3() {return todo3;}
    public void setTodo3(String todo3) {
        this.todo3=todo3;
    }

    public String getTodo4() {return todo4;}
    public void setTodo4(String todo4) {
        this.todo4=todo4;
    }

    public String getTodo5() {return todo5;}
    public void setTodo5(String todo5) {
        this.todo5=todo5;
    }

    public String getDiary() {return diary;}
    public void setDiary(String diary) {
        this.diary=diary;
    }

}
