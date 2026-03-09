package com.alura.ForoHub.infra.security;

import com.alura.ForoHub.domain.usuario.Usuario;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class TokenService {

    public String generarToken(Usuario usuario){
        try {
            var algoritmo = Algorithm.HMAC256("123456789");
            return JWT.create()
                    .withIssuer("RIRE") // Quien firma el algoritmo
                    .withSubject(usuario.getLogin())
                    .withExpiresAt(fechaExpiracion())
                    .sign(algoritmo);
        } catch (JWTCreationException exception){
            throw new RuntimeException("Error al generar el token JWT", exception);
            // Invalid Signing configuration / Couldn't convert Claims.
        }
    }

    private Instant fechaExpiracion() {

        return LocalDateTime.now().plusHours(12).toInstant(ZoneOffset.of("-06:00"));
    }

    public String getSubject(String tokenJWT){
        try {
            var algoritmo = Algorithm.HMAC256("123456789");
            return JWT.require(algoritmo)
                    .withIssuer("RIRE")
                    .build()
                    .verify(tokenJWT)
                    .getSubject();

        } catch (JWTVerificationException exception){
            throw new RuntimeException("Token JWT invalido o expirado");
            // Invalid signature/claims
        }
    }
}
