package cn.weicelove.robot.controller;

import cn.weicelove.robot.model.req.wechat.WeChatRobotQueryReq;
import cn.weicelove.robot.model.resp.wechat.WeChatRobotResp;
import cn.weicelove.robot.model.wechat.Article;
import cn.weicelove.robot.model.wechat.Img;
import cn.weicelove.robot.model.wechat.News;
import cn.weicelove.robot.wechat.query.QueryFactory;
import java.util.Collections;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DIDIBABA_CAR_QPW Create in 2020/8/11 19:12
 */
@Slf4j
@RestController
@RequestMapping("/answer/wechat")
public class WeChatController {

    /**
     * 对应菜单查询
     *
     * @param  请求参数
     * @return cn.weicelove.robot.model.req.wechat.WeChatRobotQueryReq
     * @author DIDIBABA_CAR_QPW
     */
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public WeChatRobotResp query(@RequestBody WeChatRobotQueryReq weChatRobotQueryReq) {
        return QueryFactory.getQueryByName(weChatRobotQueryReq.getQuery()).query();
    }

}
