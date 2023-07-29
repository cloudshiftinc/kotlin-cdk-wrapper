@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.cloudwatch.CfnInsightRuleProps

/**
 * Properties for defining a `CfnInsightRule`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudwatch.*;
 * CfnInsightRuleProps cfnInsightRuleProps = CfnInsightRuleProps.builder()
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
@CdkDslMarker
public class CfnInsightRulePropsDsl {
    private val cdkBuilder: CfnInsightRuleProps.Builder = CfnInsightRuleProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param ruleBody The definition of the rule, as a JSON object. For details about the syntax,
     *   see
     *   [Contributor Insights Rule Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights-RuleSyntax.html)
     *   in the *Amazon CloudWatch User Guide* .
     */
    public fun ruleBody(ruleBody: String) {
        cdkBuilder.ruleBody(ruleBody)
    }

    /** @param ruleName The name of the rule. */
    public fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
    }

    /**
     * @param ruleState The current state of the rule. Valid values are `ENABLED` and `DISABLED` .
     */
    public fun ruleState(ruleState: String) {
        cdkBuilder.ruleState(ruleState)
    }

    /**
     * @param tags A list of key-value pairs to associate with the Contributor Insights rule. You
     *   can associate as many as 50 tags with a rule.
     *
     * Tags can help you organize and categorize your resources. For more information, see
     * [Tagging Your Amazon CloudWatch Resources](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Tagging.html)
     * .
     *
     * To be able to associate tags with a rule, you must have the `cloudwatch:TagResource`
     * permission in addition to the `cloudwatch:PutInsightRule` permission.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A list of key-value pairs to associate with the Contributor Insights rule. You
     *   can associate as many as 50 tags with a rule.
     *
     * Tags can help you organize and categorize your resources. For more information, see
     * [Tagging Your Amazon CloudWatch Resources](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Tagging.html)
     * .
     *
     * To be able to associate tags with a rule, you must have the `cloudwatch:TagResource`
     * permission in addition to the `cloudwatch:PutInsightRule` permission.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnInsightRuleProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
