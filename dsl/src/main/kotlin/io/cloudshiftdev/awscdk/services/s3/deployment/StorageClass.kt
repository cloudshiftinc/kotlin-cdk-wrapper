package io.cloudshiftdev.awscdk.services.s3.deployment

public enum class StorageClass(
  private val cdkObject: software.amazon.awscdk.services.s3.deployment.StorageClass,
) {
  STANDARD(software.amazon.awscdk.services.s3.deployment.StorageClass.STANDARD),
  REDUCED_REDUNDANCY(software.amazon.awscdk.services.s3.deployment.StorageClass.REDUCED_REDUNDANCY),
  STANDARD_IA(software.amazon.awscdk.services.s3.deployment.StorageClass.STANDARD_IA),
  ONEZONE_IA(software.amazon.awscdk.services.s3.deployment.StorageClass.ONEZONE_IA),
  INTELLIGENT_TIERING(software.amazon.awscdk.services.s3.deployment.StorageClass.INTELLIGENT_TIERING),
  GLACIER(software.amazon.awscdk.services.s3.deployment.StorageClass.GLACIER),
  DEEP_ARCHIVE(software.amazon.awscdk.services.s3.deployment.StorageClass.DEEP_ARCHIVE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.deployment.StorageClass):
        StorageClass = when (cdkObject) {
      software.amazon.awscdk.services.s3.deployment.StorageClass.STANDARD -> StorageClass.STANDARD
      software.amazon.awscdk.services.s3.deployment.StorageClass.REDUCED_REDUNDANCY ->
          StorageClass.REDUCED_REDUNDANCY
      software.amazon.awscdk.services.s3.deployment.StorageClass.STANDARD_IA ->
          StorageClass.STANDARD_IA
      software.amazon.awscdk.services.s3.deployment.StorageClass.ONEZONE_IA ->
          StorageClass.ONEZONE_IA
      software.amazon.awscdk.services.s3.deployment.StorageClass.INTELLIGENT_TIERING ->
          StorageClass.INTELLIGENT_TIERING
      software.amazon.awscdk.services.s3.deployment.StorageClass.GLACIER -> StorageClass.GLACIER
      software.amazon.awscdk.services.s3.deployment.StorageClass.DEEP_ARCHIVE ->
          StorageClass.DEEP_ARCHIVE
    }

    internal fun unwrap(wrapped: StorageClass):
        software.amazon.awscdk.services.s3.deployment.StorageClass = wrapped.cdkObject
  }
}
