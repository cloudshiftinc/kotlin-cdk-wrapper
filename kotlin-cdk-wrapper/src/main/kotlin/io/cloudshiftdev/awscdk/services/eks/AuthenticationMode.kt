@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

public enum class AuthenticationMode(
  private val cdkObject: software.amazon.awscdk.services.eks.AuthenticationMode,
) {
  CONFIG_MAP(software.amazon.awscdk.services.eks.AuthenticationMode.CONFIG_MAP),
  API_AND_CONFIG_MAP(software.amazon.awscdk.services.eks.AuthenticationMode.API_AND_CONFIG_MAP),
  API(software.amazon.awscdk.services.eks.AuthenticationMode.API),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AuthenticationMode):
        AuthenticationMode = when (cdkObject) {
      software.amazon.awscdk.services.eks.AuthenticationMode.CONFIG_MAP ->
          AuthenticationMode.CONFIG_MAP
      software.amazon.awscdk.services.eks.AuthenticationMode.API_AND_CONFIG_MAP ->
          AuthenticationMode.API_AND_CONFIG_MAP
      software.amazon.awscdk.services.eks.AuthenticationMode.API -> AuthenticationMode.API
    }

    internal fun unwrap(wrapped: AuthenticationMode):
        software.amazon.awscdk.services.eks.AuthenticationMode = wrapped.cdkObject
  }
}
