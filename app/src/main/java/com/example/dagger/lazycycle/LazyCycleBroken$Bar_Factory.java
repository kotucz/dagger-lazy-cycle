package com.example.dagger.lazycycle;

import com.example.dagger.lazycycle.LazyCycleBroken.Bar;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class LazyCycleBroken$Bar_Factory implements Factory<Bar> {
  private final MembersInjector<Bar> membersInjector;

  public LazyCycleBroken$Bar_Factory(MembersInjector<Bar> membersInjector) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
  }

  @Override
  public Bar get() {  
    Bar instance = new Bar();
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<Bar> create(MembersInjector<Bar> membersInjector) {  
    return new LazyCycleBroken$Bar_Factory(membersInjector);
  }
}

