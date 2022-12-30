package io.github.xingkongqwq.dub.router.api.v1;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.ShearCaptcha;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xkawa
 */
@RestController
@RequestMapping("/api/v1/cap")
public class CaptchaController {
    @GetMapping("/new")
    public Map<String,Object> getImage(){
        Map<String,Object> map = new HashMap<>(3);
        try {
            ShearCaptcha shearCaptcha = CaptchaUtil.createShearCaptcha(200, 90, 4, 4);
            map.put("code",0);
            map.put("url",shearCaptcha.getImageBase64());
        } catch (Exception e){
            map.put("code",-1);
        }
        return map;
    }
}
