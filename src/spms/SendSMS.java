package spms;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SendSMS {
 
  public static final String ACCOUNT_SID = "AC13b8778fec42c03203c58950bde04793";
  public static final String AUTH_TOKEN = "ba63167cd1640fbf7fe19ee06710b90b";
  
  public static void send(String no,String msg) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    Message message = Message.creator(new PhoneNumber("+91"+no),
        new PhoneNumber("+12488502995"), 
        msg).create();
  }
}
