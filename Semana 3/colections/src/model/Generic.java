package model;

public class Generic <T>{
    private T info;

    public Generic(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public String getType(){
        return info.getClass().getTypeName();
    }
}
