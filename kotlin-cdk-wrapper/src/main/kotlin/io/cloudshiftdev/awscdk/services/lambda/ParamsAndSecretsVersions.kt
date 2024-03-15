@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

public enum class ParamsAndSecretsVersions(
  private val cdkObject: software.amazon.awscdk.services.lambda.ParamsAndSecretsVersions,
) {
  V1_0_103(software.amazon.awscdk.services.lambda.ParamsAndSecretsVersions.V1_0_103),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.ParamsAndSecretsVersions):
        ParamsAndSecretsVersions = when (cdkObject) {
      software.amazon.awscdk.services.lambda.ParamsAndSecretsVersions.V1_0_103 ->
          ParamsAndSecretsVersions.V1_0_103
    }

    internal fun unwrap(wrapped: ParamsAndSecretsVersions):
        software.amazon.awscdk.services.lambda.ParamsAndSecretsVersions = wrapped.cdkObject
  }
}
