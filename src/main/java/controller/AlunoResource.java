package controller;
import Services.BibliotecarioService;
import Services.BibliotecarioServiceAPI;
import br.com.una.bibliotecasaberapi.Aluno;
import br.com.una.bibliotecasaberapi.Bibliotecario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

public class AlunoResource {

    @RestController
    @RequestMapping("/usuarios")
    @CrossOrigin()
    public class UsuarioResource {

        @Autowired
        private BibliotecarioServiceAPI bibliotecarioService;

        @GetMapping
        public @ResponseBody
        HttpEntity<List<Bibliotecario>> findAll() {

            List<Aluno> aluno = alunoService.findAll();
            return ResponseEntity.ok(aluno);
        }

        @GetMapping(value = "/{id}")
        public @ResponseBody
        ResponseEntity<Aluno> get(@PathVariable(name = "id") Long id) {

            Aluno aluno = BibliotecarioService.get(id);
            return ResponseEntity.ok(aluno);
        }

        @PostMapping
        public @ResponseBody
        HttpEntity<Aluno> create(@RequestBody Aluno aluno) {

            aluno = alunoService.create(aluno);
            return ResponseEntity.ok(aluno);
        }

        @PutMapping(value = "/{id}")
        public @ResponseBody
        HttpEntity<Bibliotecario> update(@PathVariable(name = "id") Long id,
                                    @RequestBody Bibliotecario bibliotecario) {

            aluno.setId(id);
            alunoService.update(aluno);
            return ResponseEntity.ok(aluno);
        }

        @DeleteMapping(value = "/{id}")
        public @ResponseBody
        HttpEntity<Aluno> remove(@PathVariable(name = "id") Long id) {

            alunoService.remove(id);
            return ResponseEntity.ok().build();
        }
    }

}
