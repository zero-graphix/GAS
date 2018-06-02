package main;

public class GASMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MoistureController t1 = new MoistureController("Tomaten");
		
		t1.CheckCurrentHumidity();
		
		System.out.println("aktuelle Feuchtigkeit am Sensor " + t1.getName() + " " + t1.getMoisture() + "%");

	}

}
