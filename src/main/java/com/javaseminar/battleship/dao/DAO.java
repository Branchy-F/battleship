package com.javaseminar.battleship.dao;

import java.util.List;

public interface DAO {
    boolean istValide(int[][] feld, int anzahlBattleship, int anzahlCruiser, int anzahlDestroyer, int anzahlSubmarine);

    int[] getAnzahlSchiffe(int[][] feld, int anzahlBattleship, int anzahlCruiser, int anzahlDestroyer, int anzahlSubmarine);

    boolean istGetroffen (int x, int y);
    boolean schonMalGeschossen();
    boolean istVersenkt(int x, int y);
    boolean spielBeendet();
    List<int[]> getLetztesVersenktesSchiff();
    void setFeld(int[][] feld);
    List<List<int[]>> getSchiffe();
}
