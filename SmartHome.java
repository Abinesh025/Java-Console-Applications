abstract class Device{

    private static int totDevices;

    public static int getTotDevices() {
        return totDevices;
    }
    private int deviceId;
    private String deviceName;
    private String brand;

    public Device(int deviceId,String deviceName,String brand){
        if(deviceId  > 0){
            this.deviceId = deviceId;
            ++totDevices;
        }
        else{
            System.out.println("DeviceId is not valid");
        }

        if(deviceName.isBlank() || deviceName != null){
            this.deviceName = deviceName;
        }
        else{
            System.out.println("Device name not a Valid");
        }

        if(brand.isBlank() || brand != null){
            this.brand = brand;
        }
        else{
            System.out.println("Brand name not valid");
        };

        
    }

        public void getDetails(){
            System.out.println("Device-Id" + " " + this.deviceId);
            System.out.println("Device-Name" + " " + this.deviceName);
            System.out.println("Device-Brand" + " " + this.brand);
        }
}

// Interface
interface PowerControl{

    public void turnOff();
    public void turnOn();
    
}

interface MusicPlayer{

    public void playMusic();
    public void stopMusic();

}

interface InternetConnetion{

    public void connectWifi();
    public void disConnectWifi();

}

class SmartBulb extends Device implements PowerControl{

    private int brightNess;
    private boolean isOn = false;

    public SmartBulb(int id,String name,String brand){
        super(id,name,brand);
    }

    @Override
    public void turnOn(){
        if(this.isOn){
            System.out.println("Blub is Already On");
        }
        else{
            System.out.println("Blub is On");
            this.isOn = true;
        }
    }

    @Override
    public void turnOff(){
        if(this.isOn){
            System.out.println("Blub is off");
            this.isOn = false;
        }
        else{
            System.out.println("Blub is Already off");
        }
    }

    public void setBrightness(int val){
        if(this.isOn && (val > 0 && val <= 100)){
            this.brightNess = val;
        }
        else{
            System.out.println("The Bulb is in off, So can't able to increase");
        }
    }
    
}
class SmartFan extends Device implements PowerControl{

    private int speedLevel;
    private boolean isOn = false;

    public SmartFan(int id,String name,String brand){
        super(id,name,brand);
    }

    @Override
    public void turnOn(){
        if(this.isOn){
            System.out.println("Fan is Already On");
        }
        else{
            System.out.println("Fan is On");
            this.isOn = true;
        }
    }

    @Override
    public void turnOff(){
        if(this.isOn){
            System.out.println("Fan is off");
            this.isOn = false;
        }
        else{
            System.out.println("Fan is Already off");
        }
    }

    public void setspeedLevel(int val){
        if(this.isOn && (val > 0 && val <= 5)){
            this.speedLevel = val;
        }
        else{
            System.out.println("The fan is in off, So can't able to increase");
        }
    }
    
}

class SmartSpeaker extends Device implements PowerControl,MusicPlayer,InternetConnetion{

            private int volume;
            private boolean isOn = false;
            private boolean isPlay = false;
            private boolean isConnect = false;

            public SmartSpeaker(int id,String name,String brand){
                super(id,name,brand);
            }

            @Override
            public void turnOn(){
                if(this.isOn){
                    System.out.println("Speaker is Already On");
                }
                else{
                    System.out.println("Speaker is On");
                    this.isOn = true;
                }
            }

            @Override
            public void turnOff(){
                if(this.isOn){
                    System.out.println("Speaker is off");
                    this.isOn = false;
                }
                else{
                    System.out.println("Speaker is Already off");
                }
            }

            @Override
            public void playMusic(){
                if(!this.isOn || this.isPlay || !this.isConnect){
                    System.out.println("Check the Configuration");
                }
                else if(this.isOn || !this.isPlay || !this.isConnect){
                    System.out.println("Check the Network Connection");
                }
                else if(this.isOn || !this.isPlay || this.isConnect){
                    System.out.println("Music is Already Playing");
                }
                else if(this.isOn || !this.isPlay || this.isConnect){
                    System.out.println("Music is Play");
                    this.isPlay = true;
                }
            }

            @Override
            public void stopMusic(){
                if(!this.isPlay){
                    System.out.println("Music is Already off");
                }
                else{
                    this.isPlay = false;
                    System.out.println("Music is Off");
                }
            }

    @Override
    public void connectWifi(){
        if(this.isConnect){
            System.out.println("Wifi is Already Connected");
        }
        else{
            this.isConnect = true;
            System.out.println("Wifi is Connected SuccessFully");
        }
    }

    @Override
    public void disConnectWifi(){
        if(!this.isConnect){
            System.out.println("Wifi is Already disConnected");
        }
        else {
            this.isConnect = false;
            System.out.println("Wifi is DisConnect");
        }
    }

    public void setVolume(int val){
        if(this.isOn && this.isPlay && (val > 0 && val <= 100)){
            this.volume = val;
        }
        else{
            System.out.println("The fan is in off, So can't able to increase");
        }
    }
    
}





public class SmartHome {
    public static void main(String[] args) {
        PowerControl bulb = new SmartBulb(1,"Gundu Bulb","Havells");
        SmartFan fan = new SmartFan(2,"Ceilling Fan","Kana Kathadi");
        SmartSpeaker speaker = new SmartSpeaker(5,"AirBuds","Flyvo");

        bulb.turnOn();
        bulb.turnOn();
        bulb.turnOff();
        bulb.turnOff();
        
        fan.turnOn();
        fan.turnOn();
        fan.turnOff();
        fan.turnOff();

        
        speaker.turnOn();
        speaker.connectWifi();
        speaker.playMusic();
        
        System.out.println(Device.getTotDevices());
    }
}
