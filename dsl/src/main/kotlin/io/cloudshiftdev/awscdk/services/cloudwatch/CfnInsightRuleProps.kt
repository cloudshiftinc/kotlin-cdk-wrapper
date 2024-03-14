package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnInsightRuleProps {
  /**
   * The definition of the rule, as a JSON object.
   *
   * For details about the syntax, see [Contributor Insights Rule
   * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights-RuleSyntax.html)
   * in the *Amazon CloudWatch User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulebody)
   */
  public fun ruleBody(): String

  /**
   * The name of the rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulename)
   */
  public fun ruleName(): String

  /**
   * The current state of the rule.
   *
   * Valid values are `ENABLED` and `DISABLED` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulestate)
   */
  public fun ruleState(): String

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
   * To be able to associate tags with a rule, you must have the `cloudwatch:TagResource` permission
   * in addition to the `cloudwatch:PutInsightRule` permission.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnInsightRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ruleBody The definition of the rule, as a JSON object. 
     * For details about the syntax, see [Contributor Insights Rule
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights-RuleSyntax.html)
     * in the *Amazon CloudWatch User Guide* .
     */
    public fun ruleBody(ruleBody: String)

    /**
     * @param ruleName The name of the rule. 
     */
    public fun ruleName(ruleName: String)

    /**
     * @param ruleState The current state of the rule. 
     * Valid values are `ENABLED` and `DISABLED` .
     */
    public fun ruleState(ruleState: String)

    /**
     * @param tags A list of key-value pairs to associate with the Contributor Insights rule.
     * You can associate as many as 50 tags with a rule.
     *
     * Tags can help you organize and categorize your resources. For more information, see [Tagging
     * Your Amazon CloudWatch
     * Resources](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Tagging.html)
     * .
     *
     * To be able to associate tags with a rule, you must have the `cloudwatch:TagResource`
     * permission in addition to the `cloudwatch:PutInsightRule` permission.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of key-value pairs to associate with the Contributor Insights rule.
     * You can associate as many as 50 tags with a rule.
     *
     * Tags can help you organize and categorize your resources. For more information, see [Tagging
     * Your Amazon CloudWatch
     * Resources](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Tagging.html)
     * .
     *
     * To be able to associate tags with a rule, you must have the `cloudwatch:TagResource`
     * permission in addition to the `cloudwatch:PutInsightRule` permission.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CfnInsightRuleProps.Builder =
        software.amazon.awscdk.services.cloudwatch.CfnInsightRuleProps.builder()

    /**
     * @param ruleBody The definition of the rule, as a JSON object. 
     * For details about the syntax, see [Contributor Insights Rule
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights-RuleSyntax.html)
     * in the *Amazon CloudWatch User Guide* .
     */
    override fun ruleBody(ruleBody: String) {
      cdkBuilder.ruleBody(ruleBody)
    }

    /**
     * @param ruleName The name of the rule. 
     */
    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    /**
     * @param ruleState The current state of the rule. 
     * Valid values are `ENABLED` and `DISABLED` .
     */
    override fun ruleState(ruleState: String) {
      cdkBuilder.ruleState(ruleState)
    }

    /**
     * @param tags A list of key-value pairs to associate with the Contributor Insights rule.
     * You can associate as many as 50 tags with a rule.
     *
     * Tags can help you organize and categorize your resources. For more information, see [Tagging
     * Your Amazon CloudWatch
     * Resources](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Tagging.html)
     * .
     *
     * To be able to associate tags with a rule, you must have the `cloudwatch:TagResource`
     * permission in addition to the `cloudwatch:PutInsightRule` permission.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of key-value pairs to associate with the Contributor Insights rule.
     * You can associate as many as 50 tags with a rule.
     *
     * Tags can help you organize and categorize your resources. For more information, see [Tagging
     * Your Amazon CloudWatch
     * Resources](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Tagging.html)
     * .
     *
     * To be able to associate tags with a rule, you must have the `cloudwatch:TagResource`
     * permission in addition to the `cloudwatch:PutInsightRule` permission.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cloudwatch.CfnInsightRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.CfnInsightRuleProps,
  ) : CdkObject(cdkObject), CfnInsightRuleProps {
    /**
     * The definition of the rule, as a JSON object.
     *
     * For details about the syntax, see [Contributor Insights Rule
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights-RuleSyntax.html)
     * in the *Amazon CloudWatch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulebody)
     */
    override fun ruleBody(): String = unwrap(this).getRuleBody()

    /**
     * The name of the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulename)
     */
    override fun ruleName(): String = unwrap(this).getRuleName()

    /**
     * The current state of the rule.
     *
     * Valid values are `ENABLED` and `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulestate)
     */
    override fun ruleState(): String = unwrap(this).getRuleState()

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
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInsightRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnInsightRuleProps):
        CfnInsightRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInsightRuleProps):
        software.amazon.awscdk.services.cloudwatch.CfnInsightRuleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.CfnInsightRuleProps
  }
}
