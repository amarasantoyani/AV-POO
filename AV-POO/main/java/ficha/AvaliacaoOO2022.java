/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;

//CLASSE ADICIONADA PARA AV

public class AvaliacaoOO2022 {
    
    public static String nome;
    public static int matricula;
    public static float nota;

    
    public static void setNome(String nome) {
        AvaliacaoOO2022.nome = nome;
    }
    public static String getNome() {
        return AvaliacaoOO2022.nome;
    }

    public static void setMatricula(int matricula) {
        AvaliacaoOO2022.matricula = matricula;
    }
    public static int getMatricula() {
        return AvaliacaoOO2022.matricula;
    }
    
    public static void setNota(float nota) {
        AvaliacaoOO2022.nota = nota;
    }
    public static float getNota() {
        return AvaliacaoOO2022.nota;
    }
    
    public static void salvaArq(AvaliacaoOO2022 av){
        System.out.println("Nome: "+AvaliacaoOO2022.getNome());
        
        try{
            OutputStream arq = new FileOutputStream("file.txt"); // nome do arquivo que será escrito
            Writer wr = new OutputStreamWriter(arq); // criação de um escritor
            BufferedWriter w = new BufferedWriter(wr); // adiciono a um escritor de buffer
            
            w.write("Nome: ");
            w.write(av.getNome());
            w.newLine();
            w.write("Matricula: ");
            w.write(""+av.getMatricula());
            w.newLine();
            w.write("Nota: ");
            w.write(""+av.getNota());
            w.close();
            System.out.println("o arquivo foi salvo com sucesso");
            
        }catch(IOException e){System.out.println("Erro ao salvar o arquivo");}

    }      
}