package util;

public class InputTest {
    public static void main(String[] args) {
        System.out.println(Input.getString());

        System.out.println(Input.yesNo());

        System.out.println(Input.getInt(1, 10));

        System.out.println(Input.getInt());

        System.out.println(Input.getDouble(1.00, 10.00));

        System.out.println(Input.getDouble());

        System.out.println(Input.getString("This is a prompt"));

        System.out.println(Input.yesNo("This is a prompt"));

        System.out.println(Input.getInt(1, 10, "This is a prompt"));

        System.out.println(Input.getInt("This is a prompt"));

        System.out.println(Input.getDouble(1.00, 10.00, "This is a prompt"));

        System.out.println(Input.getDouble("This is a prompt"));

    }
}
