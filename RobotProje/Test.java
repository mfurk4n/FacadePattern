
public class Test {
	
	public void testFacade() {
		TasiyiciRobot tasiyici = new TasiyiciRobot();
		SpreyRobot sprey = new SpreyRobot();
		FabrikaCalistirFacade fabrika = new FabrikaCalistirFacade(tasiyici,sprey);
		
		fabrika.fabrikaBaslat();
		System.out.println("Fabrika Baþlatýldý. Test Çalýþýyor");
		
		fabrika.fabrikaDurdur();
		System.out.println("Fabrika Durduruldu. Test Çalýþýyor");
	}
	
	
	
}
