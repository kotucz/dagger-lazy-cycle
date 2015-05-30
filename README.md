# dagger-lazy-cycle
Proposal for supporting cyclic dependencies in dagger2 using `Lazy` or `Provider`

Dagger 2.0 currently does not support any kind of dependency cycles. 
Dagger 1 allowed this using `Lazy<T>` or `Provider<T>` dependency wrapper.
An issue for this was started here: https://github.com/google/dagger/issues/45

I have started with example code found in the issue above exhibiting the problem.
I have copied the dagger generated code, inspected the generated code
and made changes to it and found a way to enable cycles in dependencies using `Lazy` in the generated code.

Basically `Provider<Lazy<Foo>>` is passed to `Bar_MembersInjector` the instead of `Provider<Foo>`.
By the time when `Bar.lazyFoo.get()` is called the component's `fooProvider` is initialized.
The main change can be seen in this commit: https://github.com/kotucz/dagger-lazy-cycle/commit/3a9372af5f085f6a3c11221c424e9fc6fd65c98c 

Similar approach could probably be used for `Provider<T>` dependencies.
