

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CompanyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CompanyTest
{
    Company company1;
    User clint1;
    User clint2;
    User seller1;
    User seller2;
    Property property1;
    Property property2;
    Sell sell1;
    Sell sell2;
    /**
     * Default constructor for test class CompanyTest
     */
    public CompanyTest()
    {
        company1 = new Company();
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        clint1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        clint2 = new User("Antonio Francisco", "922222222", "fefe@remax.pt");
        seller1 = new User("Fernando Fernandes", "966777101", "tochico@hotmail.comm");
        seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");
        property1 = new Property("T3 Monte Belo", 150000.0);
        property1 = new Property("T2 Belo", 150400.0);
        sell1 = new Sell(clint1, seller1, property1);
        sell2 = new Sell(clint2, seller2, property2);
    }
    
    @Test
    public void testRegisterClient()
    {
        assertTrue(company1.registerClient(clint1));
    }
    
    @Test
    public void testRegisterClientDuplicate()
    {
        assertTrue(company1.registerClient(clint1));
        assertFalse(company1.registerClient(clint1));
    }
    
    @Test
    public void testRegisterClientNotNull()
    {
        assertFalse(company1.registerClient(null));
    }
    
    @Test
    public void testRegisterSeller()
    {
        assertTrue(company1.registerClient(seller1));
    }
    
    @Test
    public void testRegisterSellerDuplicate()
    {
        assertTrue(company1.registerSeller(seller1));
        assertFalse(company1.registerSeller(seller1));
    }
    
    @Test
    public void testRegisterSellerNotNull()
    {
        assertFalse(company1.registerSeller(null));
    }
    
    @Test
    public void testRegisterProperty()
    {
        assertTrue(company1.registerProperty(property1));
    }
    
    @Test
    public void testRegisterPropertyDuplicate()
    {
        assertTrue(company1.registerProperty(property1));
        assertFalse(company1.registerProperty(property1));
    }
    
    @Test
    public void testRegisterPropertyNotNull()
    {
        assertFalse(company1.registerProperty(null));
    }
    
    @Test
    public void testCreateSell()
    {
        assertTrue(company1.registerSell(sell1));
    }
    
    @Test
    public void testCalculateSellsOfTheYear()
    {
        company1.registerSell(sell1);
        company1.registerSell(sell2);
        assertEquals(2, company1.calculateSellsOfTheYear(2024));
    }
    
    @Test
    public void testFindSellerOfTheYear()
    {
        company1.registerSell(sell1);
        company1.registerSell(sell2);
        assertEquals("Fernando Fernandes", company1.findSellerOfTheYear(2024));
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
