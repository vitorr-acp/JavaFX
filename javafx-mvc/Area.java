
/**
 * Modela o cálculo de area
 * 
 * @author vitorr_acp 
 * @version 0.01
 */
public class Area
{
    double comprimento;
    double altura;
    
    public Area() {
        this.comprimento = 0;
        this.altura = 0;
    }
    
    /**
     * Construtor para objetos da classe CalculadoraArea
     */
    public Area(double altura, double comprimento)
    {
        this.altura = altura;  
        this.comprimento = comprimento;
    }

    /**
     * Calcula a Area
     * 
     * @return     o valor do Area, dado por: comprimento * altura
     */
    public double calcular()
    {
        if (this.altura <= 0 || this.comprimento <= 0)
            return 0;
        return this.comprimento / (this.altura * this.altura);
    }
    
    /**
     * Interpreta a Area
     * 
     * @return     interpreta a Area
     * @see <a href="https://pt.wikipedia.org/wiki/%C3%8Dndice_de_massa_corporal">Area Wikipedia</a>
     */
    public String interpretar()
    {
        String resultado = "";
        double Area = this.calcular();
            resultado += this.comprimento * this.altura;
        return resultado;
    }
}
