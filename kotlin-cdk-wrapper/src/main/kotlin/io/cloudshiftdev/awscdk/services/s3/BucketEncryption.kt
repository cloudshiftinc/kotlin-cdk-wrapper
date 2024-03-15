@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

public enum class BucketEncryption(
  private val cdkObject: software.amazon.awscdk.services.s3.BucketEncryption,
) {
  UNENCRYPTED(software.amazon.awscdk.services.s3.BucketEncryption.UNENCRYPTED),
  KMS_MANAGED(software.amazon.awscdk.services.s3.BucketEncryption.KMS_MANAGED),
  S3_MANAGED(software.amazon.awscdk.services.s3.BucketEncryption.S3_MANAGED),
  KMS(software.amazon.awscdk.services.s3.BucketEncryption.KMS),
  DSSE_MANAGED(software.amazon.awscdk.services.s3.BucketEncryption.DSSE_MANAGED),
  DSSE(software.amazon.awscdk.services.s3.BucketEncryption.DSSE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.BucketEncryption):
        BucketEncryption = when (cdkObject) {
      software.amazon.awscdk.services.s3.BucketEncryption.UNENCRYPTED ->
          BucketEncryption.UNENCRYPTED
      software.amazon.awscdk.services.s3.BucketEncryption.KMS_MANAGED ->
          BucketEncryption.KMS_MANAGED
      software.amazon.awscdk.services.s3.BucketEncryption.S3_MANAGED -> BucketEncryption.S3_MANAGED
      software.amazon.awscdk.services.s3.BucketEncryption.KMS -> BucketEncryption.KMS
      software.amazon.awscdk.services.s3.BucketEncryption.DSSE_MANAGED ->
          BucketEncryption.DSSE_MANAGED
      software.amazon.awscdk.services.s3.BucketEncryption.DSSE -> BucketEncryption.DSSE
    }

    internal fun unwrap(wrapped: BucketEncryption):
        software.amazon.awscdk.services.s3.BucketEncryption = wrapped.cdkObject
  }
}
