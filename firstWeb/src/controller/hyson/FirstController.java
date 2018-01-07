package controller.hyson;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping(value="/hello")
public class FirstController {
    @RequestMapping(value="/firstController")
    public String handleRequest(HttpServletRequest request, HttpServletResponse response, Model model) {
        // 在模型对象中添加数据
        model.addAttribute("msg", "这是我的第一个Spring MVC程序！");
        // 返回视图页面
        return "first";
    }
}
