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

package io.cloudshiftdev.awscdkdsl.services.sns

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sns.CfnTopicPolicyProps

/**
 * Properties for defining a `CfnTopicPolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sns.*;
 * Object policyDocument;
 * CfnTopicPolicyProps cfnTopicPolicyProps = CfnTopicPolicyProps.builder()
 * .policyDocument(policyDocument)
 * .topics(List.of("topics"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicpolicy.html)
 */
@CdkDslMarker
public class CfnTopicPolicyPropsDsl {
    private val cdkBuilder: CfnTopicPolicyProps.Builder = CfnTopicPolicyProps.builder()

    private val _topics: MutableList<String> = mutableListOf()

    /**
     * @param policyDocument A policy document that contains permissions to add to the specified SNS
     *   topics.
     */
    public fun policyDocument(policyDocument: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policyDocument)
        cdkBuilder.policyDocument(builder.map)
    }

    /**
     * @param policyDocument A policy document that contains permissions to add to the specified SNS
     *   topics.
     */
    public fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * @param topics The Amazon Resource Names (ARN) of the topics to which you want to add the
     *   policy. You can use the
     *   `[Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)`
     *   function to specify an
     *   `[AWS::SNS::Topic](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html)`
     *   resource.
     */
    public fun topics(vararg topics: String) {
        _topics.addAll(listOf(*topics))
    }

    /**
     * @param topics The Amazon Resource Names (ARN) of the topics to which you want to add the
     *   policy. You can use the
     *   `[Ref](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-ref.html)`
     *   function to specify an
     *   `[AWS::SNS::Topic](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html)`
     *   resource.
     */
    public fun topics(topics: Collection<String>) {
        _topics.addAll(topics)
    }

    public fun build(): CfnTopicPolicyProps {
        if (_topics.isNotEmpty()) cdkBuilder.topics(_topics)
        return cdkBuilder.build()
    }
}
