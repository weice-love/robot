package cn.weicelove.robot.wechat.query;

import cn.weicelove.robot.model.resp.wechat.WeChatRobotResp;

/**
 * @author DIDIBABA_CAR_QPW Create in 2020/8/12 16:00
 */
public class MenuQuery implements Query {

    @Override
    public WeChatRobotResp query() {
        WeChatRobotResp weChatRobotResp = new WeChatRobotResp();
        weChatRobotResp.setAnswer("暂无菜单，-_-!    可以发送以下口令，使用其功能['美图', '英语']");
        return weChatRobotResp;
    }
}
