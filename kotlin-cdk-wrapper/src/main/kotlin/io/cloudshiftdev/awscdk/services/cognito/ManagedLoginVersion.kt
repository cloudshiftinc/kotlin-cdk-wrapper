@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

public enum class ManagedLoginVersion(
  private val cdkObject: software.amazon.awscdk.services.cognito.ManagedLoginVersion,
) {
  CLASSIC_HOSTED_UI(software.amazon.awscdk.services.cognito.ManagedLoginVersion.CLASSIC_HOSTED_UI),
  NEWER_MANAGED_LOGIN(software.amazon.awscdk.services.cognito.ManagedLoginVersion.NEWER_MANAGED_LOGIN),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.ManagedLoginVersion):
        ManagedLoginVersion = when (cdkObject) {
      software.amazon.awscdk.services.cognito.ManagedLoginVersion.CLASSIC_HOSTED_UI ->
          ManagedLoginVersion.CLASSIC_HOSTED_UI
      software.amazon.awscdk.services.cognito.ManagedLoginVersion.NEWER_MANAGED_LOGIN ->
          ManagedLoginVersion.NEWER_MANAGED_LOGIN
    }

    internal fun unwrap(wrapped: ManagedLoginVersion):
        software.amazon.awscdk.services.cognito.ManagedLoginVersion = wrapped.cdkObject
  }
}
