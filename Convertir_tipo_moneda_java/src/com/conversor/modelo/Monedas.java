package com.conversor.modelo;
/**
 * 
 */
import com.conversor.controlador.control;
/**
 * @utor Ernesto Trompa
 * Challenge Alura 2022
 * conversor unidades 
 */
public class Monedas {
	
	control miControl;
	/**
	 * metodo para convertir Pesos a Dolares
	 * @param input
	 * @return
	 */
	public String convertirPesosADolares(double input) {		
		double resultado = input / 4272.00;
		return miControl.formatoResultado(resultado);
	}
	/**
	 * metodo para convertir Pesos a Euros
	 * @param input
	 * @return
	 */
	public String convertirPesosAEuros(double input) {
		double resultado = input / 4349.92;
		return miControl.formatoResultado(resultado);
	}
	/**
	 * metodo convertir Pesos a Libras Esterlinas
	 * @param input
	 * @return
	 */
	public String convertirPesosALibrasEsterlinas(double input) {
		double resultado = input / 5158.15;
		return miControl.formatoResultado(resultado);
	}
	/**
	 * metodo convertir Pesos a YenJapones
	 * @param input
	 * @return
	 */
	public String convertirPesosAYenJapones(double input) {
		double resultado = input / 31.60;
		return miControl.formatoResultado(resultado);
	}
	/**
	 * metodo convertir Pesos a WonSurcoreano
	 * @param input
	 * @return
	 */
	public String convertirPesosAWonSurcoreano(double input) {
		double resultado = input / 3.25;
		return miControl.formatoResultado(resultado);
	}
	/**
	 * metodo convertir Dolares a Pesos 
	 * @param input
	 * @return
	 */
	public String convertirDolaresAPesos(double input) {		
		double resultado = input * 4272.00;
		return miControl.formatoResultado(resultado);
	}
	/**
	 * metodo convertir Euros a Pesos
	 * @param input
	 * @return
	 */
	public String convertirEurosAPesos(double input) {		
		double resultado = input * 4349.92;
		return miControl.formatoResultado(resultado);
	}
	/**
	 * metodo convertir Libras Esterlinas a Pesos
	 * @param input
	 * @return
	 */
	public String convertirLibrasEsterlinasAPesos(double input) {		
		double resultado = input * 5158.15;
		return miControl.formatoResultado(resultado);
	}
	/**
	 * metodo convertir Yen Japones a Pesos
	 * @param input
	 * @return
	 */
	public String convertirYenJaponesAPesos(double input) {		
		double resultado = input * 31.60;
		return miControl.formatoResultado(resultado);
	}
	/**
	 * metodo convertir Won Surcoreano a Pesos
	 * @param input
	 * @return
	 */
	public String convertirWonSurcoreanoAPesos(double input) {		
		double resultado = input * 3.25;
		return miControl.formatoResultado(resultado);
	}
	/**
	 * 
	 * @param miControl
	 */
	public void setCoordinador(control miControl) {
		this.miControl = miControl;
	}	
}