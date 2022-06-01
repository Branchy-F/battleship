package com.javaseminar.battleship.model;

public class Feld {
    private int id;
    private Status status;

    public Feld(int id) {
        this.id = id;
        this.status = Status.LEER;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return id + "-" + status;
    }
}

