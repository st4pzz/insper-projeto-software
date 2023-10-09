package main.java.com.insper.partida.equipe;


public class TeamAlreadyExistsException extends RuntimeException {
    
    public TeamAlreadyExistsException() {
        super("Time já existe");
    }

}
