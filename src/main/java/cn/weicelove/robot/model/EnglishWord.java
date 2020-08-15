package cn.weicelove.robot.model;

import lombok.Data;

/**
 * @author DIDIBABA_CAR_QPW Create in 2020/8/15 14:03
 */
@Data
public class EnglishWord {

    private String name;

    private String content;

    @Override
    public String toString() {
        return "[" + name + "] => [" + content + "]";
    }
}
