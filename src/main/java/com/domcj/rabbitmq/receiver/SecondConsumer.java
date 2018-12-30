package java.com.domcj.rabbitmq.receiver;

/**
 * 消息消费者2
 * @author domcj
 * @date 2018/11/25 16:32
 * @email domcj@foxmail.com
 */
//@Component
public class SecondConsumer {

    @RabbitListener(queues = {"first-queue","second-queue"})
    public void handleMessage(Message message) throws Exception {
        // 处理消息
        System.out.println("SecondConsumer {} handleMessage :"+message);
    }
}
