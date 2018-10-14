package upeu.edu.pe.ws.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="cd")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Cd implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idcd")
	private int idcd;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="year")
	private int year;
	
	@Column(name="categoria")
	private String categoria;
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="precio")
	private Double precio;

	public Cd() {
		super();
	}

	public Cd(int idcd) {
		super();
		this.idcd = idcd;
	}

	public int getIdcd() {
		return idcd;
	}

	public void setIdcd(int idcd) {
		this.idcd = idcd;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
