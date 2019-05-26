package com.luo.service;


import com.luo.pojo.CommonResult;
import com.luo.pojo.SmsFlashPromotion;

/**
 * 秒杀商品服务层
 * @author L99
 * @createDate 2019/5/25
 *
 */
public interface ISmsFlashPromotionService {


    CommonResult addFlashPromotion(SmsFlashPromotion smsFlashPromotion);
}
