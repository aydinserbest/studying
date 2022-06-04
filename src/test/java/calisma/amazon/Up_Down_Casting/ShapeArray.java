package calisma.amazon.Up_Down_Casting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeArray {
    public static void main(String[] args) {


        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle();
        shapes[1]=new Square();
        shapes[2]=new Circle();

        for (Shape sh:shapes){
            System.out.println(sh.getClass().getName());
            sh.draw();
        }
        //arraylisti de polymorphic kaydedelim
        List<Shape> shapeList=new ArrayList<>();
        //polymorphic olusturduk
        //Shape kismi normalde wrapper classtandi integer filan
        //list yazan arraylist in parent i

        //olusturdugumuz listeye new keywordu ile object ekliyoruz
        shapeList.add(new Circle());
        shapeList.add(new Triangle());
        shapeList.add(new Square());


        //yazdiralim

        for (Shape sl: shapeList){
            System.out.println(sl.getClass().getSimpleName());
            sl.draw();
        }
        //ekleme baska yolu
        System.out.println(shapeList.addAll(Arrays.asList(shapes)));


    }
}
