package com.example.dell.actividad5_recyclerview;

public class Usuario
{
    //Declaracion de variables
    private String nombre;
    private String apellidos;
    private int edad;

    //Constructor no puede ser private porque sino no se podrá implementar en el main activity
    public Usuario(String nombre, String apellidos,  int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //Get y Set de cada una de las variables
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
