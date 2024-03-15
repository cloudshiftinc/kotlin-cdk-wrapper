@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kendraranking

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnExecutionPlanProps {
  public fun capacityUnits(): Any? = unwrap(this).getCapacityUnits()

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun capacityUnits(capacityUnits: IResolvable)

    public fun capacityUnits(capacityUnits: CfnExecutionPlan.CapacityUnitsConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24cc9b2840e88f351dbdba3e9e529d0b6a5eee7c664b3453d75d5925d623cb8c")
    public
        fun capacityUnits(capacityUnits: CfnExecutionPlan.CapacityUnitsConfigurationProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kendraranking.CfnExecutionPlanProps.Builder =
        software.amazon.awscdk.services.kendraranking.CfnExecutionPlanProps.builder()

    override fun capacityUnits(capacityUnits: IResolvable) {
      cdkBuilder.capacityUnits(capacityUnits.let(IResolvable::unwrap))
    }

    override fun capacityUnits(capacityUnits: CfnExecutionPlan.CapacityUnitsConfigurationProperty) {
      cdkBuilder.capacityUnits(capacityUnits.let(CfnExecutionPlan.CapacityUnitsConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24cc9b2840e88f351dbdba3e9e529d0b6a5eee7c664b3453d75d5925d623cb8c")
    override
        fun capacityUnits(capacityUnits: CfnExecutionPlan.CapacityUnitsConfigurationProperty.Builder.() -> Unit):
        Unit = capacityUnits(CfnExecutionPlan.CapacityUnitsConfigurationProperty(capacityUnits))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kendraranking.CfnExecutionPlanProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kendraranking.CfnExecutionPlanProps,
  ) : CdkObject(cdkObject), CfnExecutionPlanProps {
    override fun capacityUnits(): Any? = unwrap(this).getCapacityUnits()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnExecutionPlanProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kendraranking.CfnExecutionPlanProps):
        CfnExecutionPlanProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnExecutionPlanProps):
        software.amazon.awscdk.services.kendraranking.CfnExecutionPlanProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kendraranking.CfnExecutionPlanProps
  }
}
