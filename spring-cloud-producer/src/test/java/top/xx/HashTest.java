package top.xx;

import org.junit.Test;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;

public class HashTest {
    public static void main(String[] args) throws Exception {
        // 创建一个MessageDigest实例:
        MessageDigest md = MessageDigest.getInstance("MD5");
        // 反复调用update输入数据:
        md.update("Hello".getBytes("UTF-8"));
        md.update("World".getBytes("UTF-8"));
        byte[] result = md.digest(); // 16 bytes: 68e109f0f40ca72a15e05cc22786f8e6
        System.out.println(new BigInteger(1, result).toString(16));
    }

    @Test
    public void hashMap() {
        HashMap<String,String> hashMap = new HashMap<String, String>();
        hashMap.put("aab","我是1");
        hashMap.put("aba","我是2");
        hashMap.put("baa","我是1");
        hashMap.put("bba","我是2");
        hashMap.put("abc","我是1");
        hashMap.put("acb","我是2");
        hashMap.put("bca","我是1");
        hashMap.put("cba","我是2");
        hashMap.put("bbc","我是1");
        hashMap.put("ccb","我是2");
        hashMap.put("bcb","我是1");
        hashMap.put("cbb","我是2");
        hashMap.put("bcc","我是1");
        hashMap.put("aac","我是2");
        hashMap.put("acc","我是1");
        hashMap.put("cca","我是2");
        hashMap.put("cac","我是2");
        hashMap.put(null,"我是2");
        System.out.println(hashMap.get("1"));
    }



}
