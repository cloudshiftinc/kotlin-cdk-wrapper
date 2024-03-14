package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class BuiltInAttributes internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.BuiltInAttributes,
) : CdkObject(cdkObject) {
  public companion object {
    public val AMI_ID: String = software.amazon.awscdk.services.ecs.BuiltInAttributes.AMI_ID

    public val AVAILABILITY_ZONE: String =
        software.amazon.awscdk.services.ecs.BuiltInAttributes.AVAILABILITY_ZONE

    public val INSTANCE_ID: String =
        software.amazon.awscdk.services.ecs.BuiltInAttributes.INSTANCE_ID

    public val INSTANCE_TYPE: String =
        software.amazon.awscdk.services.ecs.BuiltInAttributes.INSTANCE_TYPE

    public val OS_TYPE: String = software.amazon.awscdk.services.ecs.BuiltInAttributes.OS_TYPE

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.BuiltInAttributes):
        BuiltInAttributes = BuiltInAttributes(cdkObject)

    internal fun unwrap(wrapped: BuiltInAttributes):
        software.amazon.awscdk.services.ecs.BuiltInAttributes = wrapped.cdkObject
  }
}
