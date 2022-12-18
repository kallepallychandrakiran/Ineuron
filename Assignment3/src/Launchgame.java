import java.util.Scanner;

public class Launchgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to guesser-player game");
		System.out.println("\r\n"
				+ "  _                        _           \r\n"
				+ " / `   _   _ __  _  //|   / `_  _ _  _ \r\n"
				+ "/_;/_//_'_\\_\\/_'/  |./   /_;/_|/ / //_'\r\n"
				+ "                                       \r\n"
				+ "");
		System.out.println("Dear Guesser please enter your number : ");
		Scanner scan = new Scanner(System.in);
		int guesserNum = scan.nextInt();
		Guesser g = new Guesser(guesserNum);
		System.out.println("Your Number has been stored! Thanks ");
		System.out.println("Dear Player 1 please choose your number : ");
		int playerNum1 = scan.nextInt();
		Player p1 = new Player(playerNum1);
		
		System.out.println("Dear Player 2 please choose your number : ");
		int playerNum2 = scan.nextInt();
		Player p2 = new Player(playerNum2);
		
		System.out.println("Dear Player 3 please choose your number : ");
		int playerNum3 = scan.nextInt();
		Player p3 = new Player(playerNum3);
		
		
		if(p1.playerNum==g.guesserNum && p2.playerNum!=g.guesserNum && p3.playerNum!=g.guesserNum)
		{
			System.out.println("Player 1 has won the game");
			System.out.println("                                   .''.       \r\n"
					+ "       .''.      .        *''*    :_\\/_:     . \r\n"
					+ "      :_\\/_:   _\\(/_  .:.*_\\/_*   : /\\ :  .'.:.'.\r\n"
					+ "  .''.: /\\ :   ./)\\   ':'* /\\ * :  '..'.  -=:o:=-\r\n"
					+ " :_\\/_:'.:::.    ' *''*    * '.\\'/.' _\\(/_'.':'.'\r\n"
					+ " : /\\ : :::::     *_\\/_*     -= o =-  /)\\    '  *\r\n"
					+ "  '..'  ':::'     * /\\ *     .'/.\\'.   '\r\n"
					+ "      *            *..*         :\r\n"
					+ "     *\r\n"
					+ "        *");
		}
		
		if(p2.playerNum==g.guesserNum && p1.playerNum!=g.guesserNum && p3.playerNum!=g.guesserNum)
		{
			System.out.println("Player 2 has won the game");
			System.out.println("                                   .''.       \r\n"
					+ "       .''.      .        *''*    :_\\/_:     . \r\n"
					+ "      :_\\/_:   _\\(/_  .:.*_\\/_*   : /\\ :  .'.:.'.\r\n"
					+ "  .''.: /\\ :   ./)\\   ':'* /\\ * :  '..'.  -=:o:=-\r\n"
					+ " :_\\/_:'.:::.    ' *''*    * '.\\'/.' _\\(/_'.':'.'\r\n"
					+ " : /\\ : :::::     *_\\/_*     -= o =-  /)\\    '  *\r\n"
					+ "  '..'  ':::'     * /\\ *     .'/.\\'.   '\r\n"
					+ "      *            *..*         :\r\n"
					+ "     *\r\n"
					+ "        *");
		}
		
		if(p3.playerNum==g.guesserNum && p1.playerNum!=g.guesserNum && p2.playerNum!=g.guesserNum)
		{
			System.out.println("Player 3 has won the game");
			System.out.println("                                   .''.       \r\n"
					+ "       .''.      .        *''*    :_\\/_:     . \r\n"
					+ "      :_\\/_:   _\\(/_  .:.*_\\/_*   : /\\ :  .'.:.'.\r\n"
					+ "  .''.: /\\ :   ./)\\   ':'* /\\ * :  '..'.  -=:o:=-\r\n"
					+ " :_\\/_:'.:::.    ' *''*    * '.\\'/.' _\\(/_'.':'.'\r\n"
					+ " : /\\ : :::::     *_\\/_*     -= o =-  /)\\    '  *\r\n"
					+ "  '..'  ':::'     * /\\ *     .'/.\\'.   '\r\n"
					+ "      *            *..*         :\r\n"
					+ "     *\r\n"
					+ "        *");
		}
		
		else {
			System.out.println("Guesser Congrats These three asshole players didn't guess it right YOU WON!!!!!!");
		}
		
		}
	}
			
		
		
	





 


