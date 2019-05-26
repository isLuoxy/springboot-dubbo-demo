package com.luo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.luo.pojo.SmsFlashPromotion;
import com.luo.service.ISmsFlashPromotionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 秒杀商品控制器类
 * @author L99
 * @createDate 2019/5/25
 *
 */
@RestController
public class SmsFlashPromotionController {

    @Reference(version = "1.0")
    ISmsFlashPromotionService smsFlashPromotionService;

    @PostMapping("/flash")
    public Object addFlashPromotion(@RequestBody SmsFlashPromotion flashPromotion) {
        return smsFlashPromotionService.addFlashPromotion(flashPromotion);
    }
}
