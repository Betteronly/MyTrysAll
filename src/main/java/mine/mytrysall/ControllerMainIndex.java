package mine.mytrysall;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/*")
public class ControllerMainIndex {

    // @Autowired
    // private TeamService teamService;

    public ControllerMainIndex() {
        super();
    }

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String mainIndex() {
        return "index";
    }

    @RequestMapping({ "/ex", "/extrathyme" })
    public String show() {
        return "extrathyme";
    }

    @RequestMapping(value = "/model", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("recipient", "World");
        return "index";
    }

    // @RequestMapping(value = "/test", method = RequestMethod.GET)
    // public ModelAndView save(String name1, String password1) {
    // name1 = "李荣";
    // System.out.println("接收到的信息:" + name1);
    // ModelAndView mov = new ModelAndView();
    // mov.setViewName("succ2");
    // mov.addObject("name", name1);
    // mov.addObject("passwd", password1);
    // mov.addObject("msg", "保存成功");
    //
    // return mov;
    // }
}
