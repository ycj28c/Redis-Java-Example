package redis;

import redis.clients.jedis.Jedis;

public class RedisStringJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ӱ��ص� Redis ����
	      Jedis jedis = new Jedis("localhost");
	      System.out.println("Connection to server sucessfully");
	      //���� redis �ַ�������
	      jedis.set("w3ckey", "Redis tutorial");
	     // ��ȡ�洢�����ݲ����
	     System.out.println("Stored string in redis:: "+ jedis.get("w3ckey"));
	}

}
