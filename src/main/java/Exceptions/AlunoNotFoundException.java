package Exceptions;

public class AlunoNotFoundException extends RuntimeException {

    public AlunoNotFoundException(String mensagem) {
        super(mensagem);
    }

    public AlunoNotFoundException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
