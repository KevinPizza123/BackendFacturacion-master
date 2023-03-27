package ec.edu.epn.model.entities.schema;

import ec.edu.epn.model.entities.schema.Bancos;
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

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bancos", catalog = "bancos", schema = "facturacion")
public class Bancos implements Serializable {
        private static final long serialVersionUID = 8829726435131950400L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(optional = false)
        @Column(name = "id_bancos", nullable = false)
        private Integer idBancos;
        @Basic(optional = false)
        @Column(name = "nombre_bancos", nullable = false, length = 2147483647)
        private String nombreBancos;
        @Column(name = "desc_bancos", length = 2147483647)
        private String descBancos;
        @Column(name = "estado_bancos", length = 2147483647)
        private String estadoBancos;
        @Basic(optional = false)
        @Column(name = "fecha_bancos", nullable = false)
        @Temporal(TemporalType.TIMESTAMP)
        private Date fechaBancos;
        @Basic(optional = false)
        @Column(name = "id_usuario_bancos", nullable = false)
        private int idUsuarioBancos;

    }
