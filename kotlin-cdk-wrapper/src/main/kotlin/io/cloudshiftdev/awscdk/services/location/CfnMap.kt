@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.location

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMap internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.location.CfnMap,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreateTime(): String = unwrap(this).getAttrCreateTime()

  public open fun attrDataSource(): String = unwrap(this).getAttrDataSource()

  public open fun attrMapArn(): String = unwrap(this).getAttrMapArn()

  public open fun attrUpdateTime(): String = unwrap(this).getAttrUpdateTime()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun configuration(): Any = unwrap(this).getConfiguration()

  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun configuration(`value`: MapConfigurationProperty) {
    unwrap(this).setConfiguration(`value`.let(MapConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3fb73b3b0c94a0a1b10d0adb4530f553d086a0ad2e915616eb379f5666d696c2")
  public open fun configuration(`value`: MapConfigurationProperty.Builder.() -> Unit): Unit =
      configuration(MapConfigurationProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun mapName(): String = unwrap(this).getMapName()

  public open fun mapName(`value`: String) {
    unwrap(this).setMapName(`value`)
  }

  public open fun pricingPlan(): String? = unwrap(this).getPricingPlan()

  public open fun pricingPlan(`value`: String) {
    unwrap(this).setPricingPlan(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun configuration(configuration: IResolvable)

    public fun configuration(configuration: MapConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18e1cd3843bc1dff5c3e6ee70ca7afa1d72f5ecd09d554cc7bc1b6ccb92db904")
    public fun configuration(configuration: MapConfigurationProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun mapName(mapName: String)

    public fun pricingPlan(pricingPlan: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.location.CfnMap.Builder =
        software.amazon.awscdk.services.location.CfnMap.Builder.create(scope, id)

    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    override fun configuration(configuration: MapConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(MapConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18e1cd3843bc1dff5c3e6ee70ca7afa1d72f5ecd09d554cc7bc1b6ccb92db904")
    override fun configuration(configuration: MapConfigurationProperty.Builder.() -> Unit): Unit =
        configuration(MapConfigurationProperty(configuration))

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

    public fun build(): software.amazon.awscdk.services.location.CfnMap = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.location.CfnMap.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMap {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMap(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnMap): CfnMap =
        CfnMap(cdkObject)

    internal fun unwrap(wrapped: CfnMap): software.amazon.awscdk.services.location.CfnMap =
        wrapped.cdkObject
  }

  public interface MapConfigurationProperty {
    public fun customLayers(): List<String> = unwrap(this).getCustomLayers() ?: emptyList()

    public fun politicalView(): String? = unwrap(this).getPoliticalView()

    public fun style(): String

    @CdkDslMarker
    public interface Builder {
      public fun customLayers(customLayers: List<String>)

      public fun customLayers(vararg customLayers: String)

      public fun politicalView(politicalView: String)

      public fun style(style: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.location.CfnMap.MapConfigurationProperty.Builder =
          software.amazon.awscdk.services.location.CfnMap.MapConfigurationProperty.builder()

      override fun customLayers(customLayers: List<String>) {
        cdkBuilder.customLayers(customLayers)
      }

      override fun customLayers(vararg customLayers: String): Unit =
          customLayers(customLayers.toList())

      override fun politicalView(politicalView: String) {
        cdkBuilder.politicalView(politicalView)
      }

      override fun style(style: String) {
        cdkBuilder.style(style)
      }

      public fun build(): software.amazon.awscdk.services.location.CfnMap.MapConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.location.CfnMap.MapConfigurationProperty,
    ) : CdkObject(cdkObject), MapConfigurationProperty {
      override fun customLayers(): List<String> = unwrap(this).getCustomLayers() ?: emptyList()

      override fun politicalView(): String? = unwrap(this).getPoliticalView()

      override fun style(): String = unwrap(this).getStyle()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MapConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnMap.MapConfigurationProperty):
          MapConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MapConfigurationProperty):
          software.amazon.awscdk.services.location.CfnMap.MapConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.location.CfnMap.MapConfigurationProperty
    }
  }
}
