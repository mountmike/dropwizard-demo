package org.example;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/demo")
public class DemoResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public DemoDto getDemoDto() {
        final var dto = new DemoDto();
        dto.setId("1");
        dto.setName("Demo");
        dto.setActive(true);
        dto.setCreatedAt(null);
        dto.setTags(null);
        return dto;
    }

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getDemoDto() throws Exception {
//        final var dto = new DemoDto();
//        dto.setId("1");
//        dto.setName("Demo");
//        dto.setActive(true);
//        dto.setCreatedAt(null);
//        dto.setTags(null);
//
//        final var objectMapper = new ObjectMapper();
//        objectMapper.registerModule(new JavaTimeModule());
//        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
//        objectMapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);
//
//        return Response.ok(objectMapper.writeValueAsString(dto))
//                .type(MediaType.APPLICATION_JSON)
//                .build();
//    }
}
