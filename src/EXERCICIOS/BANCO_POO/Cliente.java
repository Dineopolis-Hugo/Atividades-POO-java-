package EXERCICIOS.BANCO_POO;

public  class Cliente {
    //Representa uma pessoa que possui uma conta.
    //Ela teria:
    //nome
    //CPF
    //endereço (se quiser)
    private String  cpf;
    public String nome;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null||nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O NOME NÃO PODE ESTAR VAZIO");
            //trim() Remove os espaços do começo e do fim da String.
            //isEmpty() Verifica se a string está vazia
        }
        if (nome.matches(".*\\d.*")) {
            throw new IllegalArgumentException("O NOME NÃO PODE CONTER NÚMEROS");
            //verifica se há numero na string
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null||cpf.trim().isEmpty()) {
            //trim() Remove os espaços do começo e do fim da String.
            //isEmpty() Verifica se a string está vazia
            throw new IllegalArgumentException("O CPF NÃO PODE ESTAR VAZIO");

        }
        if (!cpf.matches("\\d+")){
            //Se não for numero
                throw new IllegalArgumentException("O CPF DEVE TER APENAS NÚMEROS ");
        }
        if  (cpf.length() != 11){
            throw new IllegalArgumentException("O CPF DEVE TER 11 NÚMEROS");
        }
        this.cpf = cpf;
    }

    public Cliente() {
        this.cpf = cpf;
        this.nome = nome;
    }


}
