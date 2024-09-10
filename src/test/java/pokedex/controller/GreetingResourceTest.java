
package pokedex.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import pokedex.controller.GreetingResource;

public class GreetingResourceTest {
    
    @Test
    public void testHello() {
        GreetingResource greetingResource = new GreetingResource();
        String response = greetingResource.hello();
        assertEquals("Nhaaaaa pokemon", response);
    }
}

// @QuarkusTest
// class GreetingResourceTest {
    // @Test
    // void testHelloEndpoint() {
    //     given()
    //       .when().get("/hello")
    //       .then()
    //          .statusCode(200)
    //          .body(is("Nhaaaaa pokemongit"));
    // }

// }