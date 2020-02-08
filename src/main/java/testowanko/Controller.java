package testowanko;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Testing";
    }
}
