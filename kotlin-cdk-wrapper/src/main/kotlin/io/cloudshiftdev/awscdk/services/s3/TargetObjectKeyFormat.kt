@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * The key format for the log object.
 *
 * Example:
 *
 * ```
 * Bucket accessLogsBucket = new Bucket(this, "AccessLogsBucket");
 * Bucket bucket = Bucket.Builder.create(this, "MyBucket")
 * .serverAccessLogsBucket(accessLogsBucket)
 * .serverAccessLogsPrefix("logs")
 * // You can use a simple prefix with `TargetObjectKeyFormat.simplePrefix()`, but it is the same
 * even if you do not specify `targetObjectKeyFormat` property.
 * .targetObjectKeyFormat(TargetObjectKeyFormat.simplePrefix())
 * .build();
 * ```
 */
public abstract class TargetObjectKeyFormat internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3.TargetObjectKeyFormat,
) : CdkObject(cdkObject) {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.TargetObjectKeyFormat,
  ) : TargetObjectKeyFormat(cdkObject)

  public companion object {
    public fun partitionedPrefix(): TargetObjectKeyFormat =
        software.amazon.awscdk.services.s3.TargetObjectKeyFormat.partitionedPrefix().let(TargetObjectKeyFormat::wrap)

    public fun partitionedPrefix(dateSource: PartitionDateSource): TargetObjectKeyFormat =
        software.amazon.awscdk.services.s3.TargetObjectKeyFormat.partitionedPrefix(dateSource.let(PartitionDateSource::unwrap)).let(TargetObjectKeyFormat::wrap)

    public fun simplePrefix(): TargetObjectKeyFormat =
        software.amazon.awscdk.services.s3.TargetObjectKeyFormat.simplePrefix().let(TargetObjectKeyFormat::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.TargetObjectKeyFormat):
        TargetObjectKeyFormat = CdkObjectWrappers.wrap(cdkObject) as? TargetObjectKeyFormat ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TargetObjectKeyFormat):
        software.amazon.awscdk.services.s3.TargetObjectKeyFormat = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.s3.TargetObjectKeyFormat
  }
}
