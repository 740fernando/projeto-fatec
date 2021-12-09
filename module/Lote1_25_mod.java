            /*
            * Nome do programa: Lote1_25_mod.
            * Nome do programador: Fernando Luiz
            * Objetivo:Receba a hora de início e de final de um jogo (HH,MM) 
                       sabendo que o tempo máximo é de 24 horas e pode começar num dia e terminar noutro.

            */

            import javax.swing.JOptionPane;

            public class Lote1_25_mod {
            static Integer HI,HF,MI,MF,HT,MT,HTOTAL,MINTOT,HIT;
            public static void main(String args[]) {

                
        /*input valores
        */
                HI = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora inicial: "));
                repeti();
                MI=  Integer.parseInt(JOptionPane.showInputDialog("Insira o minuto inicial"));
                repeti();
                MF=  Integer.parseInt(JOptionPane.showInputDialog("Insira o minuto final"));
                repeti();
                HF = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora final "));
                repeti();
                
                calc1();
                
                calc2();
                


        
            }
            
                       

static void repeti()
{
while ((HI>23) || (HI<00))
                {
                    System.out.println("Número inválido");
                    HI = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora inicial: "));
                }
while ((MI>59) || (MI<00))
                {
                    System.out.println("Número inválido");
                    MI=  Integer.parseInt(JOptionPane.showInputDialog("Insira o minuto inicial"));
                }
                    
while ((HF>23) || (HF<00))
                {
                    System.out.println("Número inválido");
                    HF = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora final: "));
                }          
 while ((MF>59) || (MF<00))
                {
                    System.out.println("Número inválido");
                    MF = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora final: "));
                }

}
            
    static void calc1()
            {
            HI=HI*60;//HORA INICIAL EM MINUTOS
            HF=HF*60;// HORA FINAL EM MINUTOS
            HIT = 1440-HI;// 24HS EM MINUTOS MENOS HORA INICIAL
            }
             
            
                  
            
            
static void calc2 ()
            {
            
/* caso 1= horario iguais
        */        
                if ((HI==HF)&&(MI==MF)) 
                {
                    JOptionPane.showMessageDialog(null, "O tempo da partida é: 24 horas");
                }
                else if (HF>HI) //hf maior que hi
                { 
                      HT= HF-HI;
                }

        /*caso 3= hf menor que o hi- jogo dura ate o dia seguinte*/
                else 
                {
                      HT= HF + HIT;  //hora final mais HIT(hora inicial- quant. de minutos em 1 dia)
                }    
         /* MI MAIOR QUE MF*/
                if (MI>MF)
                    {
                    MT=MI-MF;
                    }    
        /* MI MENOR QUE O MF*/
                    else
                {
                    MT=MF-MI;
                }
        /*RESPOSTA FINAL*/
                    HTOTAL= HT+MT;
                    MINTOT=HTOTAL%60;
                    HTOTAL=HTOTAL/60;
                    JOptionPane.showMessageDialog(null, "O jogo durou "+ HTOTAL +"HORAS "+MINTOT+" Minutos");
                }
    }
                


