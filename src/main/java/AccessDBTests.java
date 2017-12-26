
import org.junit.Assert;
import org.junit.Test;

public class AccessDBTests {
    @Test
    public void testConnectToDB()
    {
        AccessDB db = new AccessDB();
        db.connectToDB("myDB.accdb");
    }

    @Test
    public void testAddProduct()
    {
        AccessDB db = new AccessDB();
        db.connectToDB("myDB.accdb");

    }

}
