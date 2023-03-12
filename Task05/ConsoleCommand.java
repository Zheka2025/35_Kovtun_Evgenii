/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task05;

/**
 *
 * @author Evgenii
 */
public interface ConsoleCommand extends Command {
/** Горячая клавиша команды;
* шаблон Command
* @return символ горячей клавиши
*/
public char getKey();
}
