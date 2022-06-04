package calisma.amazon.Up_Down_Casting;

public class InstanceOf {
    public static void main(String[] args) {
        Shape shape=new Circle();
        if (shape instanceof Square){
            System.out.println("belongs to square class");
        }else if (shape instanceof Triangle){
            System.out.println("belongs to Triangle");
        }else if (shape instanceof Circle){
            System.out.println("belongss to Circle class");
        }

    }
}
