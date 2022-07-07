package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class Management <T>{
    private ArrayList<T> objects;
    private Comparator<T> comparator;

    public Management(Comparator<T> comparator) {

        objects = new ArrayList<>();
        this.comparator = comparator;
    }

    public T findObject( T object ){

        Optional<T> optional = objects.stream()
                .filter( element -> comparator.compare( element,object) == 0 )
                .findAny();

        return optional.isPresent() ? optional.get() : null;


       /* for ( T element : objects ){
            if ( comparator.compare( object, element) == 0 ){

                return element;
            }
        }

        return null; */
    }

    public boolean addObject( T object ){

        if( findObject( object ) == null ){
            objects.add( object );

            return true;
        }

        return false;
    }

    public ArrayList<T> getObjects(){

        return (ArrayList<T>) objects.clone();
    }

    public T deleteObject( T object ){
        T element = findObject( object );
        if( element != null ){
            objects.remove( element );

            return element;
        }

        return null;
    }

    public boolean updateObject( T object ){

        T element = findObject( object );
        if( element != null){
            int pos = objects.indexOf( element );
            objects.set( pos, object );

            return true;
        }

        return false;
    }
}
