package io.cloudshiftdev.awscdk.services.s3.notifications

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.s3.BucketNotificationDestinationConfig
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.IBucketNotificationDestination
import io.cloudshiftdev.constructs.Construct

public open class LambdaDestination internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.s3.notifications.LambdaDestination,
) : CdkObject(cdkObject), IBucketNotificationDestination {
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
  public override fun bind(_scope: Construct, bucket: IBucket): BucketNotificationDestinationConfig
      = unwrap(this).bind(_scope.let(Construct::unwrap),
      bucket.let(IBucket::unwrap)).let(BucketNotificationDestinationConfig::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3.notifications.LambdaDestination):
        LambdaDestination = LambdaDestination(cdkObject)

    internal fun unwrap(wrapped: LambdaDestination):
        software.amazon.awscdk.services.s3.notifications.LambdaDestination = wrapped.cdkObject
  }
}
