public class Main {
    public static void main(String[] args) {
        //1 уровень сложности (работа со стороками)

        //1
        String firstString = "I study Basic Java!";

        //2
        char resultString = firstString.charAt(18);
        System.out.println(resultString);

        //3
        String substring = "Java";
        System.out.println(firstString.contains(substring));

        //4
        String resultString2 = firstString.replace("a", "o");
        System.out.println(resultString2);

        //5
        String resultString3 = firstString.toUpperCase();
        System.out.println(resultString3);

        //6
        String resultString4 = firstString.toLowerCase();
        System.out.println(resultString4);

        //2 уровень сложности (работа с приведением типов)

        //1,2
        byte byteVar = 8;
        int intVar = 23;
        double doubleVar = 2.04;
        float floatVar = 5.07F;

        //3,4,5
        intVar = byteVar;
        doubleVar = intVar + byteVar + floatVar;
        floatVar = intVar + byteVar;

        byteVar = (byte)(intVar + doubleVar + floatVar);
        floatVar = (float)(intVar + doubleVar + byteVar);
        intVar = (int)(floatVar + doubleVar + byteVar);

        System.out.println(byteVar);
        System.out.println(floatVar);
        System.out.println(intVar);
        System.out.println(doubleVar);







      }
    }
