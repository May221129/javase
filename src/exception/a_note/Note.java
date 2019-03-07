package exception.a_note;

/**
 * 异常及其使用原则：
 * 1.受检异常：checked exception。
 * 	原则：如果期望调用者能够适当地恢复，对于这种情况就应该使用受检异常。
 * 		API的设计者让API用户面对受检异常，以此强制用户从这个异常条件中恢复。用户可以忽视，只需捕获异常并忽略即可，但这往往不是个好办法。
 * 2.未受检异常：
 * 	2.1 运行时异常：run-time exception。
 * 	2.2 错误：error。
 *	运行时异常和错误，在行为上两者是等同的：都不需要也不应该被捕获的可抛出结构。
 *	如果程序抛出未受检的异常或错误，往往都属于不可恢复的情形，继续执行下去有害无益。
 *	如果程序没有捕获到这样的可抛出结构，将会导致当前线程停止（halt），并出现适当的错误消息。
 */
public class Note {
	
}
