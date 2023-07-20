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

package cloudshift.awscdk.dsl.services.sqs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.sqs.CfnQueuePolicy
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnQueuePolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnQueuePolicy.Builder = CfnQueuePolicy.Builder.create(scope, id)

    private val _queues: MutableList<String> = mutableListOf()

    public fun policyDocument(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.policyDocument(builder.map)
    }

    public fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
    }

    public fun queues(vararg queues: String) {
        _queues.addAll(listOf(*queues))
    }

    public fun queues(queues: Collection<String>) {
        _queues.addAll(queues)
    }

    public fun build(): CfnQueuePolicy {
        if (_queues.isNotEmpty()) cdkBuilder.queues(_queues)
        return cdkBuilder.build()
    }
}
