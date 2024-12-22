@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

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
 * Properties for defining a `CfnMailManagerRuleSet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * Object drop;
 * CfnMailManagerRuleSetProps cfnMailManagerRuleSetProps = CfnMailManagerRuleSetProps.builder()
 * .rules(List.of(RuleProperty.builder()
 * .actions(List.of(RuleActionProperty.builder()
 * .addHeader(AddHeaderActionProperty.builder()
 * .headerName("headerName")
 * .headerValue("headerValue")
 * .build())
 * .archive(ArchiveActionProperty.builder()
 * .targetArchive("targetArchive")
 * // the properties below are optional
 * .actionFailurePolicy("actionFailurePolicy")
 * .build())
 * .deliverToMailbox(DeliverToMailboxActionProperty.builder()
 * .mailboxArn("mailboxArn")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .actionFailurePolicy("actionFailurePolicy")
 * .build())
 * .drop(drop)
 * .relay(RelayActionProperty.builder()
 * .relay("relay")
 * // the properties below are optional
 * .actionFailurePolicy("actionFailurePolicy")
 * .mailFrom("mailFrom")
 * .build())
 * .replaceRecipient(ReplaceRecipientActionProperty.builder()
 * .replaceWith(List.of("replaceWith"))
 * .build())
 * .send(SendActionProperty.builder()
 * .roleArn("roleArn")
 * // the properties below are optional
 * .actionFailurePolicy("actionFailurePolicy")
 * .build())
 * .writeToS3(S3ActionProperty.builder()
 * .roleArn("roleArn")
 * .s3Bucket("s3Bucket")
 * // the properties below are optional
 * .actionFailurePolicy("actionFailurePolicy")
 * .s3Prefix("s3Prefix")
 * .s3SseKmsKeyId("s3SseKmsKeyId")
 * .build())
 * .build()))
 * // the properties below are optional
 * .conditions(List.of(RuleConditionProperty.builder()
 * .booleanExpression(RuleBooleanExpressionProperty.builder()
 * .evaluate(RuleBooleanToEvaluateProperty.builder()
 * .attribute("attribute")
 * .build())
 * .operator("operator")
 * .build())
 * .dmarcExpression(RuleDmarcExpressionProperty.builder()
 * .operator("operator")
 * .values(List.of("values"))
 * .build())
 * .ipExpression(RuleIpExpressionProperty.builder()
 * .evaluate(RuleIpToEvaluateProperty.builder()
 * .attribute("attribute")
 * .build())
 * .operator("operator")
 * .values(List.of("values"))
 * .build())
 * .numberExpression(RuleNumberExpressionProperty.builder()
 * .evaluate(RuleNumberToEvaluateProperty.builder()
 * .attribute("attribute")
 * .build())
 * .operator("operator")
 * .value(123)
 * .build())
 * .stringExpression(RuleStringExpressionProperty.builder()
 * .evaluate(RuleStringToEvaluateProperty.builder()
 * .attribute("attribute")
 * .mimeHeaderAttribute("mimeHeaderAttribute")
 * .build())
 * .operator("operator")
 * .values(List.of("values"))
 * .build())
 * .verdictExpression(RuleVerdictExpressionProperty.builder()
 * .evaluate(RuleVerdictToEvaluateProperty.builder()
 * .analysis(AnalysisProperty.builder()
 * .analyzer("analyzer")
 * .resultField("resultField")
 * .build())
 * .attribute("attribute")
 * .build())
 * .operator("operator")
 * .values(List.of("values"))
 * .build())
 * .build()))
 * .name("name")
 * .unless(List.of(RuleConditionProperty.builder()
 * .booleanExpression(RuleBooleanExpressionProperty.builder()
 * .evaluate(RuleBooleanToEvaluateProperty.builder()
 * .attribute("attribute")
 * .build())
 * .operator("operator")
 * .build())
 * .dmarcExpression(RuleDmarcExpressionProperty.builder()
 * .operator("operator")
 * .values(List.of("values"))
 * .build())
 * .ipExpression(RuleIpExpressionProperty.builder()
 * .evaluate(RuleIpToEvaluateProperty.builder()
 * .attribute("attribute")
 * .build())
 * .operator("operator")
 * .values(List.of("values"))
 * .build())
 * .numberExpression(RuleNumberExpressionProperty.builder()
 * .evaluate(RuleNumberToEvaluateProperty.builder()
 * .attribute("attribute")
 * .build())
 * .operator("operator")
 * .value(123)
 * .build())
 * .stringExpression(RuleStringExpressionProperty.builder()
 * .evaluate(RuleStringToEvaluateProperty.builder()
 * .attribute("attribute")
 * .mimeHeaderAttribute("mimeHeaderAttribute")
 * .build())
 * .operator("operator")
 * .values(List.of("values"))
 * .build())
 * .verdictExpression(RuleVerdictExpressionProperty.builder()
 * .evaluate(RuleVerdictToEvaluateProperty.builder()
 * .analysis(AnalysisProperty.builder()
 * .analyzer("analyzer")
 * .resultField("resultField")
 * .build())
 * .attribute("attribute")
 * .build())
 * .operator("operator")
 * .values(List.of("values"))
 * .build())
 * .build()))
 * .build()))
 * // the properties below are optional
 * .ruleSetName("ruleSetName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerruleset.html)
 */
public interface CfnMailManagerRuleSetProps {
  /**
   * A user-friendly name for the rule set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerruleset.html#cfn-ses-mailmanagerruleset-rulesetname)
   */
  public fun ruleSetName(): String? = unwrap(this).getRuleSetName()

  /**
   * Conditional rules that are evaluated for determining actions on email.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerruleset.html#cfn-ses-mailmanagerruleset-rules)
   */
  public fun rules(): Any

  /**
   * The tags used to organize, track, or control access for the resource.
   *
   * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerruleset.html#cfn-ses-mailmanagerruleset-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnMailManagerRuleSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ruleSetName A user-friendly name for the rule set.
     */
    public fun ruleSetName(ruleSetName: String)

    /**
     * @param rules Conditional rules that are evaluated for determining actions on email. 
     */
    public fun rules(rules: IResolvable)

    /**
     * @param rules Conditional rules that are evaluated for determining actions on email. 
     */
    public fun rules(rules: List<Any>)

    /**
     * @param rules Conditional rules that are evaluated for determining actions on email. 
     */
    public fun rules(vararg rules: Any)

    /**
     * @param tags The tags used to organize, track, or control access for the resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for the resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnMailManagerRuleSetProps.Builder =
        software.amazon.awscdk.services.ses.CfnMailManagerRuleSetProps.builder()

    /**
     * @param ruleSetName A user-friendly name for the rule set.
     */
    override fun ruleSetName(ruleSetName: String) {
      cdkBuilder.ruleSetName(ruleSetName)
    }

    /**
     * @param rules Conditional rules that are evaluated for determining actions on email. 
     */
    override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param rules Conditional rules that are evaluated for determining actions on email. 
     */
    override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param rules Conditional rules that are evaluated for determining actions on email. 
     */
    override fun rules(vararg rules: Any): Unit = rules(rules.toList())

    /**
     * @param tags The tags used to organize, track, or control access for the resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for the resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ses.CfnMailManagerRuleSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSetProps,
  ) : CdkObject(cdkObject),
      CfnMailManagerRuleSetProps {
    /**
     * A user-friendly name for the rule set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerruleset.html#cfn-ses-mailmanagerruleset-rulesetname)
     */
    override fun ruleSetName(): String? = unwrap(this).getRuleSetName()

    /**
     * Conditional rules that are evaluated for determining actions on email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerruleset.html#cfn-ses-mailmanagerruleset-rules)
     */
    override fun rules(): Any = unwrap(this).getRules()

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerruleset.html#cfn-ses-mailmanagerruleset-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMailManagerRuleSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSetProps):
        CfnMailManagerRuleSetProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnMailManagerRuleSetProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMailManagerRuleSetProps):
        software.amazon.awscdk.services.ses.CfnMailManagerRuleSetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ses.CfnMailManagerRuleSetProps
  }
}
