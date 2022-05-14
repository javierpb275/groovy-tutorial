abstract class Car {
    String name;
    String color;
    int model;

    def startEngine() {
        println "Engine started fro $name";
    }

    abstract def topSpeed();
}