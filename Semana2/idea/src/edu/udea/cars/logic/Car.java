package edu.udea.cars.logic;

public class Car {

    private String plate;
    private String tradeMark;
    private short model;
    private short speed;
    private boolean state;
    public static final short LIMIT_SPEED = 200;

    public Car(String plate, String tradeMark, short model) {
        this.plate = plate;
        this.tradeMark = tradeMark;
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public short getModel() {
        return model;
    }

    public void setModel(short model) {
        this.model = model;
    }

    public short getSpeed() {
        return speed;
    }

    public boolean isState() {
        return state;
    }

    public boolean start(){
        state = !state ? true : state;

        return state;
    }

    public boolean shutdown(){
        if( state ){
            state = false;
        }

        return state;
    }

    public short speedUp(short speed){

        this.speed += speed;

        if( this.speed > LIMIT_SPEED ){
            this.speed = LIMIT_SPEED;
        }

        return this.speed;
    }

    public short breaking(){
        speed *= 0.8;

        return speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "plate='" + plate + '\'' +
                ", tradeMark='" + tradeMark + '\'' +
                ", model=" + model +
                ", speed=" + speed +
                ", state=" + state +
                '}';
    }
}
