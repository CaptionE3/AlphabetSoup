//Eitan A  pd.4
//9/29/26

//This program will change soup depending on if we tell driver.java to change



public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //adds a word to the pool of letters known as "letters"
    public void add(String word){
        letters=(letters+word);
    }


    //precondition  letters has values
    //postcondition returns a random value from letters
    public char randomLetter(){
                                                                                                        //example input top
        return letters.charAt((int)(Math.random()*letters.length()));                                   //example output p
    }


    
    //precondition input 
    //postcondition puts letters in company name in middle of input
    public String companyCentered(){
        //use substring and length together to "cut" letters apart and splice in the "company" varaible    //example input hi up
                                                                                                           //example output hiwhatsup
        return letters.substring(0,letters.length()/2)+company+letters.substring(letters.length()/2);
    }


    //precondition letters has a vowel
    //postcondition letters has one less vowel
    public void removeFirstVowel(){                                                                         // example input great
        letters.replace("[aeiouAEIOU]","");                                             // example output grat   
    }

    
    //precondition num length<=letters
    //postcondition letters -3 characters
    public void removeSome(int num){
        int index = (int)(Math.random()*(letters.length()-num));                                           // example input 3
         String firstHalf = letters.substring(0,index );                                        // example output hello to he
         String secondHalf= letters.substring(index+num);
         letters=firstHalf+secondHalf;
    }

    //precondition: letters exists and has length > 0 and word is a substring of letters
    //postcondition: word is removed from letters
    public void removeWord(String word){        //example input hiWhatsUp
        int index=letters.indexOf(word);        //example output hiup
        String firstHalf = letters.substring(0,index );
        String secondHalf = letters.substring(index+word.length());
        //                                      2
        word=firstHalf+secondHalf;
    }
}
