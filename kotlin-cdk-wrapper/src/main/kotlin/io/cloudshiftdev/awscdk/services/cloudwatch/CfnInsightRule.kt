@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates or updates a Contributor Insights rule.
 *
 * Rules evaluate log events in a CloudWatch Logs log group, enabling you to find contributor data
 * for the log events in that log group. For more information, see [Using Contributor Insights to
 * Analyze High-Cardinality
 * Data](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights.html) in
 * the *Amazon CloudWatch User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * CfnInsightRule cfnInsightRule = CfnInsightRule.Builder.create(this, "MyCfnInsightRule")
 * .ruleBody("ruleBody")
 * .ruleName("ruleName")
 * .ruleState("ruleState")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html)
 */
public open class CfnInsightRule(
  cdkObject: software.amazon.awscdk.services.cloudwatch.CfnInsightRule,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInsightRuleProps,
  ) :
      this(software.amazon.awscdk.services.cloudwatch.CfnInsightRule(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnInsightRuleProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInsightRuleProps.Builder.() -> Unit,
  ) : this(scope, id, CfnInsightRuleProps(props)
  )

  /**
   * The ARN of the Contributor Insights rule, such as
   * `arn:aws:cloudwatch:us-west-2:123456789012:insight-rule/MyInsightRuleName` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the Contributor Insights rule.
   */
  public open fun attrRuleName(): String = unwrap(this).getAttrRuleName()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The definition of the rule, as a JSON object.
   */
  public open fun ruleBody(): String = unwrap(this).getRuleBody()

  /**
   * The definition of the rule, as a JSON object.
   */
  public open fun ruleBody(`value`: String) {
    unwrap(this).setRuleBody(`value`)
  }

  /**
   * The name of the rule.
   */
  public open fun ruleName(): String = unwrap(this).getRuleName()

  /**
   * The name of the rule.
   */
  public open fun ruleName(`value`: String) {
    unwrap(this).setRuleName(`value`)
  }

  /**
   * The current state of the rule.
   */
  public open fun ruleState(): String = unwrap(this).getRuleState()

  /**
   * The current state of the rule.
   */
  public open fun ruleState(`value`: String) {
    unwrap(this).setRuleState(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of key-value pairs to associate with the Contributor Insights rule.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of key-value pairs to associate with the Contributor Insights rule.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of key-value pairs to associate with the Contributor Insights rule.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudwatch.CfnInsightRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The definition of the rule, as a JSON object.
     *
     * For details about the syntax, see [Contributor Insights Rule
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights-RuleSyntax.html)
     * in the *Amazon CloudWatch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulebody)
     * @param ruleBody The definition of the rule, as a JSON object. 
     */
    public fun ruleBody(ruleBody: String)

    /**
     * The name of the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulename)
     * @param ruleName The name of the rule. 
     */
    public fun ruleName(ruleName: String)

    /**
     * The current state of the rule.
     *
     * Valid values are `ENABLED` and `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulestate)
     * @param ruleState The current state of the rule. 
     */
    public fun ruleState(ruleState: String)

    /**
     * A list of key-value pairs to associate with the Contributor Insights rule.
     *
     * You can associate as many as 50 tags with a rule.
     *
     * Tags can help you organize and categorize your resources. For more information, see [Tagging
     * Your Amazon CloudWatch
     * Resources](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Tagging.html)
     * .
     *
     * To be able to associate tags with a rule, you must have the `cloudwatch:TagResource`
     * permission in addition to the `cloudwatch:PutInsightRule` permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-tags)
     * @param tags A list of key-value pairs to associate with the Contributor Insights rule. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of key-value pairs to associate with the Contributor Insights rule.
     *
     * You can associate as many as 50 tags with a rule.
     *
     * Tags can help you organize and categorize your resources. For more information, see [Tagging
     * Your Amazon CloudWatch
     * Resources](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Tagging.html)
     * .
     *
     * To be able to associate tags with a rule, you must have the `cloudwatch:TagResource`
     * permission in addition to the `cloudwatch:PutInsightRule` permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-tags)
     * @param tags A list of key-value pairs to associate with the Contributor Insights rule. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CfnInsightRule.Builder =
        software.amazon.awscdk.services.cloudwatch.CfnInsightRule.Builder.create(scope, id)

    /**
     * The definition of the rule, as a JSON object.
     *
     * For details about the syntax, see [Contributor Insights Rule
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights-RuleSyntax.html)
     * in the *Amazon CloudWatch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulebody)
     * @param ruleBody The definition of the rule, as a JSON object. 
     */
    override fun ruleBody(ruleBody: String) {
      cdkBuilder.ruleBody(ruleBody)
    }

    /**
     * The name of the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulename)
     * @param ruleName The name of the rule. 
     */
    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    /**
     * The current state of the rule.
     *
     * Valid values are `ENABLED` and `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulestate)
     * @param ruleState The current state of the rule. 
     */
    override fun ruleState(ruleState: String) {
      cdkBuilder.ruleState(ruleState)
    }

    /**
     * A list of key-value pairs to associate with the Contributor Insights rule.
     *
     * You can associate as many as 50 tags with a rule.
     *
     * Tags can help you organize and categorize your resources. For more information, see [Tagging
     * Your Amazon CloudWatch
     * Resources](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Tagging.html)
     * .
     *
     * To be able to associate tags with a rule, you must have the `cloudwatch:TagResource`
     * permission in addition to the `cloudwatch:PutInsightRule` permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-tags)
     * @param tags A list of key-value pairs to associate with the Contributor Insights rule. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of key-value pairs to associate with the Contributor Insights rule.
     *
     * You can associate as many as 50 tags with a rule.
     *
     * Tags can help you organize and categorize your resources. For more information, see [Tagging
     * Your Amazon CloudWatch
     * Resources](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Tagging.html)
     * .
     *
     * To be able to associate tags with a rule, you must have the `cloudwatch:TagResource`
     * permission in addition to the `cloudwatch:PutInsightRule` permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-tags)
     * @param tags A list of key-value pairs to associate with the Contributor Insights rule. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cloudwatch.CfnInsightRule =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudwatch.CfnInsightRule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInsightRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInsightRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnInsightRule):
        CfnInsightRule = CfnInsightRule(cdkObject)

    internal fun unwrap(wrapped: CfnInsightRule):
        software.amazon.awscdk.services.cloudwatch.CfnInsightRule = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudwatch.CfnInsightRule
  }
}
