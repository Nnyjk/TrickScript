package org.nn.trick.resource;

import org.nn.trick.entity.common.ScriptTopic;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author yangxiao
 * @since V1.0.0 2023/01/11
 */
@Path("/topic")
public class ScriptTopicResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list() {
        return Response.ok(ScriptTopic.listAll()).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(ScriptTopic topic) {
        ScriptTopic.persist(topic);
        return Response.ok().build();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(ScriptTopic topic) {
        ScriptTopic.persist(topic);
        return Response.ok(ScriptTopic.listAll()).build();
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Response drop(Long id) {
        return Response.ok(ScriptTopic.deleteById(id)).build();
    }

}
