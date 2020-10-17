package futbol;


public class Portero extends Futbolista {

	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	public String toString() {
		return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de "
				+ getPosicion() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
	}
	
	public int compareTo(Portero f) {
		return Math.abs(this.golesRecibidos - f.getGolesRecibidos());
	}
	
	public boolean jugarConLasManos() {
		return true;
	}
	
	public short getGolesRecibidos() {
		return golesRecibidos;
	}
	
	public void setGolesRecibidos(short goles) {
		this.golesRecibidos = goles;
	}
	
	public byte getDorsal() {
		return dorsal;
	}
	
	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}
	
}
