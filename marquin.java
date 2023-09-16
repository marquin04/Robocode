package marcos;
import robocode.*;
import java.awt.Color;

/**
 * Marquin - a class by (Marcos Santo)
 */
public class Marquin extends Robot {
	public void run() {
		setColors(Color.red,Color.yellow,Color.green);
		while (true) {
			ahead(100);
		  turnRight(90);    
		}
	}
	//robô inimigo identificado
	public void onScannedRobot(ScannedRobotEvent e) {
		String robotank = e.getName();
		double distancia = e.getDistance();
		System.out.println(robotank + " distância " + distancia);
		if (distancia < 135) {
			fire(3);
		} else {
			fire(1);
		}	
       
	}
	//batida na parede
	public void onHitWall(HitWallEvent e) {
		back(65);
		turnRight(80);
	}
}
