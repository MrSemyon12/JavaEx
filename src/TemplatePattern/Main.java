package TemplatePattern;

public class Main {
    public static void main(String[] args) {
        AbstractPage welcomePage = new WelcomePage();
        AbstractPage newsPage = new NewsPage();

        welcomePage.showPage();
        System.out.println("===========");
        newsPage.showPage();
    }
}
