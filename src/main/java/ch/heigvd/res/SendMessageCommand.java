package ch.heigvd.res;

import lombok.Data;

@Data
public class SendMessageCommand implements ICommand {

  private final String message;

}
