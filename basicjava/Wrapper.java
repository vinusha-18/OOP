package basicjavaprograms;

public class Wrapper {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        byte byteVar = 10;
        short shortVar = 1980;
        int intVar = 2657890;
        long longVar = 5000000000L;
        float floatVar = 19.2f;
        double doubleVar = 40.99;
        char charVar = 'V';
        boolean booleanVar = true;

    
        System.out.println("byte: Value = " + byteVar + ", Size = " + Byte.SIZE + " bits");
        System.out.println("short: Value = " + shortVar + ", Size = " + Short.SIZE + " bits");
        System.out.println("int: Value = " + intVar + ", Size = " + Integer.SIZE+ " bits");
        System.out.println("long: Value = " + longVar + ", Size = " + Long.SIZE + " bits");
        System.out.println("float: Value = " + floatVar + ", Size = " + Float.SIZE + " bits");
        System.out.println("double: Value = " + doubleVar + ", Size = " + Double.SIZE + " bits");
        System.out.println("char: Value = " + charVar + ", Size = " + Character.SIZE + " bits");
        System.out.println("boolean: Value = " + booleanVar + ", Size = Not precisely defined (JVM dependent)");
    }
}
