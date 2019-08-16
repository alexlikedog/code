import com.User;
import org.junit.Test;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.*;
import java.net.URLDecoder;

/**
 * @author alex
 * @Title: Stu
 * @ProjectName spring
 * @Description: TODO
 * @date 2019/1/6  15:24
 */
public class Stu {
    @Test
    public void f1() throws IOException, ClassNotFoundException {
        /**
         * step 1:对象序列化为流
         * step 2:Base64加密
         * step 3:URLEncoder加密
         */
        User user = new User();user.setName("张磊alex");
        String s = writeObject((Serializable) user);
        User u = readObject(URLDecoder.decode(s,"utf-8"), User.class);//URLDecoder.decode(userStr)
        System.out.println(u);


    }

    public static <T> T readObject(String base64Str, Class<T> clazz) throws IOException, ClassNotFoundException {
        BASE64Decoder base64Decoder = new BASE64Decoder();
        byte[] buf = base64Decoder.decodeBuffer(base64Str);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buf);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        T object = (T) objectInputStream.readObject();
        return object;
    }

    public static String writeObject(Serializable serializable) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(serializable);
        objectOutputStream.flush();
        BASE64Encoder base64Encoder = new BASE64Encoder();
        return base64Encoder.encode(byteArrayOutputStream.toByteArray());
    }
}
