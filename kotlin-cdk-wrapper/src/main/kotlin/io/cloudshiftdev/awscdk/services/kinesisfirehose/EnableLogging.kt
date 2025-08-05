@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import kotlin.Boolean

/**
 * Enables logging for error logs with an optional custom CloudWatch log group.
 *
 * When this class is used, logging is enabled (`logging: true`) and
 * you can optionally provide a CloudWatch log group for storing the error logs.
 *
 * If no log group is provided, a default one will be created automatically.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * Bucket bucket;
 * LogGroup logGroup = new LogGroup(this, "Log Group");
 * S3Bucket destination = S3Bucket.Builder.create(bucket)
 * .loggingConfig(new EnableLogging(logGroup))
 * .build();
 * DeliveryStream.Builder.create(this, "Delivery Stream")
 * .destination(destination)
 * .build();
 * ```
 */
public open class EnableLogging(
  cdkObject: software.amazon.awscdk.services.kinesisfirehose.EnableLogging,
) : CdkObject(cdkObject),
    ILoggingConfig {
  public constructor() : this(software.amazon.awscdk.services.kinesisfirehose.EnableLogging()
  )

  public constructor(logGroup: ILogGroup) :
      this(software.amazon.awscdk.services.kinesisfirehose.EnableLogging(logGroup.let(ILogGroup.Companion::unwrap))
  )

  /**
   * The CloudWatch log group where log streams will be created to hold error logs.
   */
  public override fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

  /**
   * If true, log errors when data transformation or data delivery fails.
   *
   * `true` when using `EnableLogging`, `false` when using `DisableLogging`.
   */
  public override fun logging(): Boolean = unwrap(this).getLogging()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.EnableLogging):
        EnableLogging = EnableLogging(cdkObject)

    internal fun unwrap(wrapped: EnableLogging):
        software.amazon.awscdk.services.kinesisfirehose.EnableLogging = wrapped.cdkObject as
        software.amazon.awscdk.services.kinesisfirehose.EnableLogging
  }
}
