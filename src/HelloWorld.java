import redis.clients.jedis.Jedis;

public class HelloWorld
{
    public static void main(String args[]){
        Jedis jedis = new Jedis("redis");
        while(true){
            System.out.println("Server is running: " + jedis.ping());
        }
    }
}
