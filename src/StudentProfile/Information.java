package StudentProfile;

import javax.swing.JOptionPane;


public class Information{
    String name,section,motto;
    
    public String getName(){
         
        return name;
    }
    void setName(){
        
        name = JOptionPane.showInputDialog(null, "ENTER YOUR NAME: ", " STUDENT'S PROFILE ", JOptionPane.INFORMATION_MESSAGE);
    
    }
    public String getSection(){
         
        return section;
    }
    void setSection(){
        
        section = JOptionPane.showInputDialog(null, "ENTER YOUR SECTION: ", " STUDENT'S PROFILE ", JOptionPane.INFORMATION_MESSAGE);
    
    }
    public String getMotto(){
         
        return motto;
    }
    void setMotto(){
        
        motto = JOptionPane.showInputDialog(null, "WRITE YOUR MOTTO: ", " STUDENT'S PROFILE ", JOptionPane.INFORMATION_MESSAGE);
    
    }

    void Info(){
        
        JOptionPane.showMessageDialog(null,"NAME:  "+name+"\nSECTION: "+section+"\nMOTTO: \n\n              "+motto,"STUDENT'S PROFILE",JOptionPane.WARNING_MESSAGE);
    
    }
    
    
}
