package exemplo;

public final class Janela {
	private static final Janela INSTANCE = new Janela();
	private static final String TESTE = "Exemplo Singleton Privado";
	
	public static final String Singleton = "Exemplo Singleton Public";
	
	public Janela() {
		// TODO Auto-generated constructor stub
	}
	
	public static Janela getInstance() {
		return INSTANCE;
	}
	
	public static void Abrir() {
		// TODO Auto-generated method stub
		System.out.println("Abrir Janela!");
	}
	
	public static void Fechar() {
		System.out.println("Abrir Fechar!");
	}
	
}
