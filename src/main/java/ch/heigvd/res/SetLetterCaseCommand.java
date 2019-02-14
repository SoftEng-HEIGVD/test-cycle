package ch.heigvd.res;

import lombok.Data;

@Data
public class SetLetterCaseCommand implements ICommand {

  enum LetterCase {
    LOWERCASE,
    UPPERCASE
  }

  private final LetterCase letterCase;

}
