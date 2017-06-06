package unit.dixit.core;


import static org.assertj.core.api.Assertions.assertThat;

import dixit.core.Partida;

import org.junit.Test;


public class PartidaTest {
  @Test public void preparar() {
    Partida partida = Partida.create();

    assertThat(partida.jogadores()).hasSize(6);
  }
}
