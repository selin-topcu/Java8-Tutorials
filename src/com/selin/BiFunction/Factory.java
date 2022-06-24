package com.selin.BiFunction;

import java.util.function.BiFunction;

public class Factory {
	//3. Factory
	public static void main(String[] args) {
		GPS result=factory("2341214","3253541",GPS::new);
		System.out.println(result);
	}
	public static <R extends GPS> R factory(String Latitude, String Longitude, BiFunction<String,String,R> biFunction){
		return biFunction.apply(Latitude,Longitude);
	}

}
	class GPS{
		String Latitude; //Latitude enlem
		String Longitude; //Longitude boylam

		public GPS(String latitude, String longitude) {
			Latitude = latitude;
			Longitude = longitude;
		}

		public String getLatitude() {
			return Latitude;
		}

		public void setLatitude(String latitude) {
			Latitude = latitude;
		}

		public String getLongitude() {
			return Longitude;
		}

		public void setLongitude(String longitude) {
			Longitude = longitude;
		}

		@Override
		public String toString() {
			return "GPS{" +
					"Latitude: "+ Latitude+
					", Longitude "+ Longitude+
		"}";
		}
	}
