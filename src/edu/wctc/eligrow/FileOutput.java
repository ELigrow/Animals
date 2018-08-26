package edu.wctc.eligrow;

import java.io.*;

/**
 * Created by mgreen14 on 12/27/17.
 */

/**
 * Outputs console to a file.
 * @author Matt Green
 * @version 1.0
 */
public class FileOutput {

    Writer out = null;
    private String fileName;

    /**
     * Specifies file to write
     * @param fileName
     */
    public FileOutput(String fileName) {
        this.fileName = fileName;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
        }
        catch(FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " "  + e);
        }
    }

    /**
     * Writes to specified file
     * @param line
     */
    public void fileWrite(String line) {
        try {
            out.write(line+"\n");
        }
        catch(Exception e) {
            System.out.println("File Write Error: " + fileName + " "  + e);
        }
    }

    /**
     * Closes the file
     */
    public void fileClose() {
        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}