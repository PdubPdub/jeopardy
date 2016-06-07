package servlets;

import beans.*;
import java.util.*;

/**
 *
 * @author Pat
 */
public class Question {

    public static QuestionBean[][] makeQuestion() {

        QuestionBean qb1 = new QuestionBean();
        QuestionBean qb2 = new QuestionBean();
        QuestionBean qb3 = new QuestionBean();
        QuestionBean qb4 = new QuestionBean();
        QuestionBean qb5 = new QuestionBean();
        QuestionBean qb6 = new QuestionBean();
        QuestionBean qb7 = new QuestionBean();
        QuestionBean qb8 = new QuestionBean();
        QuestionBean qb9 = new QuestionBean();
        QuestionBean qb10 = new QuestionBean();
        QuestionBean qb11 = new QuestionBean();
        QuestionBean qb12 = new QuestionBean();
        QuestionBean qb13 = new QuestionBean();
        QuestionBean qb14 = new QuestionBean();
        QuestionBean qb15 = new QuestionBean();
        QuestionBean qb16 = new QuestionBean();
        QuestionBean qb17 = new QuestionBean();
        QuestionBean qb18 = new QuestionBean();
        QuestionBean qb19 = new QuestionBean();
        QuestionBean qb20 = new QuestionBean();
        QuestionBean qb21 = new QuestionBean();
        QuestionBean qb22 = new QuestionBean();
        QuestionBean qb23 = new QuestionBean();
        QuestionBean qb24 = new QuestionBean();
        QuestionBean qb25 = new QuestionBean();

        int bet = 0;

        qb1.setCategory("Famous Musicians");
        qb1.setQuestion("Nevermind this long dead rocker");
        qb1.setA1("Who is Jimi Hendrix?");
        qb1.setA2("Who is Sid Vicious?");
        qb1.setA3("Who is Phil Lynott?");
        qb1.setA4("Who is Kurt Cobain?");
        qb1.setAnswer("Who is Kurt Cobain?");
        qb1.setValue(100);
        qb1.setLbl("$" + qb1.getValue());
        qb1.setAnswered(false);

        qb2.setCategory("Famous Musicians");
        qb2.setQuestion("Notorious first multi-year singer in "
                + "this electrically named band");
        qb2.setA1("Who is Bryan Johnson?");
        qb2.setA2("Who is Neil Young?");
        qb2.setA3("Who is Bon Scott?");
        qb2.setA4("Who is Jimmy Page?");
        qb2.setAnswer("Who is Bon Scott?");
        qb2.setValue(200);
        qb2.setLbl("$" + qb2.getValue());
        qb2.setAnswered(false);

        qb3.setCategory("Famous Musicians");
        qb3.setQuestion("Sued his fans who shared enthusiasm for his drumming");
        qb3.setA1("Who is Keith Moon?");
        qb3.setA2("Who is Lars Ulrich?");
        qb3.setA3("Who is Ringo Starr?");
        qb3.setA4("Who is Neil Peart?");
        qb3.setAnswer("Who is Lars Ulrich?");
        qb3.setValue(300);
        qb3.setLbl("$" + qb3.getValue());
        qb3.setAnswered(false);

        qb4.setCategory("Famous Musicians");
        qb4.setQuestion("No last names here, asking us to hold "
                + "and thrill them");
        qb4.setA1("Who is Bono?");
        qb4.setA2("Who is Madonna?");
        qb4.setA3("Who is Cher?");
        qb4.setA4("Who is Seal?");
        qb4.setAnswer("Who is Bono?");
        qb4.setValue(400);
        qb4.setLbl("" + qb4.getValue());
        qb4.setAnswered(false);

        qb5.setCategory("Famous Musicians");
        qb5.setQuestion("Has rapped about his disdain for them and "
                + "plays a one on TV ");
        qb5.setA1("Who is ICE-T?");
        qb5.setA2("Who is Cube?");
        qb5.setA3("Who is LL Cool J?");
        qb5.setA4("Who is Snoop Dog?");
        qb5.setAnswer("Who is ICE-T?");
        qb5.setValue(500);
        qb5.setLbl("" + qb5.getValue());
        qb5.setAnswered(false);

        qb6.setCategory("Video Game Characters");
        qb6.setQuestion("16-bit era introduced thid primary coloured hero, "
                + "with a doctor as a nemesis");
        qb6.setA1("Who is Mario?");
        qb6.setA2("Who is Megaman?");
        qb6.setA3("Who is Sonic the Hedgehog?");
        qb6.setA4("Who is Link?");
        qb6.setAnswer("Who is Sonic the Hedgehog?");
        qb6.setValue(100);
        qb6.setLbl("" + qb6.getValue());
        qb6.setAnswered(false);

        qb7.setCategory("Video Game Characters");
        qb7.setQuestion("The nemesis the jolly plumbers only faced once");
        qb7.setA1("Who is Wart?");
        qb7.setA2("Who is Bowser?");
        qb7.setA3("Who is Donkey Kong?");
        qb7.setA4("Who is Wario?");
        qb7.setAnswer("Who is Wart?");
        qb7.setValue(200);
        qb7.setLbl("" + qb7.getValue());
        qb7.setAnswered(false);

        qb8.setCategory("Video Game Characters");
        qb8.setQuestion("Only this adventurer can save the animals");
        qb8.setA1("Who is Megaman?");
        qb8.setA2("Who is Link?");
        qb8.setA3("Who is Simon Belmont?");
        qb8.setA4("Who is Samus Aran?");
        qb8.setAnswer("Who is Samus Aran?");
        qb8.setValue(300);
        qb8.setLbl("" + qb8.getValue());
        qb8.setAnswered(false);

        qb9.setCategory("Video Game Characters");
        qb9.setQuestion("From his point of view Lambda is his least "
                + "favourite Greek letter");
        qb9.setA1("Who is BJ Blazkowicz?");
        qb9.setA2("Who is James Bond?");
        qb9.setA3("Who is Gordon Freeman?");
        qb9.setA4("Who is Duke Nukem?");
        qb9.setAnswer("Who is Gordon Freeman?");
        qb9.setValue(400);
        qb9.setLbl("" + qb9.getValue());
        qb9.setAnswered(false);

        qb10.setCategory("Video Game Characters");
        qb10.setQuestion("Fighter who doesn't give a Van Damn "
                + "who played him in a movie");
        qb10.setA1("Who is Johnny Cage?");
        qb10.setA2("Who is Guile?");
        qb10.setA3("Who is Ryu?");
        qb10.setA4("Who is Ken?");
        qb10.setAnswer("Who is Gordon Freeman?");
        qb10.setAnswer("Who is Guile?");
        qb10.setValue(500);
        qb10.setLbl("" + qb10.getValue());
        qb10.setAnswered(false);

        qb11.setCategory("Game Shows");
        qb11.setQuestion("A whammy of a show");
        qb11.setA1("What is The Price is Right?");
        qb11.setA2("What is Supermaket Sweep?");
        qb11.setA3("What is Press Your Luck?");
        qb11.setA4("What is Let's Make a Deal?");
        qb11.setAnswer("What is Press Your Luck?");
        qb11.setValue(100);
        qb11.setLbl("" + qb11.getValue());
        qb11.setAnswered(false);

        qb12.setCategory("Game Shows");
        qb12.setQuestion("Two Letters, a grid, and 3 in a line");
        qb12.setA1("What is Wheel of Fortune?");
        qb12.setA2("What is Hollywood Squares?");
        qb12.setA3("What is Scrabble Showdown?");
        qb12.setA4("What is Lingo?");
        qb12.setAnswer("What is Hollywood Squares?");
        qb12.setValue(200);
        qb12.setLbl("" + qb12.getValue());
        qb12.setAnswered(false);

        qb13.setCategory("Game Shows");
        qb13.setQuestion("A hundred people are asked for this one");
        qb13.setA1("What is Love Connection?");
        qb13.setA2("What is Deal or No Deal?");
        qb13.setA3("What is Jeopardy?");
        qb13.setA4("What is Family Feud?");
        qb13.setAnswer("What is Family Feud?");
        qb13.setValue(300);
        qb13.setLbl("" + qb13.getValue());
        qb13.setAnswered(false);

        qb14.setCategory("Game Shows");
        qb14.setQuestion("It's judging system is in the name");
        qb14.setA1("What is America's got Talent?");
        qb14.setA2("What is American Idol?");
        qb14.setA3("What is Survivor?");
        qb14.setA4("What is Star Search?");
        qb14.setAnswer("What is Star Search?");
        qb14.setValue(400);
        qb14.setLbl("" + qb14.getValue());
        qb14.setAnswered(false);

        qb15.setCategory("Game Shows");
        qb15.setQuestion("Where dating raises questions");
        qb15.setA1("What is Love Connection?");
        qb15.setA2("What is the Dating game?");
        qb15.setA3("What is Match Game?");
        qb15.setA4("What is Newlywed game?");
        qb15.setAnswer("What is Love Connection?");
        qb15.setValue(500);
        qb15.setLbl("" + qb15.getValue());
        qb15.setAnswered(false);

        qb16.setCategory("Comic Book Characters");
        qb16.setQuestion("A human insect with powers of strength "
                + "and changing size");
        qb16.setA1("Who is Spiderman?");
        qb16.setA2("Who is Human Fly?");
        qb16.setA3("Who is Ant-Man?");
        qb16.setA4("Who is The Tick?");
        qb16.setAnswer("Who is Ant-Man?");
        qb16.setValue(100);
        qb16.setLbl("" + qb16.getValue());
        qb16.setAnswered(false);

        qb17.setCategory("Comic Book Characters");
        qb17.setQuestion("Supervillain with a Planetary sized appetite");
        qb17.setA1("Who is Thanos?");
        qb17.setA2("Who is Galactus?");
        qb17.setA3("Who is Apocalypse?");
        qb17.setA4("Who is General Zod?");
        qb17.setAnswer("Who is Galactus?");
        qb17.setValue(200);
        qb17.setLbl("" + qb17.getValue());
        qb17.setAnswered(false);

        qb18.setCategory("Comic Book Characters");
        qb18.setQuestion("Comedic duo who did not have a comic book "
                + "series in the 90s");
        qb18.setA1("Who are Beavis & Butthead?");
        qb18.setA2("Who are Ren & Stimpy?");
        qb18.setA3("Who are Bill & Ted?");
        qb18.setA4("Who are Cheech and Chong?");
        qb18.setAnswer("Who are Cheech and Chong?");
        qb18.setValue(300);
        qb18.setLbl("" + qb18.getValue());
        qb18.setAnswered(false);

        qb19.setCategory("Comic Book Characters");
        qb19.setQuestion("The third comic book superhero in the histor of TV "
                + "to get a live-action show");
        qb19.setA1("Who is Spiderman?");
        qb19.setA2("Who is Wonder Woman?");
        qb19.setA3("Who is Shazam?");
        qb19.setA4("Who is The Hulk?");
        qb19.setAnswer("Who is Shazam?");
        qb19.setValue(400);
        qb19.setLbl("" + qb19.getValue());
        qb19.setAnswered(false);

        qb20.setCategory("Comic Book Characters");
        qb20.setQuestion("This Mercenary also goes by Terminator");
        qb20.setA1("Who is Deathstroke?");
        qb20.setA2("Who is Deadshot?");
        qb20.setA3("Who is Deadpool?");
        qb20.setA4("Who is Wolverine?");
        qb20.setAnswer("Who is Deathstroke?");
        qb20.setValue(500);
        qb20.setLbl("" + qb20.getValue());
        qb20.setAnswered(false);

        qb21.setCategory("Saturday Night Live Actors");
        qb21.setQuestion("Spends a lot of time on vacation");
        qb21.setA1("Who is Eddie Murphy");
        qb21.setA2("Who is Bill Murray?");
        qb21.setA3("Who is Chevy Chase?");
        qb21.setA4("Who is Jimmy Fallon?");
        qb21.setAnswer("Who is Chevy Chase?");
        qb21.setValue(100);
        qb21.setLbl("" + qb21.getValue());
        qb21.setAnswered(false);

        qb22.setCategory("Saturday Night Live Actors");
        qb22.setQuestion("Breaking character became his signature");
        qb22.setA1("Who is Andy Samberg?");
        qb22.setA2("Who is Jimmy Fallon?");
        qb22.setA3("Who is Kevin Nealon?");
        qb22.setA4("Who is Horatio Sans?");
        qb22.setAnswer("Who is Jimmy Fallon?");
        qb22.setValue(200);
        qb22.setLbl("" + qb22.getValue());
        qb22.setAnswered(false);

        qb23.setCategory("Saturday Night Live Actors");
        qb23.setQuestion("Fired the Weekend update desk news anchor");
        qb23.setA1("Who is Kevin Nealon?");
        qb23.setA2("Who is Tina Fey?");
        qb23.setA3("Who is Norm MacDonald?");
        qb23.setA4("Who is Colin Quinn?");
        qb23.setAnswer("Who is Norm MacDonald?");
        qb23.setValue(300);
        qb23.setLbl("" + qb23.getValue());
        qb23.setAnswered(false);

        qb24.setCategory("Saturday Night Live Actors");
        qb24.setQuestion("Saved the show from cancellation");
        qb24.setA1("Who is Gilda Radner?");
        qb24.setA2("Who is Bill Murray?");
        qb24.setA3("Who is Tina Fey?");
        qb24.setA4("Who is Eddie Murphy?");
        qb24.setAnswer("Who is Eddie Murphy?");
        qb24.setValue(400);
        qb24.setLbl("" + qb24.getValue());
        qb24.setAnswered(false);

        qb25.setCategory("Saturday Night Live Actors");
        qb25.setQuestion("He stars in the highest grossing "
                + "movie based on an SNL skit");
        qb25.setA1("Who is Mike Myers?");
        qb25.setA2("Who is Will Ferrell?");
        qb25.setA3("Who is Dan Aykroyd?");
        qb25.setA4("Who is Molly Shannon?");
        qb25.setAnswer("Who is Mike Myers?");
        qb25.setValue(500);
        qb25.setLbl("" + qb25.getValue());
        qb25.setAnswered(false);

        QuestionBean[][] gameBoard = new QuestionBean[5][5];

        gameBoard[0][0] = qb1;
        gameBoard[1][0] = qb2;
        gameBoard[2][0] = qb3;
        gameBoard[3][0] = qb4;
        gameBoard[4][0] = qb5;

        gameBoard[0][1] = qb6;
        gameBoard[1][1] = qb7;
        gameBoard[2][1] = qb8;
        gameBoard[3][1] = qb9;
        gameBoard[4][1] = qb10;

        gameBoard[0][2] = qb11;
        gameBoard[1][2] = qb12;
        gameBoard[2][2] = qb13;
        gameBoard[3][2] = qb14;
        gameBoard[4][2] = qb15;

        gameBoard[0][3] = qb16;
        gameBoard[1][3] = qb17;
        gameBoard[2][3] = qb18;
        gameBoard[3][3] = qb19;
        gameBoard[4][3] = qb20;

        gameBoard[0][4] = qb21;
        gameBoard[1][4] = qb22;
        gameBoard[2][4] = qb23;
        gameBoard[3][4] = qb24;
        gameBoard[4][4] = qb25;

        return gameBoard;
    }
}
