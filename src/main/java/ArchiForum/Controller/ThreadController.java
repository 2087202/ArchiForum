package ArchiForum.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ArchiForum.Domain.Thread;
import ArchiForum.Repository.ThreadRepository;

/**
 * Created by tmo on 27-2-2017.
 */
@Controller
@RequestMapping("/thread")
public class ThreadController {
    @Autowired
    private final ThreadRepository threadRepository;

    public ThreadController(ThreadRepository threadRepository){
        this.threadRepository = threadRepository;
    }

    @GetMapping
    public ModelAndView threadList(){
        Iterable<Thread> threads = this.threadRepository.findAll();
        return new ModelAndView("threads/list","threads",threads);
    }
}
