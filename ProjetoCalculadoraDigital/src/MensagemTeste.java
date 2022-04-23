import static org.junit.Assert.*;

import org.junit.Test;

public class MensagemTeste {

	@Test
	public void test() {
		Mensagem mensagem = new Mensagem();
		String mesnEsperada = "Bem vindos, todos vocês";
		String mesRetornada = mensagem.gerarMensagem();
		assertEquals(mesnEsperada, mesRetornada);
	}

}
