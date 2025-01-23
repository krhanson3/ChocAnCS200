import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoginVerifier {
    
    public static boolean verifyIdentity(String name, int ID, String userType){

        boolean isVerified = false;
        String filepath = "";                    // initialize variable
        userType = userType.toLowerCase();       // set all lowercase for readability
        String id = String.valueOf(ID);          // convert to string to make comparison easier

        switch(userType){
            case "manager" -> filepath = "DataCenter\\ManagerData.txt";
            case "provider" -> filepath = "DataCenter\\ProviderData.txt";
            case "operator" -> filepath = "DataCenter\\OperatorData.txt";
        }

        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line;
            //We need to compare columns[0] and columns[1]
            while ((line = br.readLine()) != null) {
                // Split the line into columns
                String[] columns = line.split(",");

                if(columns[0].equalsIgnoreCase(name)){
                    if(columns[1].equals(id)){
                        isVerified = true;
						break;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return isVerified;
    }
}