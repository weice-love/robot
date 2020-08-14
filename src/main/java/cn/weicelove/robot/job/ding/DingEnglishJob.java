package cn.weicelove.robot.job.ding;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiRobotSendRequest;
import com.dingtalk.api.response.OapiRobotSendResponse;
import com.taobao.api.ApiException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author DIDIBABA_CAR_QPW Create in 2020/8/12 20:36
 */
@Slf4j
@Component
public class DingEnglishJob {

    @Value("${dingtalk.url}")
    private String dingUrl;

    private static final List<String> ENGLISH_WORDS;

    static {
        ENGLISH_WORDS = new ArrayList<>();
        ENGLISH_WORDS.add("aapamoor => n.[生]丘泽,高低位镶嵌沼泽");
        ENGLISH_WORDS.add("abacist => n.用算盘者");
        ENGLISH_WORDS.add("abandonment => n.放弃");
        ENGLISH_WORDS.add("abash => vt.使局促不安,使困窘");
        ENGLISH_WORDS.add("abashment => n.羞愧,害臊");
    }


    //@Scheduled(fixedDelay = 6000)
    @Scheduled(cron = "0 0 21-23 * * *")
    public void sendEnglishWords() {

        DingTalkClient client = new DefaultDingTalkClient(dingUrl);
        OapiRobotSendRequest request = new OapiRobotSendRequest();
        request.setMsgtype("text");
        OapiRobotSendRequest.Text text = new OapiRobotSendRequest.Text();
        text.setContent(ENGLISH_WORDS.get(new Random().nextInt(ENGLISH_WORDS.size())));
        request.setText(text);
        OapiRobotSendRequest.At at = new OapiRobotSendRequest.At();
        //at.setAtMobiles(Arrays.asList("132xxxxxxxx"));
        // isAtAll类型如果不为Boolean，请升级至最新SDK
        at.setIsAtAll(false);
        request.setAt(at);

//        request.setMsgtype("link");
//        OapiRobotSendRequest.Link link = new OapiRobotSendRequest.Link();
//        link.setMessageUrl("https://www.dingtalk.com/");
//        link.setPicUrl("");
//        link.setTitle("时代的火车向前开");
//        link.setText("这个即将发布的新版本，创始人xx称它为红树林。而在此之前，每当面临重大升级，产品经理们都会取一个应景的代号，这一次，为什么是红树林");
//        request.setLink(link);
//
//        request.setMsgtype("markdown");
//        OapiRobotSendRequest.Markdown markdown = new OapiRobotSendRequest.Markdown();
//        markdown.setTitle("杭州天气");
//        markdown.setText("#### 杭州天气 @156xxxx8827\n" +
//                "> 9度，西北风1级，空气良89，相对温度73%\n\n" +
//                "> ![screenshot](https://gw.alicdn.com/tfs/TB1ut3xxbsrBKNjSZFpXXcXhFXa-846-786.png)\n" +
//                "> ###### 10点20分发布 [天气](http://www.thinkpage.cn/) \n");
//        request.setMarkdown(markdown);
        try {
            OapiRobotSendResponse response = client.execute(request);
        } catch (ApiException e) {
            log.error("发送失败!!!", e);
        }

    }

}
