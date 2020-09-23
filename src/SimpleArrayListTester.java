import java.util.ArrayList;
import java.util.Arrays;

public class SimpleArrayListTester {
    
    private static StringBuilder sb;
    
    public static void main(String[] args) {
        sb = new StringBuilder();

        testConstructors();
        testAdd();
        testClearAndIsEmpty();
        testTrimToSize();
        testContainsAndIndexOf();
        testGet();
        testRemove();
        testSet();
    }

    private static void testConstructors() {
        try {
            ArrayList<String> list = new ArrayList<>();

            sb.append("Initial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to create list: ");
            sb.append(e.toString());
        }

        try {
            ArrayList<String> list = new ArrayList<>(15);

            sb.append("\nInitial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to create list: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayList<String> list = new ArrayList<>(-1);

            sb.append("\nInitial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to create list: ");
            sb.append(e.toString());
        }

        try {
            ArrayList<String> list = new ArrayList<>(Arrays.asList("zero", "one", "two", "three", "four"));

            sb.append("\nInitial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to create list: ");
            sb.append(e.toString());
        }

        try {
            ArrayList<String> list = new ArrayList<>(null);

            sb.append("\nInitial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to create list: ");
            sb.append(e.toString());
        }

        String expected = sb.toString();
        sb.setLength(0);

        try {
            SimpleArrayList simpleList = new SimpleArrayList();

            sb.append("Initial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to create list: ");
            sb.append(e.toString());
        }

        try {
            SimpleArrayList simpleList = new SimpleArrayList(15);

            sb.append("\nInitial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to create list: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleArrayList simpleList = new SimpleArrayList(-1);

            sb.append("\nInitial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to create list: ");
            sb.append(e.toString());
        }

        try {
            SimpleArrayList simpleList = new SimpleArrayList(Arrays.asList("zero", "one", "two", "three", "four"));

            sb.append("\nInitial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to create list: ");
            sb.append(e.toString());
        }

        try {
            SimpleArrayList simpleList = new SimpleArrayList(null);

            sb.append("\nInitial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to create list: ");
            sb.append(e.toString());
        }

        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testConstructors.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testConstructors.");
        }
    }

    private static void testAdd() {
        ArrayList<String> list = new ArrayList<>();
        SimpleArrayList simpleList = new SimpleArrayList();

        try {
            sb.append("Initial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());

            list.add("zero");
            list.add("one");
            list.add("two");
            list.add("three");
            list.add("four");
            list.add("five");
            list.add("six");
            list.add("eight");
            list.add("nine");
            list.add("ten");
            list.add("eleven");
            list.add("twelve");
            list.add("thirteen");
            list.add("fourteen");
            list.add("fifteen");
            list.add("sixteen");

            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());

            list.add(7, "seven");

            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to add elements: ");
            sb.append(e.toString());
        }

        try {
            list.add(-1, "invalid");

            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to add element: ");
            sb.append(e.toString());
        }

        try {
            list.add(100, "invalid");

            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to add element: ");
            sb.append(e.toString());
        }

        String expected = sb.toString();
        sb.setLength(0);

        try {
            sb.append("Initial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());

            simpleList.add("zero");
            simpleList.add("one");
            simpleList.add("two");
            simpleList.add("three");
            simpleList.add("four");
            simpleList.add("five");
            simpleList.add("six");
            simpleList.add("eight");
            simpleList.add("nine");
            simpleList.add("ten");
            simpleList.add("eleven");
            simpleList.add("twelve");
            simpleList.add("thirteen");
            simpleList.add("fourteen");
            simpleList.add("fifteen");
            simpleList.add("sixteen");

            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());

            simpleList.add(7, "seven");

            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to add elements: ");
            sb.append(e.toString());
        }

        try {
            simpleList.add(-1, "invalid");

            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to add element: ");
            sb.append(e.toString());
        }

        try {
            simpleList.add(100, "invalid");

            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to add element: ");
            sb.append(e.toString());
        }

        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testAdd.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testAdd.");
        }
    }

    private static void testClearAndIsEmpty() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("zero", "one", "two", "three"));
        SimpleArrayList simpleList = new SimpleArrayList(Arrays.asList("zero", "one", "two", "three"));

        try {
            sb.append("Initial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());
            sb.append("\nList is empty: " + list.isEmpty());

            list.clear();

            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
            sb.append("\nList is empty: " + list.isEmpty());
        } catch (Exception e) {
            sb.append("\nFailed to clear list: ");
            sb.append(e.toString());
        }

        String expected = sb.toString();
        sb.setLength(0);

        try {
            sb.append("Initial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());
            sb.append("\nList is empty: " + simpleList.isEmpty());

            simpleList.clear();

            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
            sb.append("\nList is empty: " + simpleList.isEmpty());
        } catch (Exception e) {
            sb.append("\nFailed to clear list: ");
            sb.append(e.toString());
        }

        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testClearAndIsEmpty.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testClearAndIsEmpty.");
        }
    }
    
    private static void testTrimToSize() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("zero", "one", "two", "three"));
        SimpleArrayList simpleList = new SimpleArrayList(Arrays.asList("zero", "one", "two", "three"));
        
        try {
            sb.append("Initial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());
            
            list.remove(1);
            list.trimToSize();
            
            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to trim list to size: ");
            sb.append(e.toString());
        }
        
        String expected = sb.toString();
        sb.setLength(0);
        
        try {
            sb.append("Initial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());
            
            simpleList.remove(1);
            simpleList.trimToSize();
            
            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to trim list to size: ");
            sb.append(e.toString());
        }
        
        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testTrimToSize.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testTrimToSize.");
        }
    }

    private static void testContainsAndIndexOf() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("zero", "one", "two", "three"));
        SimpleArrayList simpleList = new SimpleArrayList(Arrays.asList("zero", "one", "two", "three"));

        try {
            sb.append("Initial contents of list: " + list);

            boolean contains = list.contains("two");
            int index = list.indexOf("two");

            sb.append("\nList contains element: " + contains);
            sb.append("\nElement at index: " + index);
        } catch (Exception e) {
            sb.append("\nFailed to search for element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);

            boolean contains = list.contains("four");
            int index = list.indexOf("four");

            sb.append("\nList contains element: " + contains);
            sb.append("\nElement at index: " + index);
        } catch (Exception e) {
            sb.append("\nFailed to search for element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);

            boolean contains = list.contains("");
            int index = list.indexOf("");

            sb.append("\nList contains element: " + contains);
            sb.append("\nElement at index: " + index);
        } catch (Exception e) {
            sb.append("\nFailed to search for element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);

            boolean contains = list.contains(null);
            int index = list.indexOf(null);

            sb.append("\nList contains element: " + contains);
            sb.append("\nElement at index: " + index);
        } catch (Exception e) {
            sb.append("\nFailed to search for element: ");
            sb.append(e.toString());
        }

        String expected = sb.toString();
        sb.setLength(0);

        try {
            sb.append("Initial contents of list: " + simpleList);

            boolean contains = simpleList.contains("two");
            int index = simpleList.indexOf("two");

            sb.append("\nList contains element: " + contains);
            sb.append("\nElement at index: " + index);
        } catch (Exception e) {
            sb.append("\nFailed to search for element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);

            boolean contains = simpleList.contains("four");
            int index = simpleList.indexOf("four");

            sb.append("\nList contains element: " + contains);
            sb.append("\nElement at index: " + index);
        } catch (Exception e) {
            sb.append("\nFailed to search for element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);

            boolean contains = simpleList.contains("");
            int index = simpleList.indexOf("");

            sb.append("\nList contains element: " + contains);
            sb.append("\nElement at index: " + index);
        } catch (Exception e) {
            sb.append("\nFailed to search for element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);

            boolean contains = simpleList.contains(null);
            int index = simpleList.indexOf(null);

            sb.append("\nList contains element: " + contains);
            sb.append("\nElement at index: " + index);
        } catch (Exception e) {
            sb.append("\nFailed to search for element: ");
            sb.append(e.toString());
        }

        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testContainsAndIndexOf.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testContainsAndIndexOf.");
        }
    }

    private static void testGet() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("zero", "one", "two", "three"));
        SimpleArrayList simpleList = new SimpleArrayList(Arrays.asList("zero", "one", "two", "three"));

        try {
            sb.append("Initial contents of list: " + list);

            String item = list.get(2);

            sb.append("\nElement at index 2: " + item);
        } catch (Exception e) {
            sb.append("\nFailed to get element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);

            String item = list.get(-1);

            sb.append("\nElement at index -1: " + item);
        } catch (Exception e) {
            sb.append("\nFailed to get element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);

            String item = list.get(100);

            sb.append("\nElement at index 100: " + item);
        } catch (Exception e) {
            sb.append("\nFailed to get element: ");
            sb.append(e.toString());
        }

        String expected = sb.toString();
        sb.setLength(0);

        try {
            sb.append("Initial contents of list: " + simpleList);

            String item = simpleList.get(2);

            sb.append("\nElement at index 2: " + item);
        } catch (Exception e) {
            sb.append("\nFailed to get element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);

            String item = simpleList.get(-1);

            sb.append("\nElement at index -1: " + item);
        } catch (Exception e) {
            sb.append("\nFailed to get element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);

            String item = simpleList.get(100);

            sb.append("\nElement at index 100: " + item);
        } catch (Exception e) {
            sb.append("\nFailed to get element: ");
            sb.append(e.toString());
        }

        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testGet.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testGet.");
        }
    }

    private static void testRemove() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("zero", "one", "two", "three", "four"));
        SimpleArrayList simpleList = new SimpleArrayList(Arrays.asList("zero", "one", "two", "three", "four"));

        try {
            sb.append("Initial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());

            String item = list.remove(2);

            sb.append("\nElement removed at index 2: " + item);
            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to remove element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());

            String item = list.remove(-1);

            sb.append("\nElement removed at index -1: " + item);
            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to remove element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());

            String item = list.remove(100);

            sb.append("\nElement removed at index 100: " + item);
            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to remove element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());

            boolean removed = list.remove("two");

            sb.append("\nElement removed: " + removed);
            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to remove element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());

            boolean removed = list.remove("three");

            sb.append("\nElement removed: " + removed);
            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to remove element: ");
            sb.append(e.toString());
        }

        String expected = sb.toString();
        sb.setLength(0);

        try {
            sb.append("Initial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());

            String item = simpleList.remove(2);

            sb.append("\nElement removed at index 2: " + item);
            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to remove element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());

            String item = simpleList.remove(-1);

            sb.append("\nElement removed at index -1: " + item);
            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to remove element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());

            String item = simpleList.remove(100);

            sb.append("\nElement removed at index 100: " + item);
            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to remove element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());

            boolean removed = simpleList.remove("two");

            sb.append("\nElement removed: " + removed);
            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to remove element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());

            boolean removed = simpleList.remove("three");

            sb.append("\nElement removed: " + removed);
            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to remove element: ");
            sb.append(e.toString());
        }

        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testRemove.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testRemove.");
        }
    }

    private static void testSet() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("zero", "one", "X", "three", "four"));
        SimpleArrayList simpleList = new SimpleArrayList(Arrays.asList("zero", "one", "X", "three", "four"));

        try {
            sb.append("Initial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());

            String item = list.set(2, "two");

            sb.append("\nElement overwritten at index 2: " + item);
            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to set element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());

            String item = list.set(-1, "X");

            sb.append("\nElement overwritten at index -1: " + item);
            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to set element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());

            String item = list.set(100, "X");

            sb.append("\nElement overwritten at index 100: " + item);
            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to set element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());

            String item = list.set(1, null);

            sb.append("\nElement overwritten at index 1: " + item);
            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to set element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + list);
            sb.append("\nInitial size of list: " + list.size());

            String item = list.set(4, "");

            sb.append("\nElement overwritten at index 1: " + item);
            sb.append("\nUpdated contents of list: " + list);
            sb.append("\nUpdated size of list: " + list.size());
        } catch (Exception e) {
            sb.append("\nFailed to set element: ");
            sb.append(e.toString());
        }

        String expected = sb.toString();
        sb.setLength(0);

        try {
            sb.append("Initial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());

            String item = simpleList.set(2, "two");

            sb.append("\nElement overwritten at index 2: " + item);
            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to set element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());

            String item = simpleList.set(-1, "X");

            sb.append("\nElement overwritten at index -1: " + item);
            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to set element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());

            String item = simpleList.set(100, "X");

            sb.append("\nElement overwritten at index 100: " + item);
            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to set element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());

            String item = simpleList.set(1, null);

            sb.append("\nElement overwritten at index 1: " + item);
            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to set element: ");
            sb.append(e.toString());
        }

        try {
            sb.append("\nInitial contents of list: " + simpleList);
            sb.append("\nInitial size of list: " + simpleList.size());

            String item = simpleList.set(4, "");

            sb.append("\nElement overwritten at index 1: " + item);
            sb.append("\nUpdated contents of list: " + simpleList);
            sb.append("\nUpdated size of list: " + simpleList.size());
        } catch (Exception e) {
            sb.append("\nFailed to set element: ");
            sb.append(e.toString());
        }

        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testSet.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testSet.");
        }
    }
}
