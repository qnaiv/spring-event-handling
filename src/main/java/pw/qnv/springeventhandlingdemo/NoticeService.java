package pw.qnv.springeventhandlingdemo;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * NoticeService
 */
@Service
public class NoticeService {

    @EventListener
    public void eventHandle(TodoCreated event){
        System.out.println("作成されました [TODO ID: " + event.getTodoId() + " / 内容: " + event.getText() + "]");
        
    }
}