package cn.diyiliu.redis;

import cn.diyiliu.redis.config.RedisConfig;
import cn.diyiliu.redis.config.SpringContextHolder;
import cn.diyiliu.redis.pubsub.MessagePublisher;

/**
 * Main
 *
 * @author: DIYILIU
 * @date: 2022/03/03
 */
public class Main {

    public static void main(String[] args) {
        SpringContextHolder.init(RedisConfig.class);

        MessagePublisher publisher = SpringContextHolder.getBean("redisPublisher");
        publisher.publish("hello");
    }
}
