package singleIeritance;

public class Dema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Smartphone d  = new Smartphone();
		d.brand = "samsung" ;
		d.model = "s23" ;
		d.operatingSystem = "AOX" ;
		d.cameraResolution = "500px" ;
		
		
		d.display();
		d.powerOff();
		d.powerOn(); 
		d.takePhoto();
		
		d.takingPower();
		
		Device dd  = new Device() ;
		dd.takingPower();
		
		
	}

}
