package javasessions;

public class SwitchExample2 {

	public static void main(String[] args) {
		String trafficSignalLightStatus ="Green";
		switch(trafficSignalLightStatus) {
		case "Green":
			System.out.println("Signal is green");
			break;
		case "Yellow":
			System.out.println("Signal is yellow");
			break;
		case "Red":
			System.out.println("Signal is Red");
			break;
			default:
				System.out.println("No signal found");
		}

	}

}
