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

public interface CfnPlaceIndexProps {
  public fun dataSource(): String

  public fun dataSourceConfiguration(): Any? = unwrap(this).getDataSourceConfiguration()

  public fun description(): String? = unwrap(this).getDescription()

  public fun indexName(): String

  public fun pricingPlan(): String? = unwrap(this).getPricingPlan()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun dataSource(dataSource: String)

    public fun dataSourceConfiguration(dataSourceConfiguration: IResolvable)

    public
        fun dataSourceConfiguration(dataSourceConfiguration: CfnPlaceIndex.DataSourceConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd1472f42113b3548b0b4141ecc1547e890bf0c79767481109caaba7abca7a42")
    public
        fun dataSourceConfiguration(dataSourceConfiguration: CfnPlaceIndex.DataSourceConfigurationProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun indexName(indexName: String)

    public fun pricingPlan(pricingPlan: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.location.CfnPlaceIndexProps.Builder =
        software.amazon.awscdk.services.location.CfnPlaceIndexProps.builder()

    override fun dataSource(dataSource: String) {
      cdkBuilder.dataSource(dataSource)
    }

    override fun dataSourceConfiguration(dataSourceConfiguration: IResolvable) {
      cdkBuilder.dataSourceConfiguration(dataSourceConfiguration.let(IResolvable::unwrap))
    }

    override
        fun dataSourceConfiguration(dataSourceConfiguration: CfnPlaceIndex.DataSourceConfigurationProperty) {
      cdkBuilder.dataSourceConfiguration(dataSourceConfiguration.let(CfnPlaceIndex.DataSourceConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd1472f42113b3548b0b4141ecc1547e890bf0c79767481109caaba7abca7a42")
    override
        fun dataSourceConfiguration(dataSourceConfiguration: CfnPlaceIndex.DataSourceConfigurationProperty.Builder.() -> Unit):
        Unit =
        dataSourceConfiguration(CfnPlaceIndex.DataSourceConfigurationProperty(dataSourceConfiguration))

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

    public fun build(): software.amazon.awscdk.services.location.CfnPlaceIndexProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.location.CfnPlaceIndexProps,
  ) : CdkObject(cdkObject), CfnPlaceIndexProps {
    override fun dataSource(): String = unwrap(this).getDataSource()

    override fun dataSourceConfiguration(): Any? = unwrap(this).getDataSourceConfiguration()

    override fun description(): String? = unwrap(this).getDescription()

    override fun indexName(): String = unwrap(this).getIndexName()

    override fun pricingPlan(): String? = unwrap(this).getPricingPlan()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPlaceIndexProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnPlaceIndexProps):
        CfnPlaceIndexProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPlaceIndexProps):
        software.amazon.awscdk.services.location.CfnPlaceIndexProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.location.CfnPlaceIndexProps
  }
}
