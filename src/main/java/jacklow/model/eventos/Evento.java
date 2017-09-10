package jacklow.model.eventos;

import java.time.LocalDateTime;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="type",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value="evento") 
public abstract class Evento {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	
	private LocalDateTime fecha;
	
	
	/*
	 * 
	 * Muchos muchos métodos que van a reutilizar las subclases
	 * 
	 * va a tener un DTYPE que indica que subclase es
	 * 
	 * Inserte aquí
	 * 
	 * |
	 * |
	 * v
	 * 
	 * */

}
