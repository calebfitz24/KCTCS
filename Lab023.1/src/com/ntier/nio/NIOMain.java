package com.ntier.nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOMain {
	public static void main(String[] args) {
		Path pth = Paths.get("C:\\Users\\cfitz\\eclipse-workspace\\Lab023.1");
		try(DirectoryStream<Path> ds = Files.newDirectoryStream(pth, "a*")){
			for(Path currentEntry : ds ) {
				System.out.println("Entry: " + currentEntry.getFileName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}