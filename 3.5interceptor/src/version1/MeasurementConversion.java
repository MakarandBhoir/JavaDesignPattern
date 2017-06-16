package version1;

import javax.swing.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MeasurementConversion {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        String questionAsked = JOptionPane.showInputDialog(frame, "What is your Question");

        ConversionContext question = new ConversionContext(questionAsked);

        String fromConversion = question.getFromConversion();
        String toConversion = question.getToConversion();
        double quantity = question.getQuantity();

        try {

            Class<?> tempClass = Class.forName("pattern.interpreter." + fromConversion);                
            Constructor<?> constructor = tempClass.getConstructor();           
            Object convertFrom = (Expression) constructor.newInstance();    

            Class<?>[] methodParams = new Class<?>[]{Double.TYPE};                
            Method conversionMethod = tempClass.getMethod(toConversion, methodParams);      
            Object[] params = new Object[]{new Double(quantity)};          

            String toQuantity = (String) conversionMethod.invoke(convertFrom, params);

            String answerToQues = question.getConversionReponse() + toQuantity + " " + toConversion;
            JOptionPane.showMessageDialog(null, answerToQues);
            frame.dispose();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

}
