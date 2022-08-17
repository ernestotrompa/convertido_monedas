package com.conversor.modelo;
/**
 * 
 */
import java.text.DecimalFormat;
import com.conversor.controlador.control;
/**
 * @utor Ernesto Trompa
 * Challenge Alura 2022
 * conversor unidades 
 */
public class Funciones {
	
	control miControl;
	/**
	 * 
	 * @param input
	 * @return
	 */
	public double validarNumero(String input) {
        try {
        	return Double.parseDouble(input);
        } catch(NumberFormatException e) {
            return 0;
        }
	}
	/**
	 * 
	 * @param miControl
	 */
	public void setCoordinador(control miControl) {
		this.miControl = miControl;
	}
	/**
	 * 
	 * @param resultado
	 * @return
	 */
	public String formatoResultado(double resultado) {
		String formato = "#.###";
        DecimalFormat decimalFormat =  new DecimalFormat(formato);
        return decimalFormat.format(resultado);
	}
}