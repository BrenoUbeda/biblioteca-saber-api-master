package Services;
import br.com.una.bibliotecasaberapi.Bibliotecario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Service
public class BibliotecarioService implements BibliotecarioService {

    @Autowired
    private BibliotecarioServiceJPA repositoryJPA;

    @Transactional(readOnly = true)
    public Bibliotecario get(Long id){

        try {
            Product Bibliotecario = repositoryJPA.findById(id).get();
            return Bibliotecario;
        } catch (Exception ex) {
            throw new ProductNotFoundException(
                    String.format("Funcionário não cadastrado com esse id: %s ", id));
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<Bibliotecario> findAll() {

        return repositoryJPA.findAll();
    }

    @Override
    @Transactional(readOnly = false)
    public Bibliotecario create(Bibliotecario bibliotecario) {
        if(bibliotecario.getId() != null) {
            throw new RuntimeException("Id deve ser nulo pra criar um produto!");
        }
        return repositoryJPA.save(bibliotecario);
    }

    @Override
    @Transactional(readOnly = false)
    public void update(Bibliotecario bibliotecario) {
        repositoryJPA.save(bibliotecario);
    }

    @Override
    @Transactional(readOnly = false)
    public void remove(Long id) {
        repositoryJPA.deleteById(id);
    }

}
