package Services;

import br.com.una.bibliotecasaberapi.Aluno;
import br.com.una.bibliotecasaberapi.Bibliotecario;

import java.util.List;

public interface AlunoServiceAPI {

    public Aluno get(Long id);

    public List<Aluno> findAll();

    public Aluno create(Aluno aluno);

    public void update(Aluno aluno);

    public void remove(Long id);
}
