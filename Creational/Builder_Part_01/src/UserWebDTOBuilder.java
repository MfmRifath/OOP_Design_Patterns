import java.time.LocalDate;
import java.time.Period;

//The concrete builder for UserWebDTO
//TODO implement builder
public class UserWebDTOBuilder implements UserDTOBuilder {

private String firstName;
private String lastName;
private String age;
private String address;
private UserWebDTO dto;
    @Override
    public UserDTOBuilder withFirstName(String fName) {
        firstName = fName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lName) {
        lastName = lName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate birthday) {
        Period ageInYears = Period.between(birthday, LocalDate.now());
        age = ageInYears.getYears() + " years";
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + ", " +address.getStreet()
                +"\n " + address.getCity()
                +"\n " + address.getState()+" "+address.getZipCode();
        return null;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(firstName+" "+lastName, address, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
