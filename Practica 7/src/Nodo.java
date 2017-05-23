
public class Nodo {
	private String clave, valor;
	private Nodo siguiente;
	
	public Nodo(String c, String v, Nodo s){
		clave = c;
		valor = v;
		siguiente = s;
	}
	
	public String getValor(){
		return this.valor;
	}
	
	public String getClave(){
		return this.clave;
	}
	
	public Nodo getSiguiente(){
		return this.siguiente;
	}
	
	public void setValor(String v){
		this.valor = v;
	}
	
	public void setSiguiente(Nodo n){
		this.siguiente = n;
	}
}
