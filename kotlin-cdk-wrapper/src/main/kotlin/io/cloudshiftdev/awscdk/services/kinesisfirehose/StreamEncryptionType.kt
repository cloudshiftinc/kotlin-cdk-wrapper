@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

public enum class StreamEncryptionType(
  private val cdkObject: software.amazon.awscdk.services.kinesisfirehose.StreamEncryptionType,
) {
  UNENCRYPTED(software.amazon.awscdk.services.kinesisfirehose.StreamEncryptionType.UNENCRYPTED),
  CUSTOMER_MANAGED(software.amazon.awscdk.services.kinesisfirehose.StreamEncryptionType.CUSTOMER_MANAGED),
  AWS_OWNED(software.amazon.awscdk.services.kinesisfirehose.StreamEncryptionType.AWS_OWNED),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.StreamEncryptionType):
        StreamEncryptionType = when (cdkObject) {
      software.amazon.awscdk.services.kinesisfirehose.StreamEncryptionType.UNENCRYPTED ->
          StreamEncryptionType.UNENCRYPTED
      software.amazon.awscdk.services.kinesisfirehose.StreamEncryptionType.CUSTOMER_MANAGED ->
          StreamEncryptionType.CUSTOMER_MANAGED
      software.amazon.awscdk.services.kinesisfirehose.StreamEncryptionType.AWS_OWNED ->
          StreamEncryptionType.AWS_OWNED
    }

    internal fun unwrap(wrapped: StreamEncryptionType):
        software.amazon.awscdk.services.kinesisfirehose.StreamEncryptionType = wrapped.cdkObject
  }
}
