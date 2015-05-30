package com.example.dagger.lazycycle;

import com.example.dagger.lazycycle.LazyCycleBroken.Foo;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class LazyCycleBroken$Foo_Factory implements Factory<Foo> {
  private final MembersInjector<Foo> membersInjector;

  public LazyCycleBroken$Foo_Factory(MembersInjector<Foo> membersInjector) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
  }

  @Override
  public Foo get() {  
    Foo instance = new Foo();
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<Foo> create(MembersInjector<Foo> membersInjector) {  
    return new LazyCycleBroken$Foo_Factory(membersInjector);
  }
}

