public class StringExercise {
    public static void main(String[] args) {
        //We don't need no education
        //We don't need no thought control
        String education = "We don't need no education";
//        System.out.println("We don't need no education");
//        System.out.println(education.replace("education", "though control" ));
        System.out.printf("%s %n%s%n", education, education.replace("education", "though control" ));

        //Check "this" out!, "s inside of "s!
        String check = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(check);

        //In windows, the main drive is usually C:\
        String windows = "In windows the main drive is usually C:\\";
        System.out.println(windows);

        //I can do backslashes \, double backslashes \\,
        //and the amazing triple backslash \\\!
        String backslashes = "I can do backslashes \\, double backslashes \\\\, and the amazing triple backslashes \\\\\\!";
        System.out.println(backslashes);


    }
}
