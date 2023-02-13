
public class FabrikaCalistirFacade {
	private final TasiyiciRobot tasiyici ;
	private final SpreyRobot sprey;
	
	public FabrikaCalistirFacade(TasiyiciRobot tasiyici, SpreyRobot sprey)
	{
		this.tasiyici = tasiyici;
		this.sprey = sprey;
	}
	
	public void fabrikaBaslat() {
		tasiyici.emirGir();
		tasiyici.sensorOku();
		sprey.emirGir();
		sprey.sensorOku();
	}
	
	public void fabrikaDurdur() {
		tasiyici.guvenliKapat();
		sprey.guvenliKapat();
	}
}
