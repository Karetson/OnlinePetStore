package pl.onlinestore.pet.integration.api.pet;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PetControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @SneakyThrows
    void shouldAddANewPetToDb() {
        //given
        String pet = "{\n" +
                "  \"name\": \"string\",\n" +
                "  \"gender\": true,\n" +
                "  \"breed\": \"string\",\n" +
                "  \"description\": \"string\",\n" +
                "  \"image\": \"string\",\n" +
                "  \"price\": 0\n" +
                "}";
        //when
        MvcResult postPetResult = mockMvc.perform(post("/pets")
                .content(pet)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andReturn();
        //then
        assertEquals(
                "{\n" +
                        "  \"breed\": \"string\",\n" +
                        "  \"description\": \"string\",\n" +
                        "  \"gender\": true,\n" +
                        "  \"id\": 1,\n" +
                        "  \"image\": \"string\",\n" +
                        "  \"name\": \"string\",\n" +
                        "  \"price\": 0\n" +
                        "}",
                postPetResult.getResponse().getContentAsString(), false);
    }
}
