package com.conversor.vistas;
/**
 * 
 */
import javax.swing.JOptionPane;
import com.conversor.controlador.control;
/**
 * @utor Ernesto Trompa
 * Challenge Alura 2022
 * conversor unidades 
 */
public class VentanaPrincipal {
	
	control miControl;
	boolean continua = true;

	/**
	 * 
	 */
	public void iniciarConversor() {
		
		while(continua) {
			String opciones = (JOptionPane.showInputDialog(
					null, 
					"Acepta para iniciar",
					"Conversor valores con codigo Java",
					JOptionPane.INFORMATION_MESSAGE, 
					null, 
					new Object[] {
							"Conversor de Moneda", 
					},
					"Seleccion"
			)).toString();
			/**
			 * 
			 */
			if(opciones == "Conversor de Moneda") {
				String input = JOptionPane.showInputDialog(
						"Ingresa la cantidad de dinero que deseas convertir: "
				);
				
				double numero = miControl.validarNumero(input);
				/**
				 * 
				 */
				if( numero > 0 ) {
					String tipoConversion = (JOptionPane.showInputDialog(
							null, 
							"Elije una opción para convertir", 
							"Conversor de Moneda",
							JOptionPane.QUESTION_MESSAGE,
							null,
							new Object[] {
									"De Pesos a Dolares",
									"De Pesos a Euros",
									"De Pesos a Libras Esterlinas",
									"De Pesos a Yen Japones",
									"De Pesos a Won Surcoreano",
									"De Dolares a Pesos",
									"De Euros a Pesos",
									"De Libras Esterlinas a Pesos",
									"De Yen Japones a Pesos",
									"De Won Surcoreano a Pesos",
							}, 
							"Seleccion"
					)).toString();
					/**
					 * 
					 */
					if(tipoConversion == "De Pesos a Dolares") {
						String resultado = (miControl.convertirPesosADolares(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Dolares"
						);
						
						continuaEjecucion();
					}
					/**
					 * 
					 */
					if(tipoConversion == "De Pesos a Euros") {
						String resultado = (miControl.convertirPesosAEuros(numero));
						JOptionPane.showMessageDialog(
								null, 
								"Tienes "+resultado +" Euros"
						);
						
						continuaEjecucion();
						
					}
					/**
					 * 
					 */
					if(tipoConversion == "De Pesos a Libras Esterlinas") {
						String resultado = (miControl.convertirPesosALibrasEsterlinas(numero));
						JOptionPane.showMessageDialog(
								null, 
								"Tienes "+resultado +" Libras Esterlinas"
						);
						
						continuaEjecucion();
					}
					/**
					 * 
					 */
					if(tipoConversion == "De Pesos a Yen Japones") {
						String resultado = (miControl.convertirPesosAYenJapones(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Yenes Japoneses"
						);
						
						continuaEjecucion();
					}
					/**
					 * 
					 */
					if(tipoConversion == "De Pesos a Won Surcoreano") {
						String resultado = (miControl.convertirPesosAWonSurcoreano(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Wones Surcoreanos"
						);
						
						continuaEjecucion();
					}
					/**
					 * 
					 */
					if(tipoConversion == "De Dolares a Pesos") {
						String resultado = (miControl.convertirDolaresAPesos(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Pesos (Colombianos)"
						);
						
						continuaEjecucion();
					}
					/**
					 * 
					 */
					if(tipoConversion == "De Euros a Pesos") {
						String resultado = (miControl.convertirEurosAPesos(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Pesos (Colombianos)"
						);
						
						continuaEjecucion();
					}
					/**
					 * 
					 */
					if(tipoConversion == "De Libras Esterlinas a Pesos") {
						String resultado = (miControl.convertirLibrasEsterlinasAPesos(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Pesos (Colombianos)"
						);
						
						continuaEjecucion();
					}
					/**
					 * 
					 */
					if(tipoConversion == "De Yen Japones a Pesos") {
						String resultado = (miControl.convertirYenJaponesAPesos(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Pesos (Colombianos)"
						);
						
						continuaEjecucion();
					}
					/**
					 * 
					 */
					if(tipoConversion == "De Won Surcoreano a Pesos (Colombianos)") {
						String resultado = (miControl.convertirWonSurcoreanoAPesos(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Pesos"
						);
						
						continuaEjecucion();
					}
				} else {
					JOptionPane.showMessageDialog(
							null, 
							"Ingresa un numero valido"
					);
				}
			}
		} 
	}
			
	private void continuaEjecucion() {
		int respuesta = JOptionPane.showConfirmDialog(
				null,
				"Deseas realizar otra conversion?"
		);
		/**
		 * 
		 */
		if(JOptionPane.OK_OPTION != respuesta) {
			JOptionPane.showMessageDialog(null, "Programa terminado");
			continua = false;
		}
	}
	/**
	 * 
	 * @param miControl
	 */
	public void setCoordinador(control miControl) {
		this.miControl = miControl;
	}
}
