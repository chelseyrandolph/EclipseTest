package com.chelseycodes.example2;
import java.lang.*;
import java.io.*;
import java.util.*;

public class ReverseAString {

	public static void main(String[] args) {
		String stringInput = "My name is Chelsey Randolph.";
		char[] stringArray = stringInput.toCharArray();
		
		for(int i = stringArray.length-1; i >= 0; i--) {
			System.out.print(stringArray[i]);
		}

	}

}