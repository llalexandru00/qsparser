package ro.atek.qsparser.value;

/**
 * Special type of value which denotes a boolean representation.
 * This kind of value is rare as it appears only when merging
 * a string into a dictionary. The merged string is the key and
 * the value is by default a true boolean.
 */
public class BoolValue
implements Value
{
   /** The representation of the true boolean */
   public static final BoolValue TRUE = new BoolValue();

   /** The representation of the false boolean. Not generated by parsing */
   public static final BoolValue FALSE = new BoolValue();

   /**
    * Private constructor to allow only two instantiations for true and false.
    */
   private BoolValue()
   {

   }

   /**
    * Retrieve the value type of this.
    *
    * @return   The boolean type.
    */
   @Override
   public ValueType getType()
   {
      return ValueType.BOOL;
   }

   /**
    * Retrieve the internal boolean representation
    *
    * @return   {@code true} if this is the true boolean representation
    *           of {@code false} otherwise
    */
   public boolean intern()
   {
      return this == TRUE;
   }

   /**
    * Simple equality check. As boolean instances are uniquely generated,
    * a simple reference equality check is enough.
    *
    * @param   obj
    *          The object to be compared to.
    *
    * @return  {@code true} if the other object has the same value as this.
    */
   @Override
   public boolean equals(Object obj)
   {
      return this == obj;
   }

   /**
    * Simple implementation of the hash code.
    *
    * @return   The hash code representation of this.
    */
   @Override
   public int hashCode()
   {
      return super.hashCode();
   }

   /**
    * Simple string representation.
    *
    * @return   String representation
    */
   @Override
   public String toString()
   {
      return intern() ? "true" : "false";
   }
}