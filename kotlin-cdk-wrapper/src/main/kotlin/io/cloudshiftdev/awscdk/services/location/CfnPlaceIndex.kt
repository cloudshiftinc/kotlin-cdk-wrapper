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

public open class CfnPlaceIndex internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.location.CfnPlaceIndex,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreateTime(): String = unwrap(this).getAttrCreateTime()

  public open fun attrIndexArn(): String = unwrap(this).getAttrIndexArn()

  public open fun attrUpdateTime(): String = unwrap(this).getAttrUpdateTime()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun dataSource(): String = unwrap(this).getDataSource()

  public open fun dataSource(`value`: String) {
    unwrap(this).setDataSource(`value`)
  }

  public open fun dataSourceConfiguration(): Any? = unwrap(this).getDataSourceConfiguration()

  public open fun dataSourceConfiguration(`value`: IResolvable) {
    unwrap(this).setDataSourceConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun dataSourceConfiguration(`value`: DataSourceConfigurationProperty) {
    unwrap(this).setDataSourceConfiguration(`value`.let(DataSourceConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e87fc945104e3c8f90cfb926a34812a24d368dc18d104b6e6eb6721a801a183b")
  public open
      fun dataSourceConfiguration(`value`: DataSourceConfigurationProperty.Builder.() -> Unit): Unit
      = dataSourceConfiguration(DataSourceConfigurationProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun indexName(): String = unwrap(this).getIndexName()

  public open fun indexName(`value`: String) {
    unwrap(this).setIndexName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
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
    public fun dataSource(dataSource: String)

    public fun dataSourceConfiguration(dataSourceConfiguration: IResolvable)

    public fun dataSourceConfiguration(dataSourceConfiguration: DataSourceConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57149601d9fc24ae78bce5d24217bbda8def65f5af894dade12f21080b171d51")
    public
        fun dataSourceConfiguration(dataSourceConfiguration: DataSourceConfigurationProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun indexName(indexName: String)

    public fun pricingPlan(pricingPlan: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.location.CfnPlaceIndex.Builder =
        software.amazon.awscdk.services.location.CfnPlaceIndex.Builder.create(scope, id)

    override fun dataSource(dataSource: String) {
      cdkBuilder.dataSource(dataSource)
    }

    override fun dataSourceConfiguration(dataSourceConfiguration: IResolvable) {
      cdkBuilder.dataSourceConfiguration(dataSourceConfiguration.let(IResolvable::unwrap))
    }

    override fun dataSourceConfiguration(dataSourceConfiguration: DataSourceConfigurationProperty) {
      cdkBuilder.dataSourceConfiguration(dataSourceConfiguration.let(DataSourceConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57149601d9fc24ae78bce5d24217bbda8def65f5af894dade12f21080b171d51")
    override
        fun dataSourceConfiguration(dataSourceConfiguration: DataSourceConfigurationProperty.Builder.() -> Unit):
        Unit = dataSourceConfiguration(DataSourceConfigurationProperty(dataSourceConfiguration))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun indexName(indexName: String) {
      cdkBuilder.indexName(indexName)
    }

    override fun pricingPlan(pricingPlan: String) {
      cdkBuilder.pricingPlan(pricingPlan)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.location.CfnPlaceIndex = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.location.CfnPlaceIndex.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPlaceIndex {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPlaceIndex(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnPlaceIndex):
        CfnPlaceIndex = CfnPlaceIndex(cdkObject)

    internal fun unwrap(wrapped: CfnPlaceIndex):
        software.amazon.awscdk.services.location.CfnPlaceIndex = wrapped.cdkObject
  }

  public interface DataSourceConfigurationProperty {
    public fun intendedUse(): String? = unwrap(this).getIntendedUse()

    @CdkDslMarker
    public interface Builder {
      public fun intendedUse(intendedUse: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.location.CfnPlaceIndex.DataSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.location.CfnPlaceIndex.DataSourceConfigurationProperty.builder()

      override fun intendedUse(intendedUse: String) {
        cdkBuilder.intendedUse(intendedUse)
      }

      public fun build():
          software.amazon.awscdk.services.location.CfnPlaceIndex.DataSourceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.location.CfnPlaceIndex.DataSourceConfigurationProperty,
    ) : CdkObject(cdkObject), DataSourceConfigurationProperty {
      override fun intendedUse(): String? = unwrap(this).getIntendedUse()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataSourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnPlaceIndex.DataSourceConfigurationProperty):
          DataSourceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSourceConfigurationProperty):
          software.amazon.awscdk.services.location.CfnPlaceIndex.DataSourceConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.location.CfnPlaceIndex.DataSourceConfigurationProperty
    }
  }
}
