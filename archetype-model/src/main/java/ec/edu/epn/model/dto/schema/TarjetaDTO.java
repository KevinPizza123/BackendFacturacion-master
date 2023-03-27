package ec.edu.epn.model.dto.schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TarjetaDTO {

    private static final long serialVersionUID = -8706243085863105842L;

    private Integer idTarjeta;
    private String nombreTarjeta;
    private String descTarjeta;
    private String stateTarjeta;
    private Date dateTarjeta;
    private int idUsurTarjeta;
}
