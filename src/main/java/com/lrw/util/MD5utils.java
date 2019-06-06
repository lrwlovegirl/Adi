package com.lrw.util;


import java.security.MessageDigest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * MD5����
 * @author Administrator
 *
 */
public class MD5utils {

    private static final Logger LOGGER = LoggerFactory.getLogger(MD5utils.class);


    private static byte[] md5(String s) {
        MessageDigest algorithm;
        try {
            algorithm = MessageDigest.getInstance("MD5");
            algorithm.reset();
            algorithm.update(s.getBytes("UTF-8"));
            byte[] messageDigest = algorithm.digest();
            return messageDigest;
        } catch (Exception e) {
            LOGGER.error("MD5 Error...", e);
        }
        return null;
    }

    private static final String toHex(byte hash[]) {
        if (hash == null) {
            return null;
        }
        StringBuffer buf = new StringBuffer(hash.length * 2);
        int i;

        for (i = 0; i < hash.length; i++) {
            if ((hash[i] & 0xff) < 0x10) {
                buf.append("0");
            }
            buf.append(Long.toString(hash[i] & 0xff, 16));
        }
        return buf.toString();
    }

    public static String hash(String s) {
        try {
            return new String(toHex(md5(s)).getBytes("UTF-8"), "UTF-8");
        } catch (Exception e) {
            LOGGER.error("not supported charset...{}", e);
            return s;
        }
    }
    
    /**
     * �����밴���û��������룬�ν��м���
     * @param username �û���
     * @param password ����
     * @param salt ��
     * @return
     */
    public static String encryptPassword(String username, String password, String salt) {
        return MD5utils.hash(username + password + salt);
    }
    
    /**
     * �����밴�����룬�ν��м���
     * @param password ����
     * @param salt ��
     * @return
     */
    public static String encryptPassword(String password, String salt) {
        return MD5utils.hash(password + salt);
    }
    
}