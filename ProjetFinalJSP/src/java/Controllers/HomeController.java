/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author dave-
 */
@Controller
public class HomeController {
    @RequestMapping(value="/Home/accueil", method=RequestMethod.GET)
    public ModelAndView accueil(){
        ModelAndView view = new ModelAndView("accueil");
        
        // la lecture du jeton d'authentification s'il existe
//        Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
//        if (authentication!=null){
//            // la lecture du username
//            String username=authentication.getName();
//            //Envoyer le username à la vue
//            view.addObject("username",  username);
//        }
        
        return view;
    }
}
