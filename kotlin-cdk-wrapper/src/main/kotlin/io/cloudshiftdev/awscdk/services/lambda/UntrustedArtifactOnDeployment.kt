@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

public enum class UntrustedArtifactOnDeployment(
  private val cdkObject: software.amazon.awscdk.services.lambda.UntrustedArtifactOnDeployment,
) {
  ENFORCE(software.amazon.awscdk.services.lambda.UntrustedArtifactOnDeployment.ENFORCE),
  WARN(software.amazon.awscdk.services.lambda.UntrustedArtifactOnDeployment.WARN),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.UntrustedArtifactOnDeployment):
        UntrustedArtifactOnDeployment = when (cdkObject) {
      software.amazon.awscdk.services.lambda.UntrustedArtifactOnDeployment.ENFORCE ->
          UntrustedArtifactOnDeployment.ENFORCE
      software.amazon.awscdk.services.lambda.UntrustedArtifactOnDeployment.WARN ->
          UntrustedArtifactOnDeployment.WARN
    }

    internal fun unwrap(wrapped: UntrustedArtifactOnDeployment):
        software.amazon.awscdk.services.lambda.UntrustedArtifactOnDeployment = wrapped.cdkObject
  }
}
