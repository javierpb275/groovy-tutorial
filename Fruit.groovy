class Fruit {
    private String name;
    private String color;

    def setName(String name) {
        this.name = name;
    }

    def setColor(String color) {
        this.color = color;
    }

    def getName() {
        println "Name of fruit: $name";
    }

    def getColor() {
        println "Color of fruit: $color";
    }
}