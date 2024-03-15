@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnConfigurationAggregatorProps {
  public fun accountAggregationSources(): Any? = unwrap(this).getAccountAggregationSources()

  public fun configurationAggregatorName(): String? = unwrap(this).getConfigurationAggregatorName()

  public fun organizationAggregationSource(): Any? = unwrap(this).getOrganizationAggregationSource()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun accountAggregationSources(accountAggregationSources: IResolvable)

    public fun accountAggregationSources(accountAggregationSources: List<Any>)

    public fun accountAggregationSources(vararg accountAggregationSources: Any)

    public fun configurationAggregatorName(configurationAggregatorName: String)

    public fun organizationAggregationSource(organizationAggregationSource: IResolvable)

    public
        fun organizationAggregationSource(organizationAggregationSource: CfnConfigurationAggregator.OrganizationAggregationSourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d3984ca7a68f5c2b1d5578783e43eef73636bc30b0009b9303a3aedbdf3c252")
    public
        fun organizationAggregationSource(organizationAggregationSource: CfnConfigurationAggregator.OrganizationAggregationSourceProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps.Builder =
        software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps.builder()

    override fun accountAggregationSources(accountAggregationSources: IResolvable) {
      cdkBuilder.accountAggregationSources(accountAggregationSources.let(IResolvable::unwrap))
    }

    override fun accountAggregationSources(accountAggregationSources: List<Any>) {
      cdkBuilder.accountAggregationSources(accountAggregationSources)
    }

    override fun accountAggregationSources(vararg accountAggregationSources: Any): Unit =
        accountAggregationSources(accountAggregationSources.toList())

    override fun configurationAggregatorName(configurationAggregatorName: String) {
      cdkBuilder.configurationAggregatorName(configurationAggregatorName)
    }

    override fun organizationAggregationSource(organizationAggregationSource: IResolvable) {
      cdkBuilder.organizationAggregationSource(organizationAggregationSource.let(IResolvable::unwrap))
    }

    override
        fun organizationAggregationSource(organizationAggregationSource: CfnConfigurationAggregator.OrganizationAggregationSourceProperty) {
      cdkBuilder.organizationAggregationSource(organizationAggregationSource.let(CfnConfigurationAggregator.OrganizationAggregationSourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d3984ca7a68f5c2b1d5578783e43eef73636bc30b0009b9303a3aedbdf3c252")
    override
        fun organizationAggregationSource(organizationAggregationSource: CfnConfigurationAggregator.OrganizationAggregationSourceProperty.Builder.() -> Unit):
        Unit =
        organizationAggregationSource(CfnConfigurationAggregator.OrganizationAggregationSourceProperty(organizationAggregationSource))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps,
  ) : CdkObject(cdkObject), CfnConfigurationAggregatorProps {
    override fun accountAggregationSources(): Any? = unwrap(this).getAccountAggregationSources()

    override fun configurationAggregatorName(): String? =
        unwrap(this).getConfigurationAggregatorName()

    override fun organizationAggregationSource(): Any? =
        unwrap(this).getOrganizationAggregationSource()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfigurationAggregatorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps):
        CfnConfigurationAggregatorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationAggregatorProps):
        software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps
  }
}
