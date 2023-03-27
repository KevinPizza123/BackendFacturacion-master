package ec.edu.epn.model.entities.schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.persistence.*;

/**
 *
 */
@Entity
@Table(name = "tarjeta", catalog = "tarjeta",schema = "facturacion")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Tarjeta {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tarjeta", nullable = false)
    private Integer idTarjeta;
    @Basic(optional = false)
    @Column(name = "nombre_tarjeta", nullable = false, length = 2147483647)
    private String nombreTarjeta;
    @Column(name = "desc_tarjeta", length = 2147483647)
    private String descTarjeta;
    @Column(name = "estado_tarjeta", length = 2147483647)
    private String stateTarjeta;
    @Basic(optional = false)
    @Column(name = "fecha_tarjeta", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTarjeta;
    @Basic(optional = false)
    @Column(name = "id_usuario_tarjeta", nullable = false)
    private int idUsurTarjeta;
}
