//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MadLib
{
	private ArrayList<String> verbs = new ArrayList<String>();
	private ArrayList<String> nouns = new ArrayList<String>();
	private ArrayList<String> adjectives = new ArrayList<String>();
	private String story = "";
	

	public MadLib()
	{
		verbs.add("punched");
		nouns.add("wal-mart");
		adjectives.add("massive");
		story="The # @ after the & & # while the # @ the #";
	}

	public MadLib(String fileName)
	{
		//load stuff
		loadNouns();
		loadAdjectives();
		loadVerbs();

		try
		{
			String reStory = "";
			//Read the different parts of the story and concatenate the resulting
			//story using the symbols to tell you the parts of speech


			//While there is more of the story, read in the word/symbol

				//If what was read in is one of the symbols, find a random
				//word to replace it.
			Scanner reader = new Scanner(story);
			{
				while(reader.hasNext());
				{
					
    					

					if( reader.equals("#") )
						{
							
							reStory += (getRandomNoun());
						}

					else if( reader.equals("@") )
						{
							
							reStory += (getRandomVerb());
						}

					else if( reader.equals("&") )
						{
							
							reStory += (getRandomAdjective());
						}
					else
						reStory += reader;
						reader.next();

				}

				reader.close();
			}
			


		}
		catch(Exception e)
		{
			System.out.println("Houston we have a problem!");
		}

	}

	public void loadNouns()
	{
		try
		{
			Scanner reader = new Scanner(new File("nouns.dat"));

			while(reader.hasNext());
			{
				nouns.add(reader.next());
			}
			reader.close();
		}
		catch(Exception e)
		{
			System.out.println("nouns.dat does not exist");
		}

	}

	public void loadVerbs()
	{
		try
		{
			Scanner reader = new Scanner(new File("verbs.dat"));

			while(reader.hasNext());
			{
				verbs.add(reader.next());
			}
			reader.close();

		}
		catch(Exception e)
		{
			System.out.println("verbs.dat does not exist");
		}
	}

	public void loadAdjectives()
	{
		try
		{
			Scanner reader = new Scanner(new File("adjectives.dat"));

			while(reader.hasNext());
			{
				adjectives.add(reader.next());
			}
			reader.close();
		}
		catch(Exception e)
		{
			System.out.println("adjectives.dat does not exist");
		}
	}

	public String getRandomVerb()
	{
		Random rand = new Random();
		return "" + verbs.get(rand.nextInt(verbs.size()));
	}

	public String getRandomNoun()
	{	
		Random rand = new Random();
		return "" + nouns.get(rand.nextInt(nouns.size()));
	}

	public String getRandomAdjective()
	{
		Random rand = new Random();
		
		return "" + adjectives.get(rand.nextInt(adjectives.size()));
		
	}

	public String toString()
	{
		return "" + reStory;
	}
}