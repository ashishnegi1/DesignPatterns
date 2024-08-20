package StructuralPattern.DecoratorPattern;

public class Demo {
    public static void main(String[] args) {

        Shape circle = new Circle();
        circle.draw();

        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();

        Shape redSquare = new RedShapeDecorator(new Square());
        redSquare.draw();

    }
}
