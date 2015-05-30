package com.example.dagger.lazycycle;

import com.example.dagger.lazycycle.LazyCycleBroken.App;
import com.example.dagger.lazycycle.LazyCycleBroken.Bar;
import com.example.dagger.lazycycle.LazyCycleBroken.Foo;
import com.example.dagger.lazycycle.LazyCycleBroken.MyComponent;

import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DoubleCheckLazy;

import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerLazyCycleBroken_MyComponent implements MyComponent {
  private Provider<Lazy<Foo>> lazyFooProvider;
  private MembersInjector<Foo> fooMembersInjector;
  private Provider<Foo> fooProvider;
  private MembersInjector<Bar> barMembersInjector;
  private Provider<Bar> barProvider;
  private MembersInjector<App> appMembersInjector;
  private Provider<App> appProvider;

  private DaggerLazyCycleBroken_MyComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static MyComponent create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {
    this.lazyFooProvider = new Provider<Lazy<Foo>>() {
      @Override
      public Lazy<Foo> get() {
        return DoubleCheckLazy.create(fooProvider);
      }
    };
    this.barMembersInjector = LazyCycleBroken$Bar_MembersInjector.create(lazyFooProvider);
    this.barProvider = LazyCycleBroken$Bar_Factory.create(barMembersInjector);
    this.fooMembersInjector = LazyCycleBroken$Foo_MembersInjector.create(barProvider);
    this.fooProvider = LazyCycleBroken$Foo_Factory.create(fooMembersInjector);
    this.appMembersInjector = LazyCycleBroken$App_MembersInjector.create(barProvider);
    this.appProvider = LazyCycleBroken$App_Factory.create(appMembersInjector);
  }

  @Override
  public App app() {  
    return appProvider.get();
  }

  public static final class Builder {
    private Builder() {  
    }
  
    public MyComponent build() {  
      return new DaggerLazyCycleBroken_MyComponent(this);
    }
  }
}

