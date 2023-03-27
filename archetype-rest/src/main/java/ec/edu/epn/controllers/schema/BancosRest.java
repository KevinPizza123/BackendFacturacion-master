package ec.edu.epn.controllers.schema;


import ec.edu.epn.model.dto.schema.BancosDto;
import ec.edu.epn.model.enums.EnumMessages;
import ec.edu.epn.model.response.ResponseGenerico;
import ec.edu.epn.service.service.schema.BancosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bancos/")
public class BancosRest {

    @Autowired
    private BancosService service;


    /**
     * REST para guardar o actualizar EntidadDto
     *
     * @return guardar
     */
    @PostMapping(value = "guardarBancos")
    public ResponseEntity<?> create(@RequestBody BancosDto obj) {
        BancosDto dto = service.create(obj);
        ResponseGenerico<BancosDto> response = new ResponseGenerico<>();
        try {
            response.setCodigoRespuestaName(HttpStatus.OK.name());
            response.setCodigoRespuestaValue(HttpStatus.OK.value());
            response.setObjeto(dto);
            response.setMensaje(EnumMessages.INGRESO_EXITOSO.getValor());
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setCodigoRespuestaName(HttpStatus.BAD_REQUEST.name());
            response.setCodigoRespuestaValue(HttpStatus.BAD_REQUEST.value());
            response.setMensaje(EnumMessages.INGRESO_FALLIDO.name() + ":" + e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }


    }

    /**
     * Metodo para listar
     *
     * @return objeto response
     */
    @GetMapping(value = "listarBancos")
    public ResponseEntity<?> listar() {
        ResponseGenerico<BancosDto> response = new ResponseGenerico<>();
        try {
            List<BancosDto> lista = service.findAll();
            response.setCodigoRespuestaName(HttpStatus.OK.name());
            response.setCodigoRespuestaValue(HttpStatus.OK.value());
            response.setListado(lista);
            response.setTotalRegistros((long) lista.size());
            response.setMensaje(EnumMessages.REGISTRO_EXISTENTE.name());
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setCodigoRespuestaName(HttpStatus.BAD_REQUEST.name());
            response.setCodigoRespuestaValue(HttpStatus.BAD_REQUEST.value());
            response.setMensaje(EnumMessages.REGISTRO_NO_EXISTENTE.name() + ":" + e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * Metodo para listar
     *
     * @return objeto response
     */
    //@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    @GetMapping(value = "buscarPorIdBancos/{id}")
    public ResponseEntity<?> findById(@PathVariable int id) {
        ResponseGenerico<BancosDto> response = new ResponseGenerico<>();
        try {
           BancosDto dto = service.findById(id);
            response.setCodigoRespuestaName(HttpStatus.OK.name());
            response.setCodigoRespuestaValue(HttpStatus.OK.value());
            response.setObjeto(dto);
            response.setMensaje(EnumMessages.REGISTRO_EXISTENTE.name());
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setCodigoRespuestaName(HttpStatus.BAD_REQUEST.name());
            response.setCodigoRespuestaValue(HttpStatus.BAD_REQUEST.value());
            response.setMensaje(EnumMessages.REGISTRO_NO_EXISTENTE.name() + ":" + e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping(value = "eliminarBancos/{id}")
    public ResponseEntity<?> eliminarById(@PathVariable int id) {
        ResponseGenerico<Boolean> response = new ResponseGenerico<>();
        try {
            boolean dto = service.delete(id);
            response.setCodigoRespuestaName(HttpStatus.NOT_FOUND.name());
            response.setCodigoRespuestaValue(HttpStatus.NOT_FOUND.value());
            response.setObjeto(dto);
            response.setMensaje(EnumMessages.REGISTRO_NO_EXISTENTE.name());
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setCodigoRespuestaName(HttpStatus.BAD_REQUEST.name());
            response.setCodigoRespuestaValue(HttpStatus.BAD_REQUEST.value());
            response.setMensaje(EnumMessages.REGISTRO_NO_EXISTENTE.name() + ":" + e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }
}
