package com.example.dagger.lazycycle;

import com.example.dagger.lazycycle.LazyCycleBroken.App;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class LazyCycleBroken$App_Factory implements Factory<App> {
  private final MembersInjector<App> membersInjector;

  public LazyCycleBroken$App_Factory(MembersInjector<App> membersInjector) {  
    assert membersInjector != null;
    this.membersInjector = membersInjector;
  }

  @Override
  public App get() {  
    App instance = new App();
    membersInjector.injectMembers(instance);
    return instance;
  }

  public static Factory<App> create(MembersInjector<App> membersInjector) {  
    return new LazyCycleBroken$App_Factory(membersInjector);
  }
}

