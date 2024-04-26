@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

public enum class SigningAlgorithm(
  private val cdkObject: software.amazon.awscdk.services.cognito.SigningAlgorithm,
) {
  RSA_SHA256(software.amazon.awscdk.services.cognito.SigningAlgorithm.RSA_SHA256),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.SigningAlgorithm):
        SigningAlgorithm = when (cdkObject) {
      software.amazon.awscdk.services.cognito.SigningAlgorithm.RSA_SHA256 ->
          SigningAlgorithm.RSA_SHA256
    }

    internal fun unwrap(wrapped: SigningAlgorithm):
        software.amazon.awscdk.services.cognito.SigningAlgorithm = wrapped.cdkObject
  }
}
