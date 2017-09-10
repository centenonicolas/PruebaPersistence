package jacklow.model.eventos;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity  
@DiscriminatorValue("vehiculoDetectado") 
public class VehiculoDetectado extends Evento {
	private int numeroDeAntena;
	private int intensidad;

	public VehiculoDetectado(int numeroDeAntena, int intensidad) {
		super();
		this.numeroDeAntena = numeroDeAntena;
		this.intensidad = intensidad;
	}

	public int getNumeroDeAntena() {
		return numeroDeAntena;
	}

	public int getIntensidad() {
		return intensidad;
	}

}
