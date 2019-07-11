package pw.qnv.springeventhandlingdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * TodoService
 */
@RestController
public class TodoController {

    @Autowired ApplicationEventPublisher publisher;
    @GetMapping(value="")
    public String createTodo() {
        publisher.publishEvent(new TodoCreated(this, "1", "買い物に行く"));
        return "Todo created";
    }
    
}