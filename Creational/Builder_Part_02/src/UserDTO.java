import java.time.LocalDate;
import java.time.Period;

public class UserDTO {
    String name;
    private String age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'';
    }
// Builder
    public static UserDTOBuilder getBuilder() {
        return new UserDTOBuilder();
    }

    public static class UserDTOBuilder {

        private String firstName;
        private String lastName;
        private String age;
        private String address;

        private UserDTO userDTO;

        public UserDTOBuilder withFirstName(String fName) {
            this.firstName = fName;
            return this;
        }

        public UserDTOBuilder withLastName(String lName) {
            this.lastName = lName;
            return this;
        }
        public UserDTOBuilder withBirthDay(LocalDate date) {
            age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
            return this;
        }
        public UserDTOBuilder withAddress(Address address) {
            this.address = address.getHouseNumber()+", "+address.getStreet()+"\n "+address.getCity()+", " +address.getState()+" "+address.getZipCode();
            return this;
        }

        public UserDTO build() {
            this.userDTO = new UserDTO();
            userDTO.setName(firstName+" "+lastName);
            userDTO.setAge(age);
            userDTO.setAddress(address);
            return this.userDTO;
        }
        public UserDTO getUserDTO() {
            return this.userDTO;
        }

    }
}
