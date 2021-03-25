package ua.lviv.lgs;

public abstract class Plane {
	
	private int length;
	private int width;
	private int weight;

	public Plane(int length, int width, int weight) {
		super();
		this.length = length;
		this.width = width;
		this.weight = weight;
	}

	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}


	private ControlPlane controlPlane = new ControlPlane();
	
	
	public void startEngines() {
		int countready = 20 + (int) (Math.random() * (88 + 1));
		System.out.println("How much time is left to be ready to fly: " + countready);
	}
	public void takeoffPlane() {
		double distance = (double) (Math.random() * 1000);
		System.out.println("How many kilometers the plane will travel on a full tank of fuel: " + distance);
	}
	
	public void landingPlane() {
		System.out.println("The plane is landing...");
	}

	public void moveUp() {
		controlPlane.moveUp();
	}

	public void moveDown() {
		controlPlane.moveDown();
	}

	public void moveLeft() {
		controlPlane.moveLeft();
	}

	public void moveRight() {
		controlPlane.moveRight();
	}
	


}
