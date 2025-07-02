package methodTest;

public class LocationTest {
	
	int[] test(int[] data) {
		data[0] = 20;
		return data;
	}
	
	public static void main(String[] args) {
		LocationTest lt = new LocationTest();
		int[] data = {50};
		lt.test(data);
		
		System.out.println(data[0]);
		
	}
}
