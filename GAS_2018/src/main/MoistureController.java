package main;

public class MoistureController {
	
	private int moisture = 0;
	private String name;
	
	public MoistureController(String name) {
		this.name = name;
	}
	
	
	public void CheckCurrentHumidity() {
		// Call Service to get the current humidity value for Sensor
		
		// convert into internal
		this.moisture ++;
	}

	public int getMoisture() {
		return moisture;
	}

	public void setMoisture(int moisture) {
		this.moisture = moisture;
	}
	
	public String getName() {
		return name;
	}

}
