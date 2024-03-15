@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCapacityReservationFleet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet,
) : CfnResource(cdkObject), IInspectable {
  public open fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

  public open fun allocationStrategy(`value`: String) {
    unwrap(this).setAllocationStrategy(`value`)
  }

  public open fun attrCapacityReservationFleetId(): String =
      unwrap(this).getAttrCapacityReservationFleetId()

  public open fun endDate(): String? = unwrap(this).getEndDate()

  public open fun endDate(`value`: String) {
    unwrap(this).setEndDate(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceMatchCriteria(): String? = unwrap(this).getInstanceMatchCriteria()

  public open fun instanceMatchCriteria(`value`: String) {
    unwrap(this).setInstanceMatchCriteria(`value`)
  }

  public open fun instanceTypeSpecifications(): Any? = unwrap(this).getInstanceTypeSpecifications()

  public open fun instanceTypeSpecifications(`value`: IResolvable) {
    unwrap(this).setInstanceTypeSpecifications(`value`.let(IResolvable::unwrap))
  }

  public open fun instanceTypeSpecifications(__idx_ac66f0: List<Any>) {
    unwrap(this).setInstanceTypeSpecifications(__idx_ac66f0)
  }

  public open fun instanceTypeSpecifications(vararg __idx_ac66f0: Any): Unit =
      instanceTypeSpecifications(__idx_ac66f0.toList())

  public open fun noRemoveEndDate(): Any? = unwrap(this).getNoRemoveEndDate()

  public open fun noRemoveEndDate(`value`: Boolean) {
    unwrap(this).setNoRemoveEndDate(`value`)
  }

  public open fun noRemoveEndDate(`value`: IResolvable) {
    unwrap(this).setNoRemoveEndDate(`value`.let(IResolvable::unwrap))
  }

  public open fun removeEndDate(): Any? = unwrap(this).getRemoveEndDate()

  public open fun removeEndDate(`value`: Boolean) {
    unwrap(this).setRemoveEndDate(`value`)
  }

  public open fun removeEndDate(`value`: IResolvable) {
    unwrap(this).setRemoveEndDate(`value`.let(IResolvable::unwrap))
  }

  public open fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

  public open fun tagSpecifications(`value`: IResolvable) {
    unwrap(this).setTagSpecifications(`value`.let(IResolvable::unwrap))
  }

  public open fun tagSpecifications(__idx_ac66f0: List<Any>) {
    unwrap(this).setTagSpecifications(__idx_ac66f0)
  }

  public open fun tagSpecifications(vararg __idx_ac66f0: Any): Unit =
      tagSpecifications(__idx_ac66f0.toList())

  public open fun tenancy(): String? = unwrap(this).getTenancy()

  public open fun tenancy(`value`: String) {
    unwrap(this).setTenancy(`value`)
  }

  public open fun totalTargetCapacity(): Number? = unwrap(this).getTotalTargetCapacity()

  public open fun totalTargetCapacity(`value`: Number) {
    unwrap(this).setTotalTargetCapacity(`value`)
  }

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.Builder
        = software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCapacityReservationFleet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCapacityReservationFleet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet):
        CfnCapacityReservationFleet = CfnCapacityReservationFleet(cdkObject)

    internal fun unwrap(wrapped: CfnCapacityReservationFleet):
        software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet = wrapped.cdkObject
  }

  public interface TagSpecificationProperty {
    public fun resourceType(): String? = unwrap(this).getResourceType()

    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun resourceType(resourceType: String)

      public fun tags(tags: List<CfnTag>)

      public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.TagSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.TagSpecificationProperty.builder()

      override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      public fun build():
          software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.TagSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.TagSpecificationProperty,
    ) : CdkObject(cdkObject), TagSpecificationProperty {
      override fun resourceType(): String? = unwrap(this).getResourceType()

      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.TagSpecificationProperty):
          TagSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.TagSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.TagSpecificationProperty
    }
  }

  public interface InstanceTypeSpecificationProperty {
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    public fun availabilityZoneId(): String? = unwrap(this).getAvailabilityZoneId()

    public fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

    public fun instancePlatform(): String? = unwrap(this).getInstancePlatform()

    public fun instanceType(): String? = unwrap(this).getInstanceType()

    public fun priority(): Number? = unwrap(this).getPriority()

    public fun weight(): Number? = unwrap(this).getWeight()

    @CdkDslMarker
    public interface Builder {
      public fun availabilityZone(availabilityZone: String)

      public fun availabilityZoneId(availabilityZoneId: String)

      public fun ebsOptimized(ebsOptimized: Boolean)

      public fun ebsOptimized(ebsOptimized: IResolvable)

      public fun instancePlatform(instancePlatform: String)

      public fun instanceType(instanceType: String)

      public fun priority(priority: Number)

      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.InstanceTypeSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.InstanceTypeSpecificationProperty.builder()

      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      override fun availabilityZoneId(availabilityZoneId: String) {
        cdkBuilder.availabilityZoneId(availabilityZoneId)
      }

      override fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
      }

      override fun ebsOptimized(ebsOptimized: IResolvable) {
        cdkBuilder.ebsOptimized(ebsOptimized.let(IResolvable::unwrap))
      }

      override fun instancePlatform(instancePlatform: String) {
        cdkBuilder.instancePlatform(instancePlatform)
      }

      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.InstanceTypeSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.InstanceTypeSpecificationProperty,
    ) : CdkObject(cdkObject), InstanceTypeSpecificationProperty {
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      override fun availabilityZoneId(): String? = unwrap(this).getAvailabilityZoneId()

      override fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

      override fun instancePlatform(): String? = unwrap(this).getInstancePlatform()

      override fun instanceType(): String? = unwrap(this).getInstanceType()

      override fun priority(): Number? = unwrap(this).getPriority()

      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceTypeSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.InstanceTypeSpecificationProperty):
          InstanceTypeSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceTypeSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.InstanceTypeSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.InstanceTypeSpecificationProperty
    }
  }
}
