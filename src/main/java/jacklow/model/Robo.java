package jacklow.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.uqbarproject.jpa.java8.extras.convert.LocalDateConverter;

@Entity
public class Robo {

	@Id @GeneratedValue
	private Long id;
	
	@Convert(converter = LocalDateConverter.class) //Converter -> adapter
	private LocalDateTime fecha;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	private Vehiculo vehiculo;
	//En la base crea un vehiculo_id que no hizo falta crearla como atributo en el objeto
	/*
	@OneToMany
	@JoinColumn(name = "robo_id") //es necesario definir la FK en OneToMany con JoinColumn(name = (PK))
	*/
	
	@ManyToMany
	private List<Movil> moviles;
	private String denunciante;
	private String operador;
	private String zona;
	private String codigoDenuncia;

	public Robo(){
		super();
		this.fecha = LocalDateTime.now();
	}
	
	public LocalDateTime getFecha() {
		return fecha;
	}

	public String getDenunciante() {
		return denunciante;
	}

	public String getOperador() {
		return operador;
	}

	public String getZona() {
		return zona;
	}

	public String getCodigoDenuncia() {
		return codigoDenuncia;
	}

	public Vehiculo getVehiculo(){
		return vehiculo;
	}
	
	public void setVehiculo(Vehiculo vehiculo2) {
		this.vehiculo = vehiculo2;
		
	}

}
