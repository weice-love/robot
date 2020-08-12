package cn.weicelove.robot.model.wechat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import lombok.Data;

/**
 * @author DIDIBABA_CAR_QPW Create in 2020/8/12 11:43
 */
@Data
public class BidStat {

    @JsonProperty("curr_time")
    @JsonFormat(pattern = "yyyyMMdd-HH:mm:ss", timezone = "GMT+8")
    private Date currTime;

    @JsonProperty("err_msg")
    private String errMsg;

    @JsonProperty("latest_time")
    @JsonFormat(pattern = "yyyyMMdd-HH:mm:ss", timezone = "GMT+8")
    private Date latestTime;

    @JsonProperty("latest_valid")
    private Boolean latestValid;

    /** 更新返回结果 */
    @JsonProperty("up_ret")
    private Integer upRet;

}
