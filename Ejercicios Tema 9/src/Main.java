import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        //Instanciamos los objetos y establecemos los valores
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        //Set cliente
        cliente.setEdad(25);
        cliente.setNombre("David");
        cliente.setTelefono(622222222);
        cliente.setCredito(150);

        //Get cliente
        System.out.println("Edad del cliente: "+cliente.getEdad()+
                "\nNombre del cliente: "+cliente.getNombre()+
                "\nTeléfono del cliente: "+cliente.getTelefono()+
                "\nCrédito del cliente: "+cliente.getCredito()+
                "\n");

        //Set Trabajador
        trabajador.setEdad(26);
        trabajador.setNombre("Guillermo");
        trabajador.setTelefono(622222222);
        trabajador.setCredito(100);
        trabajador.setSalario(2000);

        //Get trabajador
        System.out.println("Edad del trabajador: "+trabajador.getEdad()+
                "\nNombre del trabajador: "+trabajador.getNombre()+
                "\nTeléfono del trabajador: "+trabajador.getTelefono()+
                "\nCrédito del trabajador: "+trabajador.getCredito()+
                "\nSalario del trabajador: "+trabajador.getSalario());
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;

    //Set y get edad
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    //Set y get Nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    //Set y get telefono
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}

class Cliente extends Persona {
    int credito;

    //Set y get credito
    public void setCredito(int credito){
        this.credito = credito;
    }
    public int getCredito(){
        return this.credito;
    }
}

class Trabajador extends Cliente {
    int salario;

    //Set y get salario
    public void setSalario(int salario){
        this.salario = salario;
    }
    public int getSalario(){
        return this.salario;
    }
}