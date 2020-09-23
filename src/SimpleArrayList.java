import java.util.List;

public class SimpleArrayList {
	private String[] array;
	private static final int initCapacity = 10;
	private int array_length;
	public SimpleArrayList() {
	array = new String[initCapacity];
	array_length = 0;
	}
	
	public SimpleArrayList(int n) {
		if(n < 0) { throw new IllegalArgumentException("Illegal Capacity: " + n); }
		array = new String[n];
		array_length = 0;
	}
	public SimpleArrayList(List<String> list) {
		array = list.stream().toArray(String[]::new);
		array_length = list.size();
	}
	public void add(int index, String s) {
		ensureOpenIndex();
		checkIndexLimit1(index, array_length);
		for (int i = array.length-2; i > index-1; i--) {
			array[i+1] = array[i];
		}
		
		array[index] = s;
		array_length ++;
	}
	public boolean add(String s) {
		ensureOpenIndex();
		array[array_length] = s;
		array_length ++;
		return true;
	}
	public void clear() {
		for (int i = 0; i < array_length; i++) {
			array[i] = null;
		}
		array_length = 0;
	}
	
	public boolean contains(String s) {
		for (int i = 0; i < array_length; i++) {
			if (array[i].equals(s)) { return true; }
		}
		return false;
	}
	public String get(int index) {
		checkIndexLimit(index, array_length);
		return array[index];
	}
	public int indexOf(String s) {
		for (int i = 0; i < array_length; i++) {
			if(array[i].equals(s)) { return i; }
		}
		return -1;
	}
	public boolean isEmpty() {
		return (array_length==0);
	}
	public String remove(int index) {
		checkIndexLimit(index, array_length);
		String element = array[index];
		for(int i = index; i < array_length-1; i++) {
			array[i] = array[i+1];
		}
		array[array_length-1] = null;
		array_length --;
		return element;
	}
	public boolean remove(String s) {
		int index = indexOf(s);
		if(index != -1) {
			remove(index);
			return true;
		}
		return false;
	}
	public String set(int index, String s) {
		checkIndexLimit(index, array_length);
		String elements = array[index];
		array[index] = s; 
		return elements;
	}
	public int size() {
		return array_length;
	}
	public void trimToSize() {
		String[] temporary = new String[array_length];
		for(int i = 0; i < array_length; i++) {
			temporary[i] = array[i]; 
		}
		array = temporary;
	}
	public String toString() {
	String stringUserInput = "[";
		for(int i = 0; i < array_length-1; i++) {
			stringUserInput += array[i];
			stringUserInput += ", ";
		}
		if(array_length != 0) {
			stringUserInput += array[array_length-1];
		}
		stringUserInput += "]";
		return stringUserInput;
	}
	
	public void ensureCapacity(int min) {
		if(min > array_length) {
			String[] temporaryString = new String[min];
			for(int i = 0; i < array.length; i++) {
				temporaryString[i] = array[i];
			}
			array = temporaryString;
		}
	}	
	public int length() {
		return array.length;
	}
	private void ensureOpenIndex() {
		if(array_length+1 > array.length) {
			String[] temporary = new String[array.length+initCapacity];
			for(int i = 0; i < array.length; i++) {
				temporary[i] = array[i];
			}
			array = temporary;
		}
	}

	private void checkIndexLimit1(int index, int size) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
	}
	
	private void checkIndexLimit(int index, int array_length) {
		if(index < 0 || index >= array_length) {
			throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + array_length);
		}
	}

}