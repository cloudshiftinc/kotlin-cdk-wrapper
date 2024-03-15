@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean

public open class InstanceType internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.InstanceType,
) : CdkObject(cdkObject) {
  public open fun architecture(): InstanceArchitecture =
      unwrap(this).getArchitecture().let(InstanceArchitecture::wrap)

  public open fun isBurstable(): Boolean = unwrap(this).isBurstable()

  public open fun sameInstanceClassAs(other: InstanceType): Boolean =
      unwrap(this).sameInstanceClassAs(other.let(InstanceType::unwrap))

  public companion object {
    public fun of(instanceClass: InstanceClass, instanceSize: InstanceSize): InstanceType =
        software.amazon.awscdk.services.ec2.InstanceType.of(instanceClass.let(InstanceClass::unwrap),
        instanceSize.let(InstanceSize::unwrap)).let(InstanceType::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InstanceType): InstanceType =
        InstanceType(cdkObject)

    internal fun unwrap(wrapped: InstanceType): software.amazon.awscdk.services.ec2.InstanceType =
        wrapped.cdkObject
  }
}
