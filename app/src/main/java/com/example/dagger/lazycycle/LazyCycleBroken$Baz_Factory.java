package com.example.dagger.lazycycle;

import com.example.dagger.lazycycle.LazyCycleBroken.Baz;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public enum LazyCycleBroken$Baz_Factory implements Factory<Baz> {
INSTANCE;

  @Override
  public Baz get() {  
    return new Baz();
  }

  public static Factory<Baz> create() {  
    return INSTANCE;
  }
}

