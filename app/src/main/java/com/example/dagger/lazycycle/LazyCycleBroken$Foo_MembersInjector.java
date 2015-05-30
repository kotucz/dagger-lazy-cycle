package com.example.dagger.lazycycle;

import com.example.dagger.lazycycle.LazyCycleBroken.Bar;
import com.example.dagger.lazycycle.LazyCycleBroken.Foo;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class LazyCycleBroken$Foo_MembersInjector implements MembersInjector<Foo> {
  private final Provider<Bar> barProvider;

  public LazyCycleBroken$Foo_MembersInjector(Provider<Bar> barProvider) {
    assert barProvider != null;
    this.barProvider = barProvider;
  }

  @Override
  public void injectMembers(Foo instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.bar = barProvider.get();
  }

  public static MembersInjector<Foo> create(Provider<Bar> barProvider) {
      return new LazyCycleBroken$Foo_MembersInjector(barProvider);
  }
}

