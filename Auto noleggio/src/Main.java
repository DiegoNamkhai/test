
public class Main {
//testa
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParcoAuto torino = new ParcoAuto();
		Obj Audi = new Obj("bbb", 12.48f);
		Obj Panda = new Obj("aaa", 123);
		Obj Jeep = new Obj("ddd", 0.57f);
		Obj Ford = new Obj("ccc", 90);
		torino.inserisci(Audi);
		torino.inserisci(Panda);
		torino.inserisci(Jeep);
		torino.inserisci(Ford);
		torino.disponibili();
		torino.affitta();
		torino.disponibili();
		
		
		

	}

}
