package cn.weicelove.robot.model.wechat;

/**
 * @author DIDIBABA_CAR_QPW Create in 2020/8/12 11:40
 */

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.List;
import lombok.Data;


@Data
public class Nlu {

    /** 回答详细信息 */
    private List<Msg> msg;

    @JsonProperty("slots_info")
    private List<String> slotsInfo;

    /** 是否显示回复 */
    @JsonProperty("answer_open")
    private Integer answerOpen;

    private String title;

    /** 意图回复id */
    @JsonProperty("ans_node_id")
    private Long ansNodeId;

    /** 接受query的机器人 */
    @JsonProperty("to_user_name")
    private String toUserName;

    @JsonProperty("take_options_only")
    private Boolean takeOptionsOnly;

    private String event;

    @JsonProperty("msg_id")
    private String msgId;

    @JsonProperty("intent_confirm_status")
    private String intentConfirmStatus;

    @JsonProperty("bid_stat")
    private BidStat bidStat;

    private Integer ret;

    @JsonProperty("slot_info")
    private List<String> slotInfo;

    @JsonProperty("create_time")
    private Date createTime;

    private Integer confidence;

    @JsonProperty("list_options")
    private Boolean listOptions;

    @JsonProperty("session_id")
    private String sessionId;

    private String opening;

    private String article;

    @JsonProperty("scene_status")
    private String sceneStatus;

    /** 发起query的用户,对应签名接口的userid */
    @JsonProperty("from_user_name")
    private String fromUserName;

    /** 回答 */
    private String answer;

    /** 回答类型:text,music,news */
    @JsonProperty("answer_type")
    private String answerType;

    @JsonProperty("dialog_session_status")
    private String dialogSessionStatus;

    @JsonProperty("ans_node_name")
    private String ansNodeName;

    @JsonProperty("dialog_status")
    private String dialogStatus;

    @JsonProperty("request_id")
    private Integer requestId;

    /** 机器人回复的状态, 可能的数值：FAQ、NOMATCH、CONTEXT_FAQ、GENERAL_FAQ */
    private String status;


}