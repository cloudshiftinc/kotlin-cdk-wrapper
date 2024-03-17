@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnConfigurationAggregator`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.config.*;
 * CfnConfigurationAggregatorProps cfnConfigurationAggregatorProps =
 * CfnConfigurationAggregatorProps.builder()
 * .accountAggregationSources(List.of(AccountAggregationSourceProperty.builder()
 * .accountIds(List.of("accountIds"))
 * // the properties below are optional
 * .allAwsRegions(false)
 * .awsRegions(List.of("awsRegions"))
 * .build()))
 * .configurationAggregatorName("configurationAggregatorName")
 * .organizationAggregationSource(OrganizationAggregationSourceProperty.builder()
 * .roleArn("roleArn")
 * // the properties below are optional
 * .allAwsRegions(false)
 * .awsRegions(List.of("awsRegions"))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html)
 */
public interface CfnConfigurationAggregatorProps {
  /**
   * Provides a list of source accounts and regions to be aggregated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-accountaggregationsources)
   */
  public fun accountAggregationSources(): Any? = unwrap(this).getAccountAggregationSources()

  /**
   * The name of the aggregator.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-configurationaggregatorname)
   */
  public fun configurationAggregatorName(): String? = unwrap(this).getConfigurationAggregatorName()

  /**
   * Provides an organization and list of regions to be aggregated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-organizationaggregationsource)
   */
  public fun organizationAggregationSource(): Any? = unwrap(this).getOrganizationAggregationSource()

  /**
   * An array of tag object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnConfigurationAggregatorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accountAggregationSources Provides a list of source accounts and regions to be
     * aggregated.
     */
    public fun accountAggregationSources(accountAggregationSources: IResolvable)

    /**
     * @param accountAggregationSources Provides a list of source accounts and regions to be
     * aggregated.
     */
    public fun accountAggregationSources(accountAggregationSources: List<Any>)

    /**
     * @param accountAggregationSources Provides a list of source accounts and regions to be
     * aggregated.
     */
    public fun accountAggregationSources(vararg accountAggregationSources: Any)

    /**
     * @param configurationAggregatorName The name of the aggregator.
     */
    public fun configurationAggregatorName(configurationAggregatorName: String)

    /**
     * @param organizationAggregationSource Provides an organization and list of regions to be
     * aggregated.
     */
    public fun organizationAggregationSource(organizationAggregationSource: IResolvable)

    /**
     * @param organizationAggregationSource Provides an organization and list of regions to be
     * aggregated.
     */
    public
        fun organizationAggregationSource(organizationAggregationSource: CfnConfigurationAggregator.OrganizationAggregationSourceProperty)

    /**
     * @param organizationAggregationSource Provides an organization and list of regions to be
     * aggregated.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d3984ca7a68f5c2b1d5578783e43eef73636bc30b0009b9303a3aedbdf3c252")
    public
        fun organizationAggregationSource(organizationAggregationSource: CfnConfigurationAggregator.OrganizationAggregationSourceProperty.Builder.() -> Unit)

    /**
     * @param tags An array of tag object.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of tag object.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps.Builder =
        software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps.builder()

    /**
     * @param accountAggregationSources Provides a list of source accounts and regions to be
     * aggregated.
     */
    override fun accountAggregationSources(accountAggregationSources: IResolvable) {
      cdkBuilder.accountAggregationSources(accountAggregationSources.let(IResolvable::unwrap))
    }

    /**
     * @param accountAggregationSources Provides a list of source accounts and regions to be
     * aggregated.
     */
    override fun accountAggregationSources(accountAggregationSources: List<Any>) {
      cdkBuilder.accountAggregationSources(accountAggregationSources)
    }

    /**
     * @param accountAggregationSources Provides a list of source accounts and regions to be
     * aggregated.
     */
    override fun accountAggregationSources(vararg accountAggregationSources: Any): Unit =
        accountAggregationSources(accountAggregationSources.toList())

    /**
     * @param configurationAggregatorName The name of the aggregator.
     */
    override fun configurationAggregatorName(configurationAggregatorName: String) {
      cdkBuilder.configurationAggregatorName(configurationAggregatorName)
    }

    /**
     * @param organizationAggregationSource Provides an organization and list of regions to be
     * aggregated.
     */
    override fun organizationAggregationSource(organizationAggregationSource: IResolvable) {
      cdkBuilder.organizationAggregationSource(organizationAggregationSource.let(IResolvable::unwrap))
    }

    /**
     * @param organizationAggregationSource Provides an organization and list of regions to be
     * aggregated.
     */
    override
        fun organizationAggregationSource(organizationAggregationSource: CfnConfigurationAggregator.OrganizationAggregationSourceProperty) {
      cdkBuilder.organizationAggregationSource(organizationAggregationSource.let(CfnConfigurationAggregator.OrganizationAggregationSourceProperty::unwrap))
    }

    /**
     * @param organizationAggregationSource Provides an organization and list of regions to be
     * aggregated.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d3984ca7a68f5c2b1d5578783e43eef73636bc30b0009b9303a3aedbdf3c252")
    override
        fun organizationAggregationSource(organizationAggregationSource: CfnConfigurationAggregator.OrganizationAggregationSourceProperty.Builder.() -> Unit):
        Unit =
        organizationAggregationSource(CfnConfigurationAggregator.OrganizationAggregationSourceProperty(organizationAggregationSource))

    /**
     * @param tags An array of tag object.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of tag object.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps,
  ) : CdkObject(cdkObject), CfnConfigurationAggregatorProps {
    /**
     * Provides a list of source accounts and regions to be aggregated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-accountaggregationsources)
     */
    override fun accountAggregationSources(): Any? = unwrap(this).getAccountAggregationSources()

    /**
     * The name of the aggregator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-configurationaggregatorname)
     */
    override fun configurationAggregatorName(): String? =
        unwrap(this).getConfigurationAggregatorName()

    /**
     * Provides an organization and list of regions to be aggregated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-organizationaggregationsource)
     */
    override fun organizationAggregationSource(): Any? =
        unwrap(this).getOrganizationAggregationSource()

    /**
     * An array of tag object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfigurationAggregatorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps):
        CfnConfigurationAggregatorProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnConfigurationAggregatorProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationAggregatorProps):
        software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps
  }
}
