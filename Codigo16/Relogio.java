public class Relogio {
	private Mostrador hora;
	private Mostrador minuto;
	public Relogio () {
		hora = new Mostrador(24);
		minuto = new Mostrador(60);
		mostraRelogio();
	}
	public String atualizaRelogio () {
		return hora.mostra() + ":" + minuto.mostra();
	}
	public void tictac () {
		minuto.incrementa1();
		if (minuto.getValor() == 0)
			hora.incrementa1();
		mostraRelogio();
	}
	public void mostraRelogio () {
		System.out.println(atualizaRelogio());
	}
}