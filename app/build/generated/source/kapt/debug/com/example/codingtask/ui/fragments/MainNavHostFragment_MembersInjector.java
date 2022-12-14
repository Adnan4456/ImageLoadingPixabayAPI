// Generated by Dagger (https://dagger.dev).
package com.example.codingtask.ui.fragments;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainNavHostFragment_MembersInjector implements MembersInjector<MainNavHostFragment> {
  private final Provider<MainFragmentFactory> fragmentFactoryProvider;

  public MainNavHostFragment_MembersInjector(
      Provider<MainFragmentFactory> fragmentFactoryProvider) {
    this.fragmentFactoryProvider = fragmentFactoryProvider;
  }

  public static MembersInjector<MainNavHostFragment> create(
      Provider<MainFragmentFactory> fragmentFactoryProvider) {
    return new MainNavHostFragment_MembersInjector(fragmentFactoryProvider);
  }

  @Override
  public void injectMembers(MainNavHostFragment instance) {
    injectFragmentFactory(instance, fragmentFactoryProvider.get());
  }

  @InjectedFieldSignature("com.example.codingtask.ui.fragments.MainNavHostFragment.fragmentFactory")
  public static void injectFragmentFactory(MainNavHostFragment instance,
      MainFragmentFactory fragmentFactory) {
    instance.fragmentFactory = fragmentFactory;
  }
}
