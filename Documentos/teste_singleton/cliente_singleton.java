public class cliente_singleton{
    //atributo privado para a instancia
    static cliente_singleton instancia;
    //construtor privado
    private cliente_singleton(){
        this.instancia = new cliente_singleton();
    }

    //metodo para entrega da instancia
    public cliente_singleton getInstance(){
        if(this.instancia == null){
            new cliente_singleton();
        }
        return this.instancia;
    }
    

    //atributos da classe
    public String nome;
    public String email;
}