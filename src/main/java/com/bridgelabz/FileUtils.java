package com.bridgelabz;

import java.io.File;

/* To delete the existing file */

public class FileUtils {
    /* This method is implemented to delete the existing files */

    public static boolean deleteFiles(File contentsToDelete) {
        File[] allContents = contentsToDelete.listFiles();
        if (allContents != null) {
            for (File file : allContents) {
                deleteFiles(file);
            }
        }
        return contentsToDelete.delete();
    }

}
