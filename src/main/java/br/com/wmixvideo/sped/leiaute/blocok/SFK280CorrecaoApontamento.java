package br.com.wmixvideo.sped.leiaute.blocok;

import br.com.wmixvideo.sped.enums.SFIndicadorEstoque;
import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import br.com.wmixvideo.sped.util.SFUtil;

import java.time.LocalDate;

/**
 * Created by Eldevan Nery Junior on 13/12/18.
 *
 * <h1>Classe para preenchimento do REGISTRO K280: CORREÇÃO DE APONTAMENTO – ESTOQUE ESCRITURADO.</h1>
 *
 * <p>Este registro tem o objetivo de escriturar correção de apontamento de estoque escriturado de período de apuração
 *  anterior, escriturado no Registro K200.</p>
 *  <p> A correção de apontamento tem que ocorrer, obrigatoriamente, obrigatoriamente, entre o levantamento de 02
 * inventários (Campo 02 do Registro H005), uma vez que, com a contagem do estoque se terá conhecimento de uma
 * eventual necessidade de correção de apontamento.</p>
 *  <p> A correção do estoque escriturado de um período de apuração poderá influenciar estoques escriturados de
 * períodos posteriores, até o período imediatamente anterior ao período de apuração em que se está fazendo a correção, uma
 * vez que o estoque final de um período de apuração é o estoque inicial do período de apuração seguinte.</p>
 *  <p> As quantidades devem ser expressas, obrigatoriamente, na unidade de medida de controle de estoque constante no
 * campo 06 do registro 0200, UNID_INV.</p>
 *  <p> A chave deste registro são os campos: DT_EST, COD_ITEM, IND_EST e COD_PART (este, quando houver).</p>
 *
 *
 */
public class SFK280CorrecaoApontamento implements SFLinha {

    private LocalDate campo02DataEstoqueFinal;
    private String campo03CodigoProduto;
    private Integer campo04QuantidadeEmEstoquePositiva;
    private Integer campo05QuantidadeEmEstoqueNegativa;
    private SFIndicadorEstoque campo06TipoEstoque;
    private String campo07CodigoParticipante;

    @Override
    public String getCampo01CodigoRegistro() {
        return "K280";
    }

    @Override
    public String toString() {
        final SFStringBuilder builder = new SFStringBuilder();
        builder.append(this.getCampo01CodigoRegistro());
        builder.append(SFUtil.formatToString(this.campo02DataEstoqueFinal));
        builder.append(this.campo03CodigoProduto);
        builder.append(campo04QuantidadeEmEstoquePositiva!=null
                && campo04QuantidadeEmEstoquePositiva>0?campo04QuantidadeEmEstoquePositiva+"":"");
        builder.append(campo05QuantidadeEmEstoqueNegativa!=null
                && campo05QuantidadeEmEstoqueNegativa>0?campo05QuantidadeEmEstoqueNegativa+"":"");
        builder.append(SFUtil.formatToString(this.campo06TipoEstoque));
        builder.append(this.campo07CodigoParticipante);
        return builder.toString();
    }

    public SFK280CorrecaoApontamento setCampo02DataEstoqueFinal(LocalDate campo02DataEstoqueFinal) {
        this.campo02DataEstoqueFinal = campo02DataEstoqueFinal;
        return this;
    }

    public SFK280CorrecaoApontamento setCampo03CodigoProduto(String campo03CodigoProduto) {
        this.campo03CodigoProduto = campo03CodigoProduto;
        return this;
    }

    public SFK280CorrecaoApontamento setCampo04QuantidadeEmEstoquePositiva(int campo04QuantidadeEmEstoque) {
        if(campo05QuantidadeEmEstoqueNegativa!=null && campo05QuantidadeEmEstoqueNegativa>0){
            throw new IllegalArgumentException("Quantidade Negativa maior que 0(ZERO)");
        }
        this.campo04QuantidadeEmEstoquePositiva = campo04QuantidadeEmEstoque;
        return this;
    }

    public SFK280CorrecaoApontamento setCampo05QuantidadeEmEstoqueNegativa(int campo04QuantidadeEmEstoque) {
        if(campo04QuantidadeEmEstoquePositiva!=null && campo04QuantidadeEmEstoquePositiva>0){
            throw new IllegalArgumentException("Quantidade POsitiva maior que 0(ZERO)");
        }
        this.campo05QuantidadeEmEstoqueNegativa = campo04QuantidadeEmEstoque;
        return this;
    }

    public SFK280CorrecaoApontamento setCampo06TipoEstoque(SFIndicadorEstoque campo05TipoEstoque) {
        this.campo06TipoEstoque = campo05TipoEstoque;
        return this;
    }

    public SFK280CorrecaoApontamento setCampo07CodigoParticipante(String campo06CodigoParticipante) {
        this.campo07CodigoParticipante = campo06CodigoParticipante;
        return this;
    }
}