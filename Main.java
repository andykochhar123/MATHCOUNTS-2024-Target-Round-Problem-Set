// sample MATHCOUNTS Target Round problem set

import java.util.ArrayList;
public class Main
{
    // formula one for problem 5
    public static int calculateFormulaOne(int x)
    {
        int result = calculateFormula(Math.pow(x, 2));
        
        return result;
    }
    
    // formula two for problem 5
    public static int calculateFormulaTwo(int x)
    {
        int result = Math.pow(calculateFormula(x), 2);
        
        return result;
    }
    
    // function formula for problem 5
    public static int calculateFormula(int x)
    {
        int result = 3 * x - 27;
        
        return result;
    }
    // Pythagorean Theorem's method to find side for problem 4
    public static int pythFormulaSide(int hyp, int side)
    {
        int resultSide = Math.sqrt(Math.pow(hyp, 2) - Math.pow(side, 2));
        
        return resultSide;
    }
    
    // Pythagorean Theorem's method to find hypotenuse for problem 4
    public static int pythFormulaHyp(int side1, int side2)
    {
        int resultHyp = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        
        return resultHyp;
    }
    
	public static void main(String[] args) 
	{
	    /** PROBLEM 1
	     * 
	     * There are 130 members of the Kelly family attending the family reunion 
cookout at the park. Each picnic table at the park seats eight people. What is the 
minimum number of picnic tables needed when the entire family sits down to 
eat together? 
	     **/
	     
	     System.out.println("PROBLEM 1");
	     
	    // setting static integers based on given numbers
	    int TOTAL_MEMBERS = 130;
	    int MAX_SEATING = 8;
	    
	    // calculating the amount of full tables that will be filled
	    int fullTables = TOTAL_MEMBERS / MAX_SEATING;
	    
	    // adding the extra table seating the remaining members to all the filled tables
	    int totalTables = fullTables + 1;
	    
	    // printing solution
	    System.out.println(totalTables + " picnic tables");
	    System.out.println();
	    
	    
	    /** PROBLEM 2
	     * 
	     * Yang arranges one 4 × 4-inch square tile and five 2 × 2-inch square tiles to form 
one large square. With no overlapping tiles and no space between adjacent tiles, 
what is the area of the large square?
	     **/
	     
	     System.out.println("PROBLEM 2");
	     
	     // setting static integers based on given numbers
	     int LENGTH_SMALL_SQUARE = 2;
	     int NUMBER_SMALL_SQUARES = 5;
	     
	     int LENGTH_LARGE_SQUARE = 4;
	     int NUMBER_LARGE_SQUARES = 1;
	     
	     // calculating area of one small square
	     int areaSmallSquare = Math.pow(LENGTH_SMALL_SQUARE, 2);
	     
	     // calculating total area of small squares
	     int totalAreaSmallSquares = areaSmallSquare * NUMBER_SMALL_SQUARES;
	     
	     // calculating area of one large square
	     int areaLargeSquare = Math.pow(LENGTH_LARGE_SQUARE, 2);
	     
	     // calculating total area of large square
	     int totalAreaLargeSquares = areaLargeSquare * NUMBER_LARGE_SQUARES;
	     
	     // calculating total area of all squares
	     int totalArea = totalAreaLargeSquares + totalAreaLargeSquares;
	     
	     // printing solution
	     System.out.println(totalArea + " square inches");
	     System.out.println();
	     
	     
	     
	     /** PROBLEM 3
	     * 
	     * A bus is traveling from Houston, Texas to Iowa City, Iowa, a distance of 
1200 miles. When moving, the bus’s average speed is 60 mi/h. However, 
throughout the trip, the bus makes a number of rest stops. If the bus’s average 
speed over the entire trip, including the rest stops, is only 48 mi/h, how many 
minutes in total does the bus spend at rest stops over the course of the trip? 
	     **/
	     
	     System.out.println("PROBLEM 3");
	     
	     // setting static integers based on given numbers
	     int TOTAL_DISTANCE = 1200;
	     
	     int BUS_AVG_MOVING = 60;
	     int BUS_AVG_TRIP = 48;
	     
	     int MIN_IN_HR = 60;
	     
	     // calculating trip time assuming no rest stops
	     int noRestHrs = TOTAL_DISTANCE / BUS_AVG_MOVING;
	     
	     // calculating actual trip time given rest stops
	     int restHrs = TOTAL_DISTANCE / BUS_AVG_TRIP;
	     
	     // calculating time spent at rest stops
	     int restTimeHrs = noRestHrs - restHrs;
	     
	     // converting time spent at rest stops in minutes
	     int restTimeMin = restTimeHrs * MIN_IN_HR;
	     
	     // printing solution
	     System.out.println(restTimeMin + " minutes");
	     System.out.println();
	     
	     
	     /** PROBLEM 4
	     * 
	     * In the figure shown (go to problem set file to see figure), rectangle ABCD has AB = 323 cm and AD = 204 cm. 
Isosceles triangle AEF is inscribed in rectangle ABCD with AE = AF = 325 cm. 
What is the length of segment EF?
	     **/
	     
	     System.out.println("PROBLEM 4");
	     
	     // setting static integers based on given numbers
	     int AB = 323;
	     int AD = 204;
	     int AE = 325;
	     int AF = 325;
	     int BC = AD;
	     int DC = AB;
	     
	     // calculating segment BE
	     int BE = pythFormulaSide(AE, AB);
	     
	     // calculating segment DF
	     int DF = pythFormulaSide(AF, AD);
	     
	     // calculating segment EC
	     int EC = BC - BE;
	     
	     // calculating segment FC
	     int FC = DC - DF;
	     
	     // calculating segment EF
	     int EF = pythFormulaHyp(EC, FC);
	     
	     // printing solution
	     System.out.println(EF + " cm");
	     System.out.println();
	     
	     
	     /** PROBLEM 5
	     * 
	     *  If f(x) = 3x − 27, what is the greatest real number x for which f(x^2) = (f(x))^2? 
	     **/
	     
	     // setting variables based on data given
	     int formulaOne;
	     int formulaTwo;
	     
	     // starting at zero and keep going until number is reached
	     // formula is a parabola so there is zero and then another number
	     int inputNumber = 0;
	     boolean match = false;
	     
	     while (!match)
	     {
	         formulaOne = calculateFormulaOne(inputNumber);
	         formulaTwo = calculateFormulaTwo(inputNumber);
	         
	         if (formulaOne == formulaTwo)
	         {
	             match = true;
	         }
	         
	         else
	         {
	             inputNumber++;
	         }
	     }
	     
	     // printing solution
	     System.out.println(inputNumber);
	     System.out.println();
	     
	     /** PROBLEM 6
	     * 
	     * In Mathcountia, the currency denominations are $1, $9, $81 and $729. If Coda 
has 500 pieces of Mathcountia currency whose total value exceeds $10,000, 
what is the least possible total value of Coda’s currency?
	     **/
	     
	     System.out.println("PROBLEM 6");
	     
	     // setting up ArrayList to store all possible total values
	     ArrayList <Integer> possibleValues = new ArrayList<>();
	     
	     for (int ones = 1; ones <= 500; ones++)
	     {
	         for (int nines = 1; nines <= 500; nines++)
	         {
	             for (int eightyOnes = 1; eightyOnes <= 500; eightyOnes++)
	             {
	                 for (int sevenTwoNines = 1; sevenTwoNines <= 500; sevenTwoNines++)
	                 {
	                     if (ones + nines + eightyOnes + sevenTwoNines == 500)
	                     {
	                         int possibleValue = ones * 1 + nines * 9 + eightyOnes * 81 + sevenTwoNines * 729;
	                         
	                         if (possibleValues > 10000)
	                         {
	                             possibleValues.add(possibleValue);
	                         }
	                     }
	                 }
	             }
	         }
	     }
	     
	     // finding minimum value from all possible values
	     int minValue = possibleValues.get(0);
	     
	     for (int i = 0; i < possibleValues.size(); i++)
	     {
	         if (possibleValues.get(i) < minValue)
	         {
	             minValue = possibleValues.get(i);
	         }
	     }
	     
	     // printing solution
	     System.out.println("$" + minValue);
	     
	     
	}
}