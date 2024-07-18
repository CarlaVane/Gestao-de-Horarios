package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Cadeira implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    
    private String nome;
    private int CargaHoraria;
    private String Descricao;
    private int ano;
    private int semestre;
    
    @OneToMany(mappedBy = "cadeira")
    private List<Docente> docentes;
    
    @ManyToOne
    private Curso curso;

   
    
    public Cadeira() {
        
    }
    
    
    @Override
    public String toString(){
        return this.nome;
    }
           
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int CargaHoraria) {
        this.CargaHoraria = CargaHoraria;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public List<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(List<Docente> docentes) {
        this.docentes = docentes;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}
