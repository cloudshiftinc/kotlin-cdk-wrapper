@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cleanrooms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnConfiguredTableAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cleanrooms.*;
 * CfnConfiguredTableAssociationProps cfnConfiguredTableAssociationProps =
 * CfnConfiguredTableAssociationProps.builder()
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
public interface CfnConfiguredTableAssociationProps {
  /**
   * An analysis rule for a configured table association.
   *
   * This analysis rule specifies how data from the table can be used within its associated
   * collaboration. In the console, the `ConfiguredTableAssociationAnalysisRule` is referred to as the
   * *collaboration analysis rule* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrules)
   */
  public fun configuredTableAssociationAnalysisRules(): Any? =
      unwrap(this).getConfiguredTableAssociationAnalysisRules()

  /**
   * A unique identifier for the configured table to be associated to.
   *
   * Currently accepts a configured table ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-configuredtableidentifier)
   */
  public fun configuredTableIdentifier(): String

  /**
   * A description of the configured table association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The unique ID for the membership this configured table association belongs to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-membershipidentifier)
   */
  public fun membershipIdentifier(): String

  /**
   * The name of the configured table association, in lowercase.
   *
   * The table is identified by this name when running protected queries against the underlying
   * data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-name)
   */
  public fun name(): String

  /**
   * The service will assume this role to access catalog metadata and query the table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-rolearn)
   */
  public fun roleArn(): String

  /**
   * An optional label that you can assign to a resource when you create it.
   *
   * Each tag consists of a key and an optional value, both of which you define. When you use
   * tagging, you can also use tag-based access control in IAM policies to control access to this
   * resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnConfiguredTableAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configuredTableAssociationAnalysisRules An analysis rule for a configured table
     * association.
     * This analysis rule specifies how data from the table can be used within its associated
     * collaboration. In the console, the `ConfiguredTableAssociationAnalysisRule` is referred to as
     * the *collaboration analysis rule* .
     */
    public
        fun configuredTableAssociationAnalysisRules(configuredTableAssociationAnalysisRules: IResolvable)

    /**
     * @param configuredTableAssociationAnalysisRules An analysis rule for a configured table
     * association.
     * This analysis rule specifies how data from the table can be used within its associated
     * collaboration. In the console, the `ConfiguredTableAssociationAnalysisRule` is referred to as
     * the *collaboration analysis rule* .
     */
    public
        fun configuredTableAssociationAnalysisRules(configuredTableAssociationAnalysisRules: List<Any>)

    /**
     * @param configuredTableAssociationAnalysisRules An analysis rule for a configured table
     * association.
     * This analysis rule specifies how data from the table can be used within its associated
     * collaboration. In the console, the `ConfiguredTableAssociationAnalysisRule` is referred to as
     * the *collaboration analysis rule* .
     */
    public fun configuredTableAssociationAnalysisRules(vararg
        configuredTableAssociationAnalysisRules: Any)

    /**
     * @param configuredTableIdentifier A unique identifier for the configured table to be
     * associated to. 
     * Currently accepts a configured table ID.
     */
    public fun configuredTableIdentifier(configuredTableIdentifier: String)

    /**
     * @param description A description of the configured table association.
     */
    public fun description(description: String)

    /**
     * @param membershipIdentifier The unique ID for the membership this configured table
     * association belongs to. 
     */
    public fun membershipIdentifier(membershipIdentifier: String)

    /**
     * @param name The name of the configured table association, in lowercase. 
     * The table is identified by this name when running protected queries against the underlying
     * data.
     */
    public fun name(name: String)

    /**
     * @param roleArn The service will assume this role to access catalog metadata and query the
     * table. 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociationProps.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociationProps.builder()

    /**
     * @param configuredTableAssociationAnalysisRules An analysis rule for a configured table
     * association.
     * This analysis rule specifies how data from the table can be used within its associated
     * collaboration. In the console, the `ConfiguredTableAssociationAnalysisRule` is referred to as
     * the *collaboration analysis rule* .
     */
    override
        fun configuredTableAssociationAnalysisRules(configuredTableAssociationAnalysisRules: IResolvable) {
      cdkBuilder.configuredTableAssociationAnalysisRules(configuredTableAssociationAnalysisRules.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param configuredTableAssociationAnalysisRules An analysis rule for a configured table
     * association.
     * This analysis rule specifies how data from the table can be used within its associated
     * collaboration. In the console, the `ConfiguredTableAssociationAnalysisRule` is referred to as
     * the *collaboration analysis rule* .
     */
    override
        fun configuredTableAssociationAnalysisRules(configuredTableAssociationAnalysisRules: List<Any>) {
      cdkBuilder.configuredTableAssociationAnalysisRules(configuredTableAssociationAnalysisRules.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param configuredTableAssociationAnalysisRules An analysis rule for a configured table
     * association.
     * This analysis rule specifies how data from the table can be used within its associated
     * collaboration. In the console, the `ConfiguredTableAssociationAnalysisRule` is referred to as
     * the *collaboration analysis rule* .
     */
    override fun configuredTableAssociationAnalysisRules(vararg
        configuredTableAssociationAnalysisRules: Any): Unit =
        configuredTableAssociationAnalysisRules(configuredTableAssociationAnalysisRules.toList())

    /**
     * @param configuredTableIdentifier A unique identifier for the configured table to be
     * associated to. 
     * Currently accepts a configured table ID.
     */
    override fun configuredTableIdentifier(configuredTableIdentifier: String) {
      cdkBuilder.configuredTableIdentifier(configuredTableIdentifier)
    }

    /**
     * @param description A description of the configured table association.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param membershipIdentifier The unique ID for the membership this configured table
     * association belongs to. 
     */
    override fun membershipIdentifier(membershipIdentifier: String) {
      cdkBuilder.membershipIdentifier(membershipIdentifier)
    }

    /**
     * @param name The name of the configured table association, in lowercase. 
     * The table is identified by this name when running protected queries against the underlying
     * data.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param roleArn The service will assume this role to access catalog metadata and query the
     * table. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An optional label that you can assign to a resource when you create it.
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociationProps,
  ) : CdkObject(cdkObject),
      CfnConfiguredTableAssociationProps {
    /**
     * An analysis rule for a configured table association.
     *
     * This analysis rule specifies how data from the table can be used within its associated
     * collaboration. In the console, the `ConfiguredTableAssociationAnalysisRule` is referred to as
     * the *collaboration analysis rule* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-configuredtableassociationanalysisrules)
     */
    override fun configuredTableAssociationAnalysisRules(): Any? =
        unwrap(this).getConfiguredTableAssociationAnalysisRules()

    /**
     * A unique identifier for the configured table to be associated to.
     *
     * Currently accepts a configured table ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-configuredtableidentifier)
     */
    override fun configuredTableIdentifier(): String = unwrap(this).getConfiguredTableIdentifier()

    /**
     * A description of the configured table association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The unique ID for the membership this configured table association belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-membershipidentifier)
     */
    override fun membershipIdentifier(): String = unwrap(this).getMembershipIdentifier()

    /**
     * The name of the configured table association, in lowercase.
     *
     * The table is identified by this name when running protected queries against the underlying
     * data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The service will assume this role to access catalog metadata and query the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * An optional label that you can assign to a resource when you create it.
     *
     * Each tag consists of a key and an optional value, both of which you define. When you use
     * tagging, you can also use tag-based access control in IAM policies to control access to this
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanrooms-configuredtableassociation.html#cfn-cleanrooms-configuredtableassociation-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfiguredTableAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociationProps):
        CfnConfiguredTableAssociationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnConfiguredTableAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfiguredTableAssociationProps):
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociationProps
  }
}
