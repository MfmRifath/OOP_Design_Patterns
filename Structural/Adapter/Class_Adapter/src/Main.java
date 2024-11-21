public class Main {
    public static void main(String[] args) {
       EmployeeClassAdapter adapter = new EmployeeClassAdapter();
       populateEmployeeData(adapter);
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