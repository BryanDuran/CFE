package uv.mx.FirmaRest;

//import java.util.Date;
import java.util.Map;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class FirmaRestControlador {
    @PostMapping("/firmar")
    public Contrato firmar(@RequestBody Contrato contrato) {
        System.out.println(contrato.getCurp());
        // return contrato;
        byte[] key = (contrato.getCurp() + contrato.getCurp() + contrato.getCurp()).getBytes();

        String jwt = Jwts.builder().setIssuer("http://firamas.uv.mx/")
                .claim("contrato", contrato)
                .signWith(SignatureAlgorithm.HS256, key)
                .compact();

        contrato.setFirmae(jwt);
        return contrato;
    }

    @PostMapping("/validar")
    public boolean validarFirma(@RequestBody Contrato contrato) {
        byte[] key = (contrato.getCurp() + contrato.getCurp() + contrato.getCurp()).getBytes();
        try {
            Claims claims = Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(contrato.getFirmae()).getBody();
            
            Contrato contratoDecodificado = hashMapToContrato(claims.get("contrato", Map.class));
            contratoDecodificado.setFirmae(contrato.getFirmae());
            
            return contrato.equals(contratoDecodificado);
        } catch (Exception e) {
            System.out.println("No se pudo decodificar");
           return false;
        }
    }

    private Contrato hashMapToContrato(Map hash) {
        ObjectMapper om = new ObjectMapper();
        return om.convertValue(hash, Contrato.class);
    }
}
