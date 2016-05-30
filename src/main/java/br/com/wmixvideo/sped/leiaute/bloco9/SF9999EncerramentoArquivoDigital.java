package br.com.wmixvideo.sped.leiaute.bloco9;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;

public class SF9999EncerramentoArquivoDigital implements SFLinha {

    private int totalLinhasArquivo;

    public SF9999EncerramentoArquivoDigital(final int totalLinhasArquivo) {
        this.totalLinhasArquivo = totalLinhasArquivo;
    }

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(this.totalLinhasArquivo);
        return texto.toString();
    }

    public String getCodigoRegistro() {
        return "9999";
    }
}
