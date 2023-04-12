import java.io.UnsupportedEncodingException;
import java.util.Base64; 
public class encoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        
        //Base64encoding
        final String text= "hello world";
        String encodedtext= Base64.getEncoder().encodeToString(text.getBytes("UTF-8"));
        System.out.println(encodedtext);
        byte[] decodedarr=Base64.getDecoder().decode(encodedtext);
        String decodedtext= new  String(decodedarr,"UTF-8");
        System.out.println(decodedtext);

        //urlencoding
        final String text1= "hello universe";
        String encodedtext1=Base64.getUrlEncoder().encodeToString(text1.getBytes("UTF-8"));
        System.out.println(encodedtext1);
        byte[] decodedarr1= Base64.getDecoder().decode(encodedtext1);
        String decodedtext1= new String(decodedarr1, "UTF-8");
        System.out.println(decodedtext1);

        //mimeencoding
        final String text2="hello earth";
        String encodedtext2=Base64.getMimeEncoder().encodeToString(text2.getBytes("UTF-8"));
        System.out.println(encodedtext2);
        byte[] decodedarr2= Base64.getMimeDecoder().decode(encodedtext2);
        String decodedtext2= new String(decodedarr2,"UTF-8");
        System.out.println(decodedtext2);

    } 
}
