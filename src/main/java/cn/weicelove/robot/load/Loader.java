package cn.weicelove.robot.load;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;

/**
 * @author DIDIBABA_CAR_QPW Create in 2020/8/15 10:42
 */
public interface Loader {

    File loadFile();

    List<File> loadFiles();

    default File loadFile(String filePath){
        return new File(filePath);
    }

    default List<File> loadFiles(String dirPath) {
        File file = new File(dirPath);
        // 可以指定搜索的文件类型
        Collection<File> files = FileUtils.listFiles(file, TrueFileFilter.TRUE, TrueFileFilter.TRUE);
        return new ArrayList<>(files);
    }

}
