import groovy.lang.Binding;
import groovy.lang.Script;
import org.codehaus.groovy.runtime.BytecodeInterface8;
import org.codehaus.groovy.runtime.InvokerHelper;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;

public class Decompilation
  extends Script
{
  Object z;
  
  public Object printX()
  {
    CallSite[] arrayOfCallSite = $getCallSiteArray();return arrayOfCallSite[4].callCurrent(this, arrayOfCallSite[5].callGroovyObjectGetProperty(this));return null;
  }
  
  public Object printY()
  {
    CallSite[] arrayOfCallSite = $getCallSiteArray();return arrayOfCallSite[6].callCurrent(this, arrayOfCallSite[7].callGroovyObjectGetProperty(this));return null;
  }
  
  public Object printZ()
  {
    CallSite[] arrayOfCallSite = $getCallSiteArray();return arrayOfCallSite[8].callCurrent(this, this.z);return null;
  }
  
  public Object run()
  {
    CallSite[] arrayOfCallSite = $getCallSiteArray();arrayOfCallSite[1].callCurrent(this, "������������");
    
    Object x = Integer.valueOf(1);
    
    int i = 2;ScriptBytecodeAdapter.setGroovyObjectProperty(Integer.valueOf(i), Decompilation.class, this, (String)"y");
    if ((__$stMC) || (BytecodeInterface8.disabledStandardMetaClass())) {
      arrayOfCallSite[2].callCurrent(this);
    } else {
      printY();
    }
    null;
    if ((__$stMC) || (BytecodeInterface8.disabledStandardMetaClass())) {
      return arrayOfCallSite[3].callCurrent(this);
    } else {
      return printZ();
    }
    return null;
  }
  
  public Decompilation() {}
  
  public Decompilation(Binding context)
  {
    super(context);
    int i = 3;
    this.z = Integer.valueOf(i);
  }
  
  public static void main(String... args)
  {
    CallSite[] arrayOfCallSite = $getCallSiteArray();
    arrayOfCallSite[0].call(InvokerHelper.class, Decompilation.class, args);
  }
}
Test.groovy