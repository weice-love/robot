package cn.weicelove.robot.model.req.wechat;

import cn.weicelove.robot.model.wechat.Nlu;
import java.io.Serializable;
import lombok.Data;

/**
 * @author DIDIBABA_CAR_QPW Create in 2020/8/11 19:17
 */
@Data
public class WeChatRobotQueryReq implements Serializable {

    private static final long serialVersionUID = -568677517108259951L;

    private String touser;

    private Nlu nlu;

    private String query;

}
