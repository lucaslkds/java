class Computador extends Dispositivo {
    
    String os;
    

    public Computador(String os, int id) {
        super(id);
        this.os = os;
    }

    @Override 
    public void exibirinf() {
    System.out.println("Sou um computador, meu id é " +id + " e o uso o " +os);
    }

}