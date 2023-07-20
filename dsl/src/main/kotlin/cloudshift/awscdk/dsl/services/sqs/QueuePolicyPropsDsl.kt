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
import software.amazon.awscdk.services.sqs.IQueue
import software.amazon.awscdk.services.sqs.QueuePolicyProps
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class QueuePolicyPropsDsl {
    private val cdkBuilder: QueuePolicyProps.Builder = QueuePolicyProps.builder()

    private val _queues: MutableList<IQueue> = mutableListOf()

    public fun queues(vararg queues: IQueue) {
        _queues.addAll(listOf(*queues))
    }

    public fun queues(queues: Collection<IQueue>) {
        _queues.addAll(queues)
    }

    public fun build(): QueuePolicyProps {
        if (_queues.isNotEmpty()) cdkBuilder.queues(_queues)
        return cdkBuilder.build()
    }
}
