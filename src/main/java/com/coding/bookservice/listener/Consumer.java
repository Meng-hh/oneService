package com.coding.bookservice.listener;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

@Component
public class Consumer {


    @RabbitListener(queues = "springboot_queue_a")
    public void processMessage(Message message, Channel channel, @Headers Map<String,Object> headers) throws IOException {
        String msg = new String(message.getBody(), StandardCharsets.UTF_8);
        System.out.println(msg);
        System.out.println(headers.get("spring_returned_message_correlation"));
        channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
    }
}
