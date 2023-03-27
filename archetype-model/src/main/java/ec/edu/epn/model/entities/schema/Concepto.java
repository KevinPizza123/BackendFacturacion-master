package ec.edu.epn.model.entities.schema;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import ec.edu.epn.model.entities.schema.TipoConcepto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author AXRL
 */
@Entity
@Table(name = "concepto", catalog = "concepto",schema = "facturacion")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Concepto implements Serializable {


    private static final long serialVersionUID = 7569366206365441722L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_concepto", nullable = false)
    private Integer idConcepto;
    @Basic(optional = false)
    @Column(name = "codigo_concepto", nullable = false, length = 2147483647)
    private String codigoConcepto;
    @Basic(optional = false)
    @Column(name = "id_iva", nullable = false)
    private int idIva;
    @Basic(optional = false)
    @Column(name = "id_partidac", nullable = false)
    private int idPartidac;
    @Basic(optional = false)
    @Column(name = "nombre_concepto", nullable = false, length = 2147483647)
    private String nombreConcepto;
    @Column(name = "desc_concepto", length = 2147483647)
    private String descConcepto;
    @Column(name = "id_centro_costo")
    private Integer idCentroCosto;
    @Basic(optional = false)
    @Column(name = "valor_concepto", nullable = false)
    private double valorConcepto;
    @Basic(optional = false)
    @Column(name = "estado_concetpto", nullable = false, length = 2147483647)
    private String estadoConcetpto;
    @Column(name = "fecha_concepto")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaConcepto;
    @Basic(optional = false)
    @Column(name = "id_usuario_concepto", nullable = false)
    private int idUsuarioConcepto;
    /*@OneToMany(mappedBy = "idConcepto", fetch = FetchType.EAGER)
    private List<DetalleFactura> detalleFacturaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idConcepto", fetch = FetchType.EAGER)
    private List<DetalleReciboCaja> detalleReciboCajaList;*/
    @JoinColumn(name = "id_tipo_concepto", referencedColumnName = "id_tipo_concepto", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private TipoConcepto idTipoConcepto;



}
