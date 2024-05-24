package Services;

import br.com.una.bibliotecasaberapi.Bibliotecario;

import java.util.List;

public interface BibliotecarioServiceAPI {

    public Bibliotecario get(Long id);

    public List<Bibliotecario> findAll();

    public Bibliotecario create(Bibliotecario bibliotecario);

    public void update(Bibliotecario bibliotecario);

    public void remove(Long id);
}
