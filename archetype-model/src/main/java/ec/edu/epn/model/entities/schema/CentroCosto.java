package ec.edu.epn.model.entities.schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author AXRL
 */
@Entity
@Table(name = "centro_costo", catalog = "centro_costo", schema = "facturacion")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CentroCosto implements Serializable {
    private static final long serialVersionUID = -7058342867780866780L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_centro_costo", nullable = false)
    private Integer idCentroCosto;
    @Basic(optional = false)
    @Column(name = "cod_centro_costo", nullable = false, length = 2147483647)
    private String codCentroCosto;
    @Basic(optional = false)
    @Column(name = "nombre_centro_costo", nullable = false, length = 2147483647)
    private String nombreCentroCosto;
    @Column(name = "desc_centro_costo", length = 2147483647)
    private String descCentroCosto;
    @Column(name = "estado_centro_costo", length = 2147483647)
    private String estadoCentroCosto;
    @Basic(optional = false)
    @Column(name = "fecha_centro_costo", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCentroCosto;
    @Basic(optional = false)
    @Column(name = "id_usuario_centro_costo", nullable = false)
    private int idUsuarioCentroCosto;
}
