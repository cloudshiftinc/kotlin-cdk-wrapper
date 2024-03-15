@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.athena

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCapacityReservation internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.athena.CfnCapacityReservation,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrAllocatedDpus(): Number = unwrap(this).getAttrAllocatedDpus()

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrLastSuccessfulAllocationTime(): String =
      unwrap(this).getAttrLastSuccessfulAllocationTime()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun capacityAssignmentConfiguration(): Any? =
      unwrap(this).getCapacityAssignmentConfiguration()

  public open fun capacityAssignmentConfiguration(`value`: IResolvable) {
    unwrap(this).setCapacityAssignmentConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun capacityAssignmentConfiguration(`value`: CapacityAssignmentConfigurationProperty) {
    unwrap(this).setCapacityAssignmentConfiguration(`value`.let(CapacityAssignmentConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("03f516509aa94e9d6b3e3a0ea77fd6105a0a9eec6522aec32c359d17f06d94ac")
  public open
      fun capacityAssignmentConfiguration(`value`: CapacityAssignmentConfigurationProperty.Builder.() -> Unit):
      Unit = capacityAssignmentConfiguration(CapacityAssignmentConfigurationProperty(`value`))

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  public open fun targetDpus(): Number = unwrap(this).getTargetDpus()

  public open fun targetDpus(`value`: Number) {
    unwrap(this).setTargetDpus(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: IResolvable)

    public
        fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: CapacityAssignmentConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f001a886dd0a53d1116add225212dc5c6d24da356ab06da3e64adabe3878ae64")
    public
        fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: CapacityAssignmentConfigurationProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun targetDpus(targetDpus: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.athena.CfnCapacityReservation.Builder =
        software.amazon.awscdk.services.athena.CfnCapacityReservation.Builder.create(scope, id)

    override fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: IResolvable) {
      cdkBuilder.capacityAssignmentConfiguration(capacityAssignmentConfiguration.let(IResolvable::unwrap))
    }

    override
        fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: CapacityAssignmentConfigurationProperty) {
      cdkBuilder.capacityAssignmentConfiguration(capacityAssignmentConfiguration.let(CapacityAssignmentConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f001a886dd0a53d1116add225212dc5c6d24da356ab06da3e64adabe3878ae64")
    override
        fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: CapacityAssignmentConfigurationProperty.Builder.() -> Unit):
        Unit =
        capacityAssignmentConfiguration(CapacityAssignmentConfigurationProperty(capacityAssignmentConfiguration))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun targetDpus(targetDpus: Number) {
      cdkBuilder.targetDpus(targetDpus)
    }

    public fun build(): software.amazon.awscdk.services.athena.CfnCapacityReservation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.athena.CfnCapacityReservation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCapacityReservation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCapacityReservation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnCapacityReservation):
        CfnCapacityReservation = CfnCapacityReservation(cdkObject)

    internal fun unwrap(wrapped: CfnCapacityReservation):
        software.amazon.awscdk.services.athena.CfnCapacityReservation = wrapped.cdkObject
  }

  public interface CapacityAssignmentConfigurationProperty {
    public fun capacityAssignments(): Any

    @CdkDslMarker
    public interface Builder {
      public fun capacityAssignments(capacityAssignments: IResolvable)

      public fun capacityAssignments(capacityAssignments: List<Any>)

      public fun capacityAssignments(vararg capacityAssignments: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentConfigurationProperty.builder()

      override fun capacityAssignments(capacityAssignments: IResolvable) {
        cdkBuilder.capacityAssignments(capacityAssignments.let(IResolvable::unwrap))
      }

      override fun capacityAssignments(capacityAssignments: List<Any>) {
        cdkBuilder.capacityAssignments(capacityAssignments)
      }

      override fun capacityAssignments(vararg capacityAssignments: Any): Unit =
          capacityAssignments(capacityAssignments.toList())

      public fun build():
          software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentConfigurationProperty,
    ) : CdkObject(cdkObject), CapacityAssignmentConfigurationProperty {
      override fun capacityAssignments(): Any = unwrap(this).getCapacityAssignments()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CapacityAssignmentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentConfigurationProperty):
          CapacityAssignmentConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityAssignmentConfigurationProperty):
          software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentConfigurationProperty
    }
  }

  public interface CapacityAssignmentProperty {
    public fun workgroupNames(): List<String>

    @CdkDslMarker
    public interface Builder {
      public fun workgroupNames(workgroupNames: List<String>)

      public fun workgroupNames(vararg workgroupNames: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentProperty.Builder
          =
          software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentProperty.builder()

      override fun workgroupNames(workgroupNames: List<String>) {
        cdkBuilder.workgroupNames(workgroupNames)
      }

      override fun workgroupNames(vararg workgroupNames: String): Unit =
          workgroupNames(workgroupNames.toList())

      public fun build():
          software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentProperty,
    ) : CdkObject(cdkObject), CapacityAssignmentProperty {
      override fun workgroupNames(): List<String> = unwrap(this).getWorkgroupNames()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CapacityAssignmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentProperty):
          CapacityAssignmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityAssignmentProperty):
          software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.athena.CfnCapacityReservation.CapacityAssignmentProperty
    }
  }
}
