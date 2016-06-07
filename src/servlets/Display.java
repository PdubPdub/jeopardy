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

/**
 *
 * @author Pat
 */
@WebServlet("/Display")
public class Display extends HttpServlet {

    QuestionBean[][] gameBoard;
    Chosen[] picked;
    String jsppage, buttonText;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        String hide1, hide2, hide3, hide4, radio, submit,
                ret, rightwrong, dailylbl;

        String clicked = request.getParameter("q");
        dailylbl = "";
        int bet = 0;

        String answer = request.getParameter("answer");
        String r = request.getParameter("x");
        String c = request.getParameter("y");

        int row = Integer.parseInt(r);
        int column = Integer.parseInt(c);

        HttpSession session = request.getSession();
        picked = (Chosen[]) session.getAttribute("picked");
        int questclicks = (int) session.getAttribute("questclicks");
        String endpage = (String) session.getAttribute("endpage");
        if (session.getAttribute("picked") == null) {
            picked = new Chosen[25];

            for (int m = 0; m < 25; m++) {
                picked[m] = new Chosen();

            }
        }

        if (clicked != null) {
            int q = Integer.parseInt(clicked);
            picked[q].setChosen("disabled>");
            questclicks++;
        }
        String name = (String) session.getAttribute("userName");
        int score = (int) session.getAttribute("score");
        int[] daily = (int[]) session.getAttribute("daily");
        String activate = "";
        if (column == daily[0] && row == daily[1]) {
            activate = "number";
            dailylbl = "DAILY DOUBLE!";
        } else if (column == daily[2] && row == daily[3]) {
            activate = "number";
            dailylbl = "DAILY DOUBLE!";
        } else {
            activate = "hidden";

        }
        if (answer == null) {
            gameBoard = Question.makeQuestion();
            rightwrong = "";
            submit = "submit";
            ret = "hidden";
            radio = "radio";
            hide1 = gameBoard[column][row].getA1();
            hide2 = gameBoard[column][row].getA2();
            hide3 = gameBoard[column][row].getA3();
            hide4 = gameBoard[column][row].getA4();
            gameBoard[column][row].setLbl("");
        } else {
            if (answer.equals(gameBoard[column][row].getAnswer())) {

                rightwrong = "Correct!";
                submit = "hidden";
                radio = "hidden";
                hide1 = "";
                hide2 = "";
                hide3 = "";
                hide4 = "";
                ret = "submit";
                activate = "hidden";

                if (column == daily[0] && row == daily[1]) {
                    String val = request.getParameter("bet");
                    bet = Integer.parseInt(val);
                    score += bet;
                } else if (column == daily[2] && row == daily[3]) {
                    String val = request.getParameter("bet");
                    bet = Integer.parseInt(val);
                    score += bet;
                } else {
                    score += gameBoard[column][row].getValue();
                    gameBoard[column][row].setValue(0);
                }
                if (questclicks >= 25) {
                    buttonText = "Final Score";
                    jsppage = "endpage.jsp";
                } else {
                    buttonText = "Return to Game Board";
                    jsppage = "Jeopardy";
                }
            } else {
                gameBoard[column][row].setLbl("");

                rightwrong = "Wrong!";
                radio = "hidden";
                submit = "hidden";
                hide1 = "";
                hide2 = "";
                hide3 = "";
                hide4 = "";
                ret = "submit";
                activate = "hidden";
                if (column == daily[0] && row == daily[1]) {
                    String val = request.getParameter("bet");
                    bet = Integer.parseInt(val);
                    score -= bet;
                } else if (column == daily[2] && row == daily[3]) {
                    String val = request.getParameter("bet");
                    bet = Integer.parseInt(val);
                    score -= bet;
                } else {
                    score -= gameBoard[column][row].getValue();
                    gameBoard[column][row].setValue(0);
                }
                if (questclicks >= 25) {
                    buttonText = "Final Score";
                    jsppage = "endpage.jsp";
                } else {
                    buttonText = "Return to Game Board";
                    jsppage = "Jeopardy";
                }
            }
        }
        session.setAttribute("gameboard", gameBoard[column][row]);
        session.setAttribute("picked", picked);
        session.setAttribute("score", score);
        session.setAttribute("questclicks", questclicks);
        request.setAttribute("endpage", endpage);
        request.setAttribute("buttonText", buttonText);
        request.setAttribute("jsppage", jsppage);
        request.setAttribute("dailylbl", dailylbl);
        request.setAttribute("hide1", hide1);
        request.setAttribute("hide2", hide2);
        request.setAttribute("hide3", hide3);
        request.setAttribute("hide4", hide4);
        request.setAttribute("submit", submit);
        request.setAttribute("ret", ret);
        request.setAttribute("radio", radio);
        request.setAttribute("rightwrong", rightwrong);
        request.setAttribute("x", r);
        request.setAttribute("y", c);
        request.setAttribute("activate", activate);
        request.setAttribute("question", gameBoard[column][row]);
        RequestDispatcher view = request.getRequestDispatcher("display.jsp");
        view.forward(request, response);
    }
}
