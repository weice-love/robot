package cn.weicelove.robot.wechat.query;

import cn.weicelove.robot.model.resp.wechat.WeChatRobotResp;
import cn.weicelove.robot.model.wechat.Article;
import cn.weicelove.robot.model.wechat.News;
import com.alibaba.fastjson.JSONObject;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author DIDIBABA_CAR_QPW Create in 2020/8/12 16:01
 */
public class EnglishQuery implements Query {

    @Override
    public WeChatRobotResp query() {
        WeChatRobotResp weChatRobotResp = new WeChatRobotResp();
        News news = new News();
        Article article = new Article()
                .setTitle("实时更新：新型肺炎疫情最新动态")
                .setDescription("腾讯新闻第一时间同步全国新型肺炎疫情动态，欢迎关注、转发")
                .setPicurl("https://news.qq.com/zt2020/page/feiyan.htm")
                .setType("h5")
                .setUrl("http://mmbiz.qpic.cn/mmbiz_jpg/W3gQtpV3j8D8kZRqfpTJlfVqubwgFQf47H0GWlGV6leaDF80ZpdtuFhQVsCsM3YKmwkujXzdjR2k6aWfA41ic7Q/0?wx_fmt=jpeg");
        news.setArticles(Collections.singletonList(article));
        Map<String, News> result = new HashMap<>();
        result.put("news", news);
        weChatRobotResp.setAnswer(JSONObject.toJSONString(result));
        return weChatRobotResp;
    }
}
