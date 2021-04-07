package dev.albruiz.api2;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Protocol;

import java.util.List;

public class redisHelper {
    private static Jedis jedis = new Jedis("servidor",Protocol.DEFAULT_PORT);

    public  void add(String item){
        jedis.lpush("things",item);
    }

    public  List<String> get(){
        List<String> list = jedis.lrange("things", 0 ,jedis.llen("things"));
        return list;
    }
    public void del(String item){
        jedis.lrem("things", 1, item);
    }

    public redisHelper() {
        jedis.auth("");
    }

}
