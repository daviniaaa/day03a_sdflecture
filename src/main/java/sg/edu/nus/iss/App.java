package sg.edu.nus.iss;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        String dirPath = args[0]; // data -> creates a new 'data' folder if not existing
        String fileName = args[1]; // employee.txt
        String dirPathFileName = dirPath + File.separator + fileName;

        File newDirectory = new File(dirPath);
        if (newDirectory.exists()) {
            System.out.println("The directory exists");
        } else {
            newDirectory.mkdir();
        }

        File file = new File (dirPathFileName);
        if (file.exists()) {
            System.out.println("There is an existing file with the same name");
        } else {
            file.createNewFile();
        }

        CSVWriter writer = new CSVWriter();
        List<Employee> employeeList = writer.generateEmployees();
        writer.writeToCSV(employeeList, dirPathFileName);

        CSVReader reader = new CSVReader();
        List<Employee> retrievedList = reader.readCSV(dirPathFileName);
        System.out.print(retrievedList.toString());

    }
}
