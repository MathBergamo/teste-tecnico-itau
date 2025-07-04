package teste.tecnico.itau.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import teste.tecnico.itau.entity.ENUM.TipoOperacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@Getter
@Table(name = "operacoes",
        indexes = {
                @Index(name = "idx_operacoes_usuario_ativo_data", columnList = "id_usuario, id_ativo, data_hora")
        })
public class Operacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_ativo", nullable = false)
    private Ativo ativo;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(name = "preco_unitario", nullable = false, precision = 15, scale = 4)
    private BigDecimal precoUnitario;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_operacao", nullable = false, length = 10)
    private TipoOperacao tipoOperacao;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal corretagem;

    @Column(name = "data_hora", nullable = false)
    private LocalDateTime dataHora;

}
