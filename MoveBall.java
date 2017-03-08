package p01;
 /**
  * Clase que sirve para poder mover la bola y hacer que esta rebote.
  * 
  * @author Marcos García Muñoz
  * @author Mario de la Parte Izquierdo
  */
 public class MoveBall implements Runnable {
 
	private Ball bola;
 	private Board tablero;
 
 	/**
 	 * Constructor de la clase MoveBall.
 	 * 
 	 * @param bola
 	 */
 	public MoveBall(Ball bola){
 		this.bola=bola;
 	}
 	
 	public void run() {
 		this.bola.move();
 		this.bola.reflect();
 		tablero.repaint();
 	}
 }