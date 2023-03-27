package ec.edu.epn.model.entities.schema;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AXRL
 */
@Entity
@Table(name = "pagos", catalog = "pagos",schema = "facturacion")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Pagos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pagos", nullable = false)
    private Integer idPagos;
    @Basic(optional = false)
    @Column(name = "monto_pago", nullable = false)
    private double montoPago;
    @Basic(optional = false)
    @Column(name = "saldo_pago", nullable = false)
    private double saldoPago;
    @Column(name = "id_tc")
    private Integer idTc;
    @Column(name = "id_banco")
    private Integer idBanco;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "comision_tc", precision = 17, scale = 17)
    private Double comisionTc;
    //@JoinColumn(name = "id_factura", referencedColumnName = "id_factura")
    //@ManyToOne(fetch = FetchType.EAGER)
    //private Factura idFactura;
    @JoinColumn(name = "id_forma_pago", referencedColumnName = "id_forma_pago", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private FormaPago idFormaPago;
    //@JoinColumn(name = "id_recibo_caja", referencedColumnName = "id_recibo_caja")
    //@ManyToOne(fetch = FetchType.EAGER)
    //private ReciboCaja idReciboCaja;




    
}
