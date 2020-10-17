package futbol;

public class Jugador extends Futbolista {

	public short golesMarcados;
	public byte dorsal;
	
	public Jugador() {
		super();
		golesMarcados = 289;
		dorsal = 7;
	}
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public int compareTo(Jugador f) {
		return this.getEdad() - f.getEdad();
	}
	
	public String toString() {
		return "El futbolista "+ getNombre() +" tiene " + getEdad() + ", y juega de "+ 
	getPosicion() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
	}
	
	public boolean jugarConLasManos() {
		return false;
	}
	
	public short getGolesMarcados() {
		return golesMarcados;
	}
	
	public void setGolesMarcados(short goles) {
		this.golesMarcados = goles;
	}
	
	public byte getDorsal() {
		return dorsal;
	}
	
	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}
	
}
