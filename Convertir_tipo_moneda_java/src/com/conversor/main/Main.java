package com.conversor.main;
/**
 * @utor Ernesto Trompa
 * Challenge Alura 2022
 * conversor unidades 
 */
import com.conversor.controlador.control;
import com.conversor.modelo.Funciones;
import com.conversor.modelo.Monedas;
import com.conversor.vistas.VentanaPrincipal;
/**
 * 
 */
public class Main {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 */
		VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
		Funciones misFunciones = new Funciones();
		Monedas misPesos = new Monedas();
		control miControl = new control();
		/**
		 * 
		 */
		miVentanaPrincipal.setCoordinador(miControl);
		misFunciones.setCoordinador(miControl);
		misPesos.setCoordinador(miControl);
		/**
		 * 
		 */
		miControl.setVentanaPrincipal(miVentanaPrincipal);
		miControl.setMisFunciones(misFunciones);
		miControl.setmisPesos(misPesos);
		/**
		 * 
		 */
		miControl.mostrarVentanaPrincipal();
	}
}