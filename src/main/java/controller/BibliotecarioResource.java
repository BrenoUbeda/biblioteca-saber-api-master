package controller;

import Services.BibliotecarioService;
import br.com.una.bibliotecasaberapi.Bibliotecario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

public class BibliotecarioResource {
    @RestController
    @RequestMapping("/bibliotecario")
    @CrossOrigin()
    public class UsuarioResource {

        @Autowired
        private bibliotecarioServiceAPI bibliotecarioService;

        @GetMapping
        public @ResponseBody
        HttpEntity<List<Bibliotecario>> findAll() {

            List<Bibliotecario> bibliotecario = bibliotecarioService.findAll();
            return ResponseEntity.ok(bibliotecario);
        }

        @GetMapping(value = "/{id}")
        public @ResponseBody
        ResponseEntity<Bibliotecario> get(@PathVariable(name = "id") Long id) {

            Bibliotecario bibliotecario = BibliotecarioService.get(id);
            return ResponseEntity.ok(bibliotecario);
        }

        @PostMapping
        public @ResponseBody
        HttpEntity<Bibliotecario> create(@RequestBody Bibliotecario usuario) {

            bibliotecario = BibliotecarioService.create(Bibliotecario);
            return ResponseEntity.ok(Bibliotecario);
        }

        @PutMapping(value = "/{id}")
        public @ResponseBody
        HttpEntity<Bibliotecario> update(@PathVariable(name = "id") Long id,
                                    @RequestBody Bibliotecario bibliotecario) {

            bibliotecario.setId(id);
            bibliotecarioService.update(bibliotecario);
            return ResponseEntity.ok(bibliotecario);
        }

        @DeleteMapping(value = "/{id}")
        public @ResponseBody
        HttpEntity<Bibliotecario> remove(@PathVariable(name = "id") Long id) {

            bibliotecarioService.remove(id);
            return ResponseEntity.ok().build();
        }
    }

}
