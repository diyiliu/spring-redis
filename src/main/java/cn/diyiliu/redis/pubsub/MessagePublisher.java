package cn.diyiliu.redis.pubsub;

/**
 * MessagePublisher
 *
 * @author: DIYILIU
 * @date: 2022/03/03
 */
public interface MessagePublisher {
    void publish(String message);
}
