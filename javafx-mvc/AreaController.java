import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

/**
 * Controla os dados do modelo e a interação com a interface (visão)
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AreaController
{
    AreaView areaView;
    Stage stage;
    Area area;
    public TextField textFieldAltura;
    public TextField textFieldComprimento;
    public Label labelResultado;
    
    /**
     * Construtor para objetos da classe AreaController
     */
    public AreaController()
    {
        this.stage = new Stage();
        this.areaView = new AreaView();
        this.areaView.setController(this);
    }
    
    public void iniciar() throws Exception {
        this.areaView.start(this.stage);
        this.stage.show();
    }
    
    public void botaoCalcularClicado(Event e) {
        try {
            double altura = Double.parseDouble(textFieldAltura.getText());
            double comprimento = Double.parseDouble(textFieldComprimento.getText());
            Area area = new Area(altura, comprimento);
            this.labelResultado.setText(area.interpretar());
        } catch (NumberFormatException exception) {
            labelResultado.setText("Dados de entrada incompletos ou inválidos");
        }
    }
    
    public void botaoLimparClicado(Event e) {
        textFieldAltura.setText("");
        textFieldComprimento.setText("");
        labelResultado.setText("");
    }    
}
