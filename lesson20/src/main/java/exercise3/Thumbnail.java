package exercise3;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.name.Rename;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;

public class Thumbnail {

    public static void main(String[] args) throws IOException {
        File initialFile = new File("/Users/yanakarmanova/Desktop/CV/Templates/folder/Picture1.png");
        File[] files = new File[1];
        files[0] = initialFile;
        Thumbnails.of(files)
                .size(1064, 1064)
                .outputFormat("jpg")
                .toFiles(Rename.PREFIX_DOT_THUMBNAIL);
    }
}
