package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.services.ec2.InstanceType

public open class OptimalInstanceType internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.batch.OptimalInstanceType,
) : InstanceType(cdkObject) {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.OptimalInstanceType):
        OptimalInstanceType = OptimalInstanceType(cdkObject)

    internal fun unwrap(wrapped: OptimalInstanceType):
        software.amazon.awscdk.services.batch.OptimalInstanceType = wrapped.cdkObject
  }
}
