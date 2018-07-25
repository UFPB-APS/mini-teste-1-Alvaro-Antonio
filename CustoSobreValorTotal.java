
public class CustoSobreValorTotal implements Custo{
    private String nomeDoCusto;
    private double taxa;
    
    
    
    public CustoSobreValorTotal (){
        
    }
    
    public CustoSobreValorTotal(String nomeDoCusto,double taxa){
        this.nomeDoCusto = nomeDoCusto;
        this.taxa= taxa;
    }
    public void setNomeDoCusto(String nome){
        this.nomeDoCusto = nome;
    }
    
    public void setTaxa(double taxa){
        this.taxa = taxa;
    }
    
    public String getNomeDoCusto(){
        return this.nomeDoCusto;
    }
    
    public double getTaxa(){
        return this.taxa;
    }
        
    public double calcularCusto(Venda venda){        
        
        return (venda.getTotal() * 0.05) + venda.getTotal() * taxa;
    }
    
}
