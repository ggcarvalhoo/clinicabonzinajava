package Control;

import Model.Paciente;
import java.sql.SQLException;
import java.util.ArrayList;

public class PacienteControl {

    private final Paciente paciente;

    public PacienteControl() {
        this.paciente = new Paciente(); 
    }

 
    public boolean Cadastrar(String endereco, int datanascimento, String nome, int telefone) throws SQLException {

        
        
        int id = paciente.maiorID() + 1; 
        Paciente objeto = new Paciente(endereco, datanascimento, id, nome, telefone);
        if(paciente.InsertPacienteBD(objeto)){
            return true;
        }else{
            return false;
        }
    }

  
    public boolean Editar(String endereco, int datanascimento, int id, String nome, int telefone) {
        Paciente objeto = new Paciente(endereco, datanascimento, id, nome, telefone);
        if(paciente.UpdatePacienteBD(objeto)){
            return true;
        }else{
            return false;
        }
    }

    
    public boolean Apagar(int id) {
        if(paciente.DeletePacienteBD(id)){
            return true;
        }else{
            return false;
        }
    }

   
    public Paciente LoadPaciente(int id) {
        
        return paciente.carregaPaciente(id);
    }

   
    public ArrayList getMinhaLista() {
        return paciente.getMinhaLista();
    }
    
    @SuppressWarnings("unchecked")
    public String[][] getMinhaMatrizTexto() {
        
        ArrayList<Paciente> minhalista = paciente.getMinhaLista();
        int tamanho = minhalista.size();
        
        String MatrizPacientes[][] = new String[tamanho][5];
        for (int i = 0; i < tamanho; i++) {
            MatrizPacientes[i][0] = minhalista.get(i).getId() + "";
            MatrizPacientes[i][1] = minhalista.get(i).getNome();
            MatrizPacientes[i][2] = minhalista.get(i).getTelefone() + "";
            MatrizPacientes[i][3] = minhalista.get(i).getEndereco();
            MatrizPacientes[i][4] = minhalista.get(i).getDatanascimento() + "";
        }        
        
        return MatrizPacientes;        
    }
    
}
