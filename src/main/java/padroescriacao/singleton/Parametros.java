package padroescriacao.singleton;

public class Parametros {

    private static final Parametros instance = new Parametros();

    private String nomeEscola;
    private String usuarioLogado;

    private Parametros() {
    }

    public static Parametros getInstance() {
        return instance;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}
