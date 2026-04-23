class Impressora extends Dispositivo {
    
    private Boolean cor;
    

    public Impressora(Boolean cor, int id) {
        super(id);
        this.cor = cor;
    }

    @Override 
    public void exibirinf() {
    System.out.println("Sou uma impressora, meu id é " +id + " e meu tipo de impressão é: " +(cor? Sim:Não);
    }

}