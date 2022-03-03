package cn.diyiliu.redis.pubsub;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * RedisMessageSubscriber
 *
 * @author: DIYILIU
 * @date: 2022/03/03
 */

public class RedisMessageSubscriber implements MessageListener {
    public static List<String> messageList = new ArrayList();

    public void onMessage(Message message, byte[] pattern) {
        messageList.add(message.toString());

        System.out.println("Message received: " + message);
    }
}
