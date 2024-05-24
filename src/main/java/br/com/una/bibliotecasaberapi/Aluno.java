package br.com.una.bibliotecasaberapi;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_aluno")
public class Aluno {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)



    private long idAluno;
    private String nomeAluno;
    private String emailAluno;
    private String senhaAluno;


    public long getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(long idAluno) {
        this.idAluno = idAluno;
    }


    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getSenhaAluno() {
        return senhaAluno;
    }

    public void setSenhaAluno(String senhaAluno) {
        this.senhaAluno = senhaAluno;
    }
    public String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return idAluno == aluno.idAluno && Objects.equals(nomeAluno, aluno.nomeAluno) && Objects.equals(emailAluno, aluno.emailAluno) && Objects.equals(senhaAluno, aluno.senhaAluno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAluno, nomeAluno, emailAluno, senhaAluno);
    }
}


