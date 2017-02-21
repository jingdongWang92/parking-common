package com.jcble.parking.common.service;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;

import com.xiaoguo.yo.common.util.crypto.Des;
import com.xiaoguo.yo.common.util.crypto.EncryptUtil;
import com.xiaoguo.yo.common.util.crypto.MD5;

import baseproj.component.log.LoggerAdapter;
import baseproj.component.log.LoggerService;

/**
 * 业务接口层基类,公共业务实现
 * 
 * @author Jingdong Wang
 * 
 */
public abstract class AbstractBaseService {
    protected final LoggerService logger = LoggerAdapter.getLoggerService(getClass());

    public static String signature(Map<String, String> params, String secret, boolean appendSecret, boolean isHMac,
            String signName) throws Exception {
        params.remove(signName);
        String[] names = params.keySet().toArray(ArrayUtils.EMPTY_STRING_ARRAY);
        Arrays.sort(names);
        StringBuilder sb = new StringBuilder();
        // append if not hmac
        if (!isHMac) {
            sb.append(secret);
        }
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            sb.append(name);
            sb.append(params.get(name));
        }
        if (appendSecret && !isHMac) {
            sb.append(secret);
        }
        String sign = null;
        try {
            if (isHMac) {
                // hmac
                sign = EncryptUtil.byte2hex(EncryptUtil.encryptHMAC(sb.toString().getBytes("utf-8"), secret.getBytes("utf-8")));
            } else {
                // md5
                sign = MD5.encrypt(sb.toString()).toUpperCase();
            }
        } catch (UnsupportedEncodingException e) {
            throw new java.lang.RuntimeException(e);
        }
        return sign;
    }
    
    /**
     * 解密账号
     * 
     * @param baseReq
     * @return
     */
    protected String decryptAccount(String beforDecryAccount) {
        String account = Des.decryptDES(beforDecryAccount,"MZdP^dq7");
        return account;
    }
    
    
}
