

public class String_Tester
{
   public static String weatherCondition = "mixed rain and Nat 1's";
   public static void main()
   {
       /*System.out.println(weatherCondition.substring(0, weatherCondition.indexOf(" ")));
       String weatherCondition1 = new String("Mixed rain and snow.");
       String weatherCondition2 = new String("Mixed rain and snow.");
       boolean result1 =  (weatherCondition1 == weatherCondition2);
       boolean result2 =  (weatherCondition1.equals(weatherCondition2));
       System.out.println(result1);*/
       System.out.println(WeatherConditionals.getHikingAdvice(50, 40, 40, "thunderstorm")+"\n\n");
       //System.out.println("\n"+WeatherConditionals.getWeatherAdvice(100, "snow"));
    }
    
}
