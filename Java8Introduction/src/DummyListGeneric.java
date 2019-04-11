public class DummyListGeneric<Arrays> {

	private Arrays[] arr;

	@SuppressWarnings("unchecked")
	public DummyListGeneric(int arrayLength) {
		arr = (Arrays[]) new Object[arrayLength];
	}

	public void add(Arrays obj) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = obj;
				break;
			}
		}

	}

	public Arrays get(int i) {
		return arr[i];
	}
	
	public void empty() {
		arr = (Arrays[]) new Object[arr.length];
	}

}
