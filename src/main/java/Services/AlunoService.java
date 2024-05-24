package Services;

import br.com.una.bibliotecasaberapi.Aluno;
import br.com.una.bibliotecasaberapi.Bibliotecario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AlunoService implements AlunoServiceAPI {

    @Autowired
    private AlunoServiceJPA repositoryJPA;

    @Transactional(readOnly = true)
    public Aluno get(Long id){

        try {
            Product Aluno = repositoryJPA.findById(id).get();
            return Aluno;
        } catch (Exception ex) {
            throw new AlunoNotFoundException(
                    String.format("Aluno não cadastrado com esse id: %s ", id));
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<Aluno> findAll() {

        return repositoryJPA.findAll();
    }

    @Override
    @Transactional(readOnly = false)
    public Aluno create(Aluno Aluno) {
        if(Aluno.getId() != null) {
            throw new RuntimeException("Id deve ser nulo pra criar um produto!");
        }
        return repositoryJPA.save(Aluno);
    }

    @Override
    @Transactional(readOnly = false)
    public void update(Aluno Aluno) {
        repositoryJPA.save(Aluno);
    }

    @Override
    @Transactional(readOnly = false)
    public void remove(Long id) {
        repositoryJPA.deleteById(id);
    }

}
