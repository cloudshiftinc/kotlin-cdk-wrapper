@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3.notifications

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.s3.BucketNotificationDestinationConfig
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.IBucketNotificationDestination
import io.cloudshiftdev.constructs.Construct

/**
 * Use a Lambda function as a bucket notification destination.
 *
 * Example:
 *
 * ```
 * Function myLambda;
 * IBucket bucket = Bucket.fromBucketAttributes(this, "ImportedBucket", BucketAttributes.builder()
 * .bucketArn("arn:aws:s3:::amzn-s3-demo-bucket")
 * .build());
 * // now you can just call methods on the bucket
 * bucket.addEventNotification(EventType.OBJECT_CREATED, new LambdaDestination(myLambda),
 * NotificationKeyFilter.builder()
 * .prefix("home/myusername/ *")
 * .build());
 * ```
 */
public open class LambdaDestination(
  cdkObject: software.amazon.awscdk.services.s3.notifications.LambdaDestination,
) : CdkObject(cdkObject),
    IBucketNotificationDestination {
  public constructor(fn: IFunction) :
      this(software.amazon.awscdk.services.s3.notifications.LambdaDestination(fn.let(IFunction.Companion::unwrap))
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
      unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      bucket.let(IBucket.Companion::unwrap)).let(BucketNotificationDestinationConfig::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3.notifications.LambdaDestination):
        LambdaDestination = LambdaDestination(cdkObject)

    internal fun unwrap(wrapped: LambdaDestination):
        software.amazon.awscdk.services.s3.notifications.LambdaDestination = wrapped.cdkObject as
        software.amazon.awscdk.services.s3.notifications.LambdaDestination
  }
}
