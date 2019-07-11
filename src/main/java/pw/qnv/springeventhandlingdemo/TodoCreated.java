package pw.qnv.springeventhandlingdemo;

import org.springframework.context.ApplicationEvent;

import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * TodoCreated
 */
@Getter
@EqualsAndHashCode
public class TodoCreated extends ApplicationEvent{

    private static final long serialVersionUID = 1L;
    private String todoId;
    private String text;

    public TodoCreated(Object source, String todoId, String text) {
        super(source);
        this.todoId = todoId;
        this.text = text;
        
    }

    
}