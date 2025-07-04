package teste.tecnico.itau.entity.DTO;

import teste.tecnico.itau.entity.Ativo;
import teste.tecnico.itau.entity.Usuario;

import java.math.BigDecimal;

public class PosicaoDTO {
    private Long id;
    private Usuario usuario;
    private Ativo ativo;
    private Integer quantidade;
    private BigDecimal precoMedio;
    private BigDecimal pl;

}
