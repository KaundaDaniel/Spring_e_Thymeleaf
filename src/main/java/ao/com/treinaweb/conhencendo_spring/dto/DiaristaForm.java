package ao.com.treinaweb.conhencendo_spring.dto;

public class DiaristaForm {
    private String nome;
    private String telefone;
    private String bI;

    public DiaristaForm(String nome, String telefone, String bI) {
        this.nome = nome;
        this.telefone = telefone;
        this.bI = bI;
    }

    public DiaristaForm() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getbI() {
        return bI;
    }

    public void setbI(String bI) {
        this.bI = bI;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
        result = prime * result + ((bI == null) ? 0 : bI.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DiaristaForm other = (DiaristaForm) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (telefone == null) {
            if (other.telefone != null)
                return false;
        } else if (!telefone.equals(other.telefone))
            return false;
        if (bI == null) {
            if (other.bI != null)
                return false;
        } else if (!bI.equals(other.bI))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "DiaristaForm [nome=" + nome + ", telefone=" + telefone + ", bI=" + bI + "]";
    }


    

}