package org.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/demo")
@Produces(MediaType.APPLICATION_JSON)
public class DemoResource {

    @GET
    public DemoDto getDemoDto() {
        final var dto = new DemoDto();
        dto.setId("1");
        dto.setName("Demo");
        dto.setActive(true);
        dto.setCreatedAt(null);
        dto.setTags(List.of("sdf"));
        return dto;
    }

}
