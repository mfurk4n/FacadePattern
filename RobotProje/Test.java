
public class Test {
	
	public void testFacade() {
		TasiyiciRobot tasiyici = new TasiyiciRobot();
		SpreyRobot sprey = new SpreyRobot();
		FabrikaCalistirFacade fabrika = new FabrikaCalistirFacade(tasiyici,sprey);
		
		fabrika.fabrikaBaslat();
		System.out.println("Fabrika Ba�lat�ld�. Test �al���yor");
		
		fabrika.fabrikaDurdur();
		System.out.println("Fabrika Durduruldu. Test �al���yor");
	}
	
	
	
}
