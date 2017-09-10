package jacklow.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehiculo {
	
	@Id @GeneratedValue
	private long id;
	
	//@Id Si no esta el id antes
	@Column(length = 8) //varchar de 8
	private String vtu;
	
	private String patente;

	@SuppressWarnings("unused")
	private Vehiculo() {}
	
	public Vehiculo(String vtu, String patente) {
		super();
		this.vtu = vtu;
		this.patente = patente;
	}

	public void setVtu(String vtu) {
		this.vtu = vtu;
	}

	public String getVtu() {
		return vtu;
	}

	public String getPatente() {
		return patente;
	}

}