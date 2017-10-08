package com.watermelondc.app.objects;

import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDate;

    /*
    Класс заметок: создание полей заметок, гетеров/сетеров
    */

public class Note {

    private SimpleStringProperty name = new SimpleStringProperty("");
    private SimpleStringProperty task = new SimpleStringProperty("");
    private SimpleStringProperty strDate = new SimpleStringProperty("");

    private LocalDate localDate;

    public Note(){

    }

    public Note(String name, String task) {
        this.name = new SimpleStringProperty(name);
        this.task = new SimpleStringProperty(task);
        this.strDate = new SimpleStringProperty((localDate = LocalDate.now()).toString());
    }

    public Note(String name, String task, LocalDate localDate) {
        this.name = new SimpleStringProperty(name);
        this.task = new SimpleStringProperty(task);
        this.localDate = localDate;
        this.strDate = new SimpleStringProperty((this.localDate = LocalDate.now()).toString());
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getTask() {
        return task.get();
    }

    public void setTask(String task) {
        this.task.set(task);
    }


    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getStrDate() {
        return strDate.get();
    }

    public void setStrDate(LocalDate localDate) {
        this.strDate.set(localDate.toString());
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public SimpleStringProperty taskProperty() {
        return task;
    }

    @Override
    public String toString() {
        return "Note ("+
                "Name = "+name+"\'"+
                ", Task = "+ task+"\'"+
                ")";
    }
}
