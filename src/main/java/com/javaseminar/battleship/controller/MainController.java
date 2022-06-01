package com.javaseminar.battleship.controller;

import com.javaseminar.battleship.model.Feld;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    @Value("${welcome.message}")
    private String message;
    private String errorMessage;

    private static Feld[][] meineFelder = new Feld[10][10];

    static {
        int id = 0;
        for(int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                meineFelder[i][j] = new Feld(id++);
            }
        }
    }

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {

        model.addAttribute("message", message);
        return "index";
    }

    @RequestMapping(value = { "/schiffeEintragen" }, method = RequestMethod.GET)
    public String simulatorsList(Model model) {

        model.addAttribute("meineFelder", meineFelder);

        return "schiffeEintragen";
    }
}
