package jacklow.model.eventos;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity  
@DiscriminatorValue("pistaEncontrada") 
public class PistaEncontrada extends Evento {
	private String descripcion;

	public PistaEncontrada(String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	
}
