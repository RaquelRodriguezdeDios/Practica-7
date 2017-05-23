
public class AsocArray {
	
	Nodo inicio, fin;
	
	public AsocArray(){
		inicio = null;
		fin = null;
	}
	
	public void put(String clave, String valor){
		if(this.containsKey(clave)){
			Nodo aux = inicio;
			while((aux!=null)&&(aux.getClave()!=clave)){
				aux = aux.getSiguiente();
			}
			aux.setValor(valor);
		} else{
			if(inicio == null){
				inicio = new Nodo(clave,valor,null);
				fin = inicio;
			} else{
				fin.setSiguiente(new Nodo(clave,valor,null));
				fin = fin.getSiguiente();
			}
		}
	}
	
	public String get(String clave){
		Nodo aux = inicio;
		while((aux != null)&&(aux.getClave()!=clave)){
			aux = aux.getSiguiente();
		}
		if(aux == null) throw new ExcepcionClave();
		return aux.getValor();
	}

	public String getOrElse(String clave, String valorPorDefecto) {
		String r = valorPorDefecto;
		Nodo aux = inicio;
		while((aux != null)&&(aux.getClave()!=clave)){
			aux = aux.getSiguiente();
		}
		if(aux != null) r = aux.getValor();
		return r;
	}

	public boolean containsKey(String clave) {
		boolean r = false;
		Nodo aux = inicio;
		while((aux != null)&&(!r)){
			if(aux.getClave()==clave) r = true;
			aux = aux.getSiguiente();
		}
		return r;
	}

	public boolean remove(String clave) {
		boolean r = false;
		Nodo aux = inicio,aux2 = inicio;
		while((aux != null)&&(aux.getClave()!=clave)){
			aux2 = aux;
			aux = aux.getSiguiente();
		}
		if(aux != null){
			if(aux == inicio){
				inicio = aux.getSiguiente();
			} else{
				aux2.setSiguiente(aux.getSiguiente());
			}
			r = true;
		}
		return r;
	}

	public int size() {
		int r = 0;
		Nodo aux = inicio;
		while(aux != null){
			r++;
			aux = aux.getSiguiente();
		}
		return r;
	}
	
	
}
