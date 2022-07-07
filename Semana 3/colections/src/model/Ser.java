package model;

import java.util.ArrayList;

public class Ser {
    private String name;
    private ArrayList<Organ> organs;

    public Ser(String name) {
        this.name = name;
        organs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addOrgan(Organ organ ){
        organs.add( organ );
    }

    public ArrayList<Organ> getOrgans() {
        return (ArrayList<Organ>) organs.clone();
    }

    @Override
    public String toString() {
        return "Ser{" +
                "name='" + name + '\'' +
                ", organs=" + organs +
                '}';
    }

    public class Organ{
        private String name;
        private String function;

        public Organ(String name, String function) {
            this.name = name;
            this.function = function;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFunction() {
            return function;
        }

        public void setFunction(String function) {
            this.function = function;
        }

        @Override
        public String toString() {
            return "Organ{" +
                    "name='" + name + '\'' +
                    ", function='" + function + '\'' +
                    '}';
        }
    }
}


