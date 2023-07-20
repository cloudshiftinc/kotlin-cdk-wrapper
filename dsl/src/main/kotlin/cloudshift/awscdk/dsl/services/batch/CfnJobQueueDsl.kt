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

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobQueue
import software.constructs.Construct
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnJobQueueDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnJobQueue.Builder = CfnJobQueue.Builder.create(scope, id)

    private val _computeEnvironmentOrder: MutableList<Any> = mutableListOf()

    public fun computeEnvironmentOrder(vararg computeEnvironmentOrder: Any) {
        _computeEnvironmentOrder.addAll(listOf(*computeEnvironmentOrder))
    }

    public fun computeEnvironmentOrder(computeEnvironmentOrder: Collection<Any>) {
        _computeEnvironmentOrder.addAll(computeEnvironmentOrder)
    }

    public fun computeEnvironmentOrder(computeEnvironmentOrder: IResolvable) {
        cdkBuilder.computeEnvironmentOrder(computeEnvironmentOrder)
    }

    public fun jobQueueName(jobQueueName: String) {
        cdkBuilder.jobQueueName(jobQueueName)
    }

    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    public fun schedulingPolicyArn(schedulingPolicyArn: String) {
        cdkBuilder.schedulingPolicyArn(schedulingPolicyArn)
    }

    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnJobQueue {
        if (_computeEnvironmentOrder.isNotEmpty()) {
            cdkBuilder.computeEnvironmentOrder(_computeEnvironmentOrder)
        }
        return cdkBuilder.build()
    }
}
