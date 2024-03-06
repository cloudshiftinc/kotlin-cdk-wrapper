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
import io.cloudshiftdev.awscdkdsl.services.iam.PolicyDocumentDsl
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.PolicyDocument
import software.amazon.awscdk.services.sns.ITopic
import software.amazon.awscdk.services.sns.TopicPolicyProps

/**
 * Properties to associate SNS topics with a policy.
 *
 * Example:
 * ```
 * Topic topic = new Topic(this, "Topic");
 * PolicyDocument policyDocument = PolicyDocument.Builder.create()
 * .assignSids(true)
 * .statements(List.of(
 * PolicyStatement.Builder.create()
 * .actions(List.of("sns:Subscribe"))
 * .principals(List.of(new AnyPrincipal()))
 * .resources(List.of(topic.getTopicArn()))
 * .build()))
 * .build();
 * TopicPolicy topicPolicy = TopicPolicy.Builder.create(this, "Policy")
 * .topics(List.of(topic))
 * .policyDocument(policyDocument)
 * .build();
 * ```
 */
@CdkDslMarker
public class TopicPolicyPropsDsl {
    private val cdkBuilder: TopicPolicyProps.Builder = TopicPolicyProps.builder()

    private val _topics: MutableList<ITopic> = mutableListOf()

    /**
     * @param enforceSsl Adds a statement to enforce encryption of data in transit when publishing
     *   to the topic. For more information, see
     *   https://docs.aws.amazon.com/sns/latest/dg/sns-security-best-practices.html#enforce-encryption-data-in-transit.
     */
    public fun enforceSsl(enforceSsl: Boolean) {
        cdkBuilder.enforceSsl(enforceSsl)
    }

    /** @param policyDocument IAM policy document to apply to topic(s). */
    public fun policyDocument(policyDocument: PolicyDocumentDsl.() -> Unit = {}) {
        val builder = PolicyDocumentDsl()
        builder.apply(policyDocument)
        cdkBuilder.policyDocument(builder.build())
    }

    /** @param policyDocument IAM policy document to apply to topic(s). */
    public fun policyDocument(policyDocument: PolicyDocument) {
        cdkBuilder.policyDocument(policyDocument)
    }

    /** @param topics The set of topics this policy applies to. */
    public fun topics(vararg topics: ITopic) {
        _topics.addAll(listOf(*topics))
    }

    /** @param topics The set of topics this policy applies to. */
    public fun topics(topics: Collection<ITopic>) {
        _topics.addAll(topics)
    }

    public fun build(): TopicPolicyProps {
        if (_topics.isNotEmpty()) cdkBuilder.topics(_topics)
        return cdkBuilder.build()
    }
}
