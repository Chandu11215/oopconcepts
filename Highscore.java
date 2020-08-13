 class HighScore
{
public static void main(String args[])
{
 String playerName;
 int highScorePosition;
}
public static void displayHighScorePosition(String playerName,int highScorePosition)
{
 System.out.println(playerName+"managed to get into position"+highscoreposition+"on the high score table");
}
public static int calculateHighScorePosition(int playerScore)
{
 if(playerScore>1000)
{
  return 1;
}
 else if(playerScore>500 && playerScore<1000)
{
  return 2;
}
 else if(playerScore>100 && playerScore<500)
{
  return 3;
}
 else
{ 
  return 4;
}
 
  int highScorePosition = calculateHighScorePosition(1500);
       displayHighScorePosition("Tim",highScorePosition);
 
  int highScorePosition = calculateHighScoreposition(900);
      displayHighScorePosition("Bob",highScorePosition);
 
  int highScorePosition = calculateHighScorePosition(400);
      displayHighScorePosition("chandu",highScorePosition);

  int highScorePosition = calculateHighScorePosition(500);
      displayHighScorePosition("Gibert",highScorePosition);
  }
 }


