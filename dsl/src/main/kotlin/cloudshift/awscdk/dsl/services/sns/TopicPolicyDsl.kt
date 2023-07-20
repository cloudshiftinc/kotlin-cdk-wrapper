@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.sns

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.iam.PolicyDocumentDsl
import software.amazon.awscdk.services.iam.PolicyDocument
import software.amazon.awscdk.services.sns.ITopic
import software.amazon.awscdk.services.sns.TopicPolicy
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class TopicPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: TopicPolicy.Builder = TopicPolicy.Builder.create(scope, id)

    private val _topics: MutableList<ITopic> = mutableListOf()

    public fun policyDocument(block: PolicyDocumentDsl.() -> Unit = {}) {
        val builder = PolicyDocumentDsl()
        builder.apply(block)
        cdkBuilder.policyDocument(builder.build())
    }

    public fun policyDocument(policyDocument: PolicyDocument) {
        cdkBuilder.policyDocument(policyDocument)
    }

    public fun topics(vararg topics: ITopic) {
        _topics.addAll(listOf(*topics))
    }

    public fun topics(topics: Collection<ITopic>) {
        _topics.addAll(topics)
    }

    public fun build(): TopicPolicy {
        if (_topics.isNotEmpty()) cdkBuilder.topics(_topics)
        return cdkBuilder.build()
    }
}
