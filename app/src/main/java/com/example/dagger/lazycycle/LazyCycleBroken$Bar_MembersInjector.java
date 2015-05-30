package com.example.dagger.lazycycle;

import com.example.dagger.lazycycle.LazyCycleBroken.Bar;
import com.example.dagger.lazycycle.LazyCycleBroken.Foo;
import dagger.MembersInjector;
import dagger.internal.DoubleCheckLazy;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class LazyCycleBroken$Bar_MembersInjector implements MembersInjector<Bar> {
  private final Provider<Foo> fooProvider;

  public LazyCycleBroken$Bar_MembersInjector(Provider<Foo> fooProvider) {  
    assert fooProvider != null;
    this.fooProvider = fooProvider;
  }

  @Override
  public void injectMembers(Bar instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.lazyFoo = DoubleCheckLazy.create(fooProvider);
  }

  public static MembersInjector<Bar> create(Provider<Foo> fooProvider) {  
      return new LazyCycleBroken$Bar_MembersInjector(fooProvider);
  }
}

