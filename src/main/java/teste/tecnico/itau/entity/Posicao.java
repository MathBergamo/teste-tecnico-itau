package teste.tecnico.itau.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@Table(name = "posicao",
        uniqueConstraints = @UniqueConstraint(name = "unq_usuario_ativo", columnNames = {"id_usuario", "id_ativo"}))
public class Posicao {

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

    @Column(name = "preco_medio", nullable = false, precision = 15, scale = 4)
    private BigDecimal precoMedio;

    @Column(name = "p_l", nullable = false, precision = 15, scale = 4)
    private BigDecimal pl;

}
