package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCapacityReservation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnCapacityReservation,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAvailabilityZone(): String = unwrap(this).getAttrAvailabilityZone()

  public open fun attrAvailableInstanceCount(): Number =
      unwrap(this).getAttrAvailableInstanceCount()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrInstanceType(): String = unwrap(this).getAttrInstanceType()

  public open fun attrTenancy(): String = unwrap(this).getAttrTenancy()

  public open fun attrTotalInstanceCount(): Number = unwrap(this).getAttrTotalInstanceCount()

  public open fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  public open fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

  public open fun ebsOptimized(`value`: Boolean) {
    unwrap(this).setEbsOptimized(`value`)
  }

  public open fun ebsOptimized(`value`: IResolvable) {
    unwrap(this).setEbsOptimized(`value`.let(IResolvable::unwrap))
  }

  public open fun endDate(): String? = unwrap(this).getEndDate()

  public open fun endDate(`value`: String) {
    unwrap(this).setEndDate(`value`)
  }

  public open fun endDateType(): String? = unwrap(this).getEndDateType()

  public open fun endDateType(`value`: String) {
    unwrap(this).setEndDateType(`value`)
  }

  public open fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

  public open fun ephemeralStorage(`value`: Boolean) {
    unwrap(this).setEphemeralStorage(`value`)
  }

  public open fun ephemeralStorage(`value`: IResolvable) {
    unwrap(this).setEphemeralStorage(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceCount(): Number = unwrap(this).getInstanceCount()

  public open fun instanceCount(`value`: Number) {
    unwrap(this).setInstanceCount(`value`)
  }

  public open fun instanceMatchCriteria(): String? = unwrap(this).getInstanceMatchCriteria()

  public open fun instanceMatchCriteria(`value`: String) {
    unwrap(this).setInstanceMatchCriteria(`value`)
  }

  public open fun instancePlatform(): String = unwrap(this).getInstancePlatform()

  public open fun instancePlatform(`value`: String) {
    unwrap(this).setInstancePlatform(`value`)
  }

  public open fun instanceType(): String = unwrap(this).getInstanceType()

  public open fun instanceType(`value`: String) {
    unwrap(this).setInstanceType(`value`)
  }

  public open fun outPostArn(): String? = unwrap(this).getOutPostArn()

  public open fun outPostArn(`value`: String) {
    unwrap(this).setOutPostArn(`value`)
  }

  public open fun placementGroupArn(): String? = unwrap(this).getPlacementGroupArn()

  public open fun placementGroupArn(`value`: String) {
    unwrap(this).setPlacementGroupArn(`value`)
  }

  public open fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

  public open fun tagSpecifications(`value`: IResolvable) {
    unwrap(this).setTagSpecifications(`value`.let(IResolvable::unwrap))
  }

  public open fun tagSpecifications(__idx_ac66f0: List<Any>) {
    unwrap(this).setTagSpecifications(__idx_ac66f0)
  }

  public open fun tenancy(): String? = unwrap(this).getTenancy()

  public open fun tenancy(`value`: String) {
    unwrap(this).setTenancy(`value`)
  }

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

    public fun tenancy(tenancy: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnCapacityReservation.Builder =
        software.amazon.awscdk.services.ec2.CfnCapacityReservation.Builder.create(scope, id)

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

    override fun tenancy(tenancy: String) {
      cdkBuilder.tenancy(tenancy)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnCapacityReservation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCapacityReservation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCapacityReservation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnCapacityReservation):
        CfnCapacityReservation = CfnCapacityReservation(cdkObject)

    internal fun unwrap(wrapped: CfnCapacityReservation):
        software.amazon.awscdk.services.ec2.CfnCapacityReservation = wrapped.cdkObject
  }

  public interface TagSpecificationProperty {
    public fun resourceType(): String? = unwrap(this).getResourceType()

    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    public interface Builder {
      public fun resourceType(resourceType: String)

      public fun tags(tags: List<CfnTag>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnCapacityReservation.TagSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnCapacityReservation.TagSpecificationProperty.builder()

      override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnCapacityReservation.TagSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnCapacityReservation.TagSpecificationProperty,
    ) : TagSpecificationProperty {
      override fun resourceType(): String? = unwrap(this).getResourceType()

      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TagSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnCapacityReservation.TagSpecificationProperty):
          TagSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnCapacityReservation.TagSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
