package TemplatePattern;

public abstract class AbstractPage {
    public final void showPage() {
        System.out.println("Header");
        pageContent();
        System.out.println("Footer");
    }

    public abstract void pageContent();
}
