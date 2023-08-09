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

package cloudshift.awscdk.dsl.services.sns

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sns.CfnTopicInlinePolicy
import software.constructs.Construct

/**
 * Schema for AWS::SNS::TopicInlinePolicy.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sns.*;
 * Object policyDocument;
 * CfnTopicInlinePolicy cfnTopicInlinePolicy = CfnTopicInlinePolicy.Builder.create(this,
 * "MyCfnTopicInlinePolicy")
 * .policyDocument(policyDocument)
 * .topicArn("topicArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicinlinepolicy.html)
 */
@CdkDslMarker
public class CfnTopicInlinePolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTopicInlinePolicy.Builder =
        CfnTopicInlinePolicy.Builder.create(scope, id)

    /**
     * A policy document that contains permissions to add to the specified SNS topics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicinlinepolicy.html#cfn-sns-topicinlinepolicy-policydocument)
     *
     * @param policyDocument A policy document that contains permissions to add to the specified SNS
     *   topics.
     */
    public fun policyDocument(policyDocument: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policyDocument)
        cdkBuilder.policyDocument(builder.map)
    }

    /**
     * A policy document that contains permissions to add to the specified SNS topics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicinlinepolicy.html#cfn-sns-topicinlinepolicy-policydocument)
     *
     * @param policyDocument A policy document that contains permissions to add to the specified SNS
     *   topics.
     */
    public fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * The Amazon Resource Name (ARN) of the topic to which you want to add the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicinlinepolicy.html#cfn-sns-topicinlinepolicy-topicarn)
     *
     * @param topicArn The Amazon Resource Name (ARN) of the topic to which you want to add the
     *   policy.
     */
    public fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
    }

    public fun build(): CfnTopicInlinePolicy = cdkBuilder.build()
}
