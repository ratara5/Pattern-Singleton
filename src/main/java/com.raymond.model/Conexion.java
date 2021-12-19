package com.raymond.model;

public class Conexion {

    //Declaración
    private static Conexion instancia;

    //para evitar instancia mediante operador new
    private Conexion(){

    }

    //Para obtener la instancia únicamente por este método
    //Nótese la palabra reservada static hace posible el acceso mediante clase método
    public static Conexion getInstancia(){
        if(instancia==null){
            instancia=new Conexion();
        }
        return instancia;
    }

    //Método de prueba
    public void conectar(){
        System.out.println("Me conecté a la BD");
    }

    //Método de prueba
    public void desconectar(){
        System.out.println("Me desconecté de la BD");
    }
}