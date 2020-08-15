package cn.weicelove.robot.load;

import static org.assertj.core.api.Assertions.assertThat;

import cn.weicelove.robot.RobotApplicationTests;
import cn.weicelove.robot.model.EnglishWords;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author DIDIBABA_CAR_QPW Create in 2020/8/15 15:12
 */
@Slf4j
public class WordLoaderTest extends RobotApplicationTests {

    @Autowired
    private WordLoader wordLoader;

    @Test
    public void testGetRandomLengthWord() {
        List<String> subWords = wordLoader.getSubWords();
        log.info("size: {}, data: {}", subWords.size(), subWords);
        assertThat(subWords).isNotEmpty();

        List<String> subWords1 = wordLoader.getSubWords(103977);
        System.out.println("length: " + subWords1.size());
        log.info("size: {}, data: {}", subWords1.size(), subWords1);
        assertThat(subWords1).isNotEmpty();
    }


}
