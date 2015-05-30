package com.example.dagger.lazycycle;

import com.example.dagger.lazycycle.LazyCycleBroken.Bar;
import com.example.dagger.lazycycle.LazyCycleBroken.Foo;
import dagger.Lazy;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class LazyCycleBroken$Bar_MembersInjector implements MembersInjector<Bar> {
  private final Provider<Lazy<Foo>> lazyFooProvider;

  public LazyCycleBroken$Bar_MembersInjector(Provider<Lazy<Foo>> lazyFooProvider) {
    assert lazyFooProvider != null;
    this.lazyFooProvider = lazyFooProvider;
  }

  @Override
  public void injectMembers(Bar instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.lazyFoo = lazyFooProvider.get();
  }

  public static MembersInjector<Bar> create(Provider<Lazy<Foo>> lazyFooProvider) {
      return new LazyCycleBroken$Bar_MembersInjector(lazyFooProvider);
  }
}

