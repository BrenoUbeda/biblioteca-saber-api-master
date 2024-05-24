package Exceptions;

public class BibliotecarioNotFoundException extends RuntimeException {

    public BibliotecarioNotFoundException(String mensagem) {
        super(mensagem);
    }

    public BibliotecarioNotFoundException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
