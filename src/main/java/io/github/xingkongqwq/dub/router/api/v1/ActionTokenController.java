package io.github.xingkongqwq.dub.router.api.v1;

import io.github.xingkongqwq.dub.util.HashUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author xkawa
 */
@RestController
@RequestMapping("/api/v1")
public class ActionTokenController {
    @GetMapping("/at")
    public Map<String, Object> getToken(Long t){
        Map<String, Object> map = new HashMap<>(2);
        try {
            Objects.requireNonNull(t);
            String hash = HashUtil.hmacSha512(String.valueOf(t),"DEV_UNION_SALT");
            map.put("code",0);
            map.put("tk",hash);
        } catch (Exception e) {
            map.put("code",-1);
        }
        return map;
    }
}
