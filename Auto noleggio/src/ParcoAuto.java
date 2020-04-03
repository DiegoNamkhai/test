
public class ParcoAuto {
	
	private Pila pila = new Pila();
	
	public ParcoAuto() {};
	
	public void inserisci(Obj auto) {
		
		pila.push(auto);
		
	}
	
	public Obj affitta() {
		Obj appoggio = new Obj();
		appoggio = pila.pop();
		System.out.println("Auto affittata ");
		System.out.println("Targa " + appoggio.getTarga());
		System.out.println("Cilindrata " + appoggio.getCilindrata());
		System.out.println("");
		return appoggio;
	}
	
	public void disponibili() {
		
		for (int i=0; i<pila.size(); i++) {
			System.out.println("Auto " + i);
			System.out.println("Targa " + pila.top(i).getTarga());
			System.out.println("Cilindrata " + pila.top(i).getCilindrata());
			System.out.println("");
		}
		
	}

}
