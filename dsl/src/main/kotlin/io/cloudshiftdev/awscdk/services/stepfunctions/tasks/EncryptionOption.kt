package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public enum class EncryptionOption(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EncryptionOption,
) {
  S3_MANAGED(software.amazon.awscdk.services.stepfunctions.tasks.EncryptionOption.S3_MANAGED),
  KMS(software.amazon.awscdk.services.stepfunctions.tasks.EncryptionOption.KMS),
  CLIENT_SIDE_KMS(software.amazon.awscdk.services.stepfunctions.tasks.EncryptionOption.CLIENT_SIDE_KMS),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EncryptionOption):
        EncryptionOption = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.tasks.EncryptionOption.S3_MANAGED ->
          EncryptionOption.S3_MANAGED
      software.amazon.awscdk.services.stepfunctions.tasks.EncryptionOption.KMS ->
          EncryptionOption.KMS
      software.amazon.awscdk.services.stepfunctions.tasks.EncryptionOption.CLIENT_SIDE_KMS ->
          EncryptionOption.CLIENT_SIDE_KMS
    }

    internal fun unwrap(wrapped: EncryptionOption):
        software.amazon.awscdk.services.stepfunctions.tasks.EncryptionOption = wrapped.cdkObject
  }
}
