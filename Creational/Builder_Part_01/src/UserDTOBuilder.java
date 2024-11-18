import java.time.LocalDate;

//Abstract builder
public interface UserDTOBuilder {

    UserDTOBuilder withFirstName(String fName);
    UserDTOBuilder withLastName(String lName);
    UserDTOBuilder withBirthday(LocalDate birthday);
    UserDTOBuilder withAddress(Address address);

    //method to "assemble" final product
    UserDTO build();

    //(optional) method to fetch already build object
    UserDTO getUserDTO();
}
