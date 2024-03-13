package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.constructs.Construct

public interface IBucketNotificationDestination {
  public fun bind(arg0: Construct, arg1: IBucket): BucketNotificationDestinationConfig

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.s3.IBucketNotificationDestination,
  ) : IBucketNotificationDestination {
    public override fun bind(arg0: Construct, arg1: IBucket): BucketNotificationDestinationConfig =
        unwrap(this).bind(arg0.let(Construct::unwrap),
        arg1.let(IBucket::unwrap)).let(BucketNotificationDestinationConfig::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.IBucketNotificationDestination):
        IBucketNotificationDestination = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IBucketNotificationDestination):
        software.amazon.awscdk.services.s3.IBucketNotificationDestination = (wrapped as
        Wrapper).cdkObject
  }
}
