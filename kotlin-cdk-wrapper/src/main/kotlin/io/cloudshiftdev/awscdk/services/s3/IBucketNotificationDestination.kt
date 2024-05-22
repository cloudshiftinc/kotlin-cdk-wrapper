@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct

/**
 * Implemented by constructs that can be used as bucket notification destinations.
 */
public interface IBucketNotificationDestination {
  /**
   * Registers this resource to receive notifications for the specified bucket.
   *
   * This method will only be called once for each destination/bucket
   * pair and the result will be cached, so there is no need to implement
   * idempotency in each destination.
   *
   * @param scope 
   * @param bucket The bucket object to bind to. 
   */
  public fun bind(scope: Construct, bucket: IBucket): BucketNotificationDestinationConfig

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3.IBucketNotificationDestination,
  ) : CdkObject(cdkObject), IBucketNotificationDestination {
    /**
     * Registers this resource to receive notifications for the specified bucket.
     *
     * This method will only be called once for each destination/bucket
     * pair and the result will be cached, so there is no need to implement
     * idempotency in each destination.
     *
     * @param scope 
     * @param bucket The bucket object to bind to. 
     */
    override fun bind(scope: Construct, bucket: IBucket): BucketNotificationDestinationConfig =
        unwrap(this).bind(scope.let(Construct.Companion::unwrap),
        bucket.let(IBucket.Companion::unwrap)).let(BucketNotificationDestinationConfig::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.IBucketNotificationDestination):
        IBucketNotificationDestination = CdkObjectWrappers.wrap(cdkObject) as?
        IBucketNotificationDestination ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IBucketNotificationDestination):
        software.amazon.awscdk.services.s3.IBucketNotificationDestination = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3.IBucketNotificationDestination
  }
}
