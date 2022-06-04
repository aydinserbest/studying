package calisma.amazon.Up_Down_Casting;

public class Mac extends AppleDevice{
    //parent in abstractini kullanmassak override ile hata verir uyarir
    @Override
    public void user() {
        System.out.println("mac play");

    }
    public void code(){
        System.out.println("mac is coding");
    }
}
