package Jxls;

import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;

import java.io.*;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjectCollectionDemo {

    public static void main(String[] args) throws Exception{
        System.out.println("Running Object collection demo");
        List<Employee> employees = generateSampleEmployeeData();
        try (FileInputStream in = new FileInputStream(new File("src/main/java/Jxls/employee_template.xls"))) {
            try (OutputStream os = new FileOutputStream("target/employee_output.xls")) {
                Context context = new Context();
                context.putVar("employees", employees);
                JxlsHelper.getInstance().processTemplate(in, os, context);
            }
        }
    }

    private static List<Employee> generateSampleEmployeeData() throws ParseException{
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("NgocVM", new Date(), new BigDecimal(1000), new BigDecimal(200.3)));
        employees.add(new Employee("DungTV", new Date(), new BigDecimal(12.23), new BigDecimal(220.3)));
        employees.add(new Employee("ThaoNT", new Date(), new BigDecimal(1012.1), new BigDecimal(2102.3)));
        employees.add(new Employee("VietNH", new Date(), new BigDecimal(57000), new BigDecimal(13200.3)));
        employees.add(new Employee("SonHV", new Date(), new BigDecimal(23000), new BigDecimal(53200.3)));
        return employees;
    }
}
