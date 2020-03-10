import java.io.*;
import java.util.*;

public class Main {
	public static final int ROWS = 39;
	public static final int COLLUMNS = 50;
	
	public static final int A = 0;
	public static final int B = 1;
	public static final int C = 2;
	public static final int D = 3;
	public static final int E = 4;
	public static final int F = 5;
	public static final int G = 6;
	public static final int H = 7;
	public static final int I = 8;
	public static final int J = 9;
	public static final int K = 10;
	public static final int L = 11;
	public static final int M = 12;
	public static final int N = 13;
	public static final int O = 14;
	public static final int P = 15;
	public static final int Q = 16;
	public static final int R = 17;
	public static final int S = 18;
	public static final int T = 19;
	public static final int U = 20;
	public static final int V = 21;
	public static final int W = 22;
	public static final int X = 23;
	public static final int Y = 24;
	public static final int Z = 25;
	
	public static final int ZERO = 26;
	public static final int ONE = 27;
	public static final int TWO = 28;
	public static final int THREE = 29;
	public static final int FOUR = 30;
	public static final int FIVE = 31;
	public static final int SIX = 32;
	public static final int SEVEN = 33;
	public static final int EIGHT = 34;
	public static final int NINE = 35;
	
	public static final int EMPTY = 36;
	public static final int REPEAT = 37;
	public static final int ACCEPTING = 38;
	
	public static int startIndex = -1;
	public static int endIndex = -1;
	
	
	public static boolean[] [] createTable(boolean[] [] table, char[] expression)
	{
		int currentState = 0;
		//convert the expression into Characters and then compare to see if it is digit, letter, or symbol
		for(int i = 0; i < expression.length; i++)
		{
			//grab symbol
			char symbol = expression[i];
			
			if(symbol == 'a')
			{
				table[A][currentState] = true;
			}
			else if(symbol == 'b')
			{
				table[B][currentState] = true;
			}
			else if(symbol == 'c')
			{
				table[C][currentState] = true;
			}
			else if(symbol == 'd')
			{
				table[D][currentState] = true;
			}
			else if(symbol == 'e')
			{
				table[E][currentState] = true;
			}
			else if(symbol == 'f')
			{
				table[F][currentState] = true;
			}
			else if(symbol == 'g')
			{
				table[G][currentState] = true;
			}
			else if(symbol == 'h')
			{
				table[H][currentState] = true;
			}
			else if(symbol == 'i')
			{
				table[I][currentState] = true;
			}
			else if(symbol == 'j')
			{
				table[J][currentState] = true;
			}
			else if(symbol == 'k')
			{
				table[K][currentState] = true;
			}
			else if(symbol == 'l')
			{
				table[L][currentState] = true;
			}
			else if(symbol == 'm')
			{
				table[M][currentState] = true;
			}
			else if(symbol == 'n')
			{
				table[N][currentState] = true;
			}
			else if(symbol == 'o')
			{
				table[O][currentState] = true;
			}
			else if(symbol == 'p')
			{
				table[P][currentState] = true;
			}
			else if(symbol == 'q')
			{
				table[Q][currentState] = true;
			}
			else if(symbol == 'r')
			{
				table[R][currentState] = true;
			}
			else if(symbol == 's')
			{
				table[S][currentState] = true;
			}
			else if(symbol == 't')
			{
				table[T][currentState] = true;
			}
			else if(symbol == 'u')
			{
				table[U][currentState] = true;
			}
			else if(symbol == 'v')
			{
				table[V][currentState] = true;
			}
			else if(symbol == 'w')
			{
				table[W][currentState] = true;
			}
			else if(symbol == 'x')
			{
				table[X][currentState] = true;
			}
			else if(symbol == 'y')
			{
				table[Y][currentState] = true;
			}
			else if(symbol == 'z')
			{
				table[Z][currentState] = true;
			}
			else if(symbol == '0')
			{
				table[ZERO][currentState] = true;
			}
			else if(symbol == '1')
			{
				table[ONE][currentState] = true;
			}
			else if(symbol == '2')
			{
				table[TWO][currentState] = true;
			}
			else if(symbol == '3')
			{
				table[THREE][currentState] = true;
			}
			else if(symbol == '4')
			{
				table[FOUR][currentState] = true;
			}
			else if(symbol == '5')
			{
				table[FIVE][currentState] = true;
			}
			else if(symbol == '6')
			{
				table[SIX][currentState] = true;
			}
			else if(symbol == '7')
			{
				table[SEVEN][currentState] = true;
			}
			else if(symbol == '8')
			{
				table[EIGHT][currentState] = true;
			}
			else if(symbol == '9')
			{
				table[NINE][currentState] = true;
			}
			else if(symbol == '*')
			{
				currentState--;
				table[EMPTY][currentState] = true;
				table[REPEAT][currentState] = true;
			}
			else if(symbol == '+')
			{
				//no added condition
				currentState--;
				table[REPEAT][currentState] = true;
			}
			else if(symbol == '[')
			{
				int state = currentState;
				while(symbol != ']')
				{
					i++;
					symbol = expression[i];
					if(symbol == 'a')
					{
						table[A][state] = true;
					}
					else if(symbol == 'b')
					{
						table[B][state] = true;
					}
					else if(symbol == 'c')
					{
						table[C][state] = true;
					}
					else if(symbol == 'd')
					{
						table[D][state] = true;
					}
					else if(symbol == 'e')
					{
						table[E][state] = true;
					}
					else if(symbol == 'f')
					{
						table[F][state] = true;
					}
					else if(symbol == 'g')
					{
						table[G][state] = true;
					}
					else if(symbol == 'h')
					{
						table[H][state] = true;
					}
					else if(symbol == 'i')
					{
						table[I][state] = true;
					}
					else if(symbol == 'j')
					{
						table[J][state] = true;
					}
					else if(symbol == 'k')
					{
						table[K][state] = true;
					}
					else if(symbol == 'l')
					{
						table[L][state] = true;
					}
					else if(symbol == 'm')
					{
						table[M][state] = true;
					}
					else if(symbol == 'n')
					{
						table[N][state] = true;
					}
					else if(symbol == 'o')
					{
						table[O][state] = true;
					}
					else if(symbol == 'p')
					{
						table[P][state] = true;
					}
					else if(symbol == 'q')
					{
						table[Q][state] = true;
					}
					else if(symbol == 'r')
					{
						table[R][state] = true;
					}
					else if(symbol == 's')
					{
						table[S][state] = true;
					}
					else if(symbol == 't')
					{
						table[T][state] = true;
					}
					else if(symbol == 'u')
					{
						table[U][state] = true;
					}
					else if(symbol == 'v')
					{
						table[V][state] = true;
					}
					else if(symbol == 'w')
					{
						table[W][state] = true;
					}
					else if(symbol == 'x')
					{
						table[X][state] = true;
					}
					else if(symbol == 'y')
					{
						table[Y][state] = true;
					}
					else if(symbol == 'z')
					{
						table[Z][state] = true;
					}
					else if(symbol == '0')
					{
						table[ZERO][state] = true;
					}
					else if(symbol == '1')
					{
						table[ONE][state] = true;
					}
					else if(symbol == '2')
					{
						table[TWO][state] = true;
					}
					else if(symbol == '3')
					{
						table[THREE][state] = true;
					}
					else if(symbol == '4')
					{
						table[FOUR][state] = true;
					}
					else if(symbol == '5')
					{
						table[FIVE][state] = true;
					}
					else if(symbol == '6')
					{
						table[SIX][state] = true;
					}
					else if(symbol == '7')
					{
						table[SEVEN][state] = true;
					}
					else if(symbol == '8')
					{
						table[EIGHT][state] = true;
					}
					else if(symbol == '9')
					{
						table[NINE][state] = true;
					}
				}
			}
			if(i != expression.length-1)
			{
				currentState++;
			}
		}
		//adjust accepting state for non character symbols at end of expression
		char symbol = expression[expression.length-1];
		if(symbol == '*' || symbol == '+')
		{
			table[ACCEPTING][currentState+1] = true;
		}
		else
		table[ACCEPTING][currentState+1] = true;
		
		return table;
	}
	
	public static boolean testLine(boolean[] [] table, char[] target)
	{
		boolean flag = false;
		int currentState = 0;
		for(int i = 0; i < target.length; i++)
		{
			char testChar = target[i];
			
			if(testChar == 'a' && table[A][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 'a' && i < target.length)
					{
						testChar = target[i];
						i++;
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == 'b' && table[B][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 'b' && i < target.length)
					{
						testChar = target[i];
						i++;
						
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == 'c' && table[C][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 'c' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == 'd' && table[D][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 'd' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == 'e' && table[E][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 'e' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == 'f' && table[F][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 'f' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == 'g' && table[G][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 'g' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == 'h' && table[H][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 'h' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == 'i' && table[I][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 'i' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == 'j' && table[J][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 'j' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == 'k' && table[K][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 'k' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == 'l' && table[L][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 'l' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == 'm' && table[M][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 'm' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == 'n' && table[N][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 'n' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == 'o' && table[O][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 'o' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == 'p' && table[P][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 'p' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == 'q' && table[Q][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 'q' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == 'r' && table[R][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 'r' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == 's' && table[S][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 's' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == 't' && table[T][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 't' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == 'u' && table[U][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 'u' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == 'v' && table[V][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 'v' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == 'w' && table[W][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 'w' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == 'x' && table[X][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 'x' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == 'y' && table[Y][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 'y' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == 'z' && table[Z][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == 'z' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == '0' && table[ZERO][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == '0' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == '1' && table[ONE][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == '1' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == '2' && table[TWO][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == '2' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == '3' && table[THREE][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == '3' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == '4' && table[FOUR][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == '4' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == '5' && table[FIVE][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == '5' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == '6' && table[SIX][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == '6' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == '7' && table[SEVEN][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == '7' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == '8' && table[EIGHT][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == '8' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				
				//move to next state in state table
				currentState++;
			}
			else if(testChar == '9' && table[NINE][currentState])
			{
				//if Start state is not initialized set start state to i
				if(startIndex == -1)
				{
					startIndex = i;
				}
				
				//check for repeated instances
				if(table[REPEAT][currentState])
				{
					while(testChar == '9' && i < target.length)
					{
						testChar = target[i];
						i++;	
					}
					i-=2;
				}
				//move to next state in state table
				currentState++;
			}
			else if(table[EMPTY][currentState])
			{
				//move to next state in state table
				currentState++;
				//Empty string is accepted do not instantiate starting index
			}
			else if(table[ACCEPTING][currentState])
			{
				//accepting state flag = true
				flag = true;
				endIndex = i + 1;
				break;
			}
			else
			{
				if(currentState !=0)
				{
					i--;
					currentState = 0;
					startIndex = -1;
				}
				//not a matching state so send state machine back to 0
				currentState = 0;
				startIndex = -1;
			}
			
			//Navigate through empty string states till we are at end of State Machine
			if(i == target.length -1)
			{
				while(table[EMPTY][currentState])
				{
					currentState++;
				}
			}
			//test if we are in an accepting state
			if(table[ACCEPTING][currentState])
			{
				//accepting state flag = true
				flag = true;
				endIndex = i + 1;
				break;
			}	
		}	
		return flag;
	}
	
	public static boolean findStar(char goal, char[] target)
	{
		boolean flag = false;
		for(int i = 0; i < target.length; i++)
		{
			if(goal == target[i])
			{
				flag = true;
				startIndex = i;
				while(goal == target[i])
				{
					i++;
				}
				endIndex = i;
			}
		}
		return flag;
	}

	public static void main(String[] argv) throws Exception
	{
		/*State 1; State 2; ... 50
		 *   A   ;
		 *   B   ;
		 *   C   ;
		 *   ..  ;
		 *   8   ;
		 *   9   ;
		 * Empty ;
		 * Repeat;
		 * Accept;  
		 * 
		 * 26 letters 10 digits 1 empty value 1 accepting indicator 1 repeat indicator = 39
		 */
		
		boolean [] [] stateTable = new boolean [ROWS] [COLLUMNS];
		
		String regularExpression = argv[0];
		char[] regularExpressionChars = regularExpression.toCharArray();
		File inputFile = new File(argv[1]);
		Scanner fileReader = new Scanner(inputFile);
		
		stateTable = createTable(stateTable, regularExpressionChars);
		boolean found = false;
		int count = 0;
		
		if(regularExpressionChars.length == 2 && regularExpression.charAt(1) == '*')
		{
			while(fileReader.hasNextLine())
			{
				String target = fileReader.nextLine();
				char[] targetLine = target.toCharArray();
				found = findStar(regularExpressionChars[0], targetLine);
				if(found && startIndex != -1)
				{
					System.out.println("Match found on line " + count + ", starting at position " + startIndex + " and ending at position " + (endIndex-1) + ": " + target.substring(startIndex, endIndex));
				}
				else
				{
					System.out.println("No match found on this line");
				}
				startIndex = -1;
				endIndex = -1;
				count++;
			}
		}
		else
		{
			while(fileReader.hasNextLine())
			{
				String target = fileReader.nextLine();
				char[] targetLine = target.toCharArray();
				found = testLine(stateTable, targetLine);
				if(found && startIndex != -1)
				{
					System.out.println("Match found on line " + count + ", starting at position " + startIndex + " and ending at position " + (endIndex-1) + ": " + target.substring(startIndex, endIndex));
				}
				else
				{
					System.out.println("No match found on this line");
				}
				startIndex = -1;
				endIndex = -1;
				count++;
			}
		}
		fileReader.close();
	}

}
