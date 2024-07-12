package com.example.clases;

public class Trabajador {
    private String nombres;
    private String apellidos;
    private String run;
    private String telefono;
    private Integer edad;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Trabajador(){}

    public Trabajador(
        String nombres,
        String apellidos,
        String run,
        String telefono,
        Integer edad
        ){
            this.nombres = nombres;
            this.apellidos = apellidos;
            this.run = run; 
            this.telefono = telefono;
            this.edad = edad;
        }
    
    public String nombreCompleto(String nombres,
    String apellidos){
        return  nombres+" "+apellidos;
    }
    
    public Integer descomponerRun(){
        String[] a = run.split("-");
        Integer sum = 0;
        for (int i = 0; i < a[0].length(); i++) {
            if(a[0].charAt(i) >= '0' && a[0].charAt(i) <= '9'){

                sum = sum + Character.getNumericValue(a[0].charAt(i));
            }
        }
        return sum;
    }

    @Override
    public String toString(){
        return "Trabajador: "+nombres+" "+apellidos+" de rut: "+run;
    }
}
