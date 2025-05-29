package utez.edu.mx.preexamen;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user1")
@CrossOrigin("*")
public class usuario2 {
    @GetMapping("")
    public String getMessage(){
        return "Hola pe causas!";
    }
}
