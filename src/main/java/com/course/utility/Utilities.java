package com.course.utility;

public class Utilities {

	public static class Utility {
		public static <T> boolean isNull(T obj) {
			return obj == null;
		}
		
		public static <T> boolean isNotNull(T obj) {
			return obj != null;
		}
	}

}
