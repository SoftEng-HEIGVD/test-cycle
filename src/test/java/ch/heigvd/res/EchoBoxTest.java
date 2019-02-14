package ch.heigvd.res;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EchoBoxTest {

  @Test
  void itShouldBePossibleToSendAMessageAndReceiveAnEcho() {
    EchoBox box = new EchoBox();
    SendMessageCommand command = new SendMessageCommand("hello");
    String response = box.sendCommand(command);
    assertEquals("hello", response);
  }

  @Test
  void itShouldBePossibleToSendACommandToChangeTheLetterCase() {
    EchoBox box = new EchoBox();
    SetLetterCaseCommand command = new SetLetterCaseCommand(SetLetterCaseCommand.LetterCase.LOWERCASE);
    String response = box.sendCommand(command);
    assertEquals("Letter case set to LOWERCASE", response);
  }

}