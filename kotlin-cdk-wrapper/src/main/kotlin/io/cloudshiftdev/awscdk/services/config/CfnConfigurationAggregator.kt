@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The details about the configuration aggregator, including information about source accounts,
 * regions, and metadata of the aggregator.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.config.*;
 * CfnConfigurationAggregator cfnConfigurationAggregator =
 * CfnConfigurationAggregator.Builder.create(this, "MyCfnConfigurationAggregator")
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
public open class CfnConfigurationAggregator internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.config.CfnConfigurationAggregator,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.config.CfnConfigurationAggregator(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConfigurationAggregatorProps,
  ) :
      this(software.amazon.awscdk.services.config.CfnConfigurationAggregator(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnConfigurationAggregatorProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConfigurationAggregatorProps.Builder.() -> Unit,
  ) : this(scope, id, CfnConfigurationAggregatorProps(props)
  )

  /**
   * Provides a list of source accounts and regions to be aggregated.
   */
  public open fun accountAggregationSources(): Any? = unwrap(this).getAccountAggregationSources()

  /**
   * Provides a list of source accounts and regions to be aggregated.
   */
  public open fun accountAggregationSources(`value`: IResolvable) {
    unwrap(this).setAccountAggregationSources(`value`.let(IResolvable::unwrap))
  }

  /**
   * Provides a list of source accounts and regions to be aggregated.
   */
  public open fun accountAggregationSources(`value`: List<Any>) {
    unwrap(this).setAccountAggregationSources(`value`)
  }

  /**
   * Provides a list of source accounts and regions to be aggregated.
   */
  public open fun accountAggregationSources(vararg `value`: Any): Unit =
      accountAggregationSources(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the aggregator.
   */
  public open fun attrConfigurationAggregatorArn(): String =
      unwrap(this).getAttrConfigurationAggregatorArn()

  /**
   * The name of the aggregator.
   */
  public open fun configurationAggregatorName(): String? =
      unwrap(this).getConfigurationAggregatorName()

  /**
   * The name of the aggregator.
   */
  public open fun configurationAggregatorName(`value`: String) {
    unwrap(this).setConfigurationAggregatorName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Provides an organization and list of regions to be aggregated.
   */
  public open fun organizationAggregationSource(): Any? =
      unwrap(this).getOrganizationAggregationSource()

  /**
   * Provides an organization and list of regions to be aggregated.
   */
  public open fun organizationAggregationSource(`value`: IResolvable) {
    unwrap(this).setOrganizationAggregationSource(`value`.let(IResolvable::unwrap))
  }

  /**
   * Provides an organization and list of regions to be aggregated.
   */
  public open fun organizationAggregationSource(`value`: OrganizationAggregationSourceProperty) {
    unwrap(this).setOrganizationAggregationSource(`value`.let(OrganizationAggregationSourceProperty::unwrap))
  }

  /**
   * Provides an organization and list of regions to be aggregated.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9bdef1901ccbd580b25b409bdcf63f2a37ecc7ba0bbafb22986193b6ed316df5")
  public open
      fun organizationAggregationSource(`value`: OrganizationAggregationSourceProperty.Builder.() -> Unit):
      Unit = organizationAggregationSource(OrganizationAggregationSourceProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of tag object.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of tag object.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of tag object.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.config.CfnConfigurationAggregator].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Provides a list of source accounts and regions to be aggregated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-accountaggregationsources)
     * @param accountAggregationSources Provides a list of source accounts and regions to be
     * aggregated. 
     */
    public fun accountAggregationSources(accountAggregationSources: IResolvable)

    /**
     * Provides a list of source accounts and regions to be aggregated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-accountaggregationsources)
     * @param accountAggregationSources Provides a list of source accounts and regions to be
     * aggregated. 
     */
    public fun accountAggregationSources(accountAggregationSources: List<Any>)

    /**
     * Provides a list of source accounts and regions to be aggregated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-accountaggregationsources)
     * @param accountAggregationSources Provides a list of source accounts and regions to be
     * aggregated. 
     */
    public fun accountAggregationSources(vararg accountAggregationSources: Any)

    /**
     * The name of the aggregator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-configurationaggregatorname)
     * @param configurationAggregatorName The name of the aggregator. 
     */
    public fun configurationAggregatorName(configurationAggregatorName: String)

    /**
     * Provides an organization and list of regions to be aggregated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-organizationaggregationsource)
     * @param organizationAggregationSource Provides an organization and list of regions to be
     * aggregated. 
     */
    public fun organizationAggregationSource(organizationAggregationSource: IResolvable)

    /**
     * Provides an organization and list of regions to be aggregated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-organizationaggregationsource)
     * @param organizationAggregationSource Provides an organization and list of regions to be
     * aggregated. 
     */
    public
        fun organizationAggregationSource(organizationAggregationSource: OrganizationAggregationSourceProperty)

    /**
     * Provides an organization and list of regions to be aggregated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-organizationaggregationsource)
     * @param organizationAggregationSource Provides an organization and list of regions to be
     * aggregated. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3509e85095ae5bff2927a190fde99bc83d3b089327ecf5c1f27c545eddd03ada")
    public
        fun organizationAggregationSource(organizationAggregationSource: OrganizationAggregationSourceProperty.Builder.() -> Unit)

    /**
     * An array of tag object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-tags)
     * @param tags An array of tag object. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of tag object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-tags)
     * @param tags An array of tag object. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CfnConfigurationAggregator.Builder =
        software.amazon.awscdk.services.config.CfnConfigurationAggregator.Builder.create(scope, id)

    /**
     * Provides a list of source accounts and regions to be aggregated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-accountaggregationsources)
     * @param accountAggregationSources Provides a list of source accounts and regions to be
     * aggregated. 
     */
    override fun accountAggregationSources(accountAggregationSources: IResolvable) {
      cdkBuilder.accountAggregationSources(accountAggregationSources.let(IResolvable::unwrap))
    }

    /**
     * Provides a list of source accounts and regions to be aggregated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-accountaggregationsources)
     * @param accountAggregationSources Provides a list of source accounts and regions to be
     * aggregated. 
     */
    override fun accountAggregationSources(accountAggregationSources: List<Any>) {
      cdkBuilder.accountAggregationSources(accountAggregationSources)
    }

    /**
     * Provides a list of source accounts and regions to be aggregated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-accountaggregationsources)
     * @param accountAggregationSources Provides a list of source accounts and regions to be
     * aggregated. 
     */
    override fun accountAggregationSources(vararg accountAggregationSources: Any): Unit =
        accountAggregationSources(accountAggregationSources.toList())

    /**
     * The name of the aggregator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-configurationaggregatorname)
     * @param configurationAggregatorName The name of the aggregator. 
     */
    override fun configurationAggregatorName(configurationAggregatorName: String) {
      cdkBuilder.configurationAggregatorName(configurationAggregatorName)
    }

    /**
     * Provides an organization and list of regions to be aggregated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-organizationaggregationsource)
     * @param organizationAggregationSource Provides an organization and list of regions to be
     * aggregated. 
     */
    override fun organizationAggregationSource(organizationAggregationSource: IResolvable) {
      cdkBuilder.organizationAggregationSource(organizationAggregationSource.let(IResolvable::unwrap))
    }

    /**
     * Provides an organization and list of regions to be aggregated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-organizationaggregationsource)
     * @param organizationAggregationSource Provides an organization and list of regions to be
     * aggregated. 
     */
    override
        fun organizationAggregationSource(organizationAggregationSource: OrganizationAggregationSourceProperty) {
      cdkBuilder.organizationAggregationSource(organizationAggregationSource.let(OrganizationAggregationSourceProperty::unwrap))
    }

    /**
     * Provides an organization and list of regions to be aggregated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-organizationaggregationsource)
     * @param organizationAggregationSource Provides an organization and list of regions to be
     * aggregated. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3509e85095ae5bff2927a190fde99bc83d3b089327ecf5c1f27c545eddd03ada")
    override
        fun organizationAggregationSource(organizationAggregationSource: OrganizationAggregationSourceProperty.Builder.() -> Unit):
        Unit =
        organizationAggregationSource(OrganizationAggregationSourceProperty(organizationAggregationSource))

    /**
     * An array of tag object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-tags)
     * @param tags An array of tag object. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of tag object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configurationaggregator.html#cfn-config-configurationaggregator-tags)
     * @param tags An array of tag object. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.config.CfnConfigurationAggregator =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.config.CfnConfigurationAggregator.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfigurationAggregator {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfigurationAggregator(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationAggregator):
        CfnConfigurationAggregator = CfnConfigurationAggregator(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationAggregator):
        software.amazon.awscdk.services.config.CfnConfigurationAggregator = wrapped.cdkObject
  }

  /**
   * This object contains regions to set up the aggregator and an IAM role to retrieve organization
   * details.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.config.*;
   * OrganizationAggregationSourceProperty organizationAggregationSourceProperty =
   * OrganizationAggregationSourceProperty.builder()
   * .roleArn("roleArn")
   * // the properties below are optional
   * .allAwsRegions(false)
   * .awsRegions(List.of("awsRegions"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html)
   */
  public interface OrganizationAggregationSourceProperty {
    /**
     * If true, aggregate existing AWS Config regions and future regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-allawsregions)
     */
    public fun allAwsRegions(): Any? = unwrap(this).getAllAwsRegions()

    /**
     * The source regions being aggregated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-awsregions)
     */
    public fun awsRegions(): List<String> = unwrap(this).getAwsRegions() ?: emptyList()

    /**
     * ARN of the IAM role used to retrieve AWS Organizations details associated with the aggregator
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [OrganizationAggregationSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allAwsRegions If true, aggregate existing AWS Config regions and future regions.
       */
      public fun allAwsRegions(allAwsRegions: Boolean)

      /**
       * @param allAwsRegions If true, aggregate existing AWS Config regions and future regions.
       */
      public fun allAwsRegions(allAwsRegions: IResolvable)

      /**
       * @param awsRegions The source regions being aggregated.
       */
      public fun awsRegions(awsRegions: List<String>)

      /**
       * @param awsRegions The source regions being aggregated.
       */
      public fun awsRegions(vararg awsRegions: String)

      /**
       * @param roleArn ARN of the IAM role used to retrieve AWS Organizations details associated
       * with the aggregator account. 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty.builder()

      /**
       * @param allAwsRegions If true, aggregate existing AWS Config regions and future regions.
       */
      override fun allAwsRegions(allAwsRegions: Boolean) {
        cdkBuilder.allAwsRegions(allAwsRegions)
      }

      /**
       * @param allAwsRegions If true, aggregate existing AWS Config regions and future regions.
       */
      override fun allAwsRegions(allAwsRegions: IResolvable) {
        cdkBuilder.allAwsRegions(allAwsRegions.let(IResolvable::unwrap))
      }

      /**
       * @param awsRegions The source regions being aggregated.
       */
      override fun awsRegions(awsRegions: List<String>) {
        cdkBuilder.awsRegions(awsRegions)
      }

      /**
       * @param awsRegions The source regions being aggregated.
       */
      override fun awsRegions(vararg awsRegions: String): Unit = awsRegions(awsRegions.toList())

      /**
       * @param roleArn ARN of the IAM role used to retrieve AWS Organizations details associated
       * with the aggregator account. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty,
    ) : CdkObject(cdkObject), OrganizationAggregationSourceProperty {
      /**
       * If true, aggregate existing AWS Config regions and future regions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-allawsregions)
       */
      override fun allAwsRegions(): Any? = unwrap(this).getAllAwsRegions()

      /**
       * The source regions being aggregated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-awsregions)
       */
      override fun awsRegions(): List<String> = unwrap(this).getAwsRegions() ?: emptyList()

      /**
       * ARN of the IAM role used to retrieve AWS Organizations details associated with the
       * aggregator account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-organizationaggregationsource.html#cfn-config-configurationaggregator-organizationaggregationsource-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OrganizationAggregationSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty):
          OrganizationAggregationSourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OrganizationAggregationSourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OrganizationAggregationSourceProperty):
          software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty
    }
  }

  /**
   * A collection of accounts and regions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.config.*;
   * AccountAggregationSourceProperty accountAggregationSourceProperty =
   * AccountAggregationSourceProperty.builder()
   * .accountIds(List.of("accountIds"))
   * // the properties below are optional
   * .allAwsRegions(false)
   * .awsRegions(List.of("awsRegions"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html)
   */
  public interface AccountAggregationSourceProperty {
    /**
     * The 12-digit account ID of the account being aggregated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-accountids)
     */
    public fun accountIds(): List<String>

    /**
     * If true, aggregate existing AWS Config regions and future regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-allawsregions)
     */
    public fun allAwsRegions(): Any? = unwrap(this).getAllAwsRegions()

    /**
     * The source regions being aggregated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-awsregions)
     */
    public fun awsRegions(): List<String> = unwrap(this).getAwsRegions() ?: emptyList()

    /**
     * A builder for [AccountAggregationSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accountIds The 12-digit account ID of the account being aggregated. 
       */
      public fun accountIds(accountIds: List<String>)

      /**
       * @param accountIds The 12-digit account ID of the account being aggregated. 
       */
      public fun accountIds(vararg accountIds: String)

      /**
       * @param allAwsRegions If true, aggregate existing AWS Config regions and future regions.
       */
      public fun allAwsRegions(allAwsRegions: Boolean)

      /**
       * @param allAwsRegions If true, aggregate existing AWS Config regions and future regions.
       */
      public fun allAwsRegions(allAwsRegions: IResolvable)

      /**
       * @param awsRegions The source regions being aggregated.
       */
      public fun awsRegions(awsRegions: List<String>)

      /**
       * @param awsRegions The source regions being aggregated.
       */
      public fun awsRegions(vararg awsRegions: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.config.CfnConfigurationAggregator.AccountAggregationSourceProperty.Builder
          =
          software.amazon.awscdk.services.config.CfnConfigurationAggregator.AccountAggregationSourceProperty.builder()

      /**
       * @param accountIds The 12-digit account ID of the account being aggregated. 
       */
      override fun accountIds(accountIds: List<String>) {
        cdkBuilder.accountIds(accountIds)
      }

      /**
       * @param accountIds The 12-digit account ID of the account being aggregated. 
       */
      override fun accountIds(vararg accountIds: String): Unit = accountIds(accountIds.toList())

      /**
       * @param allAwsRegions If true, aggregate existing AWS Config regions and future regions.
       */
      override fun allAwsRegions(allAwsRegions: Boolean) {
        cdkBuilder.allAwsRegions(allAwsRegions)
      }

      /**
       * @param allAwsRegions If true, aggregate existing AWS Config regions and future regions.
       */
      override fun allAwsRegions(allAwsRegions: IResolvable) {
        cdkBuilder.allAwsRegions(allAwsRegions.let(IResolvable::unwrap))
      }

      /**
       * @param awsRegions The source regions being aggregated.
       */
      override fun awsRegions(awsRegions: List<String>) {
        cdkBuilder.awsRegions(awsRegions)
      }

      /**
       * @param awsRegions The source regions being aggregated.
       */
      override fun awsRegions(vararg awsRegions: String): Unit = awsRegions(awsRegions.toList())

      public fun build():
          software.amazon.awscdk.services.config.CfnConfigurationAggregator.AccountAggregationSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.config.CfnConfigurationAggregator.AccountAggregationSourceProperty,
    ) : CdkObject(cdkObject), AccountAggregationSourceProperty {
      /**
       * The 12-digit account ID of the account being aggregated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-accountids)
       */
      override fun accountIds(): List<String> = unwrap(this).getAccountIds()

      /**
       * If true, aggregate existing AWS Config regions and future regions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-allawsregions)
       */
      override fun allAwsRegions(): Any? = unwrap(this).getAllAwsRegions()

      /**
       * The source regions being aggregated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configurationaggregator-accountaggregationsource.html#cfn-config-configurationaggregator-accountaggregationsource-awsregions)
       */
      override fun awsRegions(): List<String> = unwrap(this).getAwsRegions() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccountAggregationSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnConfigurationAggregator.AccountAggregationSourceProperty):
          AccountAggregationSourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AccountAggregationSourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccountAggregationSourceProperty):
          software.amazon.awscdk.services.config.CfnConfigurationAggregator.AccountAggregationSourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.config.CfnConfigurationAggregator.AccountAggregationSourceProperty
    }
  }
}
