@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

public enum class PasskeyUserVerification(
  private val cdkObject: software.amazon.awscdk.services.cognito.PasskeyUserVerification,
) {
  PREFERRED(software.amazon.awscdk.services.cognito.PasskeyUserVerification.PREFERRED),
  REQUIRED(software.amazon.awscdk.services.cognito.PasskeyUserVerification.REQUIRED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.PasskeyUserVerification):
        PasskeyUserVerification = when (cdkObject) {
      software.amazon.awscdk.services.cognito.PasskeyUserVerification.PREFERRED ->
          PasskeyUserVerification.PREFERRED
      software.amazon.awscdk.services.cognito.PasskeyUserVerification.REQUIRED ->
          PasskeyUserVerification.REQUIRED
    }

    internal fun unwrap(wrapped: PasskeyUserVerification):
        software.amazon.awscdk.services.cognito.PasskeyUserVerification = wrapped.cdkObject
  }
}
