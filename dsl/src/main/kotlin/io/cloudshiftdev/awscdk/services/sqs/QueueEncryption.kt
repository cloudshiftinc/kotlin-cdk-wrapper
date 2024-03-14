package io.cloudshiftdev.awscdk.services.sqs

public enum class QueueEncryption(
  private val cdkObject: software.amazon.awscdk.services.sqs.QueueEncryption,
) {
  UNENCRYPTED(software.amazon.awscdk.services.sqs.QueueEncryption.UNENCRYPTED),
  KMS_MANAGED(software.amazon.awscdk.services.sqs.QueueEncryption.KMS_MANAGED),
  KMS(software.amazon.awscdk.services.sqs.QueueEncryption.KMS),
  SQS_MANAGED(software.amazon.awscdk.services.sqs.QueueEncryption.SQS_MANAGED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.QueueEncryption):
        QueueEncryption = when (cdkObject) {
      software.amazon.awscdk.services.sqs.QueueEncryption.UNENCRYPTED -> QueueEncryption.UNENCRYPTED
      software.amazon.awscdk.services.sqs.QueueEncryption.KMS_MANAGED -> QueueEncryption.KMS_MANAGED
      software.amazon.awscdk.services.sqs.QueueEncryption.KMS -> QueueEncryption.KMS
      software.amazon.awscdk.services.sqs.QueueEncryption.SQS_MANAGED -> QueueEncryption.SQS_MANAGED
    }

    internal fun unwrap(wrapped: QueueEncryption):
        software.amazon.awscdk.services.sqs.QueueEncryption = wrapped.cdkObject
  }
}
