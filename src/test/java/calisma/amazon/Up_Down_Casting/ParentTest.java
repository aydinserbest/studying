package calisma.amazon.Up_Down_Casting;

public class ParentTest {
    public static void main(String[] args) {

        ChildA childA = new ChildA();
        childA.m1();
        childA.m2();
        childA.m3();

        ChildB childB = new ChildB();
        childB.m1();
        childB.m2();
        childB.m4();

        Parent parent1 = new ChildA();
        parent1.m1();

        Parent parent2 = new ChildB();
        parent2.m1();

        MyInterface interface1 = new ChildA();
        interface1.m2();

        MyInterface interface2 = new ChildB();
        interface2.m2();
        //interface2.m4();

    }
}

class Parent{

    public void m1(){

    }
}

interface MyInterface{

    public void m2();
}

class ChildA extends Parent implements MyInterface{

    @Override
    public void m2() {

    }

    public void m3(){

    }
}

class ChildB extends Parent implements MyInterface{

    @Override
    public void m2() {

    }

    public void m4(){

    }
}


