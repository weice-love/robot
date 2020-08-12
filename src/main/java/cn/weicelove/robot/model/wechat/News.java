package cn.weicelove.robot.model.wechat;

import cn.weicelove.robot.model.wechat.Article;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 * @author DIDIBABA_CAR_QPW Create in 2020/8/12 15:18
 */
@Data
public class News implements Serializable {

    private static final long serialVersionUID = 3080609211703589713L;

    private List<Article> articles;

}
