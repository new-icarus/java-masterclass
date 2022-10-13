public class ByteShortIntLong {
    public static void main(String[] args) {

        //Min and Max values of Int
        System.out.println("Integer Minimum Value: " + Integer.MIN_VALUE +
                "\nInteger Maximum Value: " + Integer.MAX_VALUE);

        System.out.println("\nByte Minimum Value: " + Byte.MIN_VALUE +
                "\nByte Maximum Value: " + Byte.MAX_VALUE);

        System.out.println("\nShort Minimum Value: " + Short.MIN_VALUE +
                "\nShort Maximum Value: " + Short.MAX_VALUE);

        System.out.println("\nLong Minimum Value: " + Long.MIN_VALUE +
                "\nLong Maximum Value: " + Long.MAX_VALUE);

        long ultraLong = 2_147_483_648L; //use L to declare a long

        System.out.println("\nDouble Minimum Value: " + Double.MIN_VALUE +
            "\nDouble Maximum Value: " + Double.MAX_VALUE);

        System.out.println("\nFloat Minimum Value: " + Float.MIN_VALUE +
            "\nFloat Maximum Value: " + Float.MAX_VALUE);
    }
}
