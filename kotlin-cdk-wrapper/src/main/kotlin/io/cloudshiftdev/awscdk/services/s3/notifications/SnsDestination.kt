@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3.notifications

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.BucketNotificationDestinationConfig
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.IBucketNotificationDestination
import io.cloudshiftdev.awscdk.services.sns.ITopic
import io.cloudshiftdev.constructs.Construct

/**
 * Use an SNS topic as a bucket notification destination.
 *
 * Example:
 *
 * ```
 * Bucket bucket = new Bucket(this, "MyBucket");
 * Topic topic = new Topic(this, "MyTopic");
 * bucket.addEventNotification(EventType.OBJECT_CREATED, new SnsDestination(topic));
 * ```
 */
public open class SnsDestination(
  cdkObject: software.amazon.awscdk.services.s3.notifications.SnsDestination,
) : CdkObject(cdkObject), IBucketNotificationDestination {
  public constructor(topic: ITopic) :
      this(software.amazon.awscdk.services.s3.notifications.SnsDestination(topic.let(ITopic::unwrap))
  )

  /**
   * Registers this resource to receive notifications for the specified bucket.
   *
   * This method will only be called once for each destination/bucket
   * pair and the result will be cached, so there is no need to implement
   * idempotency in each destination.
   *
   * @param _scope 
   * @param bucket 
   */
  public override fun bind(scope: Construct, bucket: IBucket): BucketNotificationDestinationConfig =
      unwrap(this).bind(scope.let(Construct::unwrap),
      bucket.let(IBucket::unwrap)).let(BucketNotificationDestinationConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.notifications.SnsDestination):
        SnsDestination = SnsDestination(cdkObject)

    internal fun unwrap(wrapped: SnsDestination):
        software.amazon.awscdk.services.s3.notifications.SnsDestination = wrapped.cdkObject as
        software.amazon.awscdk.services.s3.notifications.SnsDestination
  }
}
