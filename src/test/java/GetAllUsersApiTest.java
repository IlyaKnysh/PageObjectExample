import com.google.gson.Gson;
import gson.UserGson;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static propsResolver.Properties.props;

public class GetAllUsersApiTest extends BaseTest {

    @Test(groups = "tyb", priority = 1)
    public void getAllUsersResponseLengthOnApplicationUpTest() {
        assertThat("Array length on application start should be equals 3", usersSearch().length == 3);
    }

    private static UserGson[] usersSearch() {
        Gson gson = new Gson();
        return gson.fromJson(given().basePath(props.basePath())
                .get().asString(), UserGson[].class);
    }
}
