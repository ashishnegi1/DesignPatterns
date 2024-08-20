package StructuralPattern.DecoratorPattern;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    private void setRedBorder(){
        System.out.println("Border Color: Red");
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder();
    }
}
