@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.athena

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnCapacityReservationProps {
  public fun capacityAssignmentConfiguration(): Any? =
      unwrap(this).getCapacityAssignmentConfiguration()

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun targetDpus(): Number

  @CdkDslMarker
  public interface Builder {
    public fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: IResolvable)

    public
        fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: CfnCapacityReservation.CapacityAssignmentConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78b979be9beaab427b42c10ad83a2bfdc39237adda5293638b6ccbc520411253")
    public
        fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: CfnCapacityReservation.CapacityAssignmentConfigurationProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun targetDpus(targetDpus: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.athena.CfnCapacityReservationProps.Builder =
        software.amazon.awscdk.services.athena.CfnCapacityReservationProps.builder()

    override fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: IResolvable) {
      cdkBuilder.capacityAssignmentConfiguration(capacityAssignmentConfiguration.let(IResolvable::unwrap))
    }

    override
        fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: CfnCapacityReservation.CapacityAssignmentConfigurationProperty) {
      cdkBuilder.capacityAssignmentConfiguration(capacityAssignmentConfiguration.let(CfnCapacityReservation.CapacityAssignmentConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78b979be9beaab427b42c10ad83a2bfdc39237adda5293638b6ccbc520411253")
    override
        fun capacityAssignmentConfiguration(capacityAssignmentConfiguration: CfnCapacityReservation.CapacityAssignmentConfigurationProperty.Builder.() -> Unit):
        Unit =
        capacityAssignmentConfiguration(CfnCapacityReservation.CapacityAssignmentConfigurationProperty(capacityAssignmentConfiguration))

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

    public fun build(): software.amazon.awscdk.services.athena.CfnCapacityReservationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.athena.CfnCapacityReservationProps,
  ) : CdkObject(cdkObject), CfnCapacityReservationProps {
    override fun capacityAssignmentConfiguration(): Any? =
        unwrap(this).getCapacityAssignmentConfiguration()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun targetDpus(): Number = unwrap(this).getTargetDpus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCapacityReservationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnCapacityReservationProps):
        CfnCapacityReservationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCapacityReservationProps):
        software.amazon.awscdk.services.athena.CfnCapacityReservationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.athena.CfnCapacityReservationProps
  }
}
