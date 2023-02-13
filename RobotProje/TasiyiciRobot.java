
public class TasiyiciRobot implements Komut {
    
    @Override
    public String emirGir() {
       return "Tasiyici calismaya baslatildi. Hat ilerliyor!" ;
    }

    @Override
    public String sensorOku() {
        return "Tasiyicinin uzerindeki urunler sayildi!";
    }

    @Override
    public String kesmeSinyali() {
        return "Tasiyici ani kesme ile durduruldu!";
    }

    @Override
    public String guvenliKapat() {
        return "Tasiyici uzerindeki yukleri kontrol ettikten sonra guvenli sekilde kapatildi";
    }
    
}