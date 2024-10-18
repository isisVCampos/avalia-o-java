public abstract class Loja {

    protected String cnpj;
    protected String razaoSocial;
    protected boolean aberta;


    public Loja(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.aberta = false;
    }


    public void abrir() {
        if (!aberta) {
            aberta = true;
            System.out.println("A loja " + razaoSocial + " está agora aberta.");
        } else {
            System.out.println("A loja " + razaoSocial + " já está aberta.");
        }
    }

    public void fechar() {
        if (aberta) {
            aberta = false;
            System.out.println("A loja " + razaoSocial + " está agora fechada.");
        } else {
            System.out.println("A loja " + razaoSocial + " já está fechada.");
        }
    }
}
