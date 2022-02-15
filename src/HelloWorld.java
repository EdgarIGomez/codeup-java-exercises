public class HelloWorld {
    public static void main (String[] args){

        System.out.println("Hello World");
//        System.out.print("Hello World");

        //1.
        int myFavoriteNumber = 3;
        System.out.println(myFavoriteNumber);

        //2. 3. 4.
        String myString = "Hi! I'm Catbug!";
        System.out.println(myString);

        //5. 6. 7. 8. 9.
        float myNumber = 3.14f;
        System.out.println(myNumber);
        //3.14 doesn't work with long because long only takes in integers which are whole numbers not fractions or decimals

        //10.
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
        //The increment ++ is behind the x, so x is incremented after the system prints them out which is why prints out
        //5 then 6
        int x = 5;
        System.out.println(++x);
        System.out.println(x);

        //The increment ++ is before the x, so x is incremented before the system prints out x which is why both of them
        //print-out 6

        //11.
//        int class = 12;
        //Can't give variable name class as class is a special keyword

        //12.
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three"

        //Gives different errors first one gives an error of an exception in thread "main", the second one gives an error
        //of string cannot become an int.

        //13.
        int y = 4;
//        x = x + 5;
        y += 5;
        System.out.println(y);

        int a = 3;
        int b = 4;
        b *= a;
        System.out.println(b);

        int c = 10;
        int d = 2;
        c /= d;
        d -= c;

//        int c = 10;
//        int d = 2;
//        c = c / d;
//        d = d - c;

        System.out.println(c);
        System.out.println(d);

        //14.
        //If you assign a number to a data type that is too small to hold it, it will start from the lowest negative number and increment up the remaining numbers.
        //If you assign a number to a data type that is larger than it nothing will happen it will just now be the larger data type.
        //Ex: byte 127 + byte 100 = (byte) -28
        int large = Integer.MAX_VALUE;
        large++;
        System.out.println(large);
        //Goes up one but starts at the lowest number of the integer

    }
}
