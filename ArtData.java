/** ****************************************************************
 *Alix Field     afield@cnm.edu     FieldP4_Java
 *Art Data Class
 *
 *Data to Run the Program
 ****************************************************************** */
// Packages
package field.p4_java;

// Imports
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArtData {

    // Instance Declerations
    private ArtData data;
    private boolean groundShip;
    private boolean twoDay;
    private boolean nextDay;
    private boolean masterCard;
    private boolean visaCard;
    private boolean americanExprCard;
    private int cardNumber;
    private int cardExpDate;
    private int cardCIN;
    private boolean artOne;
    private boolean artTwo;
    private boolean artThree;
    private boolean artFour;
    private String giftWrap;
    private int sizePrice;
    
    //---------------------------------
    // Default Constructor
    //--------------------------------
    public ArtData(){
        groundShip = false;
        twoDay = false;
        nextDay = false;
        masterCard = false;
        visaCard = false;
        americanExprCard = false;
        cardNumber = 0;
        cardExpDate = 0;
        cardCIN = 0;
        artOne = false;
        artTwo = false;
        artThree = false;
        artFour = false;
        giftWrap = " ";
        sizePrice = 0;
    }
    

    //*********************************************** SETTERS **********************************************************//        
    //--------------------------------------------------------------------------
    // Check Box Individual Setters w/ Overloaded Setter
    //--------------------------------------------------------------------------
    public void setArtOne(boolean artOne) {
        this.artOne = artOne;
    }

    public void setArtTwo(boolean artTwo) {
        this.artTwo = artTwo;
    }

    public void setArtThree(boolean artThree) {
        this.artThree = artThree;
    }

    public void setArtFour(boolean artFour) {
        this.artFour = artFour;
    }

    //--------------------------------------
    // JComboBox Setter
    //--------------------------------------
    public void setGiftWrap(String giftWrap) {
        this.giftWrap = giftWrap;
    }
    //--------------------------------------
    //JSlider Setter
    //--------------------------------------

    void setSizePrice(int sizePrice) {
        this.sizePrice = sizePrice;
    }

    //----------------------------------------------------------------------------
    // Radio Button Individual Setters w/ Overloaded Setter
    //-----------------------------------------------------------------------------
    public void setGroundShip(boolean groundShip) {
        this.groundShip = groundShip;
    }

    public void setTwoDay(boolean twoDay) {
        this.twoDay = twoDay;
    }

    public void setNextDay(boolean nextDay) {
        this.nextDay = nextDay;
    }

    public void setMasterCard(boolean masterCard) {
        this.masterCard = masterCard;
    }

    public void setVisaCard(boolean visaCard) {
        this.groundShip = visaCard;
    }

    public void setAmericanExprCard(boolean americanExprCard) {
        this.americanExprCard = americanExprCard;
    }

    //-----------------------------------------------------------------------------
    // Credit Card Text Field Setters w/ Overloaded Setter
    //-----------------------------------------------------------------------------
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardExpDate(int cardExpDate) {
        this.cardExpDate = cardExpDate;
    }

    public void setCardCIN(int cardCIN) {
        this.cardCIN = cardCIN;
    }

    public void setUserTextInput(int cardNumber, int cardExpDate, int cardCIN) {
        setCardNumber(cardNumber);
        setCardExpDate(cardExpDate);
        setCardCIN(cardCIN);
    }

    //************************************************ GETTERS ***********************************************//
    //----------------------------------------------------
    // Display Invoice Summary
    //----------------------------------------------------
    public String getInvoiceSummary() {

        String desc = "";
        
        // Painting Selection
        desc += "Painting Selection:";       
        if (artOne) {
            desc += "\n     Snow White";
        }
        if (artTwo) {
            desc += "\n     Alice";
        }
        if (artThree) {
            desc += "\n     Baby Strangeling";
        }
        if (artFour) {
            desc += "\n     Alice Van Eyke";
        }
        
        // Shipment Type
        desc += "\nShipment Type:";
        if (groundShip) {
            desc += "\n     Ground Shipment $0.00";
        }
        if (twoDay) {
            desc += "\n     Two Day Shipment $5.00";
        }
        if (nextDay) {
        desc += "\n     Next Day Shipment $10.00";
        }
        
        // Gift Wrap Selection
        desc += "\nGift Wrap Selection:";
        switch (giftWrap) {
            case "Christmas":
                desc += "\n     Chritsmas Wrap";
                break;
            case "Anniversary":
                desc += "\n     Anniversary Wrap";
                break;
            case "Birthday":
                desc += "\n     Birthday Wrap";
                break;
            case "No Wrap":
                desc += "\n     No Wrap";
                break;
        }       
        
        // Painting Size and Price
        desc += "\nPainting Size and Price:";
        switch (sizePrice) {
            case 12:
                desc += "\n     12x12in Painting: $50.00";
                break;
            case 24:
                desc += "\n     24x24in Painting: $100.00";
                break;
            case 36:
                desc += "\n     36x36in Painting: $200.00";
                break;
            case 48:
                desc += "\n     48x48in Painting: $350.00";
                break;
        }      
        
        // Credit Card Selection & Information
        desc += "\nCredit Card Selction:";
        if (masterCard) {
            desc += "\n     Master Card";
        }
        if (visaCard) {
            desc += "\n     Visa Card";
        }
        if (americanExprCard) {
            desc += "\n     American Express Card";
        }
        desc += "\nCredit Card Information:" + "\n     " + cardNumber + 
                "\n     " + cardExpDate + "\n     " + cardCIN;
                      
        return desc;
    }

    //---------------------------------------
    // Write to User File
    //---------------------------------------
    public void writeFile(File file) {

        FileWriter fstream;

        try {
            fstream = new FileWriter(file);
            try (BufferedWriter out = new BufferedWriter(fstream)) {
                out.write(getInvoiceSummary());      // Write file contents, will have many write statements
            } // Write file contents, will have many write statements
            finally {
                fstream.close();
            }
        } catch (IOException e) //Catch exception if any
        {
            System.err.println("Error: " + e.getMessage());
        }// End Exception Handeling
    }// End writeFile
}// End ArtData Class