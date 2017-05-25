/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author tunnes
 */
public interface IteradorInterface {
    void first();
 
    void next();
    
    void prev();
  
    boolean isDone();
    
    Canal currentItem();
}
