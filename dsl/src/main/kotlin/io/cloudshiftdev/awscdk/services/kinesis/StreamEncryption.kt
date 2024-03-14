package io.cloudshiftdev.awscdk.services.kinesis

public enum class StreamEncryption(
  private val cdkObject: software.amazon.awscdk.services.kinesis.StreamEncryption,
) {
  UNENCRYPTED(software.amazon.awscdk.services.kinesis.StreamEncryption.UNENCRYPTED),
  KMS(software.amazon.awscdk.services.kinesis.StreamEncryption.KMS),
  MANAGED(software.amazon.awscdk.services.kinesis.StreamEncryption.MANAGED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.StreamEncryption):
        StreamEncryption = when (cdkObject) {
      software.amazon.awscdk.services.kinesis.StreamEncryption.UNENCRYPTED ->
          StreamEncryption.UNENCRYPTED
      software.amazon.awscdk.services.kinesis.StreamEncryption.KMS -> StreamEncryption.KMS
      software.amazon.awscdk.services.kinesis.StreamEncryption.MANAGED -> StreamEncryption.MANAGED
    }

    internal fun unwrap(wrapped: StreamEncryption):
        software.amazon.awscdk.services.kinesis.StreamEncryption = wrapped.cdkObject
  }
}
