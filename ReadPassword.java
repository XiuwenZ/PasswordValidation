/*read data from the input file, and returns count to the main program to process more steps
*/
public static int readData(String[]passwords) throws Exception {
		File inputFile = new File("input.txt");
		Scanner input = new Scanner(inputFile);
		int count = 0;
		while (input.hasNext()) {
				passwords[count] = input.nextLine().trim();
				count++;
		}
	
		input.close();

		return count;
}
	
