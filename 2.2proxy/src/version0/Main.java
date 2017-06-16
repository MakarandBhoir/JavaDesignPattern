package version0;

import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;

public class Main {

	public static void main(String[] args) {
		GlobalWeather globalWeather = new GlobalWeather();
		GlobalWeatherSoap soap = globalWeather.getGlobalWeatherSoap();
		String result = soap.getCitiesByCountry("India");
		System.out.println(result);
	}
}