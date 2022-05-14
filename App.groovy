class App {
    static void main(args) {
        Toyota toyota1 = new Toyota();
        toyota1.name = "Toyota";
        toyota1.model = 2020;
        toyota1.color = "blue";
        toyota1.topSpeed = 250;
        toyota1.startEngine();
        toyota1.topSpeed();
    }
}