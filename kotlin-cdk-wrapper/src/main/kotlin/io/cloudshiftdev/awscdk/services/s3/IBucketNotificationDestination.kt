@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct

public interface IBucketNotificationDestination {
  public fun bind(arg0: Construct, arg1: IBucket): BucketNotificationDestinationConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.IBucketNotificationDestination,
  ) : CdkObject(cdkObject), IBucketNotificationDestination {
    override fun bind(arg0: Construct, arg1: IBucket): BucketNotificationDestinationConfig =
        unwrap(this).bind(arg0.let(Construct::unwrap),
        arg1.let(IBucket::unwrap)).let(BucketNotificationDestinationConfig::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.IBucketNotificationDestination):
        IBucketNotificationDestination = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IBucketNotificationDestination):
        software.amazon.awscdk.services.s3.IBucketNotificationDestination = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3.IBucketNotificationDestination
  }
}
