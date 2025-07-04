package teste.tecnico.itau.entity.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import teste.tecnico.itau.entity.ENUM.TipoOperacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Getter
@Setter
public class OperacoesDTO {
    private Long id;
    private UsuarioDTO usuario;
    private AtivoDTO ativo;
    private Integer quantidade;
    private BigDecimal precoUnitario;
    private TipoOperacao tipoOperacao;
    private BigDecimal corretagem;
    private LocalDateTime dataHora;

}
