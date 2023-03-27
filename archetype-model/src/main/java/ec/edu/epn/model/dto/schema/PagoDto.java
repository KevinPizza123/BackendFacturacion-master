package ec.edu.epn.model.dto.schema;

import ec.edu.epn.model.entities.schema.FormaPago;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagoDto  implements Serializable {

    private static final long serialVersionUID = 2397364510620911193L;
    private Integer idPagos;

    private double montoPago;
   
    private double saldoPago;
   
    private Integer idTc;
    
    private Integer idBanco;
   
    private Double comisionTc;

   
    private FormaPago idFormaPago;
}
