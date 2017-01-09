package uchidb;



/**
 * @author aelmore
 */
public class HW0Runner{

	//TODO you likely will need to add member variable
	
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	public static Containers<Integer, String> getContainers() {
		Container<Integer,String> cont = new Container<Integer,String>();
		return cont;
	}


	public static void main(String[] args){
		
	}
}
