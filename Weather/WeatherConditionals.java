

public class WeatherConditionals
{


public static String getHikingAdvice(int temperature,int windchill, int humidity,
 String description)
{
    
    boolean hot = false;//
    boolean freezing = false; //
    
    boolean mildHumid = false;//
    boolean badHumid = false;//
    
    boolean snow = false;//
    boolean rain = false;//
    boolean drizzle = false;//
    
    boolean severe = false; //
    boolean badRain = false;//
    
    boolean cloudy = false;//
    boolean sunny  = false;//
    //boolean returned = false;
        
    if (temperature <= 32 || windchill <= 32)
        {freezing = true;}
    if (temperature >= 85)
    {hot = true;}
    
    if (humidity < 55 && humidity >20)
    {mildHumid = true;}
    if (humidity >= 55)
    {badHumid = true;}
    
    if (description.indexOf("snow") != -1)
    {snow = true;}
    if (description.indexOf("cloudy") != -1)
    {cloudy = true;}
    if (description.indexOf("sunny") != -1)
    {sunny = true;}
    if (description.indexOf("tornado") != -1 || description.indexOf("tropical storm") != -1 || description.indexOf("hurricane") != -1)
    {severe = true;}
    if (description.indexOf("thunderstorm") != -1 || description.indexOf("hail") != -1 || description.indexOf("sleet") != -1 )
    {badRain = true;}
    if (description.indexOf("drizzle") != -1)
    {drizzle = true;}
   
    if (temperature < 40 && drizzle == true || temperature < 40 && rain == true )
    {return "dress warm or you're gonna freeze in the rain. It's " + temperature + " degrees and " + description;}
    else if (temperature <= 40 && snow == true)
    {return "It's cold and snowing, dress warm or don't go out";}
    else if (temperature >40 && snow || rain || drizzle == true)
    {return "Be carful it's gonna be wet and mildly chilly." ;}
    else if (freezing)
    {return "It's " + temperature + " degrees. You may not want to go out";}
    else if (badRain)
    {return "There's some bad stuff coming out of the sky, you DON'T want do go out there. Specificly: " + description;}
    else if (severe)
    {return "Take cover, bad stuff is coming";}
    else if (temperature >80 && badHumid || hot)
    {return "You're gonna die in this. It's " + temperature + " degrees and " + description;}
    else if (temperature > 40 && hot == false)
    {return "It's some great weather to go out. It's "+ temperature + " degrees and " + description;}
    
    
    
    return "Um... It's always easier not to do things than to do them. Just like right now.";
    
}
    
public static String check(int temp)
{
if (temp <= 28)
{return "It's to cold";}
else if (temp > 28 && temp<35)
{return "chilly";}
else
{return "nice weather";}
}
    
    
    
    
    
    
    
    
    
/*public String getWeatherAdvice(int temperature, String description){
        
        
        if (description.equals("windy"))
        {windy = true;}
        if (temperature <= 30)
        {freezing = true;}
        if (temperature >= 100)
        {hot = true;}
        if (description.equals("snow"))
        {snow = true;}
        if (description.equals("cloudy"))
        {cloudy = true;}
        if (description.equals("sunny"))
        {sunny = true;}
        if (description.equals("fair"))
        {fair = true;}
        
        
        
        
        if (freezing || windy)
        {
         return "Too windy or cold! Enjoy watching the weather through the window.";}
        if (snow&&hot)
        {
         return "What the flying waffle house, it's hot aNd sNowing";}   
        if (freezing&&cloudy)
        {return "NOOOOOOOO it's cold and cloudy, don't go out there.";}
         
         
         
         
        if (!freezing && !windy)
        {
         return "It’s safe to go outside," + temperature + " degrees and " + description + ".";}

        else 
        {return "waht";}
        
        
        
        
    } 
       **/ 
    
}
