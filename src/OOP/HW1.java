package OOP;

public class HW1 {

	public static void main(String[] args) {
        String lyics = "Let it go! Let it go! Cannot hold it back anymore";
        String her = "\"her\"";
        String cant = "Can't";
        
        lyics = lyics.replace("it", her);
        System.out.println(lyics.replace("Cannot", cant));

	}

}