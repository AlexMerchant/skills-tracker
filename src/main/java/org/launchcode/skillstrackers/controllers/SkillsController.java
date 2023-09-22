package org.launchcode.skillstrackers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping("/")
    @ResponseBody
    public String renderHomePage() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Javascript</li>" +
                "<li>Bash</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String renderSkillsRankingForm() {
        return "<html>" +
                "<body>" +
                "<form method='get' action='/form/submit'>" +
                "<label for='username'>User's Name</label><br/>" +
                "<input type='text' name='username' /><br>" +
                "<br>" +
                "<label for='skillsOne'>My favorite skill out of those listed</label><br>" +
                "<select name='skillsOne'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='Bash'>Bash</option>" +
                "</select><br>" +
                "<br>" +
                "<label for='skillsTwo'>My second favorite skill out of those listed</label><br>" +
                "<select name='skillsTwo'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='Bash'>Bash</option>" +
                "</select><br>" +
                "<br>" +
                "<label for='skillsThree'>My least favorite skill out of those listed</label><br>" +
                "<select name='skillsThree'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='Bash'>Bash</option>" +
                "</select><br>" +
                "<br>" +
                "<input type='submit' name='submit' />" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form/submit")
    @ResponseBody
    public String renderRequestParamSkillsRankingSubmission(@RequestParam String username, @RequestParam String skillsOne, @RequestParam String skillsTwo, @RequestParam String skillsThree) {
        return "<h2>" + username + "'s favorite skills order:</h2>" +
                "<ol>" +
                "<li>" + skillsOne + "</li>" +
                "<li>" + skillsTwo + "</li>" +
                "<li>" + skillsThree + "</li>" +
                "</ol>";
    }

}
