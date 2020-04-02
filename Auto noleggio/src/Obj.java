
public class Obj {
	private String targa;
	private float cilindrata;
	
	public Obj(String targa, float cilindrata) {
		
		this.setTarga(targa);
		this.setCilindrata(cilindrata);
		
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {//la targa non cambia,
		//utile solo nel caso di errato inserimento
		this.targa = targa;
	}

	public float getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(float cilindrata) {//la cilindrata non cambia,
		//utile solo nel caso di errato inserimento
		this.cilindrata = cilindrata;
	}
	
	

}
