public class hangman {
    public static void main(String[] args){
        int numberOfMisses=0;
        for( int i=0; i<15; i++) {
           hangManImage(i);}

    }
    public static void hangManImage(int tries) {
        String display="";
        switch(tries){

            case 0:
            default:
                System.out.println("    |-------------------------|");
                System.out.println("    |          ");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                System.out.println("");
                break;

            case 1:
                System.out.println("    |--------------------------|");
                System.out.println("    |                          |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                System.out.println("");

                break;

            case 2:
                System.out.println("    |--------------------------|");
                System.out.println("    |                          |");
                System.out.println("    |                        -- --");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                System.out.println("");
                break;

            case 3:
                System.out.println("    |--------------------------|");
                System.out.println("    |                          | ");
                System.out.println("    |                       (  - -  )");
                System.out.println("    |                             ");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                System.out.println("");

                break;


            case 4:
                System.out.println("    |--------------------------|");
                System.out.println("    |                          | ");
                System.out.println("    |                       (  - -  )");
                System.out.println("    |                           |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                System.out.println("");
                break;
            case 5:
                System.out.println("    |--------------------------|");
                System.out.println("    |                          | ");
                System.out.println("    |                       (  - -  )");
                System.out.println("    |                           |");
                System.out.println("    |                           |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                System.out.println("");
                break;

            case 6:
                System.out.println("    |--------------------------|");
                System.out.println("    |                          | ");
                System.out.println("    |                       (  - -  )");
                System.out.println("    |                           |");
                System.out.println("    |                       |---|");
                System.out.println("    |                          ");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                System.out.println("");
                break;
            case 7:
                System.out.println("    |--------------------------|");
                System.out.println("    |                          | ");
                System.out.println("    |                       (  - -  )");
                System.out.println("    |                           |");
                System.out.println("    |                       |---|");
                System.out.println("    |                       |    ");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                System.out.println("");
                    break;
            case 8:
                System.out.println("    |--------------------------|");
                System.out.println("    |                          | ");
                System.out.println("    |                       (  - -  )");
                System.out.println("    |                           |");
                System.out.println("    |                       |---|");
                System.out.println("    |                       |    ");
                System.out.println("    |                       |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                System.out.println("");
                break;
            case 9:
                System.out.println("    |--------------------------|");
                System.out.println("    |                          | ");
                System.out.println("    |                       (  - -  )");
                System.out.println("    |                           |");
                System.out.println("    |                       |---|");
                System.out.println("    |                       |   |");
                System.out.println("    |                       |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                System.out.println("");
                break;
            case 10:
                System.out.println("    |--------------------------|");
                System.out.println("    |                          | ");
                System.out.println("    |                       (  - -  )");
                System.out.println("    |                           |");
                System.out.println("    |                       |---|");
                System.out.println("    |                       |   |");
                System.out.println("    |                       |   |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                System.out.println("");
                break;
            case 11:
                System.out.println("    |--------------------------|");
                System.out.println("    |                          | ");
                System.out.println("    |                       (  - -  )");
                System.out.println("    |                           |");
                System.out.println("    |                       |---|---");
                System.out.println("    |                       |   |");
                System.out.println("    |                       |   |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                System.out.println("");
                break;
            case 12:
                System.out.println("    |--------------------------|");
                System.out.println("    |                          | ");
                System.out.println("    |                       (  - -  )");
                System.out.println("    |                           |");
                System.out.println("    |                       |---|---|");
                System.out.println("    |                       |   |   |");
                System.out.println("    |                       |   |   |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                System.out.println("");
                break;
            case 13:
                System.out.println("    |--------------------------|");
                System.out.println("    |                        ");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                System.out.println("");
                break;
            case 14:
                System.out.println("    |--------------------------|");
                System.out.println("    |                        ");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                System.out.println("");
                break;
            case 15:
                System.out.println("    |--------------------------|");
                System.out.println("    |                        ");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                System.out.println("");
                break;
        }



    }
}
