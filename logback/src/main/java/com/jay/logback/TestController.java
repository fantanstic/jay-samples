package com.jay.logback;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration

@RestController()
@RequestMapping("test")
public class TestController {
    private Logger log = LoggerFactory.getLogger(TestController.class);

    @GetMapping("index")
    public String index(){

//        log.debug("test logback usage [{}] [{}]", "20190808", "jay");
//        log.info("=============================");
//        return "test logback";

        try {
            System.out.println("AE"+StringUtils.leftPad(String.valueOf("1234"), 8, '0'));
            if(log.isDebugEnabled()){
                log.debug("&&&&&&&&&&test logback usage [{}] [{}]", "20190808", "jay");
            }
            log.info("&&&&&&&&&&test info");
        }catch (Exception e){
            log.info("&&&&&&&&&&thorw errors");
        }
        return "test logback";
    }

//    @Override
//    @Transactional
//    public void createUserAndBindMobile(@NotBlank String mobile, @NotNull User user) throws CreateConflictException{
//        boolean debug = log.isDebugEnabled();
//        if(debug){
//            log.debug("开始创建用户并绑定手机号. args[mobile=[{}],user=[{}]]", mobile, LogObjects.toString(user));
//        }
//        try {
//            user.setCreateTime(new Date());
//            user.setUpdateTime(new Date());
//            userRepository.insertSelective(user);
//            if(debug){
//                log.debug("创建用户信息成功. insertedUser=[{}]",LogObjects.toString(user));
//            }
//            UserMobileRelationship relationship = new UserMobileRelationship();
//            relationship.setMobile(mobile);
//            relationship.setOpenId(user.getOpenId());
//            relationship.setCreateTime(new Date());
//            relationship.setUpdateTime(new Date());
//            userMobileRelationshipRepository.insertOnDuplicateKey(relationship);
//            if(debug){
//                log.debug("绑定手机成功. relationship=[{}]",LogObjects.toString(relationship));
//            }
//            log.info("创建用户并绑定手机号. userId=[{}],openId=[{}],mobile=[{}]",user.getId(),user.getOpenId(),mobile);
//        }catch(DuplicateKeyException e){
//            log.info("创建用户并绑定手机号失败,已存在相同的用户. openId=[{}],mobile=[{}]",user.getOpenId(),mobile);
//            throw new CreateConflictException("创建用户发生冲突, openid=[%s]",user.getOpenId());
//        }
//    }
}
