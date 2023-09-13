package org.launchcode.hellospring.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
//@RequestMapping("hello")
public class HelloController {


//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring";
//    }

//    @GetMapping("goodbye")
//    public String goodbye(){
//        return "Goodbye, Spring";
//    }

    @RequestMapping(value="hello", method= {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name, Model model){
        String thegreeting = "Hello, " + name + "!";
        model.addAttribute("greeting", thegreeting);
        return "hello";
    }


    @GetMapping("hello/{name}")
    public String hello(@PathVariable String name, Model model){
        model.addAttribute("greeting", "Hello, " + name + "!");
        return "hello";
    }

    @GetMapping("form")
    public String helloForm(){
    return "form";
    }

    @GetMapping("hello-names")
    public String helloNames(Model model){
        List<String> names = new ArrayList<>();
        names.add("LaunchCode");
        names.add("Java");
        names.add("JavaScript");
        model.addAttribute("names", names);
        return "hello-list";
    }

//    @RequestMapping(value="hello", method = RequestMethod.POST)
//    @ResponseBody
//    public String helloPost(@RequestParam String name, @RequestParam String language) {
//        if (name == null) {
//            name = "World";
//        }
//
//        return createMessage(name, language);
//    }

//    public static String createMessage(String name, String language) {
//        String greeting = "";
//
//        if (language.equals("english")) {
//            greeting = "Hello";
//        }
//        else if (language.equals("french")) {
//            greeting = "Bonjour";
//        }
//        else if (language.equals("canadian")) {
//            greeting = "EH?";
//        }
//        else if (language.equals("spanish")) {
//            greeting = "Hola";
//        }
//        else if (language.equals("german")) {
//            greeting = "Hallo";
//        }
//
//        return greeting + " " + name;
//    }


}
