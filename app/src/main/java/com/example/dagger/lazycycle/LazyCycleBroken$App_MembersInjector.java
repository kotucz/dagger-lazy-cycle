package com.example.dagger.lazycycle;

import com.example.dagger.lazycycle.LazyCycleBroken.App;
import com.example.dagger.lazycycle.LazyCycleBroken.Bar;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class LazyCycleBroken$App_MembersInjector implements MembersInjector<App> {
  private final Provider<Bar> barProvider;

  public LazyCycleBroken$App_MembersInjector(Provider<Bar> barProvider) {  
    assert barProvider != null;
    this.barProvider = barProvider;
  }

  @Override
  public void injectMembers(App instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.bar = barProvider.get();
  }

  public static MembersInjector<App> create(Provider<Bar> barProvider) {  
      return new LazyCycleBroken$App_MembersInjector(barProvider);
  }
}

