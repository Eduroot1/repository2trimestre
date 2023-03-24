/**
 * 
 */
package parejas;

import javax.swing.JOptionPane;

public class MainParejas {

	public static Boolean fin;
	public static String eleccionUsuario;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		fin=false;
		while (fin==false) {
			menu();
		}
	}

	static void menu() {
		// Declaracion de variable para la elecccion del usuario para su posterior
		// respuesta
		eleccionUsuario = JOptionPane.showInputDialog(
				"Que desea hacer\n " + "1.Añadir una nueva persona, PULSE 1\n " + "2.Buscar emparejamientos,PULSE 2\n "
						+ "3. Salir del programa,PULSE 3\n\n" + "Indique aquí a continuacion la opcion deseada");
		switch (eleccionUsuario) {
		case "1":
			//altaPersona();
			break;
		case "2":
			emparejamiento();	
			break;
		case "3": 
			JOptionPane.showMessageDialog(null, "Fin del programa");
			fin=true;
			break;


		default: {
			JOptionPane.showMessageDialog(null, "Respuesta Incorrecta responda de nuevo");
			menu();
		}
		}
	}


	static void emparejamiento() {
		String eleccionUsuario;
		eleccionUsuario = JOptionPane.showInputDialog(
				"Como desea buscar?\n " + "1.Filtrando, PULSE 1\n " + "2.Personas con mas datos en comun,PULSE 2\n "
						+ "3.Personas con aficiones opuestas,PULSE 3\n " + "4.Busqueda aleatoria, PULSE 4\n " + "5.Volver al menu, PULSE 5\n\n " + "Indique aquí a continuacion la opcion deseada");
		switch (eleccionUsuario) {
		case "1":
			//filtrando();
			break;
		case "2":
			//datosComun();	
			break;
		case "3":
			//aficionesOpuestas();	
			break;
		case "4":
			//busquedaAleatoria();	
			break;
		case "5":
			menu();	
			break;
		case "6": 
			JOptionPane.showMessageDialog(null, "Fin del programa");
			fin=true;
			break;


		default: {
			JOptionPane.showMessageDialog(null, "Respuesta Incorrecta responda de nuevo");
			emparejamiento();
		}
		}
	}

}
