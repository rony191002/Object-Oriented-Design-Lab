public class Car {
     private String modelName;
     private String engineType;
     private String color;
     private String transmission;
     private boolean sunroof;
     private boolean infotainmentSystem;


public Car(String modelName, String engineTtpe, String color, String transmission, boolean sunroof, boolean infotainmentSystem){
   this.modelName = modelName;
   this.engineType = engineTtpe;
   this.color = color;
   this.transmission = transmission;
   this.sunroof = sunroof;
   this.infotainmentSystem = infotainmentSystem;
}

public String toString(){
   return "\nModel Name: " + modelName + 
          "\nEngine Type: " + engineType +
          "\nColor: " + color +
          "\nTransmission: " + transmission +
          "\nSunroof: " + (sunroof ? "Yes" : "No") +
          "\nInfotainment System: " + (infotainmentSystem ? "Yes" : "No");
   }
}
