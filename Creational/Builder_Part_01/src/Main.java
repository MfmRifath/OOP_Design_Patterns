import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        User user = createUser();
        UserDTOBuilder builder =new UserWebDTOBuilder();

        UserDTO dto = directBuild(builder, user);

        System.out.println(dto);

    }

    //Director
    private static UserDTO directBuild(UserDTOBuilder userDTOBuilder, User user) {

        userDTOBuilder.withFirstName(user.getFirstName());
        userDTOBuilder.withLastName(user.getLastName());
        userDTOBuilder.withAddress(user.getAddress());
        userDTOBuilder.withBirthday(user.getBirthDate());
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