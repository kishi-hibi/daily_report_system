package utils;

import javax.xml.bind.DatatypeConverter;

public class EncryptUtil {
    public static String getPasswordEncrypt(String plain_p, String salt) {
        String ret = "";

        if(plain_p != null && !plain_p.equals("")) {
            byte[] bytes;
            String password = plain_p + salt;
            try {
                bytes = MessageDigst.getInstance("SHA-256").digest(password.getBytes());
                ret = DatatypeConverter.prinHexBinary(bytes);
            } catch(NoSuchAlgorithmExceprion ex) {}
        }

        return ret;

    }

}
