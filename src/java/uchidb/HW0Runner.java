package uchidb;



/**
 * @author aelmore
 */
public class HW0Runner{

	private static Container<Integer,String> cont = null;
	
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	public static Containers<Integer, String> getContainers() {
		if (cont == null){
			cont = new Container<Integer,String>();
		}
		return cont;
	}


	public static void main(String[] args){
		
	}
}
