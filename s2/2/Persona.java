import java.util.*;
import java.lang.Math;

public class Persona {
    //atributos
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    //constructores
    public Persona(){
        sexo=' ';
    }

    public Persona (String nombre, int edad, char sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
    }

    public Persona (String nombre, int edad, char sexo, double peso, double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
    }


    //metodos de acceso (get y set)
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public int getEdad(){
        return edad;
    }

    public void setSexo (char sexo){
        //this.sexo=sexo;
        comprobarSexo(sexo);
    }

    public char getSexo (){
        return sexo;
    }

    public void setPeso(double peso){
        this.peso=peso;
    }

    public double getPeso(){
        return peso;
    }

    public void setAltura (double altura){
        this.altura=altura;
    }
    
    public double getAltura(){
        return altura;
    }

    //metodos propios de la clase
    public void calcularIMC(){
        double imc;
        imc = peso/Math.pow(altura, 2);
        if(imc<20){
            System.out.println("BAJO DE PESO...");
        } else if(imc>=20 && imc<=25){
            System.out.println("PESO ADECUADO");
        } else if (imc > 25){
            System.out.println("SOBREPESO...");
        } else {
            System.out.println("Error");
        }
    }

    public boolean esMayorDeEdad(){
        if (edad>=18) {
            return true;
        } else {
            return false;
        }
    }


    public void comprobarSexo(char sexo){
        if (sexo=='M' || sexo=='F') {
            this.sexo=sexo;
        }else{
            this.sexo='O'; //una sola comilla porque es char, no string
        }
    }


    public String toString(){
        String estado = "nombre: " + nombre + "\nedad: " + edad + "\nsexo: " + sexo + "\npeso: " + peso + "\naltura: " + altura;
        return estado; 
    }
}

