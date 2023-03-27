package ec.edu.epn.model.dto.schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConceptoDto implements Serializable {


    private static final long serialVersionUID = 820636906803404167L;
    private Integer idConcepto;

    private String codigoConcepto;

    private int idIva;

    private int idPartidac;

    private String nombreConcepto;

    private String descConcepto;

    private Integer idCentroCosto;

    private double valorConcepto;

    private String estadoConcetpto;

    private Date fechaConcepto;

    private int idUsuarioConcepto;
}
