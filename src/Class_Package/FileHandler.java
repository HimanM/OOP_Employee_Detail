package Class_Package;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class FileHandler {

    public static String[] readAndStoreInArray(String fileName) {
        ArrayList<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("An Error Occured ");
        }

        return lines.toArray(new String[0]);
    }
    
    public static File readAndReturnFile(String fileName) {
    File myFile = new File(fileName);
    try{
            if (myFile.createNewFile()){
                System.out.println("File Created: " + myFile.getName());
            }
            else{
                System.out.println("File already exists.");
            }      
        }
        catch(IOException ex){
            System.out.println("Error happened when creating file");
        }
    
    return myFile;
    }
    
    public static boolean checkValues(String fileName,String value){
        boolean found = false;
        File myFile = new File(fileName);
        try{
            FileReader fReader = new FileReader(myFile);
            BufferedReader bReader = new BufferedReader(fReader);
            String FindLine;
            outerLoop:  
            while(null!= (FindLine = bReader.readLine())){
                if (FindLine.equals(value)){
                    found = true;
                }
            }  
        } 
        catch(IOException ex){
            System.out.println("An Error Occured Searching "+ ex);
        }
        return found;
    }
    
     public static boolean checkValuesHR(String value){
        boolean found = false;
        File myFile = new File("src\\oop_employee_detail\\Sources\\HR_logins.txt");
        try{
            FileReader fReader = new FileReader(myFile);
            BufferedReader bReader = new BufferedReader(fReader);
            String FindLine;
            outerLoop:  
            while(null!= (FindLine = bReader.readLine())){
                String UserName = FindLine.split("---")[0];
                if (UserName.equals(value)){
                    found = true;
                }
            }  
        } 
        catch(IOException ex){
            System.out.println("An Error Occured Searching "+ ex);
        }
        return found;
    }
     
     public static boolean WriteRecord(String filePath,String record){
         try{
                FileWriter fileWriter = new FileWriter(FileHandler.readAndReturnFile(filePath),true); //use true to avoid overWrite
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(record);
                bufferedWriter.newLine();
                bufferedWriter.close();
                fileWriter.close();
                return true;
            }
            catch(IOException ex){
                return false;
            }
     }
}
