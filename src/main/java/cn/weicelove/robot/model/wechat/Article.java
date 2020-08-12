package cn.weicelove.robot.model.wechat;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author DIDIBABA_CAR_QPW Create in 2020/8/12 15:23
 */
@Data
@Accessors(chain = true)
public class Article implements Serializable {

    private static final long serialVersionUID = 6878960334699948573L;

    private String title;

    private String description;

    private String url;

    private String picurl;

    private String type;

}