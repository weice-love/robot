package cn.weicelove.robot.wechat.query;

import cn.weicelove.robot.model.resp.wechat.WeChatRobotResp;
import cn.weicelove.robot.model.wechat.Img;
import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.Map;

/**
 * @author DIDIBABA_CAR_QPW Create in 2020/8/12 16:00
 */
public class ImgQuery implements Query {

    @Override
    public WeChatRobotResp query() {
        WeChatRobotResp weChatRobotResp = new WeChatRobotResp();
        Img img = new Img();
        img.setMediaId("KegpipQG9t-klMo25My4e4BCZFcmKvgMcpMFAkC-VFE");
        img.setUrl("http://mmbiz.qpic.cn/mmbiz_jpg/W3gQtpV3j8Bax22dhRiccWAb2AtVjal28XmqnhDW22dMn3RA5EoGkpolMO3tD9kQC1Hf9AjEJI66K40xQsNtXgQ/0?wx_fmt=jpeg");

        Map<String, Img> result = new HashMap<>();
        result.put("image", img);
        weChatRobotResp.setAnswer(JSONObject.toJSONString(result));
        return weChatRobotResp;
    }
}
