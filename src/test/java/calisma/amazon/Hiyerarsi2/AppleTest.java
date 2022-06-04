package calisma.amazon.Hiyerarsi2;

public class AppleTest {
    public static void main(String[] args) {
        AppleDevice mac=new Mac();
        mac.user(); //mac classindaki user metodunu cagirir
        //cunku override edilmis
        //objectin kayit edildigi classtaki metodu cagirdi

        //mac.code  cagiramiyoruz reference type i farkli
        //overridde sorun yapmadi
        //ama polymorphic sekilde object create ediyorsak belirleyici olan
        //reference type olan parent classin metotlari
        //polymorphic kayit etmeseydik normal kayit etmis olsaydik
        //hata vermezdi

        Mac user2=new Mac();
        user2.code();
        //ulasabildik
        //override haric durumlarda polymorphic te kendi class metoduna ulasamiyoruz
    }
}
