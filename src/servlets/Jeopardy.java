package servlets;

import beans.*;

import java.io.IOException;
import java.util.Arrays;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pat
 */
@WebServlet("/Jeopardy")
public class Jeopardy extends HttpServlet {

    QuestionBean[][] gameBoard;
    Chosen[] picked;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        String name = request.getParameter("name");
        int score = 0;
        int questclicks = 0;

        HttpSession session = request.getSession(false);
        if (session == null) {
            session = request.getSession();
            gameBoard = Question.makeQuestion();
            session.setAttribute("userName", name);
            session.setAttribute("score", score);

            session.setAttribute("questclicks", questclicks);
            session.setAttribute("endpage", "hidden");
            Chosen[] picked = new Chosen[25];
            for (int m = 0; m < 25; m++) {
                picked[m] = new Chosen();

            }

            picked[0].setChosen(">$" + gameBoard[0][0].getValue());
            picked[1].setChosen(">$" + gameBoard[1][0].getValue());
            picked[2].setChosen(">$" + gameBoard[2][0].getValue());
            picked[3].setChosen(">$" + gameBoard[3][0].getValue());
            picked[4].setChosen(">$" + gameBoard[4][0].getValue());
            picked[5].setChosen(">$" + gameBoard[0][1].getValue());
            picked[6].setChosen(">$" + gameBoard[1][1].getValue());
            picked[7].setChosen(">$" + gameBoard[2][1].getValue());
            picked[8].setChosen(">$" + gameBoard[3][1].getValue());
            picked[9].setChosen(">$" + gameBoard[4][1].getValue());
            picked[10].setChosen(">$" + gameBoard[0][2].getValue());
            picked[11].setChosen(">$" + gameBoard[1][2].getValue());
            picked[12].setChosen(">$" + gameBoard[2][2].getValue());
            picked[13].setChosen(">$" + gameBoard[3][2].getValue());
            picked[14].setChosen(">$" + gameBoard[4][2].getValue());
            picked[15].setChosen(">$" + gameBoard[0][3].getValue());
            picked[16].setChosen(">$" + gameBoard[1][3].getValue());
            picked[17].setChosen(">$" + gameBoard[2][3].getValue());
            picked[18].setChosen(">$" + gameBoard[3][3].getValue());
            picked[19].setChosen(">$" + gameBoard[4][3].getValue());
            picked[20].setChosen(">$" + gameBoard[0][4].getValue());
            picked[21].setChosen(">$" + gameBoard[1][4].getValue());
            picked[22].setChosen(">$" + gameBoard[2][4].getValue());
            picked[23].setChosen(">$" + gameBoard[3][4].getValue());
            picked[24].setChosen(">$" + gameBoard[4][4].getValue());

            session.setAttribute("picked", picked);

            int[] dailyA = new int[2];
            int[] dailyB = new int[2];
            System.out.print("\n");
            do {
                for (int i = 0; i < dailyA.length; i++) {
                    dailyA[i] = (int) (Math.random() * 5);
                    dailyB[i] = (int) (Math.random() * 5);

                }

            } while (Arrays.equals(dailyA, dailyB));
            int[] dailyAB = new int[dailyA.length + dailyB.length];
            System.arraycopy(dailyA, 0, dailyAB, 0, dailyA.length);
            System.arraycopy(dailyB, 0, dailyAB, dailyA.length, dailyB.length);
            System.out.print(Arrays.toString(dailyAB));

            session.setAttribute("gameBoard", gameBoard);
            session.setAttribute("daily", dailyAB);
        } else {

        }
        RequestDispatcher view = request.getRequestDispatcher("gameboard.jsp");
        view.forward(request, response);

    }

}
