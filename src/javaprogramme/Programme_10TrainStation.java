package javaprogramme;

import java.util.Scanner;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme_10TrainStation {
    public static void main(String[] args) {
        String[] station = {"Aldgate", "Aldgate east", "Angle", "Baker street", "Bank", "Barbican",
                "Battersea power station", "Bayswater", "Blackfriars", "Bond street", "Borough",
                "Cannon street", "Chancery lane", "Charring cross", "City thameslink", "Covent garden",
                "Earl's court", "Edgware road", "Elephant & castle", "Embankment", "Euston",
                "Euston square", "Farringdon", "Fenuchurch street", "Gloucester road", "Goodge street",
                "Great Portland Street", "Green park", "High street kensington", "Holborn", "Hoxton",
                "Hyde park corner", "Kennington", "King-cross st pancras", "Knightsbridge", "Lambeth north",
                "Lancaster gate", "Leicester square", "Liverpool street", "London bridge", "Mansion house",
                "Marble arch", "Marylebone", "Monument", "Moorgate", "Nine elms", "Marylebone", "Old street",
                "Oxford circus", "Paddington", "Piccadilly circus", "Pimlico", "Queens way", "Regent's park"
                , "Russell square", "Shoreditch high street", "Sloane Square", "South kensington", "Southwark",
                "St james's park", "St pancras international", "St paul's", "Temple", "Tottenham court road",
                "Tower gateway", "Tower hill", "Vauxhall", "Victoria", "Warren street", "Waterloo",
                "Westminster"};
        String[][] lines = new String[26][100];
        lines[0][0] = "Bakerloo line";
        lines[0][1] = "Baker street";
        lines[0][2] = "Charring cross";
        lines[0][3] = "Edgware road";
        lines[0][4] = "Elephanth and castle";
        lines[0][5] = "Embankment";
        lines[0][6] = "Lambeth north";
        lines[0][7] = "Marylebone";
        lines[0][8] = "Oxford circus";
        lines[0][9] = "Picadilly circus";
        lines[0][10] = "Paddington";
        lines[0][11] = "Regent's park";
        lines[0][12] = "Waterloo";

        lines[1][0] = "Central line";
        lines[1][1] = "Queensway";
        lines[1][2] = "Lancaster gate";
        lines[1][3] = "Marble arch";
        lines[1][4] = "Bond street";
        lines[1][5] = "Oxford circus";
        lines[1][6] = "Tottenham court road";
        lines[1][7] = "Holborn";
        lines[1][8] = "Chancery lane";
        lines[1][9] = "St paul's";
        lines[1][10] = "Bank";
        lines[1][11] = "Liverpool street";

        lines[2][0] = "Circle line";
        lines[2][1] = "Baker street";
        lines[2][2] = "Barbican";
        lines[2][3] = "Bayswater";
        lines[2][4] = "Blackfriars";
        lines[2][5] = "Cannon street";
        lines[2][6] = "Edgware road";
        lines[2][7] = "Embankment";
        lines[2][8] = "Euston square";
        lines[2][9] = "Farringdon";
        lines[2][10] = "Gloucester road";
        lines[2][11] = "Great Portland Street";
        lines[2][12] = "High street kensington";
        lines[2][13] = "King-cross st pancras";
        lines[2][14] = "Liverpool street";
        lines[2][15] = "Monument";
        lines[2][16] = "Mansion house";
        lines[2][17] = "Moorgate";
        lines[2][18] = "Sloane Square";
        lines[2][19] = "South kensington";
        lines[2][20] = "St jame's park";
        lines[2][21] = "Temple";
        lines[2][22] = "Tower hill";
        lines[2][23] = "Victoria";
        lines[2][24] = "Westminster";
        lines[2][25] = "Aldgate";

        lines[3][0] = "District Line";
        lines[3][1] = "Aldgate east";
        lines[3][2] = "Bayswater";
        lines[3][3] = "Blackfriars";
        lines[3][4] = "Cannon street";
        lines[3][5] = "Edgware road";
        lines[3][6] = "Embankment";
        lines[3][7] = "High street kensington";
        lines[3][8] = "Mansion house";
        lines[3][9] = "Monument";
        lines[3][10] = "Paddington";
        lines[3][11] = "Sloane Square";
        lines[3][12] = "South kensington";
        lines[3][13] = "St jame's park";
        lines[3][14] = "Temple";
        lines[3][15] = "Tower hill";
        lines[3][16] = "Victoria";
        lines[3][17] = "Westminster";

        lines[4][0] = "Jubilee Line";
        lines[4][1] = "Baker street";
        lines[4][2] = "Bond street";
        lines[4][3] = "Green park";
        lines[4][4] = "London bridge";
        lines[4][5] = "Southwark";
        lines[4][6] = "Waterloo";
        lines[4][7] = "Westminster";

        lines[5][0] = "Metropolitan Line";
        lines[5][1] = "Aldgate";
        lines[5][2] = "Baker street";
        lines[5][3] = "Barbican";
        lines[5][4] = "Euston square";
        lines[5][5] = "Farringdon";
        lines[5][6] = "Great Portland Street";
        lines[5][7] = "King-cross st pancras";
        lines[5][8] = "Liverpool street";

        lines[6][0] = "Northern Line";
        lines[6][1] = "Angle";
        lines[6][2] = "Bank";
        lines[6][3] = "Battersea power station";
        lines[6][4] = "Borough";
        lines[6][5] = "Charring cross";
        lines[6][6] = "Embankment";
        lines[6][7] = "Euston";
        lines[6][8] = "Goodge street";
        lines[6][9] = "King-cross st pancras";
        lines[6][10] = "Leicester square";
        lines[6][11] = "London bridge";
        lines[6][12] = "Moorgate";
        lines[6][13] = "Nine elms";
        lines[6][14] = "Old street";
        lines[6][15] = "Tottenham court road";
        lines[6][16] = "Warren street";
        lines[6][17] = "Waterloo";

        lines[7][0] = "Victoria line";
        lines[7][1] = "Euston";
        lines[7][2] = "Green park";
        lines[7][3] = "King-cross st pancras";
        lines[7][4] = "Oxford circus";
        lines[7][5] = "Pimlico";
        lines[7][6] = "Victoria";
        lines[7][7] = "Warren street";
        lines[7][8] = "Vauxhall";

        lines[8][0] = "Waterloo Line";
        lines[8][1] = "Bank";
        lines[8][2] = "Waterloo";

        lines[9][0] = "Piccadilly line";
        lines[9][1] = "Earl's court";
        lines[9][2] = "Gloucester road";
        lines[9][3] = "South kensington";
        lines[9][4] = "Knightsbridge";
        lines[9][6] = "Hyde park corner";
        lines[9][7] = "Green park";
        lines[9][8] = "Piccadilly circus";
        lines[9][9] = "Leicester square";
        lines[9][10] = "Covent garden";
        lines[9][11] = "Holborn";
        lines[9][12] = "Russell square";
        lines[9][13] = "King-cross st pancras";

        char c = 'Y';
        Scanner scan = new Scanner(System.in);
        while (c == 'Y' || c == 'y') {
            System.out.println("Please enter the station name: ");
            String name = scan.next();
            String ans = "";
            for (int i = 0; i < station.length; i++) {
                if (name.equalsIgnoreCase(station[i])) {
                    ans = station[i];
                    break;
                }
            }
            if (name.equals(ans)) {
                System.out.println("--------------------------------------");
                System.out.println("Lines pass through this station are: ");
                System.out.println("--------------------------------------");
                for (int j = 0; j < lines.length; j++) {
                    for (int a = 0; a < lines.length; a++) {
                        String fAns = lines[j][a];
                        if (name.equalsIgnoreCase(fAns)) {
                            System.out.println(lines[j][0]);
                        }
                    }
                }
            } else {
                System.out.println("This station is not in Zone 1");
            }
            System.out.println("If you want to check more station, press 'Y' or press 'N'");
            c = scan.next().charAt(0);
        }
        scan.close();
    }
}
