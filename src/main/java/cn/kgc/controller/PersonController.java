package cn.kgc.controller;

import cn.kgc.entity.Person;
import cn.kgc.mapper.PersonMapper;
import cn.kgc.service.PersonSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class PersonController {

    @Autowired
    PersonSevice personSevice;
    @RequestMapping(value = "/all")
    public String all(HttpServletRequest request){
        List<Person> person = personSevice.getAll();
        HttpSession session = request.getSession();
        session.setAttribute("list",person);
        return "redirect:index.jsp";
    }
//删
    @RequestMapping(value = "/del")
    public String del(@RequestParam("id")int id){
        personSevice.del(id);
        return "redirect:all";
    }
    //加
    @RequestMapping(value = "/add")
    public String add(Person person){
        if(person.getId()==null){
            personSevice.add(person);
        }else{
            personSevice.updata(person);
        }
        return "redirect:all";
    }


//    @RequestMapping(value = "/pid")
//    public String pid(@RequestParam("id") int id,HttpServletRequest request){
//        Person person = personSevice.getPersonById(id);
//        request.setAttribute("person",person);
//        return "updata.jsp";
//    }
//改
    @RequestMapping(value = "/updata")
    public String updata(@RequestParam("id") int id,HttpServletRequest request){
        Person personById = personSevice.getPersonById(id);
        HttpSession session = request.getSession();
        session.setAttribute("person",personById);
        return "updata.jsp";
    }
}
