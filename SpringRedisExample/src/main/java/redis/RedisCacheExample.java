package redis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * http://memorynotfound.com/spring-redis-cache-manager-example/
 */
public class RedisCacheExample {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MusicService musicService = ctx.getBean(MusicService.class);

        System.out.println("message: " + musicService.play("trumpet"));
        System.out.println("message: " + musicService.play("trumpet"));
        System.out.println("message: " + musicService.play("guitar"));
        System.out.println("message: " + musicService.play("guitar"));

        System.out.println("Done.");
    }

}