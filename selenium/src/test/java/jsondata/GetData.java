package jsondata;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class GetData {

    public static void main(String[] args) {
        // Create a JSONParser object
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("C:\\charan's\\Jpractice\\Selenium\\selenium\\src\\test\\java\\jsondata\\data.json")) {

            // Parse the JSON file
            Object obj = jsonParser.parse(reader);

            // Convert the parsed object to JSONObject
            JSONObject companyObject = (JSONObject) obj;

            // Retrieve the company object
            JSONObject company = (JSONObject) companyObject.get("Company");

            // Read Employee1 data
            JSONObject employee1 = (JSONObject) company.get("Employee1");
            System.out.println("Employee1 First Name: " + employee1.get("FirstName"));
            System.out.println("Employee1 Last Name: " + employee1.get("LastName"));
            System.out.println("Employee1 Contact No: " + employee1.get("ContactNo"));
            System.out.println("Employee1 Email: " + employee1.get("Email"));

            // Access Employee1 address
            JSONObject employee1Address = (JSONObject) employee1.get("Address");
            System.out.println("Employee1 City: " + employee1Address.get("City"));
            System.out.println("Employee1 State: " + employee1Address.get("State"));
            System.out.println("Employee1 Zip: " + employee1Address.get("Zip"));

            // Read Employee2 data
            JSONObject employee2 = (JSONObject) company.get("Employee2");
            System.out.println("Employee2 First Name: " + employee2.get("FirstName"));
            System.out.println("Employee2 Last Name: " + employee2.get("LastName"));
            System.out.println("Employee2 Contact No: " + employee2.get("ContactNo"));
            System.out.println("Employee2 Email: " + employee2.get("Email"));

            // Access Employee2 address
            JSONObject employee2Address = (JSONObject) employee2.get("Address");
            System.out.println("Employee2 City: " + employee2Address.get("City"));
            System.out.println("Employee2 State: " + employee2Address.get("State"));
            System.out.println("Employee2 Zip: " + employee2Address.get("Zip"));

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
