package java.com.domcj.rabbitmq.mqcallback;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
/**
 * 消息确认机制
 * @author domcj
 * @date 2018/11/25 17:32
 * @email domcj@foxmail.com
 */
public class MsgSendReturnCallback implements RabbitTemplate.ReturnCallback {
    @Override
    public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
        System.out.println("回馈消息："+message);
    }
}
