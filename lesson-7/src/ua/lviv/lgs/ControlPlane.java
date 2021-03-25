package ua.lviv.lgs;

public class ControlPlane {
	
	public void moveUp() {	
		int moveDistance = (int) (Math.random() * 4000);
		System.out.println("Plane move up " + moveDistance);
	}
	
	public void moveDown() {
		int moveDistance = (int) (Math.random() * 4000);
		System.out.println("Plane move down " + moveDistance);
	}
	public void moveLeft() {
		int moveDistance = (int) (Math.random() * 4000);
		System.out.println("Plane move left " + moveDistance);
	}
	
	public void moveRight() {
		int moveDistance = (int) (Math.random() * 4000);
		System.out.println("Plane move right " + moveDistance);
	}

	
	
}
