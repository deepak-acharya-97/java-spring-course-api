package com.course.utility;

public class Utilities {

	public static class Utility {
		public <T> boolean isNull(T obj) {
			return obj == null;
		}
		
		public <T> boolean isNotNull(T obj) {
			return obj != null;
		}
	}

}
