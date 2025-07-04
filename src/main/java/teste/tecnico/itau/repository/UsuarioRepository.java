package teste.tecnico.itau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teste.tecnico.itau.entity.Operacao;
import teste.tecnico.itau.entity.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Operacao> operacoesPorUsuario(Long id);
}
