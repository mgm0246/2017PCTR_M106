package p01;
 /**
  * Clase que sirve para poder mover la bola y hacer que esta rebote.
  * 
  * @author Marcos García Muñoz
  * @author Mario de la Parte Izquierdo
  */
 public class MoveBall extends Thread {
 
	private Ball bola;
 	private Board tablero;
 
 	/**
 	 * Constructor de la clase MoveBall.
 	 * 
 	 * @param bola
 	 */
 	public MoveBall(Ball bola,Board tablero){
 		this.bola=bola;
		this.tablero=tablero;
 	}
 	
 	public void run() {
		try{
		     while (true) {
 			this.bola.move();
 			this.bola.reflect();
 			tablero.repaint();
			Thread.sleep(100);
		     }
			} catch (InterruptedException a) {
			return;
		}
 	}
 }
