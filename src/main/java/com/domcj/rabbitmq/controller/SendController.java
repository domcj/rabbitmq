package java.com.domcj.rabbitmq.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.space.rabbitmq.sender.FirstSender;

/**
 * @author domcj
 * @date 2018/11/25 17:45
 * @email domcj@foxmail.com
 */
@RestController
public class SendController {

    @Autowired
    private FirstSender firstSender;

    @GetMapping("/send")
    public String send(String message){
        String uuid = UUID.randomUUID().toString();
        firstSender.send(uuid,message);
        return uuid;
    }
}
