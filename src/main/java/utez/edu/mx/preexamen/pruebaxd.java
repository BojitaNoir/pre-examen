package utez.edu.mx.preexamen;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user1")
@CrossOrigin("*")

public class pruebaxd {
    @GetMapping("")
    public String getMessage(){
        return "QUE PASA CAUSA GAAAAAAAA!";
    }
}