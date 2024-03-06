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
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.PolicyDocument
import software.amazon.awscdk.services.sns.ITopic
import software.amazon.awscdk.services.sns.TopicPolicy
import software.constructs.Construct

/**
 * The policy for an SNS Topic.
 *
 * Policies define the operations that are allowed on this resource.
 *
 * You almost never need to define this construct directly.
 *
 * All AWS resources that support resource policies have a method called `addToResourcePolicy()`,
 * which will automatically create a new resource policy if one doesn't exist yet, otherwise it will
 * add to the existing policy.
 *
 * Prefer to use `addToResourcePolicy()` instead.
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
public class TopicPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: TopicPolicy.Builder = TopicPolicy.Builder.create(scope, id)

    private val _topics: MutableList<ITopic> = mutableListOf()

    /**
     * Adds a statement to enforce encryption of data in transit when publishing to the topic.
     *
     * For more information, see
     * https://docs.aws.amazon.com/sns/latest/dg/sns-security-best-practices.html#enforce-encryption-data-in-transit.
     *
     * Default: false
     *
     * @param enforceSsl Adds a statement to enforce encryption of data in transit when publishing
     *   to the topic.
     */
    public fun enforceSsl(enforceSsl: Boolean) {
        cdkBuilder.enforceSsl(enforceSsl)
    }

    /**
     * IAM policy document to apply to topic(s).
     *
     * Default: empty policy document
     *
     * @param policyDocument IAM policy document to apply to topic(s).
     */
    public fun policyDocument(policyDocument: PolicyDocumentDsl.() -> Unit = {}) {
        val builder = PolicyDocumentDsl()
        builder.apply(policyDocument)
        cdkBuilder.policyDocument(builder.build())
    }

    /**
     * IAM policy document to apply to topic(s).
     *
     * Default: empty policy document
     *
     * @param policyDocument IAM policy document to apply to topic(s).
     */
    public fun policyDocument(policyDocument: PolicyDocument) {
        cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * The set of topics this policy applies to.
     *
     * @param topics The set of topics this policy applies to.
     */
    public fun topics(vararg topics: ITopic) {
        _topics.addAll(listOf(*topics))
    }

    /**
     * The set of topics this policy applies to.
     *
     * @param topics The set of topics this policy applies to.
     */
    public fun topics(topics: Collection<ITopic>) {
        _topics.addAll(topics)
    }

    public fun build(): TopicPolicy {
        if (_topics.isNotEmpty()) cdkBuilder.topics(_topics)
        return cdkBuilder.build()
    }
}
