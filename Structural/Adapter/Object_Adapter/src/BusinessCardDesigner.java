//Client
public class BusinessCardDesigner {
    public String designCard(Customer customer){
        String card = "";
        card += customer.getName();
        card += customer.getDesignation();
        card += customer.getAddress();

        return card;

    }
}
