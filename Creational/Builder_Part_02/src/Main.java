import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User user = createUser();

        UserDTO dto = directBuild(UserDTO.getBuilder(), user);

        System.out.println(dto);
    }

    private static UserDTO directBuild(UserDTO.UserDTOBuilder userDTOBuilder, User user) {

        userDTOBuilder.withFirstName(user.getFirstName());
        userDTOBuilder.withLastName(user.getLastName());
        userDTOBuilder.withAddress(user.getAddress());
        userDTOBuilder.withBirthDay(user.getBirthDate());
        return userDTOBuilder
                .build();

    }

    public static User createUser() {
        User user = new User();
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setBirthDate(LocalDate.of(1990, 1, 1));
        Address address = new Address();
        address.setHouseNumber("204");
        address.setStreet("Street");
        address.setCity("City");
        address.setState("State");
        address.setZipCode("12345");
        user.setAddress(address);
        return user;
    }


}