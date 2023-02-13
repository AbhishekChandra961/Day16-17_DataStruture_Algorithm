package StringFunctionRegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringFunctionRegEx {
    public static void main(String[] args) {
        String message = "Hello <<name>>, We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx. Please, let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";

        // Replace <<name>> with first name
        String firstName = "John";
        message = message.replaceAll("<<name>>", firstName);

        // Replace <<full name>> with full name
        String fullName = "John Doe";
        message = message.replaceAll("<<full name>>", fullName);

        // Replace the mobile number in format 91-xxxxxxxxxx with the user's contact number
        String contactNumber = "91-1234567890";
        message = message.replaceAll("91-[0-9]{10}", contactNumber);

        // Replace any date in the format XX/XX/XXXX with the current date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String currentDate = dateFormat.format(date);
        message = message.replaceAll("[0-9]{2}/[0-9]{2}/[0-9]{4}", currentDate);

        // Output the modified message
        System.out.println(message);
    }
}

