import javax.swing.*;
import java.awt.*;

public class Screen extends JFrame {
    //private Calculo calculo =  new Calculo();
    private String output;

    private static final String EX01 = "1. Reverta a ordem das palavras nas frases, mantendo a ordem das palavras";
    private static final String EX02 = "2. Remova todos os caracteres duplicados da string abaixo";
    private static final String EX03 = "3. Encontre a substring paindroma mars longa na string";
    private static final String EX04 = "4. Coloque em maiúscula a primeira letra de cada frase na string";
    private static final String EX05 = "5. Verifique se a string é um anagrama de um palindromo";

    private static final String INPUT01 = "Hello, World! OpenAl is amazing.";
    private static final String INPUT02 = "Hello, World!";
    private static final String INPUT03 = "babad";
    private static final String INPUT04 = "hello. how are you? I'm fine, thank you.";
    private static final String INPUT05 = "racecar";

    private JLabel jLabel = new JLabel();
    public Screen(){

        setTitle("DESAFIO DE CÓDIGO");
        setVisible(true);
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        Calculo calculo =  new Calculo();

        JLabel title = new JLabel("Manipulação de Strings");
        title.setBounds(100, 10, 500, 40);
        title.setFont(new Font("Arial", Font.BOLD, 30));
        add(title);


        statement(jLabel, EX01, 10, 70, 500, 16);
        input(jLabel, INPUT01, 20, 90, 500, 16);
        output(jLabel, calculo.reverseSentence(), 20, 110, 500, 16);

        statement(jLabel, EX02, 10, 140, 500, 16 );
        input(jLabel, INPUT02, 20, 160, 500, 16);
        output(jLabel, calculo.deleteDuplicates(), 20, 180, 500, 16);

        statement(jLabel, EX03, 10, 210, 500, 16 );
        input(jLabel, INPUT03, 20, 230, 500, 16);
        output(jLabel, calculo.longestPalindromeSubstring(), 20, 250, 500, 16);

        statement(jLabel, EX04, 10, 280, 500, 16 );
        input(jLabel, INPUT04, 20, 300, 500, 16);
        output(jLabel, calculo.capitalFirstLetter(), 20, 320, 500, 16);

        statement(jLabel, EX05, 10, 350, 500, 16 );
        input(jLabel, INPUT05, 20, 370, 500, 16);
        output(jLabel, calculo.anagramOfAPalindrome(), 20, 390, 500, 16);


    }

    public void output(JLabel jLabel, String output, int x, int y, int width, int height ){
        jLabel = new JLabel("Output: " + output );
        jLabel.setBounds(x, y, width, height);
        jLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        add(jLabel);
    }

    public void statement(JLabel jLabel, String statement, int x, int y, int width, int height ){
        jLabel = new JLabel(statement);
        jLabel.setBounds(x, y, width, height);
        jLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        add(jLabel);
    }

    public void input(JLabel jLabel, String input, int x, int y, int width, int height ){
        jLabel = new JLabel("Input: " + input);
        jLabel.setBounds(x, y, width, height);
        jLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        add(jLabel);
    }

}
