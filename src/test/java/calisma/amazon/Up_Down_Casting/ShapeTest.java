package calisma.amazon.Up_Down_Casting;

public class ShapeTest {
    public static void main(String[] args) {
         Shape shape1=new Shape();
         shape1.draw(); //parent taki metodu cagiracak

        //polymorphic object olusturalim
        Shape shape2=new Circle();//buna polymorphic create diyoruz
        shape2.draw(); //circle daki metodu yazar

        Shape shape3=new Square();
        shape3.draw();

        Shape shape4=new Triangle();
        shape4.draw();

        //childclassta override metod varsa olusturdugumuz obje uzerinden o clasin metodunu cagirir
        //override yoksa parent metodu cagirir
        //polymorphic te == sagi object classi
        //override metod child classindaki metodu cagirir, polymorphism buna ekstra bisey katmiyor

        //asagida ayni isimde object yi farkli classlardan creat ediyoruz
        //hangi metot cagirildigi kafa karisiklina yol acabilir

        Shape shape=new Shape();
        shape.draw();

        shape=new Circle();
        shape.draw();

        shape=new Triangle();
        shape.draw();

        shape=new Square();
        //burda sadece override metotlari kullanabiliyoruz, parent harici classa ait bir
        //metot olusmussa onu cagiramiyoruz
        //ana reference Shape hala

    }

}
