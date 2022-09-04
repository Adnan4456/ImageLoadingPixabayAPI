// Generated by Dagger (https://dagger.dev).
package com.example.codingtask.ui.fragments;

import com.example.codingtask.utils.InternetStatus;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ImageFragment_MembersInjector implements MembersInjector<ImageFragment> {
  private final Provider<InternetStatus> internetStatusProvider;

  public ImageFragment_MembersInjector(Provider<InternetStatus> internetStatusProvider) {
    this.internetStatusProvider = internetStatusProvider;
  }

  public static MembersInjector<ImageFragment> create(
      Provider<InternetStatus> internetStatusProvider) {
    return new ImageFragment_MembersInjector(internetStatusProvider);
  }

  @Override
  public void injectMembers(ImageFragment instance) {
    injectInternetStatus(instance, internetStatusProvider.get());
  }

  @InjectedFieldSignature("com.example.codingtask.ui.fragments.ImageFragment.internetStatus")
  public static void injectInternetStatus(ImageFragment instance, InternetStatus internetStatus) {
    instance.internetStatus = internetStatus;
  }
}