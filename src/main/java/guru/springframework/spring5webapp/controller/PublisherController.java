package guru.springframework.spring5webapp.controller;

import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublisherController {
    @Autowired
    private PublisherRepository publisherRepository;

    @RequestMapping("/publishers")
    public String getPublisher(Model model){
        model.addAttribute("publishers", publisherRepository.findAll());
        return "publisher/list";
    }
}
