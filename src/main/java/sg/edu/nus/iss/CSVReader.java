package sg.edu.nus.iss;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    
    public List<Employee> readCSV(String fileName) throws IOException {

        BufferedReader br = null;
        
        String line = "";
        List<Employee> employees = new ArrayList<Employee>();

        br = new BufferedReader(new FileReader(fileName));

        // skip FILE_HEADER because we don't want the header, only the data
        line = br.readLine();

        // read each line of CSV record
        // format into an Employee object
        // add the Employee object into list of employees
        while((line = br.readLine()) != null ) {
            // option: use scanner - replace comma with space (since scanner detects spaces only)

            // use String.split() to split into String[]
            String[] lineData = line.split(CSVWriter.COMMA_DELIMITER);

            if (lineData.length > 0) {
                Employee e = new Employee(lineData[0], lineData[1], lineData[2], lineData[3], lineData[4], Integer.parseInt(lineData[5]));

                employees.add(e);
            }
        }

        br.close();

        return employees;
    }
}
