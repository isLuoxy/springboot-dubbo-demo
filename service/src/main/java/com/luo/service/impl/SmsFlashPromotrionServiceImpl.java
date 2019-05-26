package com.luo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.luo.dao.SmsFlashPromotionDao;

import com.luo.pojo.CommonResult;
import com.luo.pojo.SmsFlashPromotion;
import com.luo.service.ISmsFlashPromotionService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 秒杀商品服务层实现
 * @author L99
 * @createDate 2019/5/25
 *
 */
@Service(version = "1.0")
public class SmsFlashPromotrionServiceImpl implements ISmsFlashPromotionService {


    @Autowired
    SmsFlashPromotionDao flashPromotionDao;

    @Override
    public CommonResult addFlashPromotion(SmsFlashPromotion smsFlashPromotion) {
        boolean result = flashPromotionDao.addFlashPromotrion(smsFlashPromotion);
        if (result) {
            return CommonResult.success();
        }

        return CommonResult.failure(-1, "test desc");
    }
}
