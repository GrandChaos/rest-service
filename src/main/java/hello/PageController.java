package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    @RequestMapping("/page")
    public Page page(@RequestParam(value="text", required=false, defaultValue="hsdg") String text) {
        return new Page(String.format(text));
    }
}
