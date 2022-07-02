package model;

import java.util.ArrayList;

public class Management <T>{
    private ArrayList<T> objects;

    public Management() {
        objects = new ArrayList<>();
    }

    public T findObject( T object ){


        return object;
    }

    public boolean addObject( T object ){

        return false;
    }

    public ArrayList<T> getObjects(){

        return (ArrayList<T>) objects.clone();
    }
}
