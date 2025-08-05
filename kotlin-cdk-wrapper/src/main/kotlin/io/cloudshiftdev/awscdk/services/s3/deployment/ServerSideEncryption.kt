@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3.deployment

public enum class ServerSideEncryption(
  private val cdkObject: software.amazon.awscdk.services.s3.deployment.ServerSideEncryption,
) {
  AES_256(software.amazon.awscdk.services.s3.deployment.ServerSideEncryption.AES_256),
  AWS_KMS(software.amazon.awscdk.services.s3.deployment.ServerSideEncryption.AWS_KMS),
  AWS_KMS_DSSE(software.amazon.awscdk.services.s3.deployment.ServerSideEncryption.AWS_KMS_DSSE),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3.deployment.ServerSideEncryption):
        ServerSideEncryption = when (cdkObject) {
      software.amazon.awscdk.services.s3.deployment.ServerSideEncryption.AES_256 ->
          ServerSideEncryption.AES_256
      software.amazon.awscdk.services.s3.deployment.ServerSideEncryption.AWS_KMS ->
          ServerSideEncryption.AWS_KMS
      software.amazon.awscdk.services.s3.deployment.ServerSideEncryption.AWS_KMS_DSSE ->
          ServerSideEncryption.AWS_KMS_DSSE
    }

    internal fun unwrap(wrapped: ServerSideEncryption):
        software.amazon.awscdk.services.s3.deployment.ServerSideEncryption = wrapped.cdkObject
  }
}
