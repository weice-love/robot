package cn.weicelove.robot.wechat.query;

/**
 * 查询工厂类
 * @author DIDIBABA_CAR_QPW Create in 2020/8/12 16:14
 */
public class QueryFactory {

    public static Query getQueryByName(String name) {
        switch (name) {
            case "英语": return new EnglishQuery();
            case "美图": return new ImgQuery();
            default: return new MenuQuery();
        }
    }

}
