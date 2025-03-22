package com.ListaDeTareas;

public class Tarea {

    private int id;
    private String name;
    private String homework;
    private boolean complete;

    public Tarea(int id, String name, String homework, boolean complete) {
        this.id = id;
        this.name = name;
        this.homework = homework;
        this.complete = complete;
    }

    public Tarea(int id) {
        this.id = id;
        this.name = "No se guardó un nombre.";
        this.homework = "No se guardó la tarea a completar.";
        this.complete = false;
    }



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

    public String getHomework() {
        return homework;
    }

    public void setHomework(String homework) {
        this.homework = homework;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
