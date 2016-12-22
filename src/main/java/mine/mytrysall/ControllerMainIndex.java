package mine.mytrysall;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping(value = "/teachtools", method = RequestMethod.GET)
    public String teachtools(Model model) {
        // model.addAttribute("recipient", "World");
        return "teachtools";
    }

    @RequestMapping(value = "json/datagrid_data1.json", method = RequestMethod.GET)
    @ResponseBody
    public Object datagrid(Model model) {
        // model.addAttribute("recipient", "World");

        // Map<String, Object> result = new HashMap<String, Object>();
        // List<User> users = userService.getAllUser(null, null);
        // JSONArray jsonArray = new JSONArray();
        // for (User user : users) {
        // JSONObject jsonObject = new JSONObject();
        // jsonObject.put("id", user.getUid());
        // jsonObject.put("name", user.getName());
        // jsonObject.put("age", user.getAge());
        // jsonObject.put("phone", user.getPhone());
        // jsonArray.add(jsonObject);
        // }
        // result.put("total", users.size());
        // result.put("rows", jsonArray);
        // return JSONObject.fromObject(result);

        Map<String, String> result = new HashMap<String, String>();
        result.put("productid", "FI-SW-01");
        result.put("unitcost", "10.00");
        result.put("status", "P");
        result.put("listprice", "36.50");

        // JSONObject jsonObject = new JSONObject();
        // jsonObject = JSONObject.fromObject(result);
        return result;
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
