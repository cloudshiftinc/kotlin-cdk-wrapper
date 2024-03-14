package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public enum class S3DataType(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.S3DataType,
) {
  MANIFEST_FILE(software.amazon.awscdk.services.stepfunctions.tasks.S3DataType.MANIFEST_FILE),
  S3_PREFIX(software.amazon.awscdk.services.stepfunctions.tasks.S3DataType.S3_PREFIX),
  AUGMENTED_MANIFEST_FILE(software.amazon.awscdk.services.stepfunctions.tasks.S3DataType.AUGMENTED_MANIFEST_FILE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.S3DataType):
        S3DataType = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.tasks.S3DataType.MANIFEST_FILE ->
          S3DataType.MANIFEST_FILE
      software.amazon.awscdk.services.stepfunctions.tasks.S3DataType.S3_PREFIX ->
          S3DataType.S3_PREFIX
      software.amazon.awscdk.services.stepfunctions.tasks.S3DataType.AUGMENTED_MANIFEST_FILE ->
          S3DataType.AUGMENTED_MANIFEST_FILE
    }

    internal fun unwrap(wrapped: S3DataType):
        software.amazon.awscdk.services.stepfunctions.tasks.S3DataType = wrapped.cdkObject
  }
}
