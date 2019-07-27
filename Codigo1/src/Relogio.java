public class Relogio {
	private Mostrador horas;
	private Mostrador minuto;
	private Mostrador hora;
	
	public Relogio () {
		horas = new Mostrador (24);
		minuto = new Mostrador (60);
		
	}
	public String mostraRelogio () {
		return horas.mostra() + ":" + minuto.mostra();
		
	}
	
	public void tictac(){
			minuto.incrementa1();
			if(minuto.Valor() == 0){
				hora.incrementa1();
			}
			mostraRelogio();
		}	
	
}