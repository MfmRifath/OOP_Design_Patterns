public class EmployeeClassAdapter extends Employee implements Customer{

    @Override
    public String getName() {
         return this.getFullName();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }
}
