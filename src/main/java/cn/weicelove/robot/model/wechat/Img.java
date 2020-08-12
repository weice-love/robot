package cn.weicelove.robot.model.wechat;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * @author DIDIBABA_CAR_QPW Create in 2020/8/12 15:18
 */
@Data
public class Img implements Serializable {

    private static final long serialVersionUID = 4539129252267115144L;

    @JsonProperty("media_id")
    private String mediaId;

    private String url;
}
