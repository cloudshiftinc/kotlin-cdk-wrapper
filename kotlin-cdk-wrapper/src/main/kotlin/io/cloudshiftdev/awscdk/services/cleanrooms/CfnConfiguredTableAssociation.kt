@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cleanrooms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a configured table association.
 *
 * A configured table association links a configured table with a collaboration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
 * CfnConfiguredTableAssociation cfnConfiguredTableAssociation =
 * CfnConfiguredTableAssociation.Builder.create(this, "MyCfnConfiguredTableAssociation")
 * .configuredTableIdentifier("configuredTableIdentifier")
 * .membershipIdentifier("membershipIdentifier")
 * .name("name")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .configuredTableAssociationAnalysisRules(List.of(ConfiguredTableAssociationAnalysisRuleProperty.builder()
 * .policy(ConfiguredTableAssociationAnalysisRulePolicyProperty.builder()
 * .v1(ConfiguredTableAssociationAnalysisRulePolicyV1Property.builder()
 * .aggregation(ConfiguredTableAssociationAnalysisRuleAggregationProperty.builder()
 * .allowedAdditionalAnalyses(List.of("allowedAdditionalAnalyses"))
 * .allowedResultReceivers(List.of("allowedResultReceivers"))
 * .build())
 * .custom(ConfiguredTableAssociationAnalysisRuleCustomProperty.builder()
 * .allowedAdditionalAnalyses(List.of("allowedAdditionalAnalyses"))
 * .allowedResultReceivers(List.of("allowedResultReceivers"))
 * .build())
 * .list(ConfiguredTableAssociationAnalysisRuleListProperty.builder()
 * .allowedAdditionalAnalyses(List.of("allowedAdditionalAnalyses"))
 * .allowedResultReceivers(List.of("allowedResultReceivers"))
 * .build())
 * .build())
 * .build())
 * .type("type")
 * .build()))
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html)
 */
public open class CfnConfiguredTableAssociation(
  cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConfiguredTableAssociationProps,
  ) :
      this(software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnConfiguredTableAssociationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConfiguredTableAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnConfiguredTableAssociationProps(props)
  )

  /**
   * Returns the Amazon Resource Name (ARN) of the specified configured table association.
   *
   * Example:
   * `arn:aws:cleanrooms:us-east-1:111122223333:configuredtable/a1b2c3d4-5678-90ab-cdef-EXAMPLE33333`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Returns the unique identifier of the specified configured table association.
   *
   * Example: `a1b2c3d4-5678-90ab-cdef-EXAMPLE33333`
   */
  public open fun attrConfiguredTableAssociationIdentifier(): String =
      unwrap(this).getAttrConfiguredTableAssociationIdentifier()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * An analysis rule for a configured table association.
   */
  public open fun configuredTableAssociationAnalysisRules(): Any? =
      unwrap(this).getConfiguredTableAssociationAnalysisRules()

  /**
   * An analysis rule for a configured table association.
   */
  public open fun configuredTableAssociationAnalysisRules(`value`: IResolvable) {
    unwrap(this).setConfiguredTableAssociationAnalysisRules(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An analysis rule for a configured table association.
   */
  public open fun configuredTableAssociationAnalysisRules(`value`: List<Any>) {
    unwrap(this).setConfiguredTableAssociationAnalysisRules(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * An analysis rule for a configured table association.
   */
  public open fun configuredTableAssociationAnalysisRules(vararg `value`: Any): Unit =
      configuredTableAssociationAnalysisRules(`value`.toList())

  /**
   * A unique identifier for the configured table to be associated to.
   */
  public open fun configuredTableIdentifier(): String = unwrap(this).getConfiguredTableIdentifier()

  /**
   * A unique identifier for the configured table to be associated to.
   */
  public open fun configuredTableIdentifier(`value`: String) {
    unwrap(this).setConfiguredTableIdentifier(`value`)
  }

  /**
   * A description of the configured table association.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the configured table association.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The unique ID for the membership this configured table association belongs to.
   */
  public open fun membershipIdentifier(): String = unwrap(this).getMembershipIdentifier()

  /**
   * The unique ID for the membership this configured table association belongs to.
   */
  public open fun membershipIdentifier(`value`: String) {
    unwrap(this).setMembershipIdentifier(`value`)
  }

  /**
   * The name of the configured table association, in lowercase.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the configured table association, in lowercase.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The service will assume this role to access catalog metadata and query the table.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The service will assume this role to access catalog metadata and query the table.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * An optional label that you can assign to a resource when you create it.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An optional label that you can assign to a resource when you create it.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An optional label that you can assign to a resource when you create it.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.cleanrooms.CfnConfiguredTableAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An analysis rule for a configured table association.
     *
     * This analysis rule specifies how data from the table can be used within its associated
     * collaboration. In the console, the `ConfiguredTableAssociationAnalysisRule` is referred to as
     * the *collaboration analysis rule* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrules)
     * @param configuredTableAssociationAnalysisRules An analysis rule for a configured table
     * association. 
     */
    public
        fun configuredTableAssociationAnalysisRules(configuredTableAssociationAnalysisRules: IResolvable)

    /**
     * An analysis rule for a configured table association.
     *
     * This analysis rule specifies how data from the table can be used within its associated
     * collaboration. In the console, the `ConfiguredTableAssociationAnalysisRule` is referred to as
     * the *collaboration analysis rule* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrules)
     * @param configuredTableAssociationAnalysisRules An analysis rule for a configured table
     * association. 
     */
    public
        fun configuredTableAssociationAnalysisRules(configuredTableAssociationAnalysisRules: List<Any>)

    /**
     * An analysis rule for a configured table association.
     *
     * This analysis rule specifies how data from the table can be used within its associated
     * collaboration. In the console, the `ConfiguredTableAssociationAnalysisRule` is referred to as
     * the *collaboration analysis rule* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrules)
     * @param configuredTableAssociationAnalysisRules An analysis rule for a configured table
     * association. 
     */
    public fun configuredTableAssociationAnalysisRules(vararg
        configuredTableAssociationAnalysisRules: Any)

    /**
     * A unique identifier for the configured table to be associated to.
     *
     * Currently accepts a configured table ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-configuredtableidentifier)
     * @param configuredTableIdentifier A unique identifier for the configured table to be
     * associated to. 
     */
    public fun configuredTableIdentifier(configuredTableIdentifier: String)

    /**
     * A description of the configured table association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-description)
     * @param description A description of the configured table association. 
     */
    public fun description(description: String)

    /**
     * The unique ID for the membership this configured table association belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-membershipidentifier)
     * @param membershipIdentifier The unique ID for the membership this configured table
     * association belongs to. 
     */
    public fun membershipIdentifier(membershipIdentifier: String)

    /**
     * The name of the configured table association, in lowercase.
     *
     * The table is identified by this name when running protected queries against the underlying
     * data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-name)
     * @param name The name of the configured table association, in lowercase. 
     */
    public fun name(name: String)

    /**
     * The service will assume this role to access catalog metadata and query the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-rolearn)
     * @param roleArn The service will assume this role to access catalog metadata and query the
     * table. 
     */
    public fun roleArn(roleArn: String)

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-tags)
     * @param tags An optional label that you can assign to a resource when you create it. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-tags)
     * @param tags An optional label that you can assign to a resource when you create it. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.Builder.create(scope,
        id)

    /**
     * An analysis rule for a configured table association.
     *
     * This analysis rule specifies how data from the table can be used within its associated
     * collaboration. In the console, the `ConfiguredTableAssociationAnalysisRule` is referred to as
     * the *collaboration analysis rule* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrules)
     * @param configuredTableAssociationAnalysisRules An analysis rule for a configured table
     * association. 
     */
    override
        fun configuredTableAssociationAnalysisRules(configuredTableAssociationAnalysisRules: IResolvable) {
      cdkBuilder.configuredTableAssociationAnalysisRules(configuredTableAssociationAnalysisRules.let(IResolvable.Companion::unwrap))
    }

    /**
     * An analysis rule for a configured table association.
     *
     * This analysis rule specifies how data from the table can be used within its associated
     * collaboration. In the console, the `ConfiguredTableAssociationAnalysisRule` is referred to as
     * the *collaboration analysis rule* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrules)
     * @param configuredTableAssociationAnalysisRules An analysis rule for a configured table
     * association. 
     */
    override
        fun configuredTableAssociationAnalysisRules(configuredTableAssociationAnalysisRules: List<Any>) {
      cdkBuilder.configuredTableAssociationAnalysisRules(configuredTableAssociationAnalysisRules.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * An analysis rule for a configured table association.
     *
     * This analysis rule specifies how data from the table can be used within its associated
     * collaboration. In the console, the `ConfiguredTableAssociationAnalysisRule` is referred to as
     * the *collaboration analysis rule* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrules)
     * @param configuredTableAssociationAnalysisRules An analysis rule for a configured table
     * association. 
     */
    override fun configuredTableAssociationAnalysisRules(vararg
        configuredTableAssociationAnalysisRules: Any): Unit =
        configuredTableAssociationAnalysisRules(configuredTableAssociationAnalysisRules.toList())

    /**
     * A unique identifier for the configured table to be associated to.
     *
     * Currently accepts a configured table ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-configuredtableidentifier)
     * @param configuredTableIdentifier A unique identifier for the configured table to be
     * associated to. 
     */
    override fun configuredTableIdentifier(configuredTableIdentifier: String) {
      cdkBuilder.configuredTableIdentifier(configuredTableIdentifier)
    }

    /**
     * A description of the configured table association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-description)
     * @param description A description of the configured table association. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The unique ID for the membership this configured table association belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-membershipidentifier)
     * @param membershipIdentifier The unique ID for the membership this configured table
     * association belongs to. 
     */
    override fun membershipIdentifier(membershipIdentifier: String) {
      cdkBuilder.membershipIdentifier(membershipIdentifier)
    }

    /**
     * The name of the configured table association, in lowercase.
     *
     * The table is identified by this name when running protected queries against the underlying
     * data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-name)
     * @param name The name of the configured table association, in lowercase. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The service will assume this role to access catalog metadata and query the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-rolearn)
     * @param roleArn The service will assume this role to access catalog metadata and query the
     * table. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-tags)
     * @param tags An optional label that you can assign to a resource when you create it. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-tags)
     * @param tags An optional label that you can assign to a resource when you create it. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfiguredTableAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfiguredTableAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation):
        CfnConfiguredTableAssociation = CfnConfiguredTableAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnConfiguredTableAssociation):
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation = wrapped.cdkObject
        as software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation
  }

  /**
   * The configured table association analysis rule applied to a configured table with the
   * aggregation analysis rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * ConfiguredTableAssociationAnalysisRuleAggregationProperty
   * configuredTableAssociationAnalysisRuleAggregationProperty =
   * ConfiguredTableAssociationAnalysisRuleAggregationProperty.builder()
   * .allowedAdditionalAnalyses(List.of("allowedAdditionalAnalyses"))
   * .allowedResultReceivers(List.of("allowedResultReceivers"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisruleaggregation.html)
   */
  public interface ConfiguredTableAssociationAnalysisRuleAggregationProperty {
    /**
     * The list of resources or wildcards (ARNs) that are allowed to perform additional analysis on
     * query output.
     *
     * The `allowedAdditionalAnalyses` parameter is currently supported for the list analysis rule (
     * `AnalysisRuleList` ) and the custom analysis rule ( `AnalysisRuleCustom` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisruleaggregation.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisruleaggregation-allowedadditionalanalyses)
     */
    public fun allowedAdditionalAnalyses(): List<String> =
        unwrap(this).getAllowedAdditionalAnalyses() ?: emptyList()

    /**
     * The list of collaboration members who are allowed to receive results of queries run with this
     * configured table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisruleaggregation.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisruleaggregation-allowedresultreceivers)
     */
    public fun allowedResultReceivers(): List<String> = unwrap(this).getAllowedResultReceivers() ?:
        emptyList()

    /**
     * A builder for [ConfiguredTableAssociationAnalysisRuleAggregationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowedAdditionalAnalyses The list of resources or wildcards (ARNs) that are allowed
       * to perform additional analysis on query output.
       * The `allowedAdditionalAnalyses` parameter is currently supported for the list analysis rule
       * ( `AnalysisRuleList` ) and the custom analysis rule ( `AnalysisRuleCustom` ).
       */
      public fun allowedAdditionalAnalyses(allowedAdditionalAnalyses: List<String>)

      /**
       * @param allowedAdditionalAnalyses The list of resources or wildcards (ARNs) that are allowed
       * to perform additional analysis on query output.
       * The `allowedAdditionalAnalyses` parameter is currently supported for the list analysis rule
       * ( `AnalysisRuleList` ) and the custom analysis rule ( `AnalysisRuleCustom` ).
       */
      public fun allowedAdditionalAnalyses(vararg allowedAdditionalAnalyses: String)

      /**
       * @param allowedResultReceivers The list of collaboration members who are allowed to receive
       * results of queries run with this configured table.
       */
      public fun allowedResultReceivers(allowedResultReceivers: List<String>)

      /**
       * @param allowedResultReceivers The list of collaboration members who are allowed to receive
       * results of queries run with this configured table.
       */
      public fun allowedResultReceivers(vararg allowedResultReceivers: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleAggregationProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleAggregationProperty.builder()

      /**
       * @param allowedAdditionalAnalyses The list of resources or wildcards (ARNs) that are allowed
       * to perform additional analysis on query output.
       * The `allowedAdditionalAnalyses` parameter is currently supported for the list analysis rule
       * ( `AnalysisRuleList` ) and the custom analysis rule ( `AnalysisRuleCustom` ).
       */
      override fun allowedAdditionalAnalyses(allowedAdditionalAnalyses: List<String>) {
        cdkBuilder.allowedAdditionalAnalyses(allowedAdditionalAnalyses)
      }

      /**
       * @param allowedAdditionalAnalyses The list of resources or wildcards (ARNs) that are allowed
       * to perform additional analysis on query output.
       * The `allowedAdditionalAnalyses` parameter is currently supported for the list analysis rule
       * ( `AnalysisRuleList` ) and the custom analysis rule ( `AnalysisRuleCustom` ).
       */
      override fun allowedAdditionalAnalyses(vararg allowedAdditionalAnalyses: String): Unit =
          allowedAdditionalAnalyses(allowedAdditionalAnalyses.toList())

      /**
       * @param allowedResultReceivers The list of collaboration members who are allowed to receive
       * results of queries run with this configured table.
       */
      override fun allowedResultReceivers(allowedResultReceivers: List<String>) {
        cdkBuilder.allowedResultReceivers(allowedResultReceivers)
      }

      /**
       * @param allowedResultReceivers The list of collaboration members who are allowed to receive
       * results of queries run with this configured table.
       */
      override fun allowedResultReceivers(vararg allowedResultReceivers: String): Unit =
          allowedResultReceivers(allowedResultReceivers.toList())

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleAggregationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleAggregationProperty,
    ) : CdkObject(cdkObject),
        ConfiguredTableAssociationAnalysisRuleAggregationProperty {
      /**
       * The list of resources or wildcards (ARNs) that are allowed to perform additional analysis
       * on query output.
       *
       * The `allowedAdditionalAnalyses` parameter is currently supported for the list analysis rule
       * ( `AnalysisRuleList` ) and the custom analysis rule ( `AnalysisRuleCustom` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisruleaggregation.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisruleaggregation-allowedadditionalanalyses)
       */
      override fun allowedAdditionalAnalyses(): List<String> =
          unwrap(this).getAllowedAdditionalAnalyses() ?: emptyList()

      /**
       * The list of collaboration members who are allowed to receive results of queries run with
       * this configured table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisruleaggregation.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisruleaggregation-allowedresultreceivers)
       */
      override fun allowedResultReceivers(): List<String> = unwrap(this).getAllowedResultReceivers()
          ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfiguredTableAssociationAnalysisRuleAggregationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleAggregationProperty):
          ConfiguredTableAssociationAnalysisRuleAggregationProperty =
          CdkObjectWrappers.wrap(cdkObject) as?
          ConfiguredTableAssociationAnalysisRuleAggregationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfiguredTableAssociationAnalysisRuleAggregationProperty):
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleAggregationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleAggregationProperty
    }
  }

  /**
   * The configured table association analysis rule applied to a configured table with the custom
   * analysis rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * ConfiguredTableAssociationAnalysisRuleCustomProperty
   * configuredTableAssociationAnalysisRuleCustomProperty =
   * ConfiguredTableAssociationAnalysisRuleCustomProperty.builder()
   * .allowedAdditionalAnalyses(List.of("allowedAdditionalAnalyses"))
   * .allowedResultReceivers(List.of("allowedResultReceivers"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulecustom.html)
   */
  public interface ConfiguredTableAssociationAnalysisRuleCustomProperty {
    /**
     * The list of resources or wildcards (ARNs) that are allowed to perform additional analysis on
     * query output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulecustom.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulecustom-allowedadditionalanalyses)
     */
    public fun allowedAdditionalAnalyses(): List<String> =
        unwrap(this).getAllowedAdditionalAnalyses() ?: emptyList()

    /**
     * The list of collaboration members who are allowed to receive results of queries run with this
     * configured table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulecustom.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulecustom-allowedresultreceivers)
     */
    public fun allowedResultReceivers(): List<String> = unwrap(this).getAllowedResultReceivers() ?:
        emptyList()

    /**
     * A builder for [ConfiguredTableAssociationAnalysisRuleCustomProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowedAdditionalAnalyses The list of resources or wildcards (ARNs) that are allowed
       * to perform additional analysis on query output.
       */
      public fun allowedAdditionalAnalyses(allowedAdditionalAnalyses: List<String>)

      /**
       * @param allowedAdditionalAnalyses The list of resources or wildcards (ARNs) that are allowed
       * to perform additional analysis on query output.
       */
      public fun allowedAdditionalAnalyses(vararg allowedAdditionalAnalyses: String)

      /**
       * @param allowedResultReceivers The list of collaboration members who are allowed to receive
       * results of queries run with this configured table.
       */
      public fun allowedResultReceivers(allowedResultReceivers: List<String>)

      /**
       * @param allowedResultReceivers The list of collaboration members who are allowed to receive
       * results of queries run with this configured table.
       */
      public fun allowedResultReceivers(vararg allowedResultReceivers: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleCustomProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleCustomProperty.builder()

      /**
       * @param allowedAdditionalAnalyses The list of resources or wildcards (ARNs) that are allowed
       * to perform additional analysis on query output.
       */
      override fun allowedAdditionalAnalyses(allowedAdditionalAnalyses: List<String>) {
        cdkBuilder.allowedAdditionalAnalyses(allowedAdditionalAnalyses)
      }

      /**
       * @param allowedAdditionalAnalyses The list of resources or wildcards (ARNs) that are allowed
       * to perform additional analysis on query output.
       */
      override fun allowedAdditionalAnalyses(vararg allowedAdditionalAnalyses: String): Unit =
          allowedAdditionalAnalyses(allowedAdditionalAnalyses.toList())

      /**
       * @param allowedResultReceivers The list of collaboration members who are allowed to receive
       * results of queries run with this configured table.
       */
      override fun allowedResultReceivers(allowedResultReceivers: List<String>) {
        cdkBuilder.allowedResultReceivers(allowedResultReceivers)
      }

      /**
       * @param allowedResultReceivers The list of collaboration members who are allowed to receive
       * results of queries run with this configured table.
       */
      override fun allowedResultReceivers(vararg allowedResultReceivers: String): Unit =
          allowedResultReceivers(allowedResultReceivers.toList())

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleCustomProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleCustomProperty,
    ) : CdkObject(cdkObject),
        ConfiguredTableAssociationAnalysisRuleCustomProperty {
      /**
       * The list of resources or wildcards (ARNs) that are allowed to perform additional analysis
       * on query output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulecustom.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulecustom-allowedadditionalanalyses)
       */
      override fun allowedAdditionalAnalyses(): List<String> =
          unwrap(this).getAllowedAdditionalAnalyses() ?: emptyList()

      /**
       * The list of collaboration members who are allowed to receive results of queries run with
       * this configured table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulecustom.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulecustom-allowedresultreceivers)
       */
      override fun allowedResultReceivers(): List<String> = unwrap(this).getAllowedResultReceivers()
          ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfiguredTableAssociationAnalysisRuleCustomProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleCustomProperty):
          ConfiguredTableAssociationAnalysisRuleCustomProperty = CdkObjectWrappers.wrap(cdkObject)
          as? ConfiguredTableAssociationAnalysisRuleCustomProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfiguredTableAssociationAnalysisRuleCustomProperty):
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleCustomProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleCustomProperty
    }
  }

  /**
   * The configured table association analysis rule applied to a configured table with the list
   * analysis rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * ConfiguredTableAssociationAnalysisRuleListProperty
   * configuredTableAssociationAnalysisRuleListProperty =
   * ConfiguredTableAssociationAnalysisRuleListProperty.builder()
   * .allowedAdditionalAnalyses(List.of("allowedAdditionalAnalyses"))
   * .allowedResultReceivers(List.of("allowedResultReceivers"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulelist.html)
   */
  public interface ConfiguredTableAssociationAnalysisRuleListProperty {
    /**
     * The list of resources or wildcards (ARNs) that are allowed to perform additional analysis on
     * query output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulelist.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulelist-allowedadditionalanalyses)
     */
    public fun allowedAdditionalAnalyses(): List<String> =
        unwrap(this).getAllowedAdditionalAnalyses() ?: emptyList()

    /**
     * The list of collaboration members who are allowed to receive results of queries run with this
     * configured table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulelist.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulelist-allowedresultreceivers)
     */
    public fun allowedResultReceivers(): List<String> = unwrap(this).getAllowedResultReceivers() ?:
        emptyList()

    /**
     * A builder for [ConfiguredTableAssociationAnalysisRuleListProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowedAdditionalAnalyses The list of resources or wildcards (ARNs) that are allowed
       * to perform additional analysis on query output.
       */
      public fun allowedAdditionalAnalyses(allowedAdditionalAnalyses: List<String>)

      /**
       * @param allowedAdditionalAnalyses The list of resources or wildcards (ARNs) that are allowed
       * to perform additional analysis on query output.
       */
      public fun allowedAdditionalAnalyses(vararg allowedAdditionalAnalyses: String)

      /**
       * @param allowedResultReceivers The list of collaboration members who are allowed to receive
       * results of queries run with this configured table.
       */
      public fun allowedResultReceivers(allowedResultReceivers: List<String>)

      /**
       * @param allowedResultReceivers The list of collaboration members who are allowed to receive
       * results of queries run with this configured table.
       */
      public fun allowedResultReceivers(vararg allowedResultReceivers: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleListProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleListProperty.builder()

      /**
       * @param allowedAdditionalAnalyses The list of resources or wildcards (ARNs) that are allowed
       * to perform additional analysis on query output.
       */
      override fun allowedAdditionalAnalyses(allowedAdditionalAnalyses: List<String>) {
        cdkBuilder.allowedAdditionalAnalyses(allowedAdditionalAnalyses)
      }

      /**
       * @param allowedAdditionalAnalyses The list of resources or wildcards (ARNs) that are allowed
       * to perform additional analysis on query output.
       */
      override fun allowedAdditionalAnalyses(vararg allowedAdditionalAnalyses: String): Unit =
          allowedAdditionalAnalyses(allowedAdditionalAnalyses.toList())

      /**
       * @param allowedResultReceivers The list of collaboration members who are allowed to receive
       * results of queries run with this configured table.
       */
      override fun allowedResultReceivers(allowedResultReceivers: List<String>) {
        cdkBuilder.allowedResultReceivers(allowedResultReceivers)
      }

      /**
       * @param allowedResultReceivers The list of collaboration members who are allowed to receive
       * results of queries run with this configured table.
       */
      override fun allowedResultReceivers(vararg allowedResultReceivers: String): Unit =
          allowedResultReceivers(allowedResultReceivers.toList())

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleListProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleListProperty,
    ) : CdkObject(cdkObject),
        ConfiguredTableAssociationAnalysisRuleListProperty {
      /**
       * The list of resources or wildcards (ARNs) that are allowed to perform additional analysis
       * on query output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulelist.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulelist-allowedadditionalanalyses)
       */
      override fun allowedAdditionalAnalyses(): List<String> =
          unwrap(this).getAllowedAdditionalAnalyses() ?: emptyList()

      /**
       * The list of collaboration members who are allowed to receive results of queries run with
       * this configured table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulelist.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulelist-allowedresultreceivers)
       */
      override fun allowedResultReceivers(): List<String> = unwrap(this).getAllowedResultReceivers()
          ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfiguredTableAssociationAnalysisRuleListProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleListProperty):
          ConfiguredTableAssociationAnalysisRuleListProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConfiguredTableAssociationAnalysisRuleListProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfiguredTableAssociationAnalysisRuleListProperty):
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleListProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleListProperty
    }
  }

  /**
   * Controls on the query specifications that can be run on an associated configured table.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * ConfiguredTableAssociationAnalysisRulePolicyProperty
   * configuredTableAssociationAnalysisRulePolicyProperty =
   * ConfiguredTableAssociationAnalysisRulePolicyProperty.builder()
   * .v1(ConfiguredTableAssociationAnalysisRulePolicyV1Property.builder()
   * .aggregation(ConfiguredTableAssociationAnalysisRuleAggregationProperty.builder()
   * .allowedAdditionalAnalyses(List.of("allowedAdditionalAnalyses"))
   * .allowedResultReceivers(List.of("allowedResultReceivers"))
   * .build())
   * .custom(ConfiguredTableAssociationAnalysisRuleCustomProperty.builder()
   * .allowedAdditionalAnalyses(List.of("allowedAdditionalAnalyses"))
   * .allowedResultReceivers(List.of("allowedResultReceivers"))
   * .build())
   * .list(ConfiguredTableAssociationAnalysisRuleListProperty.builder()
   * .allowedAdditionalAnalyses(List.of("allowedAdditionalAnalyses"))
   * .allowedResultReceivers(List.of("allowedResultReceivers"))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulepolicy.html)
   */
  public interface ConfiguredTableAssociationAnalysisRulePolicyProperty {
    /**
     * The policy for the configured table association analysis rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulepolicy.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulepolicy-v1)
     */
    public fun v1(): Any

    /**
     * A builder for [ConfiguredTableAssociationAnalysisRulePolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param v1 The policy for the configured table association analysis rule. 
       */
      public fun v1(v1: IResolvable)

      /**
       * @param v1 The policy for the configured table association analysis rule. 
       */
      public fun v1(v1: ConfiguredTableAssociationAnalysisRulePolicyV1Property)

      /**
       * @param v1 The policy for the configured table association analysis rule. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("211ce285034ad977ffafc429e3982971e9da3768221359b1809c2b9a53157675")
      public fun v1(v1: ConfiguredTableAssociationAnalysisRulePolicyV1Property.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRulePolicyProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRulePolicyProperty.builder()

      /**
       * @param v1 The policy for the configured table association analysis rule. 
       */
      override fun v1(v1: IResolvable) {
        cdkBuilder.v1(v1.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param v1 The policy for the configured table association analysis rule. 
       */
      override fun v1(v1: ConfiguredTableAssociationAnalysisRulePolicyV1Property) {
        cdkBuilder.v1(v1.let(ConfiguredTableAssociationAnalysisRulePolicyV1Property.Companion::unwrap))
      }

      /**
       * @param v1 The policy for the configured table association analysis rule. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("211ce285034ad977ffafc429e3982971e9da3768221359b1809c2b9a53157675")
      override
          fun v1(v1: ConfiguredTableAssociationAnalysisRulePolicyV1Property.Builder.() -> Unit):
          Unit = v1(ConfiguredTableAssociationAnalysisRulePolicyV1Property(v1))

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRulePolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRulePolicyProperty,
    ) : CdkObject(cdkObject),
        ConfiguredTableAssociationAnalysisRulePolicyProperty {
      /**
       * The policy for the configured table association analysis rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulepolicy.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulepolicy-v1)
       */
      override fun v1(): Any = unwrap(this).getV1()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfiguredTableAssociationAnalysisRulePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRulePolicyProperty):
          ConfiguredTableAssociationAnalysisRulePolicyProperty = CdkObjectWrappers.wrap(cdkObject)
          as? ConfiguredTableAssociationAnalysisRulePolicyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfiguredTableAssociationAnalysisRulePolicyProperty):
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRulePolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRulePolicyProperty
    }
  }

  /**
   * Controls on the query specifications that can be run on an associated configured table.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * ConfiguredTableAssociationAnalysisRulePolicyV1Property
   * configuredTableAssociationAnalysisRulePolicyV1Property =
   * ConfiguredTableAssociationAnalysisRulePolicyV1Property.builder()
   * .aggregation(ConfiguredTableAssociationAnalysisRuleAggregationProperty.builder()
   * .allowedAdditionalAnalyses(List.of("allowedAdditionalAnalyses"))
   * .allowedResultReceivers(List.of("allowedResultReceivers"))
   * .build())
   * .custom(ConfiguredTableAssociationAnalysisRuleCustomProperty.builder()
   * .allowedAdditionalAnalyses(List.of("allowedAdditionalAnalyses"))
   * .allowedResultReceivers(List.of("allowedResultReceivers"))
   * .build())
   * .list(ConfiguredTableAssociationAnalysisRuleListProperty.builder()
   * .allowedAdditionalAnalyses(List.of("allowedAdditionalAnalyses"))
   * .allowedResultReceivers(List.of("allowedResultReceivers"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulepolicyv1.html)
   */
  public interface ConfiguredTableAssociationAnalysisRulePolicyV1Property {
    /**
     * Analysis rule type that enables only aggregation queries on a configured table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulepolicyv1.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulepolicyv1-aggregation)
     */
    public fun aggregation(): Any? = unwrap(this).getAggregation()

    /**
     * Analysis rule type that enables the table owner to approve custom SQL queries on their
     * configured tables.
     *
     * It supports differential privacy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulepolicyv1.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulepolicyv1-custom)
     */
    public fun custom(): Any? = unwrap(this).getCustom()

    /**
     * Analysis rule type that enables only list queries on a configured table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulepolicyv1.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulepolicyv1-list)
     */
    public fun list(): Any? = unwrap(this).getList()

    /**
     * A builder for [ConfiguredTableAssociationAnalysisRulePolicyV1Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param aggregation Analysis rule type that enables only aggregation queries on a configured
       * table.
       */
      public fun aggregation(aggregation: IResolvable)

      /**
       * @param aggregation Analysis rule type that enables only aggregation queries on a configured
       * table.
       */
      public fun aggregation(aggregation: ConfiguredTableAssociationAnalysisRuleAggregationProperty)

      /**
       * @param aggregation Analysis rule type that enables only aggregation queries on a configured
       * table.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2da8fd06ce5ec6e417da9c4e223237243448d1af2ed1ecb6952ca9bb80469141")
      public
          fun aggregation(aggregation: ConfiguredTableAssociationAnalysisRuleAggregationProperty.Builder.() -> Unit)

      /**
       * @param custom Analysis rule type that enables the table owner to approve custom SQL queries
       * on their configured tables.
       * It supports differential privacy.
       */
      public fun custom(custom: IResolvable)

      /**
       * @param custom Analysis rule type that enables the table owner to approve custom SQL queries
       * on their configured tables.
       * It supports differential privacy.
       */
      public fun custom(custom: ConfiguredTableAssociationAnalysisRuleCustomProperty)

      /**
       * @param custom Analysis rule type that enables the table owner to approve custom SQL queries
       * on their configured tables.
       * It supports differential privacy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c27198f9e906abccccef97e6831b9dc042f9a8f71306a0bc9263160272e6db0")
      public
          fun custom(custom: ConfiguredTableAssociationAnalysisRuleCustomProperty.Builder.() -> Unit)

      /**
       * @param list Analysis rule type that enables only list queries on a configured table.
       */
      public fun list(list: IResolvable)

      /**
       * @param list Analysis rule type that enables only list queries on a configured table.
       */
      public fun list(list: ConfiguredTableAssociationAnalysisRuleListProperty)

      /**
       * @param list Analysis rule type that enables only list queries on a configured table.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98f94f3412c38693c92e7a4cab6e988ca07f8a2bfa6b3834cdf49d891e178eaa")
      public fun list(list: ConfiguredTableAssociationAnalysisRuleListProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRulePolicyV1Property.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRulePolicyV1Property.builder()

      /**
       * @param aggregation Analysis rule type that enables only aggregation queries on a configured
       * table.
       */
      override fun aggregation(aggregation: IResolvable) {
        cdkBuilder.aggregation(aggregation.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param aggregation Analysis rule type that enables only aggregation queries on a configured
       * table.
       */
      override
          fun aggregation(aggregation: ConfiguredTableAssociationAnalysisRuleAggregationProperty) {
        cdkBuilder.aggregation(aggregation.let(ConfiguredTableAssociationAnalysisRuleAggregationProperty.Companion::unwrap))
      }

      /**
       * @param aggregation Analysis rule type that enables only aggregation queries on a configured
       * table.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2da8fd06ce5ec6e417da9c4e223237243448d1af2ed1ecb6952ca9bb80469141")
      override
          fun aggregation(aggregation: ConfiguredTableAssociationAnalysisRuleAggregationProperty.Builder.() -> Unit):
          Unit = aggregation(ConfiguredTableAssociationAnalysisRuleAggregationProperty(aggregation))

      /**
       * @param custom Analysis rule type that enables the table owner to approve custom SQL queries
       * on their configured tables.
       * It supports differential privacy.
       */
      override fun custom(custom: IResolvable) {
        cdkBuilder.custom(custom.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param custom Analysis rule type that enables the table owner to approve custom SQL queries
       * on their configured tables.
       * It supports differential privacy.
       */
      override fun custom(custom: ConfiguredTableAssociationAnalysisRuleCustomProperty) {
        cdkBuilder.custom(custom.let(ConfiguredTableAssociationAnalysisRuleCustomProperty.Companion::unwrap))
      }

      /**
       * @param custom Analysis rule type that enables the table owner to approve custom SQL queries
       * on their configured tables.
       * It supports differential privacy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c27198f9e906abccccef97e6831b9dc042f9a8f71306a0bc9263160272e6db0")
      override
          fun custom(custom: ConfiguredTableAssociationAnalysisRuleCustomProperty.Builder.() -> Unit):
          Unit = custom(ConfiguredTableAssociationAnalysisRuleCustomProperty(custom))

      /**
       * @param list Analysis rule type that enables only list queries on a configured table.
       */
      override fun list(list: IResolvable) {
        cdkBuilder.list(list.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param list Analysis rule type that enables only list queries on a configured table.
       */
      override fun list(list: ConfiguredTableAssociationAnalysisRuleListProperty) {
        cdkBuilder.list(list.let(ConfiguredTableAssociationAnalysisRuleListProperty.Companion::unwrap))
      }

      /**
       * @param list Analysis rule type that enables only list queries on a configured table.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98f94f3412c38693c92e7a4cab6e988ca07f8a2bfa6b3834cdf49d891e178eaa")
      override
          fun list(list: ConfiguredTableAssociationAnalysisRuleListProperty.Builder.() -> Unit):
          Unit = list(ConfiguredTableAssociationAnalysisRuleListProperty(list))

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRulePolicyV1Property
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRulePolicyV1Property,
    ) : CdkObject(cdkObject),
        ConfiguredTableAssociationAnalysisRulePolicyV1Property {
      /**
       * Analysis rule type that enables only aggregation queries on a configured table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulepolicyv1.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulepolicyv1-aggregation)
       */
      override fun aggregation(): Any? = unwrap(this).getAggregation()

      /**
       * Analysis rule type that enables the table owner to approve custom SQL queries on their
       * configured tables.
       *
       * It supports differential privacy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulepolicyv1.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulepolicyv1-custom)
       */
      override fun custom(): Any? = unwrap(this).getCustom()

      /**
       * Analysis rule type that enables only list queries on a configured table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulepolicyv1.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrulepolicyv1-list)
       */
      override fun list(): Any? = unwrap(this).getList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfiguredTableAssociationAnalysisRulePolicyV1Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRulePolicyV1Property):
          ConfiguredTableAssociationAnalysisRulePolicyV1Property = CdkObjectWrappers.wrap(cdkObject)
          as? ConfiguredTableAssociationAnalysisRulePolicyV1Property ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfiguredTableAssociationAnalysisRulePolicyV1Property):
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRulePolicyV1Property
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRulePolicyV1Property
    }
  }

  /**
   * An analysis rule for a configured table association.
   *
   * This analysis rule specifies how data from the table can be used within its associated
   * collaboration. In the console, the `ConfiguredTableAssociationAnalysisRule` is referred to as the
   * *collaboration analysis rule* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
   * ConfiguredTableAssociationAnalysisRuleProperty configuredTableAssociationAnalysisRuleProperty =
   * ConfiguredTableAssociationAnalysisRuleProperty.builder()
   * .policy(ConfiguredTableAssociationAnalysisRulePolicyProperty.builder()
   * .v1(ConfiguredTableAssociationAnalysisRulePolicyV1Property.builder()
   * .aggregation(ConfiguredTableAssociationAnalysisRuleAggregationProperty.builder()
   * .allowedAdditionalAnalyses(List.of("allowedAdditionalAnalyses"))
   * .allowedResultReceivers(List.of("allowedResultReceivers"))
   * .build())
   * .custom(ConfiguredTableAssociationAnalysisRuleCustomProperty.builder()
   * .allowedAdditionalAnalyses(List.of("allowedAdditionalAnalyses"))
   * .allowedResultReceivers(List.of("allowedResultReceivers"))
   * .build())
   * .list(ConfiguredTableAssociationAnalysisRuleListProperty.builder()
   * .allowedAdditionalAnalyses(List.of("allowedAdditionalAnalyses"))
   * .allowedResultReceivers(List.of("allowedResultReceivers"))
   * .build())
   * .build())
   * .build())
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrule.html)
   */
  public interface ConfiguredTableAssociationAnalysisRuleProperty {
    /**
     * The policy of the configured table association analysis rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrule.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrule-policy)
     */
    public fun policy(): Any

    /**
     * The type of the configured table association analysis rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrule.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrule-type)
     */
    public fun type(): String

    /**
     * A builder for [ConfiguredTableAssociationAnalysisRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param policy The policy of the configured table association analysis rule. 
       */
      public fun policy(policy: IResolvable)

      /**
       * @param policy The policy of the configured table association analysis rule. 
       */
      public fun policy(policy: ConfiguredTableAssociationAnalysisRulePolicyProperty)

      /**
       * @param policy The policy of the configured table association analysis rule. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a172a509e56316027b3eb53176c81acbb72594877a434bb9108f7d85c19a5154")
      public
          fun policy(policy: ConfiguredTableAssociationAnalysisRulePolicyProperty.Builder.() -> Unit)

      /**
       * @param type The type of the configured table association analysis rule. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleProperty.Builder
          =
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleProperty.builder()

      /**
       * @param policy The policy of the configured table association analysis rule. 
       */
      override fun policy(policy: IResolvable) {
        cdkBuilder.policy(policy.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param policy The policy of the configured table association analysis rule. 
       */
      override fun policy(policy: ConfiguredTableAssociationAnalysisRulePolicyProperty) {
        cdkBuilder.policy(policy.let(ConfiguredTableAssociationAnalysisRulePolicyProperty.Companion::unwrap))
      }

      /**
       * @param policy The policy of the configured table association analysis rule. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a172a509e56316027b3eb53176c81acbb72594877a434bb9108f7d85c19a5154")
      override
          fun policy(policy: ConfiguredTableAssociationAnalysisRulePolicyProperty.Builder.() -> Unit):
          Unit = policy(ConfiguredTableAssociationAnalysisRulePolicyProperty(policy))

      /**
       * @param type The type of the configured table association analysis rule. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleProperty,
    ) : CdkObject(cdkObject),
        ConfiguredTableAssociationAnalysisRuleProperty {
      /**
       * The policy of the configured table association analysis rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrule.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrule-policy)
       */
      override fun policy(): Any = unwrap(this).getPolicy()

      /**
       * The type of the configured table association analysis rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrule.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrule-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfiguredTableAssociationAnalysisRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleProperty):
          ConfiguredTableAssociationAnalysisRuleProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConfiguredTableAssociationAnalysisRuleProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfiguredTableAssociationAnalysisRuleProperty):
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation.ConfiguredTableAssociationAnalysisRuleProperty
    }
  }
}
