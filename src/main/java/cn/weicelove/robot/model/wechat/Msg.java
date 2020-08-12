package cn.weicelove.robot.model.wechat;

/**
 * @author DIDIBABA_CAR_QPW Create in 2020/8/12 11:41
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class Msg {

    /** 回复的意图id */
    @JsonProperty("ans_node_id")
    private Long ansNodeId;

    /** 技能名称 */
    @JsonProperty("ans_node_name")
    private String ansNodeName;

    private String article;

    /** 分值 */
    private Integer confidence;

    /** 回复内容 */
    private String content;

    @JsonProperty("debugInfo")
    private String debugInfo;

    private String event;

    @JsonProperty("list_options")
    private Boolean listOptions;

    @JsonProperty("msg_type")
    private String msgType;

    private String opening;

    @JsonProperty("request_id")
    private Integer requestId;

    /** 	回复的意图名称 */
    @JsonProperty("resp_title")
    private String respTitle;

    @JsonProperty("scene_status")
    private String sceneStatus;

    @JsonProperty("session_id")
    private String sessionId;

    /** 回复所用匹配类型 */
    private String status;

    @JsonProperty("take_options_only")
    private Boolean takeOptionsOnly;

}