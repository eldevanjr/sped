package br.com.wmixvideo.sped.leiaute.blocok;

import br.com.wmixvideo.sped.enums.SFIndicadorEstoque;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class SFK280CorrecaoApontamentoTest {

    @Test
    public void deveGerarLinhaCompletaPositiva() {
        final SFK280CorrecaoApontamento linha = new SFK280CorrecaoApontamento()
                .setCampo02DataEstoqueFinal(LocalDate.of(2018, 10, 31))
                .setCampo03CodigoProduto("1000")
                .setCampo04QuantidadeEmEstoquePositiva(900)
                .setCampo06TipoEstoque(SFIndicadorEstoque.DO_INFORMANTE_EM_SEU_PODER)
                .setCampo07CodigoParticipante("");

        Assert.assertEquals("|K280|31102018|1000|900||0||", linha.toString());
    }

    @Test
    public void deveGerarLinhaCompletaNegativa() {
        final SFK280CorrecaoApontamento linha = new SFK280CorrecaoApontamento()
                .setCampo02DataEstoqueFinal(LocalDate.of(2018, 10, 31))
                .setCampo03CodigoProduto("1000")
                .setCampo05QuantidadeEmEstoqueNegativa(900)
                .setCampo06TipoEstoque(SFIndicadorEstoque.DO_INFORMANTE_EM_SEU_PODER)
                .setCampo07CodigoParticipante("");

        Assert.assertEquals("|K280|31102018|1000||900|0||", linha.toString());
    }

}