@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3.notifications

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.BucketNotificationDestinationConfig
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.awscdk.services.s3.IBucketNotificationDestination
import io.cloudshiftdev.constructs.Construct

public open class SnsDestination internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3.notifications.SnsDestination,
) : CdkObject(cdkObject), IBucketNotificationDestination {
  public override fun bind(_scope: Construct, bucket: IBucket): BucketNotificationDestinationConfig
      = unwrap(this).bind(_scope.let(Construct::unwrap),
      bucket.let(IBucket::unwrap)).let(BucketNotificationDestinationConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.notifications.SnsDestination):
        SnsDestination = SnsDestination(cdkObject)

    internal fun unwrap(wrapped: SnsDestination):
        software.amazon.awscdk.services.s3.notifications.SnsDestination = wrapped.cdkObject
  }
}