/**
 * 
 */
package entidades;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author admin
 *
 */

public class persona {

	public static final String[][] LISTA_INTERESES = { { "Deportes:", "Futbol", "Baloncesto", "Tenis", "Padel", "Formula1", "MotoGP", "Senderismo", "Boxeo" },
			{ "M�sica:", "Rock", "Pop", "Electr�nica" }, { "Arte y cultura:", "Pintura", "Leer", "Bricolaje" },
			{ "Mascotas:", "Perros", "Gatos", "Tortugas" }, { "Comida:", "Italiana", "Japonesa", "Mexicana" },
			{ "Bienestar y salud:", "Yoga", "Realfooder" }, { "Tecnologia:", "Impresion3D", "Informatica", "Hardware" },
			{ "Videojuegos:", "Rpg", "Estrategia", "Plataformas" },
			{ "Cine y TV:", "Cine clasico", "Series TV", "Ciencia ficcion", "Comedia", "Terror", "Accion", "Aventuras" } };

	/**Definicion de atributos*/
	public String nombre;
	public String apellidos;
	public LocalDate fechaNacimiento;
	public int edad;
	public double peso;
	public Nacionalidades nacionalidad;
	public String idioma;
	public Genero sexo;
	public String orientacionSexual;
	public String descripcion;
	public ArrayList<String> intereses = new ArrayList();




	/**Constructor*/

	public persona(String nombre, String apellidos, LocalDate fechaNacimiento, int edad, double peso,
			Nacionalidades nacionalidad, String idioma, Genero sexo, String orientacionSexual, String descripcion,
			ArrayList<String> intereses) {

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.peso = peso;
		this.nacionalidad = nacionalidad;
		this.idioma = idioma;
		this.sexo = sexo;
		this.orientacionSexual = orientacionSexual;
		this.descripcion = descripcion;
		this.intereses = intereses;


	}




	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}




	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}




	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}




	/**
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}




	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}




	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}




	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}




	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}




	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}




	/**
	 * @return the nacionalidad
	 */
	public Nacionalidades getNacionalidad() {
		return nacionalidad;
	}




	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(Nacionalidades nacionalidad) {
		this.nacionalidad = nacionalidad;
	}




	/**
	 * @return the idioma
	 */
	public String getIdioma() {
		return idioma;
	}




	/**
	 * @param idioma the idioma to set
	 */
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}




	/**
	 * @return the sexo
	 */
	public Genero getSexo() {
		return sexo;
	}




	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(Genero sexo) {
		this.sexo = sexo;
	}




	/**
	 * @return the orientacionSexual
	 */
	public String getOrientacionSexual() {
		return orientacionSexual;
	}




	/**
	 * @param orientacionSexual the orientacionSexual to set
	 */
	public void setOrientacionSexual(String orientacionSexual) {
		this.orientacionSexual = orientacionSexual;
	}




	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}




	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}




	/**
	 * @return the intereses
	 */
	public ArrayList<String> getIntereses() {
		return intereses;
	}




	/**
	 * @param intereses the intereses to set
	 */
	public void setIntereses(ArrayList<String> intereses) {
		this.intereses = intereses;
	}
	
	/**GET and SET*/
	
	
}
