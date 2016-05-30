package br.com.wmixvideo.sped.leiaute.bloco0;

import br.com.wmixvideo.sped.leiaute.SFLinha;
import br.com.wmixvideo.sped.util.SFStringBuilder;
import org.apache.commons.lang3.StringUtils;

public class SF0150CadastroParticipante implements SFLinha {

    private String codigoParticipante, nome, codigoPais, cnpj, cpf, inscricaoEstadual, codigoMunicipio, suframa, logradouro, numero, complemento, bairro;

    @Override
    public String toString() {
        final SFStringBuilder texto = new SFStringBuilder();
        texto.append(this.getCodigoRegistro());
        texto.append(this.codigoParticipante);
        texto.append(this.nome);
        texto.append(this.codigoPais);
        texto.append(this.cnpj);
        texto.append(this.cpf);
        texto.append(this.inscricaoEstadual);
        texto.append(this.codigoMunicipio);
        texto.append(this.suframa);
        texto.append(StringUtils.trimToEmpty(this.logradouro));
        texto.append(StringUtils.trimToEmpty(this.numero));
        texto.append(this.complemento);
        texto.append(StringUtils.trimToEmpty(this.bairro));
        return texto.toString();
    }

    @Override
    public String getCodigoRegistro() {
        return "0150";
    }

    public SF0150CadastroParticipante setBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public SF0150CadastroParticipante setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public SF0150CadastroParticipante setCodigoMunicipio(String codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
        return this;
    }

    public SF0150CadastroParticipante setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
        return this;
    }

    public SF0150CadastroParticipante setCodigoParticipante(String codigoParticipante) {
        this.codigoParticipante = codigoParticipante;
        return this;
    }

    public SF0150CadastroParticipante setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public SF0150CadastroParticipante setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public SF0150CadastroParticipante setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
        return this;
    }

    public SF0150CadastroParticipante setLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    public SF0150CadastroParticipante setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public SF0150CadastroParticipante setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public SF0150CadastroParticipante setSuframa(String suframa) {
        this.suframa = suframa;
        return this;
    }
}