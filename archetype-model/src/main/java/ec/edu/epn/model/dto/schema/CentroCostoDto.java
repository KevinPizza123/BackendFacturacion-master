package ec.edu.epn.model.dto.schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CentroCostoDto implements Serializable {
    private static final long serialVersionUID = -338791682502987220L;
    private Integer idCentroCosto;
    private String codCentroCosto;
    private String nombreCentroCosto;
    private String descCentroCosto;
    private String estadoCentroCosto;
    private Date fechaCentroCosto;
    private int idUsuarioCentroCosto;
}
