/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_Package;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mandu
 */
public class Employee {
    
    private String  EmployeeName;
    private String  EmployeeEPF;
    private String  Designation;
    private String Department;
    
    public Employee(String Name, String EPF, String Department, String Designation){
        
        this.EmployeeName = Name;
        this.EmployeeEPF = EPF;
        this.Department = Department;
        this.Designation = Designation;   
    }
    
    public String getEmpRecord(){
        
        String record = EmployeeName + "---" + EmployeeEPF + "---" + this.Designation + "---" + this.Department;
        return record;
    }
    
    public String searchEmployee(){
        
        String record = "";
        try{
            String fileLocation ="src\\oop_employee_detail\\Sources\\employee_details.txt";       
            FileReader fReader = new FileReader(FileHandler.readAndReturnFile(fileLocation));
            BufferedReader bReader = new BufferedReader(fReader);
            String FindLine;
            boolean found = false;
            outerLoop:  
            while(null!= (FindLine = bReader.readLine())){
                String userName = FindLine.split("---")[0];
                String userEPF = FindLine.split("---")[1];
                String userDesignation = FindLine.split("---")[2];
                String userDepartment = FindLine.split("---")[3];
                //System.err.println(UserName);
                //System.err.println(UserPass);
                if (userName.equals(EmployeeName) && userEPF.equals(EmployeeEPF) && userDesignation.equals(Designation)&&
                    userDepartment.equals(Department)){
                    found = true;
                    record = record + userName + " ---- " +userEPF + " ---- " + userDesignation + " ---- " + userDepartment + "\n";
                }
                else if (userName.equals(EmployeeName) && userEPF.equals(EmployeeEPF)){
                    found = true;
                    record = record + userName + " ---- " +userEPF + " ---- " + userDesignation + " ---- " + userDepartment + "\n";
                } 
                else if (userDesignation.equals(Designation)&&
                    userDepartment.equals(Department)){
                    found = true;
                    record = record + userName + " ---- " +userEPF + " ---- " + userDesignation + " ---- " + userDepartment + "\n";
                }
                else if (userName.equals(EmployeeName) || userEPF.equals(EmployeeEPF)|| userDesignation.equals(Designation)||
                        userDepartment.equals(Department)){
                    found = true;
                    record = record + userName + " ---- " +userEPF + " ---- " + userDesignation + " ---- " + userDepartment + "\n";
                }  
            }
            fReader.close();
            bReader.close();
        }        
        catch(IOException ex){
            System.out.println("An Error Occured Searching "+ ex);
        }
        return record;
    }
}
