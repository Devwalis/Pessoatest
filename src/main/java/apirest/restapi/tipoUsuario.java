package apirest.restapi;

class TipoUsuario{

    private String nome;
    private int idade;
    private String email;
    private String segundoNome;



    
    public TipoUsuario(String nome, int idade, String email, String segundoNome) {
        this.segundoNome = segundoNome;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }
    public String getsegundoNome(){
        return segundoNome;

    public void setsegundoNome(String segundoNome){
        this.nome = nome;
    }
    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
     public int  hashcode(){
        return object.hash(id);
     }

     }
     public boolean equals( object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if getClass() != obj.getClass()
            return false;
        TipoUsuario  other = (TipoUsuario) obj;
        return object.equals(id, other, id);



     }
    
    }






    

