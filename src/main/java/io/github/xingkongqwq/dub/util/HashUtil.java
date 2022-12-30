package io.github.xingkongqwq.dub.util;

import org.apache.tomcat.util.codec.binary.Base64;
import org.jetbrains.annotations.NotNull;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * @author xkawa
 */
public class HashUtil {
    public static String hmacSha512(@NotNull String p, @NotNull String k) throws InvalidKeyException, NoSuchAlgorithmException {
        Mac m = Mac.getInstance("HmacSHA512");
        SecretKeySpec secretKey = new SecretKeySpec(k.getBytes(StandardCharsets.UTF_8), "HmacSHA512");
        m.init(secretKey);
        byte[] hash = m.doFinal(p.getBytes(StandardCharsets.UTF_8));
        String encodeStr = Base64.encodeBase64String(hash);
        return byte2Hex(hash);
    }
    private static @NotNull String byte2Hex(byte @NotNull [] bytes) {
        StringBuilder stringBuffer = new StringBuilder();
        String temp = null;
        for (byte aByte : bytes) {
            temp = Integer.toHexString(aByte & 0xFF);
            if (temp.length() == 1) {
                //1得到一位的进行补0操作
                stringBuffer.append("0");
            }
            stringBuffer.append(temp);
        }
        return stringBuffer.toString();
    }
}
