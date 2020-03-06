
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Pikachu dans l'action 14

public class Map extends JFrame {
	JFrame frame = new JFrame();  
	protected JPanel pan = new JPanel();
	protected JButton bouton = new JButton("Toi");
	protected JButton bouton2 = new JButton("");
	protected JButton bouton3 = new JButton("");
	protected JButton bouton4 = new JButton("");
	protected JButton bouton5 = new JButton("");
	protected JButton bouton6 = new JButton("");
	protected JButton bouton7 = new JButton("");
	protected JButton bouton8 = new JButton("");
	protected JButton bouton9 = new JButton("");
	protected JButton boutonA = new JButton("");
	protected JButton boutonB = new JButton("");
	protected JButton boutonC = new JButton("");
	protected JButton boutonD = new JButton("");
	protected JButton boutonE = new JButton("");
	protected JButton boutonF = new JButton("");
	protected JButton boutonG = new JButton("");
	  
	  public Map(){
		
	    this.setTitle("Game");
	    this.setSize(450, 450);
	    this.setBackground(Color.MAGENTA);
	    this.setLocationRelativeTo(null);  
	    this.setContentPane(pan);
	    this.setVisible(true);
	 
	 
	    bouton.setPreferredSize(new Dimension(100, 100));
	    bouton.addActionListener(actions);
	   	bouton2.setPreferredSize(new Dimension(100, 100));
	   	bouton2.addActionListener(actions);
	    bouton3.setPreferredSize(new Dimension(100, 100));
	    bouton3.addActionListener(actions3);
	    bouton4.setPreferredSize(new Dimension(100, 100));
	    bouton4.addActionListener(actions4);
	    bouton5.setPreferredSize(new Dimension(100, 100));
	    bouton5.addActionListener(actions5);
	    bouton6.setPreferredSize(new Dimension(100, 100));
	    bouton6.addActionListener(actions6);
	    bouton7.setPreferredSize(new Dimension(100, 100));
	    bouton7.addActionListener(actions7);
	    bouton8.setPreferredSize(new Dimension(100, 100));
	    bouton8.addActionListener(actions8);
	    bouton9.setPreferredSize(new Dimension(100, 100));
	    bouton9.addActionListener(actions9);
	    boutonA.setPreferredSize(new Dimension(100, 100));
	    boutonA.addActionListener(actions10);
	    boutonB.setPreferredSize(new Dimension(100, 100));
	    boutonB.addActionListener(actions11);
	    boutonC.setPreferredSize(new Dimension(100, 100));
	    boutonC.addActionListener(actions12);
	    boutonD.setPreferredSize(new Dimension(100, 100));
	    boutonD.addActionListener(actions13);
	    boutonE.setPreferredSize(new Dimension(100, 100));
	    boutonE.addActionListener(actions14);
	    boutonF.setPreferredSize(new Dimension(100, 100));
	    boutonF.addActionListener(actions15);
	    boutonG.setPreferredSize(new Dimension(100, 100));
	    boutonG.addActionListener(actions16);
	    
	    bouton.setForeground(Color.blue);
	    bouton2.setForeground(Color.blue);
	    bouton3.setForeground(Color.blue);
	    bouton4.setForeground(Color.blue);
	    bouton5.setForeground(Color.blue);
	    bouton6.setForeground(Color.blue);
	    bouton7.setForeground(Color.blue);
	    bouton8.setForeground(Color.blue);
	    bouton9.setForeground(Color.blue);
	    boutonA.setForeground(Color.blue);
	    boutonB.setForeground(Color.blue);
	    boutonC.setForeground(Color.blue);
	    boutonD.setForeground(Color.blue);
	    boutonE.setForeground(Color.blue);
	    boutonF.setForeground(Color.blue);
	    boutonG.setForeground(Color.blue);
	    
	    boutonD.setBackground(Color.GREEN);
		boutonD.setOpaque(true);
		boutonD.setBorderPainted(true);
	    
	    pan.add(bouton);
	    pan.add(bouton2);
	    pan.add(bouton3);
	    pan.add(bouton4);
	    pan.add(bouton5);
	    pan.add(bouton6);
	    pan.add(bouton7);
	    pan.add(bouton8);
	    pan.add(bouton9);
	    pan.add(boutonA);
	    pan.add(boutonB);
	    pan.add(boutonC);
	    pan.add(boutonD);
	    pan.add(boutonE);
	    pan.add(boutonF);
	    pan.add(boutonG);
    
	  
	  }     
	  
	  private ActionListener actions = new ActionListener()
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			 
			  if(e.getSource() == bouton)
			  {
				  
				  bouton.setText("Toi");
				  bouton2.setText("");
				  bouton3.setText("");
				  bouton4.setText("");
				  bouton5.setText("");
				  bouton6.setText("");
				  bouton7.setText("");
				  bouton8.setText("");
				  bouton9.setText("");
				  boutonA.setText("");
				  boutonB.setText("");
				  boutonC.setText("");
				  boutonD.setText("");
				  boutonE.setText("");
				  boutonF.setText("");
				  boutonG.setText(""); 
				  
				  try {
						Thread.sleep(500);
						boutonB.setBackground(Color.RED);
						boutonB.setOpaque(true);
						boutonB.setBorderPainted(true);
						
					} catch (InterruptedException e1) {
					
						e1.printStackTrace();
					}
				  
				  bouton7.setBackground(null);
				  boutonG.setBackground(null);
				  bouton.setBackground(null);
				  bouton2.setBackground(null);
				  bouton3.setBackground(null);
				  bouton4.setBackground(null);
				  bouton5.setBackground(null);
				  bouton6.setBackground(null);
				  bouton8.setBackground(null);
				  boutonA.setBackground(null);
				  bouton9.setBackground(null);
				  boutonC.setBackground(null);
				  boutonD.setBackground(Color.GREEN);
				  boutonE.setBackground(null);
				  boutonF.setBackground(null);
			  
			  }
			  
			  if(e.getSource() == bouton2)
			  {
				  
				  bouton.setText("");
				  bouton2.setText("Toi");
				  bouton3.setText("");
				  bouton4.setText("");
				  bouton5.setText("");
				  bouton6.setText("");
				  bouton7.setText("");
				  bouton8.setText("");
				  bouton9.setText("");
				  boutonA.setText("");
				  boutonB.setText("");
				  boutonC.setText("");
				  boutonD.setText("");
				  boutonE.setText("");
				  boutonF.setText("");
				  boutonG.setText(""); 
				  
				  try {
						Thread.sleep(500);
						bouton6.setBackground(Color.RED);
						bouton6.setOpaque(true);
						bouton6.setBorderPainted(true);
						
					} catch (InterruptedException e1) {
					
						e1.printStackTrace();
					}
				  
				  bouton7.setBackground(null);
				  boutonG.setBackground(null);
				  bouton.setBackground(null);
				  bouton2.setBackground(null);
				  bouton3.setBackground(null);
				  bouton4.setBackground(null);
				  bouton5.setBackground(null);
				  bouton9.setBackground(null);
				  bouton8.setBackground(null);
				  boutonA.setBackground(null);
				  boutonB.setBackground(null);
				  boutonC.setBackground(null);
				  boutonD.setBackground(Color.GREEN);
				  boutonE.setBackground(null);
				  boutonF.setBackground(null);
			  
			  }
			
		  }
	  };
	  
	  
	  private ActionListener actions3 = new ActionListener()
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			 
			  if(e.getSource() == bouton3)
			  {
				  
				  bouton.setText("");
				  bouton2.setText("");
				  bouton3.setText("Toi");
				  bouton4.setText("");
				  bouton5.setText("");
				  bouton6.setText("");
				  bouton7.setText("");
				  bouton8.setText("");
				  bouton9.setText("");
				  boutonA.setText("");
				  boutonB.setText("");
				  boutonC.setText("");
				  boutonD.setText("");
				  boutonE.setText("");
				  boutonF.setText("");
				  boutonG.setText(""); 
				  
				  try {
						Thread.sleep(500);
						bouton.setBackground(Color.RED);
						bouton.setOpaque(true);
						bouton.setBorderPainted(true);
						
					} catch (InterruptedException e1) {
					
						e1.printStackTrace();
					}
				  
				  bouton7.setBackground(null);
				  boutonG.setBackground(null);
				  bouton9.setBackground(null);
				  bouton2.setBackground(null);
				  bouton3.setBackground(null);
				  bouton4.setBackground(null);
				  bouton5.setBackground(null);
				  bouton6.setBackground(null);
				  bouton8.setBackground(null);
				  boutonA.setBackground(null);
				  boutonB.setBackground(null);
				  boutonC.setBackground(null);
				  boutonD.setBackground(Color.GREEN);
				  boutonE.setBackground(null);
				  boutonF.setBackground(null);
			  
			  }
			
		  }
	  };
	  
	  private ActionListener actions4 = new ActionListener()
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			 
			  if(e.getSource() == bouton4)
			  {
				  
				  bouton.setText("");
				  bouton2.setText("");
				  bouton3.setText("");
				  bouton4.setText("Toi");
				  bouton5.setText("");
				  bouton6.setText("");
				  bouton7.setText("");
				  bouton8.setText("");
				  bouton9.setText("");
				  boutonA.setText("");
				  boutonB.setText("");
				  boutonC.setText("");
				  boutonD.setText("");
				  boutonE.setText("");
				  boutonF.setText("");
				  boutonG.setText(""); 
				  
				  try {
						Thread.sleep(500);
						boutonA.setBackground(Color.RED);
						boutonA.setOpaque(true);
						boutonA.setBorderPainted(true);
						
					} catch (InterruptedException e1) {
					
						e1.printStackTrace();
					}
				  
				  bouton7.setBackground(null);
				  boutonG.setBackground(null);
				  bouton.setBackground(null);
				  bouton2.setBackground(null);
				  bouton3.setBackground(null);
				  bouton4.setBackground(null);
				  bouton5.setBackground(null);
				  bouton6.setBackground(null);
				  bouton8.setBackground(null);
				  bouton9.setBackground(null);
				  boutonB.setBackground(null);
				  boutonC.setBackground(null);
				  boutonD.setBackground(Color.GREEN);
				  boutonE.setBackground(null);
				  boutonF.setBackground(null);
			  
			  }
			
		  }
	  };
	  
	  private ActionListener actions5 = new ActionListener()
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			 
			  if(e.getSource() == bouton5)
			  {
				  
				  bouton.setText("");
				  bouton2.setText("");
				  bouton3.setText("");
				  bouton4.setText("");
				  bouton5.setText("Toi");
				  bouton6.setText("");
				  bouton7.setText("");
				  bouton8.setText("");
				  bouton9.setText("");
				  boutonA.setText("");
				  boutonB.setText("");
				  boutonC.setText("");
				  boutonD.setText("");
				  boutonE.setText("");
				  boutonF.setText("");
				  boutonG.setText(""); 
				  
				  try {
						Thread.sleep(500);
						bouton4.setBackground(Color.RED);
						bouton4.setOpaque(true);
						bouton4.setBorderPainted(true);
						
					} catch (InterruptedException e1) {
					
						e1.printStackTrace();
					}
				  
				  bouton7.setBackground(null);
				  boutonG.setBackground(null);
				  bouton.setBackground(null);
				  bouton2.setBackground(null);
				  bouton3.setBackground(null);
				  bouton9.setBackground(null);
				  bouton5.setBackground(null);
				  bouton6.setBackground(null);
				  bouton8.setBackground(null);
				  boutonA.setBackground(null);
				  boutonB.setBackground(null);
				  boutonC.setBackground(null);
				  boutonD.setBackground(Color.GREEN);
				  boutonE.setBackground(null);
				  boutonF.setBackground(null);
			  
			  }
			
		  }
	  };
	  private ActionListener actions6 = new ActionListener()
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			 
			  if(e.getSource() == bouton6)
			  {
				  
				  bouton.setText("");
				  bouton2.setText("");
				  bouton3.setText("");
				  bouton4.setText("");
				  bouton5.setText("");
				  bouton6.setText("Toi");
				  bouton7.setText("");
				  bouton8.setText("");
				  bouton9.setText("");
				  boutonA.setText("");
				  boutonB.setText("");
				  boutonC.setText("");
				  boutonD.setText("");
				  boutonE.setText("");
				  boutonF.setText("");
				  boutonG.setText(""); 
				  
				  try {
						Thread.sleep(500);
						boutonF.setBackground(Color.RED);
						boutonF.setOpaque(true);
						boutonF.setBorderPainted(true);
						
					} catch (InterruptedException e1) {
					
						e1.printStackTrace();
					}
				  
				  bouton7.setBackground(null);
				  boutonG.setBackground(null);
				  bouton.setBackground(null);
				  bouton2.setBackground(null);
				  bouton3.setBackground(null);
				  bouton4.setBackground(null);
				  bouton5.setBackground(null);
				  bouton6.setBackground(null);
				  bouton8.setBackground(null);
				  boutonA.setBackground(null);
				  boutonB.setBackground(null);
				  boutonC.setBackground(null);
				  boutonD.setBackground(Color.GREEN);
				  boutonE.setBackground(null);
				  bouton9.setBackground(null);
			  
			  }
			
		  }
	  };
	  private ActionListener actions7 = new ActionListener()
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			 
			  if(e.getSource() == bouton7)
			  {
				  
				  bouton.setText("");
				  bouton2.setText("");
				  bouton3.setText("");
				  bouton4.setText("");
				  bouton5.setText("");
				  bouton6.setText("");
				  bouton7.setText("Toi");
				  bouton8.setText("");
				  bouton9.setText("");
				  boutonA.setText("");
				  boutonB.setText("");
				  boutonC.setText("");
				  boutonD.setText("");
				  boutonE.setText("");
				  boutonF.setText("");
				  boutonG.setText(""); 
				  
				  
				  
				  try {
						Thread.sleep(500);
						bouton7.setBackground(Color.RED);
						bouton7.setOpaque(true);
						bouton7.setBorderPainted(true);
						Thread.sleep(500);
						JFrame fight = new Joueur();
						
						
					} catch (InterruptedException e1) {
					
						e1.printStackTrace();
					}
				  bouton9.setBackground(null);
				  boutonG.setBackground(null);
				  bouton.setBackground(null);
				  bouton2.setBackground(null);
				  bouton3.setBackground(null);
				  bouton4.setBackground(null);
				  bouton5.setBackground(null);
				  bouton6.setBackground(null);
				  bouton8.setBackground(null);
				  boutonA.setBackground(null);
				  boutonB.setBackground(null);
				  boutonC.setBackground(null);
				  boutonD.setBackground(Color.GREEN);
				  boutonE.setBackground(null);
				  boutonF.setBackground(null);
				  
			  }
			
		  }
	  };
	  private ActionListener actions8 = new ActionListener()
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			 
			  if(e.getSource() == bouton8)
			  {
				  
				  bouton.setText("");
				  bouton2.setText("");
				  bouton3.setText("");
				  bouton4.setText("");
				  bouton5.setText("");
				  bouton6.setText("");
				  bouton7.setText("");
				  bouton8.setText("Toi");
				  bouton9.setText("");
				  boutonA.setText("");
				  boutonB.setText("");
				  boutonC.setText("");
				  boutonD.setText("");
				  boutonE.setText("");
				  boutonF.setText("");
				  boutonG.setText("");
				  
				  try {
						Thread.sleep(500);
						boutonE.setBackground(Color.RED);
						boutonE.setOpaque(true);
						boutonE.setBorderPainted(true);
						
					} catch (InterruptedException e1) {
					
						e1.printStackTrace();
					}
				  
				  bouton7.setBackground(null);
				  boutonG.setBackground(null);
				  bouton.setBackground(null);
				  bouton2.setBackground(null);
				  bouton3.setBackground(null);
				  bouton4.setBackground(null);
				  bouton5.setBackground(null);
				  bouton6.setBackground(null);
				  bouton8.setBackground(null);
				  boutonA.setBackground(null);
				  boutonB.setBackground(null);
				  boutonC.setBackground(null);
				  boutonD.setBackground(Color.GREEN);
				  bouton9.setBackground(null);
				  boutonF.setBackground(null);
			  
			  }
			
		  }
	  };
	  private ActionListener actions9 = new ActionListener()
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			 
			  if(e.getSource() == bouton9)
			  {
				  
				  bouton.setText("");
				  bouton2.setText("");
				  bouton3.setText("");
				  bouton4.setText("");
				  bouton5.setText("");
				  bouton6.setText("");
				  bouton7.setText("");
				  bouton8.setText("");
				  bouton9.setText("Toi");
				  boutonA.setText("");
				  boutonB.setText("");
				  boutonC.setText("");
				  boutonD.setText("");
				  boutonE.setText("");
				  boutonF.setText("");
				  boutonG.setText(""); 
				  
				  
				  try {
						Thread.sleep(500);
						bouton9.setBackground(Color.RED);
						bouton9.setOpaque(true);
						bouton9.setBorderPainted(true);
						Thread.sleep(500);
						JFrame fight = new Joueur2();
						
					} catch (InterruptedException e1) {
					
						e1.printStackTrace();
					}
				  
				  bouton7.setBackground(null);
				  boutonG.setBackground(null);
				  bouton.setBackground(null);
				  bouton2.setBackground(null);
				  bouton3.setBackground(null);
				  bouton4.setBackground(null);
				  bouton5.setBackground(null);
				  bouton6.setBackground(null);
				  bouton8.setBackground(null);
				  boutonA.setBackground(null);
				  boutonB.setBackground(null);
				  boutonC.setBackground(null);
				  boutonD.setBackground(Color.GREEN);
				  boutonE.setBackground(null);
				  boutonF.setBackground(null);
			  }
			
		  }
	  };
	  private ActionListener actions10 = new ActionListener()
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			 
			  if(e.getSource() == boutonA)
			  {
				  
				  bouton.setText("");
				  bouton2.setText("");
				  bouton3.setText("");
				  bouton4.setText("");
				  bouton5.setText("");
				  bouton6.setText("");
				  bouton7.setText("");
				  bouton8.setText("");
				  bouton9.setText("");
				  boutonA.setText("Toi");
				  boutonB.setText("");
				  boutonC.setText("");
				  boutonD.setText("");
				  boutonE.setText("");
				  boutonF.setText("");
				  boutonG.setText(""); 
				  
				  try {
						Thread.sleep(500);
						boutonC.setBackground(Color.RED);
						boutonC.setOpaque(true);
						boutonC.setBorderPainted(true);
						
					} catch (InterruptedException e1) {
					
						e1.printStackTrace();
					}
				  
				  bouton7.setBackground(null);
				  boutonG.setBackground(null);
				  bouton.setBackground(null);
				  bouton2.setBackground(null);
				  bouton3.setBackground(null);
				  bouton4.setBackground(null);
				  bouton5.setBackground(null);
				  bouton6.setBackground(null);
				  bouton8.setBackground(null);
				  boutonA.setBackground(null);
				  boutonB.setBackground(null);
				  bouton9.setBackground(null);
				  boutonD.setBackground(Color.GREEN);
				  boutonE.setBackground(null);
				  boutonF.setBackground(null);
			  
			  }
			
		  }
	  };
	  private ActionListener actions11 = new ActionListener()
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			 
			  if(e.getSource() == boutonB)
			  {
				  
				  bouton.setText("");
				  bouton2.setText("");
				  bouton3.setText("");
				  bouton4.setText("");
				  bouton5.setText("");
				  bouton6.setText("");
				  bouton7.setText("");
				  bouton8.setText("");
				  bouton9.setText("");
				  boutonA.setText("");
				  boutonB.setText("Toi");
				  boutonC.setText("");
				  boutonD.setText("");
				  boutonE.setText("");
				  boutonF.setText("");
				  boutonG.setText(""); 
				  
				  try {
						Thread.sleep(500);
						bouton2.setBackground(Color.RED);
						bouton2.setOpaque(true);
						bouton2.setBorderPainted(true);
						
					} catch (InterruptedException e1) {
					
						e1.printStackTrace();
					}
				  
				  bouton7.setBackground(null);
				  boutonG.setBackground(null);
				  bouton.setBackground(null);
				  bouton9.setBackground(null);
				  bouton3.setBackground(null);
				  bouton4.setBackground(null);
				  bouton5.setBackground(null);
				  bouton6.setBackground(null);
				  bouton8.setBackground(null);
				  boutonA.setBackground(null);
				  boutonB.setBackground(null);
				  boutonC.setBackground(null);
				  boutonD.setBackground(Color.GREEN);
				  boutonE.setBackground(null);
				  boutonF.setBackground(null);
			  
			  }
			
		  }
	  };
	  private ActionListener actions12 = new ActionListener()
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			 
			  if(e.getSource() == boutonC)
			  {
				  
				  bouton.setText("");
				  bouton2.setText("");
				  bouton3.setText("");
				  bouton4.setText("");
				  bouton5.setText("");
				  bouton6.setText("");
				  bouton7.setText("");
				  bouton8.setText("");
				  bouton9.setText("");
				  boutonA.setText("");
				  boutonB.setText("");
				  boutonC.setText("Toi");
				  boutonD.setText("");
				  boutonE.setText("");
				  boutonF.setText("");
				  boutonG.setText("");
				  
				  try {
						Thread.sleep(500);
						bouton5.setBackground(Color.RED);
						bouton5.setOpaque(true);
						bouton5.setBorderPainted(true);
						
					} catch (InterruptedException e1) {
					
						e1.printStackTrace();
					}
				  
				  bouton7.setBackground(null);
				  boutonG.setBackground(null);
				  bouton.setBackground(null);
				  bouton2.setBackground(null);
				  bouton3.setBackground(null);
				  bouton4.setBackground(null);
				  bouton9.setBackground(null);
				  bouton6.setBackground(null);
				  bouton8.setBackground(null);
				  boutonA.setBackground(null);
				  boutonB.setBackground(null);
				  boutonC.setBackground(null);
				  boutonD.setBackground(Color.GREEN);
				  boutonE.setBackground(null);
				  boutonF.setBackground(null);
			  
			  }
			
		  }
	  };
	  private ActionListener actions13 = new ActionListener()
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			 
			  if(e.getSource() == boutonD)
			  {
				  
				  bouton.setText("");
				  bouton2.setText("");
				  bouton3.setText("");
				  bouton4.setText("");
				  bouton5.setText("");
				  bouton6.setText("");
				  bouton7.setText("");
				  bouton8.setText("");
				  bouton9.setText("");
				  boutonA.setText("");
				  boutonB.setText("");
				  boutonC.setText("");
				  boutonD.setText("Toi");
				  boutonE.setText("");
				  boutonF.setText("");
				  boutonG.setText(""); 
				  
				  try {
						Thread.sleep(500);
						bouton8.setBackground(Color.RED);
						bouton8.setOpaque(true);
						bouton8.setBorderPainted(true);
						System.out.println("");
						System.out.println("");
						System.out.println("-------------------------");
						System.out.println("Vous êtes tombé dans un trou entouré de peinture verte.");
						System.out.println("");
						System.out.println("GAME OVER");
						System.out.println("-------------------------");
						
						try {
							
							Thread.sleep(1000);
							System.exit(1);
							
						} catch (InterruptedException e1) {
						
							e1.printStackTrace();
						}
						
					} catch (InterruptedException e1) {
					
						e1.printStackTrace();
					}
				  
				  bouton7.setBackground(null);
				  boutonG.setBackground(null);
				  bouton.setBackground(null);
				  bouton2.setBackground(null);
				  bouton3.setBackground(null);
				  bouton4.setBackground(null);
				  bouton5.setBackground(null);
				  bouton6.setBackground(null);
				  bouton9.setBackground(null);
				  boutonA.setBackground(null);
				  boutonB.setBackground(null);
				  boutonC.setBackground(null);
				  boutonD.setBackground(Color.GREEN);
				  boutonE.setBackground(null);
				  boutonF.setBackground(null);
			  
			  }
			
		  }
	  };
	  private ActionListener actions14 = new ActionListener()
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			 
			  if(e.getSource() == boutonE)
			  {
				  
				  bouton.setText("");
				  bouton2.setText("");
				  bouton3.setText("");
				  bouton4.setText("");
				  bouton5.setText("");
				  bouton6.setText("");
				  bouton7.setText("");
				  bouton8.setText("");
				  bouton9.setText("");
				  boutonA.setText("");
				  boutonB.setText("");
				  boutonC.setText("");
				  boutonD.setText("");
				  boutonE.setText("Toi");
				  boutonF.setText("");
				  boutonG.setText(""); 
				  
				  
				  bouton9.setBackground(null);
				  bouton7.setBackground(null);
				  boutonG.setBackground(null);
				  bouton.setBackground(null);
				  bouton2.setBackground(null);
				  bouton3.setBackground(null);
				  bouton4.setBackground(null);
				  bouton5.setBackground(null);
				  bouton6.setBackground(null);
				  bouton8.setBackground(null);
				  boutonA.setBackground(null);
				  boutonB.setBackground(null);
				  boutonC.setBackground(null);
				  boutonD.setBackground(Color.GREEN);
				  boutonE.setBackground(null);
				  boutonF.setBackground(null);
			  
			  
				  // LE PIKACHUUUUUU
				  try {
					JFrame pika = new Pika();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			  
			  }
		  }
	  };
	  private ActionListener actions15 = new ActionListener()
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			 
			  if(e.getSource() == boutonF)
			  {
				  
				  bouton.setText("");
				  bouton2.setText("");
				  bouton3.setText("");
				  bouton4.setText("");
				  bouton5.setText("");
				  bouton6.setText("");
				  bouton7.setText("");
				  bouton8.setText("");
				  bouton9.setText("");
				  boutonA.setText("");
				  boutonB.setText("");
				  boutonC.setText("");
				  boutonD.setText("");
				  boutonE.setText("");
				  boutonF.setText("Toi");
				  boutonG.setText(""); 
				  
				  try {
						Thread.sleep(500);
						bouton3.setBackground(Color.RED);
						bouton3.setOpaque(true);
						bouton3.setBorderPainted(true);
					} catch (InterruptedException e1) {
					
						e1.printStackTrace();
					}
					  
					  bouton9.setBackground(null);
					  bouton7.setBackground(null);
					  bouton.setBackground(null);
					  bouton2.setBackground(null);
					  boutonG.setBackground(null);
					  bouton4.setBackground(null);
					  bouton5.setBackground(null);
					  bouton6.setBackground(null);
					  bouton8.setBackground(null);
					  boutonA.setBackground(null);
					  boutonB.setBackground(null);
					  boutonC.setBackground(null);
					  boutonD.setBackground(Color.GREEN);
					  boutonE.setBackground(null);
					  boutonF.setBackground(null);
				  
				  
			  }
			
		  }
	  };
	  private ActionListener actions16 = new ActionListener()
	  {
		  public void actionPerformed(ActionEvent e)
		  {
			 
			  if(e.getSource() == boutonG)
			  {
				  
				  bouton.setText("");
				  bouton2.setText("");
				  bouton3.setText("");
				  bouton4.setText("");
				  bouton5.setText("");
				  bouton6.setText("");
				  bouton7.setText("");
				  bouton8.setText("");
				  bouton9.setText("");
				  boutonA.setText("");
				  boutonB.setText("");
				  boutonC.setText("");
				  boutonD.setText("");
				  boutonE.setText("");
				  boutonF.setText("");
				  boutonG.setText("Toi"); 
				  
				  try {
					Thread.sleep(500);
					boutonG.setBackground(Color.RED);
					boutonG.setOpaque(true);
					boutonG.setBorderPainted(true);
					Thread.sleep(500);
					JFrame fight = new Joueur3();
				} catch (InterruptedException e1) {
				
					e1.printStackTrace();
				}
				  
				  bouton9.setBackground(null);
				  bouton7.setBackground(null);
				  bouton.setBackground(null);
				  bouton2.setBackground(null);
				  bouton3.setBackground(null);
				  bouton4.setBackground(null);
				  bouton5.setBackground(null);
				  bouton6.setBackground(null);
				  bouton8.setBackground(null);
				  boutonA.setBackground(null);
				  boutonB.setBackground(null);
				  boutonC.setBackground(null);
				  boutonD.setBackground(Color.GREEN);
				  boutonE.setBackground(null);
				  boutonF.setBackground(null);
				  
			  }
			
		  }
	  };
}
