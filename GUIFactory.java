package button;

/**Esse e o contrato entre as classes, existem possiveis
*buttons que tem em comum essa interface, ela nao fara nada, 
*mas estara em todos os seus descedentes sendo sobrescrevida
 */

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
