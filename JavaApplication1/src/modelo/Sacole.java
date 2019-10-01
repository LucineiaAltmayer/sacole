/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.time.LocalDate;


/**
 *
 * @author Administrador
 */
public class Sacole {
    private Integer codigo;
    private Integer nr_serie;
    private Double preco;
    private String sabor;
    private LocalDate data_validade;

    public LocalDate getData_validade() {
        return data_validade;
    }

    public void setData_validade(LocalDate data_validade) {
        this.data_validade = data_validade;
    }
    

    @Override
    public String toString() {
        return sabor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getNr_serie() {
        return nr_serie;
    }

    public void setNr_serie(Integer nr_serie) {
        this.nr_serie = nr_serie;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
}
