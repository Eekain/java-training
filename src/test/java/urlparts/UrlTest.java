package urlparts;

import java_basic.urlparts.Url;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class UrlTest {
    Url url = new Url("http://test.com/testapp/test.do?test_id=1&test_name=SS");

    @Test
    void getParameterNames() {
        assertEquals(List.of("test_id", "test_name"), url.getParameterNames());
    }

    @Test
    void getParameterValues() {
        assertEquals(List.of("1", "SS"), url.getParameterValues());
    }

    @Test
    void getProtocoll() {
        assertEquals("http", url.getProtocoll());
    }

    @Test
    void getDomainName() {
        assertEquals("test", url.getDomainName());
    }

    @Test
    void getOrgType() {
        assertEquals(".com", url.getOrgType());
    }




}