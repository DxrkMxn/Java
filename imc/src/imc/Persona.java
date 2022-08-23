package imc;
public class Persona {

    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
        nombre = "";
        edad = 0;
        sexo = comprobarSexo();               
        peso = 0.0;
        altura = 0.0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void calcularIMC() {
        final int DEBAJO_PESO_IDEAL = -1;
        final int PESO_IDEAL = 0;
        final int SOBREPESO = 1;
        double imc;

        imc = peso / altura * altura;

        if (imc < 18.5) {
            System.out.println(DEBAJO_PESO_IDEAL);
        } else if (imc >= 18.5 && imc <= 25) {
            System.out.println(PESO_IDEAL);
        } else {
            System.out.println(SOBREPESO);
        }

    }

    private char comprobarSexo() {
        if (sexo != 'H' || sexo != 'M') {
            sexo = 'H';
        }
        return sexo;
    }

    public String toString() {
        return nombre+"/"+edad+"/"+"/"+sexo+"/"+peso+"/"+altura;
    }
   
   
   
   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}