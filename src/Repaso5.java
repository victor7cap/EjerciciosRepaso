/*
 * Repaso 5 a�ade soporte al programa para poder escuchar
 * los clic del rat�n 
 * Lo que har� el programa es cambiar el color de relleno 
 * aleatoriamente de un rect�ngulo cada vez que se pulse clic
 * 
 */

import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.util.RandomGenerator;

public class Repaso5 extends acm.program.GraphicsProgram{

	//declaro una variable de instancia para guardar el rect�ngulo
	GRect rectangulo;

	//declaro una variable de tipo aleatorio
	RandomGenerator aleatorio = new RandomGenerator();

	public void init(){
		setSize(800,600);
		rectangulo = new GRect(120, 80);
		//inserto el "escuchador" del raton
		addMouseListeners();

	}

	public void run(){
		//A�ado el rect�ngulo en el centro exacto de la pantalla
		add(rectangulo, 
				getWidth()/2 - rectangulo.getWidth()/2,
				getHeight()/2 - rectangulo.getHeight()/2
				);
	}


	//a�ado el m�todo que escucha el evento del clic del raton

	public void mouseClicked (MouseEvent evento){
		if (evento.getButton() == MouseEvent.BUTTON1){
			rectangulo.setFilled(true);
			rectangulo.setFillColor(aleatorio.nextColor());
		}
	}







}
