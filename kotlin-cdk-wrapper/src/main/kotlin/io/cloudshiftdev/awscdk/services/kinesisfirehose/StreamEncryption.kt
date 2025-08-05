@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey

/**
 * Represents server-side encryption for an Amazon Firehose Delivery Stream.
 *
 * Example:
 *
 * ```
 * IDestination destination;
 * // SSE with an customer-managed key that is explicitly specified
 * Key key;
 * // SSE with an AWS-owned key
 * // SSE with an AWS-owned key
 * DeliveryStream.Builder.create(this, "Delivery Stream with AWS Owned Key")
 * .encryption(StreamEncryption.awsOwnedKey())
 * .destination(destination)
 * .build();
 * // SSE with an customer-managed key that is created automatically by the CDK
 * // SSE with an customer-managed key that is created automatically by the CDK
 * DeliveryStream.Builder.create(this, "Delivery Stream with Customer Managed Key")
 * .encryption(StreamEncryption.customerManagedKey())
 * .destination(destination)
 * .build();
 * DeliveryStream.Builder.create(this, "Delivery Stream with Customer Managed and Provided Key")
 * .encryption(StreamEncryption.customerManagedKey(key))
 * .destination(destination)
 * .build();
 * ```
 */
public abstract class StreamEncryption(
  cdkObject: software.amazon.awscdk.services.kinesisfirehose.StreamEncryption,
) : CdkObject(cdkObject) {
  /**
   * Optional KMS key used for customer managed encryption.
   */
  public open fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * The type of server-side encryption for the Amazon Firehose delivery stream.
   */
  public open fun type(): StreamEncryptionType =
      unwrap(this).getType().let(StreamEncryptionType::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesisfirehose.StreamEncryption,
  ) : StreamEncryption(cdkObject)

  public companion object {
    public fun awsOwnedKey(): StreamEncryption =
        software.amazon.awscdk.services.kinesisfirehose.StreamEncryption.awsOwnedKey().let(StreamEncryption::wrap)

    public fun customerManagedKey(): StreamEncryption =
        software.amazon.awscdk.services.kinesisfirehose.StreamEncryption.customerManagedKey().let(StreamEncryption::wrap)

    public fun customerManagedKey(encryptionKey: IKey): StreamEncryption =
        software.amazon.awscdk.services.kinesisfirehose.StreamEncryption.customerManagedKey(encryptionKey.let(IKey.Companion::unwrap)).let(StreamEncryption::wrap)

    public fun unencrypted(): StreamEncryption =
        software.amazon.awscdk.services.kinesisfirehose.StreamEncryption.unencrypted().let(StreamEncryption::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.StreamEncryption):
        StreamEncryption = CdkObjectWrappers.wrap(cdkObject) as? StreamEncryption ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: StreamEncryption):
        software.amazon.awscdk.services.kinesisfirehose.StreamEncryption = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kinesisfirehose.StreamEncryption
  }
}
