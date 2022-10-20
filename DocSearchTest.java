import static org.junit.Assert.*;
import org.junit.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;

public class DocSearchTest {
    @Test
    public void test1() {
        String path = "/";
        URI uri = new URI(path);
        Handler t = new Handler(path);
        assertEquals(t.handleRequest(uri), "1042");
    }
}