package ec.edu.epn.model.dto.schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BancosDto implements Serializable{
    private static final long serialVersionUID = -4652765102259108248L;
    private Integer idBancos;
    private String nombreBancos;

    private String descBancos;
    private String estadoBancos;

    private Date fechaBancos;

    private int idUsuarioBancos;
}
