package cn.weicelove.robot.load;

import cn.weicelove.robot.model.EnglishWords;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author DIDIBABA_CAR_QPW Create in 2020/8/15 10:45
 */
@Slf4j
@Component
public class WordLoader implements Loader {

    @Value("${word.file.path}")
    private String defaultWordFilePath;

    @Value("${word.dir.path}")
    private String defaultWordDirPath;

    @Value("${word.length}")
    private int defaultWordLength;

    private static List<String> words;

    @Override
    public File loadFile() {
        return loadFile(defaultWordFilePath);
    }

    @Override
    public List<File> loadFiles() {
        return loadFiles(defaultWordDirPath);
    }

    /**
     *
     * 从文件中加载单词到内存
     *
     * @return void
     * @author DIDIBABA_CAR_QPW
     */
    private void getDefaultWordContent() {

        initWordContent();

        // 加载文件
        File file = loadFile();
        // 处理文件
        if (file == null) {
            log.warn("文件不存在! path: {}", defaultWordFilePath);
        }
        if (!file.isFile()) {
            log.warn("非文件: {}", file.getName());
        }

        // 处理文件
        try(BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))){
            String line;
            int cnt = 0;
            while ((line = bufferedReader.readLine()) != null) {
                words.add(line.replace("\",", "\" => "));
//                log.info("line: {}", line);
                cnt ++;
            }
            // 103977
            log.info("cnt: {}", cnt);
        } catch (IOException e) {
            log.error("failed", e);
        }
    }

    /**
     * 获取默认长度的单词列表
     *
     * @return java.util.List<java.lang.String>
     * @author DIDIBABA_CAR_QPW
     */
    public List<String> getSubWords() {
        return getSubWords(defaultWordLength);
    }

    /**
     * 获取指定长度的单词列表
     *
     * @param length 列表长度
     * @return java.util.List<java.lang.String> 单词列表
     * @author DIDIBABA_CAR_QPW
     */
    public List<String> getSubWords(int length) {
        // 检查是否为空
        if (CollectionUtils.isEmpty(words)) {
            getDefaultWordContent();
        }

        if (length <=0 || words.size() < length) {
            throw new ArrayIndexOutOfBoundsException(length);
        }
        int size = words.size();
        int startPos = new Random().nextInt(size - length + 1);
        return words.stream().skip(startPos).limit(length).collect(Collectors.toList());

    }

    /**
     *
     * 初始化内容
     *
     * @return void 无
     * @author DIDIBABA_CAR_QPW
     */
    private void initWordContent() {
        words = null;
        words = new ArrayList<>();
    }
}
