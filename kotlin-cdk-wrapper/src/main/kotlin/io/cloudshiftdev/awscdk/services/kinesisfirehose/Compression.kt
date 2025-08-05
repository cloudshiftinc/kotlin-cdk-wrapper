@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Possible compression options Amazon Data Firehose can use to compress data on delivery.
 *
 * Example:
 *
 * ```
 * // Compress data delivered to S3 using Snappy
 * Bucket bucket;
 * S3Bucket s3Destination = S3Bucket.Builder.create(bucket)
 * .compression(Compression.SNAPPY)
 * .build();
 * DeliveryStream.Builder.create(this, "Delivery Stream")
 * .destination(s3Destination)
 * .build();
 * ```
 */
public open class Compression(
  cdkObject: software.amazon.awscdk.services.kinesisfirehose.Compression,
) : CdkObject(cdkObject) {
  /**
   * the string value of the Compression.
   */
  public open fun `value`(): String = unwrap(this).getValue()

  public companion object {
    public val GZIP: Compression =
        Compression.wrap(software.amazon.awscdk.services.kinesisfirehose.Compression.GZIP)

    public val HADOOP_SNAPPY: Compression =
        Compression.wrap(software.amazon.awscdk.services.kinesisfirehose.Compression.HADOOP_SNAPPY)

    public val SNAPPY: Compression =
        Compression.wrap(software.amazon.awscdk.services.kinesisfirehose.Compression.SNAPPY)

    public val UNCOMPRESSED: Compression =
        Compression.wrap(software.amazon.awscdk.services.kinesisfirehose.Compression.UNCOMPRESSED)

    public val ZIP: Compression =
        Compression.wrap(software.amazon.awscdk.services.kinesisfirehose.Compression.ZIP)

    public fun of(`value`: String): Compression =
        software.amazon.awscdk.services.kinesisfirehose.Compression.of(`value`).let(Compression::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.Compression):
        Compression = Compression(cdkObject)

    internal fun unwrap(wrapped: Compression):
        software.amazon.awscdk.services.kinesisfirehose.Compression = wrapped.cdkObject as
        software.amazon.awscdk.services.kinesisfirehose.Compression
  }
}
