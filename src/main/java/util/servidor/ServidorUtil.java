package util.servidor;

import java.math.BigInteger;
import java.security.SecureRandom;

import modelo.contenido.Contenido;
import modelo.contenido.ContenidoImpl;
import modelo.token.Token;

public class ServidorUtil {

    public static final Contenido PUBLICIDAD = new ContenidoImpl("Publicidad", 23);

    private static SecureRandom random = new SecureRandom();

    public static Token generarToken() {
        return new Token(randomToken());
    }

    private static String randomToken() {
        return new BigInteger(130, random).toString(32);
    }

    public static Contenido obtenerPublicidad() {
        return PUBLICIDAD;
    }

}