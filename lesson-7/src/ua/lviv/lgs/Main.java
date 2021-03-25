package ua.lviv.lgs;

public class Main {
	public static void main(String[] args) {
		Su27 su27 = new Su27(2500, 5000, 1200, 1700, "red");
		
		su27.startEngines();
		su27.takeoffPlane();
		su27.moveUp();
		su27.moveLeft();
		su27.moveDown();
		su27.moveRight();
		su27.technologyStealth();
		su27.nuclearStrike();
		su27.turboAcceleration();
		su27.landingPlane();
		
		
	}

}
