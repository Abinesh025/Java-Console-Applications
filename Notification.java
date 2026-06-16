class Notify{

    public void sendNotification(){
        System.out.println("Send Notification");
    }
}

class Email extends Notify{

    @Override
    public void sendNotification(){
        System.out.println("Mail was SuccessFully Sent");
    }
}

class Sms extends Notify{
    @Override
    public void sendNotification(){
        System.out.println("Sms was sent SuccessFully");
    }
}

class Other extends Notify{
    @Override
    public void sendNotification(){
        super.sendNotification();
    }
}


public class Notification {
    public static void main(String[] args) {
        Email email = new Email();
        Sms sms = new Sms();
        Other other = new Other();

        sms.sendNotification();
        email.sendNotification();
        other.sendNotification();
    }
}
