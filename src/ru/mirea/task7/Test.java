package ru.mirea.task7;

public class Test
{
    public static void main(String[] args)
    {
//        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
//        System.out.println(s1); // which version?
//        System.out.println(s1.getArea()); // which version?
//        System.out.println(s1.getPerimeter()); // which version?
//        System.out.println(s1.getColor());
//        System.out.println(s1.isFilled());
//        //System.out.println(s1.getRadius()); Cannot resolve method 'getRadius' in 'Shape'
//        //мы создаём объект абстрактного класса Shape, но он не имеет метода getRadius()
//        Circle c1 = (Circle)s1; // Downcast back to Circle
//        System.out.println(c1);
//        System.out.println(c1.getArea());
//        System.out.println(c1.getPerimeter());
//        System.out.println(c1.getColor());
//        System.out.println(c1.isFilled());
//        System.out.println(c1.getRadius());
//        //Shape s2 = new Shape(); так как Shape- абстрактный класс, мы не можем создавать напрямую его объекты
//        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
//        System.out.println(s3);
//        System.out.println(s3.getArea());
//        System.out.println(s3.getPerimeter());
//        System.out.println(s3.getColor());
//        //System.out.println(s3.getLength()); Cannot resolve method 'getLength' in 'Shape
//        Rectangle r1 = (Rectangle)s3; // downcast
//        System.out.println(r1);
//        System.out.println(r1.getArea());
//        System.out.println(r1.getColor());
//        System.out.println(r1.getLength());
//        Shape s4 = new Square(6.6); // Upcast
//        System.out.println(s4);
//        System.out.println(s4.getArea());
//        System.out.println(s4.getColor());
//        //System.out.println(s4.getSide()); Cannot resolve method 'getSide' in 'Shape'
//        // Take note that we downcast Shape s4 to Rectangle,
//// which is a superclass of Square, instead of Square
//        Rectangle r2 = (Rectangle)s4;
//        System.out.println(r2);
//        System.out.println(r2.getArea());
//        System.out.println(r2.getColor());
//        //System.out.println(r2.getSide()); Cannot resolve method 'getSide' in 'Rectangle'
//        System.out.println(r2.getLength());
//// Downcast Rectangle r2 to Square
//        Square sq1 = (Square)r2;
//        System.out.println(sq1);
//        System.out.println(sq1.getArea());
//        System.out.println(sq1.getColor());
//        System.out.println(sq1.getSide());
//        System.out.println(sq1.getLength());

//        MovableCircle g =  new MovableCircle(0,0,2,2);
//        g.moveDown();
//        g.moveLeft();
//        g.moveRight();
//        g.moveRight();
//
//        System.out.println(g.toString());
//
//        MovablePoint d = new MovablePoint(0,0,1,1);
//        d.moveDown();d.moveUp();
//        System.out.println(d);


        MovableRectangle foo = new MovableRectangle(-3,2,3,-2,2,2);

        foo.moveUp();

        System.out.println(foo);

    }
}
