
public class SpreyRobot implements Komut {

    @Override
    public String emirGir() {
        return "Hat uzerindeki urunler spreyleniyor!";
    }

    @Override
    public String sensorOku() {
        return "Hat uzerinde sprey asamasinda urun tarandi";
    }

    @Override
    public String kesmeSinyali() {
        return "Sprey ani kesme ile duraklatildi";
    }

    @Override
    public String guvenliKapat() {
        return "Sprey hat uzerini kontrol ettikten sonra guvenli sekilde kapatildi";
    }
    
}
