@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3.notifications

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.BucketNotificationDestinationConfig
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.IBucketNotificationDestination
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import io.cloudshiftdev.constructs.Construct

/**
 * Use an SQS queue as a bucket notification destination.
 *
 * Example:
 *
 * ```
 * Queue myQueue;
 * Bucket bucket = new Bucket(this, "MyBucket");
 * bucket.addEventNotification(EventType.OBJECT_REMOVED, new SqsDestination(myQueue),
 * NotificationKeyFilter.builder()
 * .prefix("foo/")
 * .suffix(".jpg")
 * .build());
 * ```
 */
public open class SqsDestination internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3.notifications.SqsDestination,
) : CdkObject(cdkObject), IBucketNotificationDestination {
  public constructor(queue: IQueue) :
      this(software.amazon.awscdk.services.s3.notifications.SqsDestination(queue.let(IQueue::unwrap))
  )

  /**
   * Allows using SQS queues as destinations for bucket notifications.
   *
   * Use `bucket.onEvent(event, queue)` to subscribe.
   *
   * @param _scope 
   * @param bucket 
   */
  public override fun bind(scope: Construct, bucket: IBucket): BucketNotificationDestinationConfig =
      unwrap(this).bind(scope.let(Construct::unwrap),
      bucket.let(IBucket::unwrap)).let(BucketNotificationDestinationConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.notifications.SqsDestination):
        SqsDestination = SqsDestination(cdkObject)

    internal fun unwrap(wrapped: SqsDestination):
        software.amazon.awscdk.services.s3.notifications.SqsDestination = wrapped.cdkObject
  }
}
