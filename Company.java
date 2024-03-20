
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

/**
 * Manage a company.
 *
 * @author POO
 * @version 03/2024
 */
public class Company {

    // Clients registry
    private ArrayList<User> clients;
    // Sellers registry
    private ArrayList<User> sellers;
    // Properties registry
    private ArrayList<Property> properties;
    // Sells registry
    private ArrayList<Sell> sells;

    /**
     * Constructor of class Company
     */
    public Company() {
        clients = new ArrayList();
        sellers = new ArrayList();
        properties = new ArrayList();
        sells = new ArrayList();
    }

    /**
     * Get the list of clients.
     *
     * @return This company clients.
     */
    public List<User> getClients() {
        return clients;
    }

    /**
     * Get the list of sellers.
     *
     * @return This company sellers.
     */
    public List<User> getSellers() {
        return sellers;
    }

    /**
     * Get the list of properties.
     *
     * @return This company's properties.
     */
    public List<Property> getProperties() {
        return properties;
    }

    /**
     * Get the list of sells.
     *
     * @return This company sells.
     */
    public List<Sell> getSells() {
        return sells;
    }

    /**
     * Register a client.
     *
     * @param client to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerClient(User client) {
        if(clients.contains(client) || client == null)
        {
            return false;
        }
        clients.add(client);
        return true;
    }

    /**
     * Register a seller.
     *
     * @param seller to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerSeller(User seller) {
        if(sellers.contains(seller) || seller == null)
        {
            return false;
        }
        sellers.add(seller);
        return true;    
    }

    /**
     * Register a property.
     *
     * @param property to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerProperty(Property property) {
        if(properties.contains(property) || property == null)
        {
            return false;
        }
        properties.add(property);
        return true;        
    }

    /**
     * Register a sell.
     *
     * @param sell to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerSell(Sell sell) {
        if(sells.contains(sell) || sell == null)
        {
            return false;
        }
        sells.add(sell);
        return true;
    }

    /**
     * Generate a new sell and register that sell.
     *
     * @param client Must be already registered.
     * @param seller Must be already registered.
     * @param property Must be already registered.
     * @return true If the request succeeds, false otherwise.
     */
    public boolean createSell(User client, User seller, Property property) {
        Sell newSell = new Sell(client, seller, property);
        registerSell(newSell);
        return true;
    }

    /**
     * Calculates the total number of sells within the provided year.
     *
     * @param year
     * @return The total number of sells in the year.
     */
    public int calculateSellsOfTheYear(int year) {
        int count = 0;
        for (Sell sell : sells)
        {
            if(sell.getDate().getYear() == year)
            {
                count++;
            }
        }
        return count;
    }

    /**
     * Find the seller with more sells within the provided year.
     *
     * @param year
     * @return The name of the seller of the year.
     */
    public String findSellerOfTheYear(int year) {
        int mostSells = 0;
        int count = 0;
        String bestSeller = "";
        for (User seller : sellers) {
            for (Sell sell : sells)
            {
                if(seller.getName().equals(sell.getSeller()) && sell.getDate().getYear() == year)
                {
                    count++;
                }
            }
            if(count > mostSells)
            {
                mostSells = count;
                count = 0;
                bestSeller = seller.getName();
            }
        }
        
        return bestSeller;
    }

}
