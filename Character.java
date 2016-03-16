

public class Character extends JFrame implements ActionListener 
{
        super();
        private JPanel mainPanel;
        private Jpanel buttonPanel;
        
                System.out.println("Creating Variables...");
        private Sting characterName = null;
        private int confirm = 0;
        
                System.out.println("Creating_JFrame");
        JFrame myFrame = new JFrame("Beat_Box");
                System.out.println("Created_JFrame");
                        
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                System.out.println("Creating_Visibility");
        myFrame.setVisible( true );
                System.out.println("Window_Visibilty_Capability_Ready");
                        
        myFrame.setLayout( new GridLayout( 2, 2, 50, 10 ) );
                System.out.println("Created_GridBag_Layout");
        layout = new GridBagLayout();
        myFrame.setLayout( layout );
               System.out.println("Added_Layout_To_JFrame");
                
        //creates border layout
        setLayout( new BorderLayout() );
                        System.out.println("Border_Created")
                
                System.out.println("Creating_General_Constraints");
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        
               System.out.println("Creating_Restraints");
        c.weightx = 0.0;
        c.gridwidth = GridBagConstraints.RELATIVE;
                
                System.out.println("Creating_ButtonPanel");
        buttonPanel = new JPanel();
        
                System.out.println("Creating_ButtonPanel_Layout");
        buttonPanel.setLayout( new GridLayout(1 , 2) );
}//end of characterClass
