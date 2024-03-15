@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnCapacityReservationFleetProps {
  public fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

  public fun endDate(): String? = unwrap(this).getEndDate()

  public fun instanceMatchCriteria(): String? = unwrap(this).getInstanceMatchCriteria()

  public fun instanceTypeSpecifications(): Any? = unwrap(this).getInstanceTypeSpecifications()

  public fun noRemoveEndDate(): Any? = unwrap(this).getNoRemoveEndDate()

  public fun removeEndDate(): Any? = unwrap(this).getRemoveEndDate()

  public fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

  public fun tenancy(): String? = unwrap(this).getTenancy()

  public fun totalTargetCapacity(): Number? = unwrap(this).getTotalTargetCapacity()

  @CdkDslMarker
  public interface Builder {
    public fun allocationStrategy(allocationStrategy: String)

    public fun endDate(endDate: String)

    public fun instanceMatchCriteria(instanceMatchCriteria: String)

    public fun instanceTypeSpecifications(instanceTypeSpecifications: IResolvable)

    public fun instanceTypeSpecifications(instanceTypeSpecifications: List<Any>)

    public fun instanceTypeSpecifications(vararg instanceTypeSpecifications: Any)

    public fun noRemoveEndDate(noRemoveEndDate: Boolean)

    public fun noRemoveEndDate(noRemoveEndDate: IResolvable)

    public fun removeEndDate(removeEndDate: Boolean)

    public fun removeEndDate(removeEndDate: IResolvable)

    public fun tagSpecifications(tagSpecifications: IResolvable)

    public fun tagSpecifications(tagSpecifications: List<Any>)

    public fun tagSpecifications(vararg tagSpecifications: Any)

    public fun tenancy(tenancy: String)

    public fun totalTargetCapacity(totalTargetCapacity: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnCapacityReservationFleetProps.Builder =
        software.amazon.awscdk.services.ec2.CfnCapacityReservationFleetProps.builder()

    override fun allocationStrategy(allocationStrategy: String) {
      cdkBuilder.allocationStrategy(allocationStrategy)
    }

    override fun endDate(endDate: String) {
      cdkBuilder.endDate(endDate)
    }

    override fun instanceMatchCriteria(instanceMatchCriteria: String) {
      cdkBuilder.instanceMatchCriteria(instanceMatchCriteria)
    }

    override fun instanceTypeSpecifications(instanceTypeSpecifications: IResolvable) {
      cdkBuilder.instanceTypeSpecifications(instanceTypeSpecifications.let(IResolvable::unwrap))
    }

    override fun instanceTypeSpecifications(instanceTypeSpecifications: List<Any>) {
      cdkBuilder.instanceTypeSpecifications(instanceTypeSpecifications)
    }

    override fun instanceTypeSpecifications(vararg instanceTypeSpecifications: Any): Unit =
        instanceTypeSpecifications(instanceTypeSpecifications.toList())

    override fun noRemoveEndDate(noRemoveEndDate: Boolean) {
      cdkBuilder.noRemoveEndDate(noRemoveEndDate)
    }

    override fun noRemoveEndDate(noRemoveEndDate: IResolvable) {
      cdkBuilder.noRemoveEndDate(noRemoveEndDate.let(IResolvable::unwrap))
    }

    override fun removeEndDate(removeEndDate: Boolean) {
      cdkBuilder.removeEndDate(removeEndDate)
    }

    override fun removeEndDate(removeEndDate: IResolvable) {
      cdkBuilder.removeEndDate(removeEndDate.let(IResolvable::unwrap))
    }

    override fun tagSpecifications(tagSpecifications: IResolvable) {
      cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable::unwrap))
    }

    override fun tagSpecifications(tagSpecifications: List<Any>) {
      cdkBuilder.tagSpecifications(tagSpecifications)
    }

    override fun tagSpecifications(vararg tagSpecifications: Any): Unit =
        tagSpecifications(tagSpecifications.toList())

    override fun tenancy(tenancy: String) {
      cdkBuilder.tenancy(tenancy)
    }

    override fun totalTargetCapacity(totalTargetCapacity: Number) {
      cdkBuilder.totalTargetCapacity(totalTargetCapacity)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnCapacityReservationFleetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnCapacityReservationFleetProps,
  ) : CdkObject(cdkObject), CfnCapacityReservationFleetProps {
    override fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

    override fun endDate(): String? = unwrap(this).getEndDate()

    override fun instanceMatchCriteria(): String? = unwrap(this).getInstanceMatchCriteria()

    override fun instanceTypeSpecifications(): Any? = unwrap(this).getInstanceTypeSpecifications()

    override fun noRemoveEndDate(): Any? = unwrap(this).getNoRemoveEndDate()

    override fun removeEndDate(): Any? = unwrap(this).getRemoveEndDate()

    override fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

    override fun tenancy(): String? = unwrap(this).getTenancy()

    override fun totalTargetCapacity(): Number? = unwrap(this).getTotalTargetCapacity()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCapacityReservationFleetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnCapacityReservationFleetProps):
        CfnCapacityReservationFleetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCapacityReservationFleetProps):
        software.amazon.awscdk.services.ec2.CfnCapacityReservationFleetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnCapacityReservationFleetProps
  }
}
