package ua.lviv.lgs;

public class Su27 extends Plane implements CapabilitiesPlane{
	 
		private int maxSpeed;
		private String color;
		
		public Su27(int length, int width, int weight, int maxSpeed, String color) {
			super(length, width, weight);
			this.maxSpeed = maxSpeed;
			this.color = color;
		}
		
		public int getMaxSpeed() {
			return maxSpeed;
		}
		public void setMaxSpeed(int maxSpeed) {
			this.maxSpeed = maxSpeed;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		
		@Override
		public void turboAcceleration() {
			int startTurbo = this.maxSpeed + (int) (Math.random() * this.maxSpeed);
			System.out.println("We include turbo acceleration " + startTurbo + " and run...");	
		}
		@Override
		public void technologyStealth() {
			int includeStealth = (int) (Math.random() * 1000);
			System.out.println("We include stealth technology: " + includeStealth);	
		}
		@Override
		public void nuclearStrike() {
			int countBomb = (int) (Math.random() * (10 + 1));
			System.out.println("We are conducting a nuclear strike: " + countBomb);	
		}

}
