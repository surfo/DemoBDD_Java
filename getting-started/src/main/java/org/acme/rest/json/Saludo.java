package org.acme.rest.json;
public class Saludo {
    public String name;
    public String descripcion;

    public Saludo(){
    }

    public Saludo(String name, String descripcion) {
        this.name = name;
        this.descripcion = descripcion;
    }
}
