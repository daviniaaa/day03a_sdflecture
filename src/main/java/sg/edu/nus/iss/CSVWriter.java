package sg.edu.nus.iss;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVWriter {
    // defining the delimiter and separator
    public static final String COMMA_DELIMITER = ",";
    public static final String NEWLINE_SEPARATOR = "\n";
    public static final String FILE_HEADER = "staffNumber,fullName,department,role,emailAddress,salary";

    public List<Employee> employees = null;

    public List<Employee> generateEmployees() {
        employees = new ArrayList<>();

        Employee e1 = new Employee("12344", "Bryan", "Customer Relation", "Relationship Manager", "bryan@visa.com", 5000);
        Employee e2 = new Employee("12345", "Cheryl", "Web Development", "Backend Engineer", "cheryl@visa.com", 10000);
        Employee e3 = new Employee("12346", "Dash", "Marketing", "Paid Advertisements Executive", "dash@visa.com", 5000);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        return employees;
    }

    public void writeToCSV(List<Employee> employees, String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        

        // write the FILE_HEADER
        fw.write(FILE_HEADER.toString());

        // iterate through employees to write each employee record to file
        // can maybe use write function as well
        for (Employee e : employees) {
            fw.append(NEWLINE_SEPARATOR);
            fw.append(e.getStaffNumber());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getFullName());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getDepartment());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getRole());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getEmailAddress());
            fw.append(COMMA_DELIMITER);
            fw.append(String.valueOf(e.getSalary()));
        }

        // flush and close the FileWriter
        fw.flush();
        fw.close();
    }


}
