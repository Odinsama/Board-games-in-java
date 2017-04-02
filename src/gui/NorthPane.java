package gui;

import game.CheckersGame;
import game.GameController;
import game.ChessGame;
import gui.controller.GUIController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Odin on 2/14/2017.
 */
class NorthPane extends JMenuBar{

    NorthPane(){

        JMenu actions = new JMenu("Actions");
        JMenuItem undo = new JMenuItem("Undo Move");
        JMenuItem redo = new JMenuItem("Redo Move");
        JMenuItem reset = new JMenuItem("Reset Board");
        undo.addActionListener(e -> GameController.undoMove());
        redo.addActionListener(e -> GameController.redoMove());
        reset.addActionListener(e -> GameController.resetBoard());
        actions.add(undo);
        actions.add(redo);
        actions.add(reset);
        add(actions);

        JMenu games = new JMenu("Games");
        JMenuItem checkers = new JMenuItem("Checkers");
        JMenuItem chess = new JMenuItem("chess");
        chess.addActionListener(e -> GUIController.setGame("chess"));
        checkers.addActionListener(e -> GUIController.setGame("checkers"));
        games.add(chess);
        games.add(checkers);
        add(games);

        setVisible(true);
    }

}
