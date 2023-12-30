
package Class_Package;


public class cmbPopulate {
    
    public static String[] GetCmb(String FilePath){
        String[] Array = FileHandler.readAndStoreInArray(FilePath);
        String[] newArray = new String[Array.length + 1];
        newArray[0] = "null";
        System.arraycopy(Array, 0, newArray, 1, Array.length);
        return newArray;
    }
}
