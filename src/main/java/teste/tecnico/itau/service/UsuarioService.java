package teste.tecnico.itau.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import teste.tecnico.itau.entity.DTO.OperacoesDTO;
import teste.tecnico.itau.repository.UsuarioRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public List<OperacoesDTO> operacoesPorUsuario(Long id) {

    }
}
