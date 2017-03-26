package Singleton;

/**
 *
 * @author tunnes
 * 
 * Singleton 
 *
 * No Java ele não possui muita utilidade, porem quando implementado tal padrão 
 * no PHP ele é util para simular o tipo "Enum" assim desacoplando e tornando o 
 * projeto mas seguro isto é evitando comparações de tipos com "Strings".
 * 
 */
final public class Singleton {
    private static Singleton uniqueInstance;
    
    public static Singleton getInstance(){
            return uniqueInstance != null ? uniqueInstance : new Singleton();
        }
    }

