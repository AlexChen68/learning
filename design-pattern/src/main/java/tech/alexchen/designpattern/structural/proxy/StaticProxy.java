package tech.alexchen.designpattern.structural.proxy;

/**
 * @author alexchen
 */
public class StaticProxy implements Subject{

    private Subject subject;

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void operation() {
        System.out.println("้ๆไปฃ็");
        subject.operation();
    }
}
