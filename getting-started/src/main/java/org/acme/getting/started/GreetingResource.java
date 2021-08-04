package org.acme.getting.started;

import org.acme.rest.json.Saludo;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/saludo")
public class GreetingResource
{
    private Set<Saludo> saludos = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public GreetingResource() {
        saludos.add(new Saludo("Automatizaciòn", "Hola Automatizaciòn"));
        saludos.add(new Saludo("QA", "Hola QA"));
    }

    @GET
    public Set<Saludo> list() {
        return saludos;
    }

    @POST
    public Set<Saludo> add(Saludo saludo) {
        saludos.add(saludo);
        return saludos;
    }

    @DELETE
    public Set<Saludo> delete(Saludo saludo) {
        saludos.removeIf(existingSaludo -> existingSaludo.name.contentEquals(saludo.name));
        return saludos;
    }
}