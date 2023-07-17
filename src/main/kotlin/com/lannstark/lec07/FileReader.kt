package com.lannstark.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FileReader {

    fun readFile() {

        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        println(reader.readLine())

        reader.close()
    }

    fun readFileV2(path: String) {

        BufferedReader(FileReader(path)).use { reader ->
            while(true) {
                println(reader.readLine() ?: break)
            }
        }
    }
}