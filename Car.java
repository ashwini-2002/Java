//use case6: c} car class: encapsulate engine status, speed, fuelLevel 
package ashwini.cm;
	 
	public class Car {

	    private boolean enginestatus;

	    private int speed;

	    private int fuellevel;
	 
	    void setEngine(boolean engine) {

	        this.enginestatus = engine;

	    }
	 
	    void setSpeed(int speed) {

	        this.speed = speed;

	    }
	 
	    void setFuelLevel(int fuellevel) {

	        this.fuellevel = fuellevel;

	    }
	 
	    public boolean getEngine() {

	        return enginestatus;

	    }
	 
	    public int getSpeed() {

	        return speed;

	    }
	 
	    public int getFuelLevel() {

	        return fuellevel;

	    }
	 
	    public static void main(String[] args) {

	        Car c = new Car();
	 
	        c.setEngine(true);

	        c.setSpeed(50);

	        c.setFuelLevel(70);
	 
	        System.out.println("Engine status: " + c.getEngine());

	        System.out.println("Speed: " + c.getSpeed());

	        System.out.println("Fuel Level: " + c.getFuelLevel());

	    }

	}

	 

