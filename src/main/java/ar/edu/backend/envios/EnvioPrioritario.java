package ar.edu.backend.envios;

public class EnvioPrioritario extends Envio{
    public EnvioPrioritario(String id, String zona, int gramos){
        super(id, zona, gramos);
        if (gramos > 5000) throw new IllegalArgumentException("El envio prioritario acepta como máximo 5000g y este envio tiene: " + gramos);

    }
    @Override public String modalidad(){return "PRIORITARIO";}
    @Override public int costo() {return super.costo() + 400;}
}
