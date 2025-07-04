package teste.tecnico.itau.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import teste.tecnico.itau.entity.DTO.OperacoesDTO;
import teste.tecnico.itau.service.UsuarioService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping("/{id}/operacoes")
    public List<OperacoesDTO> operacoesPorUsuario(@PathVariable Long id) {
        return usuarioService.operacoesPorUsuario(id);
    }
}
