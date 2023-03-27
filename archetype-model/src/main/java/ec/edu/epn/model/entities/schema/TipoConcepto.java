package ec.edu.epn.model.entities.schema;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import ec.edu.epn.model.entities.schema.Concepto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author AXRL
 */
@Entity
@Table(name = "tipo_concepto", catalog = "tipo_concepto",schema = "facturacion")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoConcepto implements Serializable {


    private static final long serialVersionUID = -5810295122709188191L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_concepto", nullable = false)
    private Integer idTipoConcepto;
    @Basic(optional = false)
    @Column(name = "nombre_tipo_concepto", nullable = false, length = 2147483647)
    private String nombreTipoConcepto;
    @Column(name = "desc_tipo_concepto", length = 2147483647)
    private String descTipoConcepto;
    @Column(name = "id_unidad_tc")
    private Integer idUnidadTc;
    @Column(name = "prtida_nc")
    private Integer prtidaNc;
    @Column(name = "fecha_tc")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTc;
    @Basic(optional = false)
    @Column(name = "id_usuario_tc", nullable = false)
    private int idUsuarioTc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoConcepto", fetch = FetchType.EAGER)
    private List<Concepto> conceptoList;

    
}
