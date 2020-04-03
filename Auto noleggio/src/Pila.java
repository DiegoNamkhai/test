import java.util.Vector;

public class Pila {

	private Vector <Obj> pila = new Vector<Obj>(10);
	
	public Pila () {};
	
	public void push(Obj obj) {
		pila.add(obj);
	}
	
	public Obj pop () {
		Obj obj = pila.get(pila.size()-1);
		pila.remove(obj);//poiché ultimo elemento non occorre lo shift effettuato da remove(int index)
		return obj;
	}
	
	public Obj top () {
		return pila.get(pila.size()-1);
	}

	public Obj top (int index) {
		if (index > this.zerosize()) {
			System.out.println("L'index " + index + ", é fuori dalla pila");
			index = this.zerosize();
			System.out.println("perció é stato ridimensionato a  " + index);
		}
		return pila.get(index);
	}
	
	public boolean empty() {
		return pila.isEmpty();
	}
	
	public int size() {
		return pila.size();
	}
	
	public int zerosize () {//conta gli elementi partendo da zero
		return pila.size()-1;
	}
	
}
