package marker;

public class MarkerTest {
	
	public void checkKind(Animal animal) {
//		육식동물
		if (animal instanceof CanivoreMarker) {
			System.out.println("not wait");
		}
		else {
			System.out.println("생존");
		}
	}
	
	public static void main(String[] args) {
		MarkerTest mt = new MarkerTest();
		mt.checkKind(new Bear()); // 육식동물?
		mt.checkKind(new Cow()); // 육식동물?
	}
}
