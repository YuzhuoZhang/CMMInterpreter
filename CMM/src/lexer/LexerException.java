package lexer;

import Entry.*;
/**
 * �쳣�������
 */
public class LexerException {

    /**
     * ��ʶ���쳣
     */
    public static void identifierException() {
        System.out.println();
        System.out.println("[L" + LexerEntry.lexer.line + ": unknown identifier.]");
        System.out.println("[tips: identifier begins with letter,and can not end with '.','_']");
        System.out.println();
    }

    /**
     * δ����ķ���
     *
     * @param s
     */
    public static void unknownSymbolException(String s) {
        System.out.println();
        System.out.println("[L" + LexerEntry.lexer.line + ": \"" + s + "\" can not be recognized.]");
        System.out.println();
    }

    /**
     * δ�պϵĶ���ע��
     */
    public static void unclosedMultiAnnotation() {
        System.out.println();
        System.out.println("[L" + LexerEntry.lexer.line + ": unclosed annotation.]");
        System.out.println();
    }
}