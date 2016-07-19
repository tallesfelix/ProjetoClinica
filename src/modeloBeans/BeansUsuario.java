package modeloBeans;

/**
 * Classe que representa um usuário no dominio da aplicação.
 *
 * @author Allan Gomes
 * @author Daniel Nunes
 * @author Luis Eduardo
 * @author Talles Felix
 */
public class BeansUsuario {

    /**
     * Codigo do usuário
     */
    private Integer usuCod;

    /**
     * Login de acesso do usuário
     */
    private String usuNome;

    /**
     * Tipo do usuário
     */
    private String usuTipo;

    /**
     * senha de acesso do usuário
     */
    private String usuSenha;

    /**
     * Pesquisa do usuário
     */
    private String usuPesquisa;

    /**
     * @return the usuCod
     */
    public Integer getUsuCod() {
        return usuCod;
    }

    /**
     * @param usuCod the usuCod to set
     */
    public void setUsuCod(Integer usuCod) {
        this.usuCod = usuCod;
    }

    /**
     * @return the usuNome
     */
    public String getUsuNome() {
        return usuNome;
    }

    /**
     * @param usuNome the usuNome to set
     */
    public void setUsuNome(String usuNome) {
        this.usuNome = usuNome;
    }

    /**
     * @return the usuTipo
     */
    public String getUsuTipo() {
        return usuTipo;
    }

    /**
     * @param usuTipo the usuTipo to set
     */
    public void setUsuTipo(String usuTipo) {
        this.usuTipo = usuTipo;
    }

    /**
     * @return the usuSenha
     */
    public String getUsuSenha() {
        return usuSenha;
    }

    /**
     * @param usuSenha the usuSenha to set
     */
    public void setUsuSenha(String usuSenha) {
        this.usuSenha = usuSenha;
    }

    /**
     * @return the usuPesquisa
     */
    public String getUsuPesquisa() {
        return usuPesquisa;
    }

    /**
     * @param usuPesquisa the usuPesquisa to set
     */
    public void setUsuPesquisa(String usuPesquisa) {
        this.usuPesquisa = usuPesquisa;
    }

}
