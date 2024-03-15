@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.location

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnMapProps {
  public fun configuration(): Any

  public fun description(): String? = unwrap(this).getDescription()

  public fun mapName(): String

  public fun pricingPlan(): String? = unwrap(this).getPricingPlan()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun configuration(configuration: IResolvable)

    public fun configuration(configuration: CfnMap.MapConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("afdd544c6a3d1f2315e21a5d2e3d6af304d7d1f110a39479a7e8f5c96d186267")
    public fun configuration(configuration: CfnMap.MapConfigurationProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun mapName(mapName: String)

    public fun pricingPlan(pricingPlan: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.location.CfnMapProps.Builder =
        software.amazon.awscdk.services.location.CfnMapProps.builder()

    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    override fun configuration(configuration: CfnMap.MapConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(CfnMap.MapConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("afdd544c6a3d1f2315e21a5d2e3d6af304d7d1f110a39479a7e8f5c96d186267")
    override fun configuration(configuration: CfnMap.MapConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(CfnMap.MapConfigurationProperty(configuration))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun mapName(mapName: String) {
      cdkBuilder.mapName(mapName)
    }

    override fun pricingPlan(pricingPlan: String) {
      cdkBuilder.pricingPlan(pricingPlan)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.location.CfnMapProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.location.CfnMapProps,
  ) : CdkObject(cdkObject), CfnMapProps {
    override fun configuration(): Any = unwrap(this).getConfiguration()

    override fun description(): String? = unwrap(this).getDescription()

    override fun mapName(): String = unwrap(this).getMapName()

    override fun pricingPlan(): String? = unwrap(this).getPricingPlan()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMapProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnMapProps): CfnMapProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMapProps): software.amazon.awscdk.services.location.CfnMapProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.location.CfnMapProps
  }
}
