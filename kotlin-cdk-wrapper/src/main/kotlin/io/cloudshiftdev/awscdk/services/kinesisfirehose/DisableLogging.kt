@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean

/**
 * Disables logging for error logs.
 *
 * When this class is used, logging is disabled (`logging: false`)
 * and no CloudWatch log group can be specified.
 *
 * Example:
 *
 * ```
 * Bucket bucket;
 * S3Bucket destination = S3Bucket.Builder.create(bucket)
 * .loggingConfig(new DisableLogging())
 * .build();
 * DeliveryStream.Builder.create(this, "Delivery Stream")
 * .destination(destination)
 * .build();
 * ```
 */
public open class DisableLogging(
  cdkObject: software.amazon.awscdk.services.kinesisfirehose.DisableLogging,
) : CdkObject(cdkObject),
    ILoggingConfig {
  public constructor() : this(software.amazon.awscdk.services.kinesisfirehose.DisableLogging()
  )

  /**
   * If true, log errors when data transformation or data delivery fails.
   *
   * `true` when using `EnableLogging`, `false` when using `DisableLogging`.
   */
  public override fun logging(): Boolean = unwrap(this).getLogging()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.DisableLogging):
        DisableLogging = DisableLogging(cdkObject)

    internal fun unwrap(wrapped: DisableLogging):
        software.amazon.awscdk.services.kinesisfirehose.DisableLogging = wrapped.cdkObject as
        software.amazon.awscdk.services.kinesisfirehose.DisableLogging
  }
}
