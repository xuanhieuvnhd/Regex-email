public class EmailTest {
    private static Email emailExample;
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String args[]) {
        emailExample = new Email();
        for (String email : validEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email la " + email +" hop le: "+ isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email la " + email +" hop le: "+ isvalid);
        }
    }
}
