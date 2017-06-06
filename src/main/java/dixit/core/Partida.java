package dixit.core;


import java.util.Arrays;
import java.util.List;


public class Partida {
  public static Partida create() {
    return new Partida();
  }

  public List<Jogador> jogadores() {
    return Arrays.asList(
      Jogador.create(),
      Jogador.create(),
      Jogador.create(),
      Jogador.create(),
      Jogador.create(),
      Jogador.create()
    );
  }
}
