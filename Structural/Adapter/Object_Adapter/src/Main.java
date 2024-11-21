public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        populateEmployeeData(employee );
        EmployeeObjectAdapter adapter = new EmployeeObjectAdapter(employee);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);
        System.out.println(card);
    }
    public static void populateEmployeeData(Employee employee) {
        employee.setFullName("Mohammed Farees Mohammed Rifath");
        employee.setJobTitle("Manager");
        employee.setOfficeLocation("Colombo");
    }
}