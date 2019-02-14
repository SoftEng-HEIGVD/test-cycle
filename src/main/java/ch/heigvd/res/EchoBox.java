package ch.heigvd.res;

public class EchoBox {

  public String sendCommand(ICommand command) {
    if (command instanceof SendMessageCommand) {
      return ((SendMessageCommand) command).getMessage();
    }
    throw new UnsupportedOperationException();
  }

}
