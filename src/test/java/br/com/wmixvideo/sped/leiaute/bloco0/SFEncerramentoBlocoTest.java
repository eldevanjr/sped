package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFEncerramentoBloco;
import org.junit.Assert;
import org.junit.Test;

public class SFEncerramentoBlocoTest {

    @Test
    public void deveGerarLinhaCompleta() {
        Assert.assertEquals("|J990|1577|", new SFEncerramentoBloco("J990", 1577).toString());
    }
}