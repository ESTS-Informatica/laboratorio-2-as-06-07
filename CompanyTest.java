

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
