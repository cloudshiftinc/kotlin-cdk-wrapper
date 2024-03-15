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

public interface CfnCapacityReservationProps {
  public fun availabilityZone(): String

  public fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

  public fun endDate(): String? = unwrap(this).getEndDate()

  public fun endDateType(): String? = unwrap(this).getEndDateType()

  public fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

  public fun instanceCount(): Number

  public fun instanceMatchCriteria(): String? = unwrap(this).getInstanceMatchCriteria()

  public fun instancePlatform(): String

  public fun instanceType(): String

  public fun outPostArn(): String? = unwrap(this).getOutPostArn()

  public fun placementGroupArn(): String? = unwrap(this).getPlacementGroupArn()

  public fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

  public fun tenancy(): String? = unwrap(this).getTenancy()

  @CdkDslMarker
  public interface Builder {
    public fun availabilityZone(availabilityZone: String)

    public fun ebsOptimized(ebsOptimized: Boolean)

    public fun ebsOptimized(ebsOptimized: IResolvable)

    public fun endDate(endDate: String)

    public fun endDateType(endDateType: String)

    public fun ephemeralStorage(ephemeralStorage: Boolean)

    public fun ephemeralStorage(ephemeralStorage: IResolvable)

    public fun instanceCount(instanceCount: Number)

    public fun instanceMatchCriteria(instanceMatchCriteria: String)

    public fun instancePlatform(instancePlatform: String)

    public fun instanceType(instanceType: String)

    public fun outPostArn(outPostArn: String)

    public fun placementGroupArn(placementGroupArn: String)

    public fun tagSpecifications(tagSpecifications: IResolvable)

    public fun tagSpecifications(tagSpecifications: List<Any>)

    public fun tagSpecifications(vararg tagSpecifications: Any)

    public fun tenancy(tenancy: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnCapacityReservationProps.Builder
        = software.amazon.awscdk.services.ec2.CfnCapacityReservationProps.builder()

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun ebsOptimized(ebsOptimized: Boolean) {
      cdkBuilder.ebsOptimized(ebsOptimized)
    }

    override fun ebsOptimized(ebsOptimized: IResolvable) {
      cdkBuilder.ebsOptimized(ebsOptimized.let(IResolvable::unwrap))
    }

    override fun endDate(endDate: String) {
      cdkBuilder.endDate(endDate)
    }

    override fun endDateType(endDateType: String) {
      cdkBuilder.endDateType(endDateType)
    }

    override fun ephemeralStorage(ephemeralStorage: Boolean) {
      cdkBuilder.ephemeralStorage(ephemeralStorage)
    }

    override fun ephemeralStorage(ephemeralStorage: IResolvable) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(IResolvable::unwrap))
    }

    override fun instanceCount(instanceCount: Number) {
      cdkBuilder.instanceCount(instanceCount)
    }

    override fun instanceMatchCriteria(instanceMatchCriteria: String) {
      cdkBuilder.instanceMatchCriteria(instanceMatchCriteria)
    }

    override fun instancePlatform(instancePlatform: String) {
      cdkBuilder.instancePlatform(instancePlatform)
    }

    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    override fun outPostArn(outPostArn: String) {
      cdkBuilder.outPostArn(outPostArn)
    }

    override fun placementGroupArn(placementGroupArn: String) {
      cdkBuilder.placementGroupArn(placementGroupArn)
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

    public fun build(): software.amazon.awscdk.services.ec2.CfnCapacityReservationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnCapacityReservationProps,
  ) : CdkObject(cdkObject), CfnCapacityReservationProps {
    override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

    override fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

    override fun endDate(): String? = unwrap(this).getEndDate()

    override fun endDateType(): String? = unwrap(this).getEndDateType()

    override fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

    override fun instanceCount(): Number = unwrap(this).getInstanceCount()

    override fun instanceMatchCriteria(): String? = unwrap(this).getInstanceMatchCriteria()

    override fun instancePlatform(): String = unwrap(this).getInstancePlatform()

    override fun instanceType(): String = unwrap(this).getInstanceType()

    override fun outPostArn(): String? = unwrap(this).getOutPostArn()

    override fun placementGroupArn(): String? = unwrap(this).getPlacementGroupArn()

    override fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

    override fun tenancy(): String? = unwrap(this).getTenancy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCapacityReservationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnCapacityReservationProps):
        CfnCapacityReservationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCapacityReservationProps):
        software.amazon.awscdk.services.ec2.CfnCapacityReservationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnCapacityReservationProps
  }
}
