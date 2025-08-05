@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.kinesis.IStream

/**
 * An Amazon Data Firehose delivery stream source.
 *
 * Example:
 *
 * ```
 * IDestination destination;
 * Stream sourceStream = new Stream(this, "Source Stream");
 * DeliveryStream.Builder.create(this, "Delivery Stream")
 * .source(new KinesisStreamSource(sourceStream))
 * .destination(destination)
 * .build();
 * ```
 */
public open class KinesisStreamSource(
  cdkObject: software.amazon.awscdk.services.kinesisfirehose.KinesisStreamSource,
) : CdkObject(cdkObject),
    ISource {
  public constructor(stream: IStream) :
      this(software.amazon.awscdk.services.kinesisfirehose.KinesisStreamSource(stream.let(IStream.Companion::unwrap))
  )

  /**
   * Grant read permissions for this source resource and its contents to an IAM principal (the
   * delivery stream).
   *
   * If an encryption key is used, permission to use the key to decrypt the
   * contents of the stream will also be granted.
   *
   * @param grantee 
   */
  public override fun grantRead(grantee: IGrantable): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.KinesisStreamSource):
        KinesisStreamSource = KinesisStreamSource(cdkObject)

    internal fun unwrap(wrapped: KinesisStreamSource):
        software.amazon.awscdk.services.kinesisfirehose.KinesisStreamSource = wrapped.cdkObject as
        software.amazon.awscdk.services.kinesisfirehose.KinesisStreamSource
  }
}
