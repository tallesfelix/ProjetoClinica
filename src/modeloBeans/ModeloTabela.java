package modeloBeans;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * Classe que representa uma tabela no dominio da aplicação.
 *
 * @author Allan Gomes
 * @author Daniel Nunes
 * @author Luis Eduardo
 * @author Talles Felix
 */
public class ModeloTabela extends AbstractTableModel{
    
    
    /**
     * Linhas da tabela
     */
    private ArrayList linhas = null;
    
    /**
     * Colunas da tabela
     */
    private String[] colunas = null;
    
    
    /** Construtor da tabela
     * @param lin - Linhas da tabela
     * @param  col - Coluna da tabela
     */
    public ModeloTabela (ArrayList lin, String[] col){
        setLinhas(lin);
        setColunas(col);
        
    }

    /**
     * @return the linhas
     */
    public ArrayList getLinhas() {
        return linhas;
    }

    /**
     * @param linhas the linhas to set
     */
    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    /**
     * @return the colunas
     */
    public String[] getColunas() {
        return colunas;
    }

    /**
     * @param colunas the colunas to set
     */
    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    
    /**
     * @return O número de colunas
     */
    public int getColumnCount(){
        return colunas.length;
    }
    
    /**
     * @return O número de linhas
     */
    public int getRowCount(){
        return linhas.size();
    }
    
    
    /**
     * @param numCol - indice de coluna
     * @return coluna indice numCol
     */
    public String getColumnName (int numCol){
        return colunas[numCol];
    }
    
    
    /**
     * @param  numLin - indice da linha
     * @param numCol - indice de coluna
     * @return item dados os indices numLin x numCol
     */
    public Object getValueAt (int numLin, int numCol){
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];
    }
    
}
