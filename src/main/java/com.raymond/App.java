package com.raymond;

import com.raymond.model.Conexion;

public class App{

    public static void main(String[] args){
        //Intanciación por constructor prohibido por ser private
        //Conexion c=new Conexion();
        //Correcta instanciación
        Conexion c=Conexion.getInstancia();
        c.conectar();
        c.desconectar();

        boolean rpta=c instanceof Conexion;
        System.out.println(rpta);
    }
    //Spring gestiona sus beans como singleton por defecto
}
