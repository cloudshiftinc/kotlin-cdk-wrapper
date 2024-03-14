package io.cloudshiftdev.awscdk.services.s3.notifications

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.s3.BucketNotificationDestinationConfig
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.IBucketNotificationDestination
import io.cloudshiftdev.constructs.Construct

public open class SqsDestination internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3.notifications.SqsDestination,
) : CdkObject(cdkObject), IBucketNotificationDestination {
  /**
   * Allows using SQS queues as destinations for bucket notifications.
   *
   * Use `bucket.onEvent(event, queue)` to subscribe.
   *
   * @param _scope 
   * @param bucket 
   */
  public override fun bind(_scope: Construct, bucket: IBucket): BucketNotificationDestinationConfig
      = unwrap(this).bind(_scope.let(Construct::unwrap),
      bucket.let(IBucket::unwrap)).let(BucketNotificationDestinationConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.notifications.SqsDestination):
        SqsDestination = SqsDestination(cdkObject)

    internal fun unwrap(wrapped: SqsDestination):
        software.amazon.awscdk.services.s3.notifications.SqsDestination = wrapped.cdkObject
  }
}
