/*
 * Project Euler Solutions
 * Copyright (c) 2018 Dominic Rutkowski
 *
 * LICENSE:
 * https://github.com/DominicRutkowski/Project-Euler/blob/master/LICENSE
 */

package com.dominicrutkowski.projecteuler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Util {

    /**
     * @param name The name of the file to be read. The file should be stored in the resources folder.
     * @return A string containing the contents of the text file.
     * @throws FileNotFoundException The file was not found in the /resources directory.
     */
    public static String readTextFile(String name) throws FileNotFoundException {
        String contents = "";
        try {
            Scanner reader = new Scanner(new File("resources/" + name));
            while (reader.hasNext()) {
                contents += reader.nextLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("The file: \"" + name + "\" was not found in the /resources directory.");
        }
        return contents;
    }

}
