package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Boolean

public open class InstanceType internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.InstanceType,
) : CdkObject(cdkObject) {
  /**
   * The instance's CPU architecture.
   */
  public open fun architecture(): InstanceArchitecture =
      unwrap(this).getArchitecture().let(InstanceArchitecture::wrap)

  /**
   * Return whether this instance type is a burstable instance type.
   */
  public open fun isBurstable(): Boolean = unwrap(this).isBurstable()

  /**
   * @param other 
   */
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