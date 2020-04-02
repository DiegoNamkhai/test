
public class ParcoAuto {
	
	private Pila pila;
	
	public ParcoAuto() {};
	
	public void inserisci(Obj auto) {
		
		pila.push(auto);
		
	}
	
	public Obj affitta() {
		return pila.pop();
	}
	
	public void disponibili() {
		
		for (int i=0; i<pila.zerosize(); i++) {
			System.out.println("Auto " + i);
			System.out.println("Targa " + pila.top(i).getTarga());
			System.out.println("Cilindrata " + pila.top(i).getTarga());
			System.out.println("");
		}
		
	}

}
