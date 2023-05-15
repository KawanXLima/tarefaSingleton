package exemplo;

public class Janela2 {
		
	private static Janela2 instancia;
	
	public Janela2() {
		// TODO Auto-generated constructor stub
	}
	
	public static synchronized Janela2 getInstance() {
		if(instancia == null) {
			instancia = new Janela2();
		}
		return instancia;
	}
}
