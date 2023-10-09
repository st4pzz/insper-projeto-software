package main.java.com.insper.partida.equipe;

import java.time.LocalDateTime;
import java.util.HashMap;

@ControllerAdvice
public class TeamControllerAdvice {
    
    @ExceptionHandler(TeamAlreadyExistsException.class)
    public HashMap teamAlreadyExistsException(TeamAlreadyExistsException ex){
        HashMap<String,String> error = new HashMap<>();
        error.put("message", "Já existe uma equipe com esse nome");
        error.put("code","400");
        error.put("time",LocalDateTime.now().toString());

        return error;

    }

    



}
