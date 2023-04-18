import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.RestService;

public class RestServicesTest {

    @ParameterizedTest
    @CsvSource({
            "3, 10000, 3000, 20000",
            "2, 100000, 60000, 150000"
    })
    public void testRestService(int expected, int income, int expences, int threshold) {

        RestService service = new RestService();
        int actual = service.calculate(income, expences, threshold);
        Assertions.assertEquals(expected, actual);

    }


}
