@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.synthetics

public enum class ArtifactsEncryptionMode(
  private val cdkObject: software.amazon.awscdk.services.synthetics.ArtifactsEncryptionMode,
) {
  S3_MANAGED(software.amazon.awscdk.services.synthetics.ArtifactsEncryptionMode.S3_MANAGED),
  KMS(software.amazon.awscdk.services.synthetics.ArtifactsEncryptionMode.KMS),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.ArtifactsEncryptionMode):
        ArtifactsEncryptionMode = when (cdkObject) {
      software.amazon.awscdk.services.synthetics.ArtifactsEncryptionMode.S3_MANAGED ->
          ArtifactsEncryptionMode.S3_MANAGED
      software.amazon.awscdk.services.synthetics.ArtifactsEncryptionMode.KMS ->
          ArtifactsEncryptionMode.KMS
    }

    internal fun unwrap(wrapped: ArtifactsEncryptionMode):
        software.amazon.awscdk.services.synthetics.ArtifactsEncryptionMode = wrapped.cdkObject
  }
}
