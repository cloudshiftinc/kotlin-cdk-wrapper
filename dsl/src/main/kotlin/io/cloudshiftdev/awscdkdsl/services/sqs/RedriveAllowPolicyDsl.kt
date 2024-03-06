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

package io.cloudshiftdev.awscdkdsl.services.sqs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sqs.IQueue
import software.amazon.awscdk.services.sqs.RedriveAllowPolicy
import software.amazon.awscdk.services.sqs.RedrivePermission

/**
 * Permission settings for the dead letter source queue.
 *
 * Example:
 * ```
 * IQueue sourceQueue;
 * // Only the sourceQueue can specify this queue as the dead-letter queue.
 * Queue queue1 = Queue.Builder.create(this, "Queue2")
 * .redriveAllowPolicy(RedriveAllowPolicy.builder()
 * .sourceQueues(List.of(sourceQueue))
 * .build())
 * .build();
 * // No source queues can specify this queue as the dead-letter queue.
 * Queue queue2 = Queue.Builder.create(this, "Queue")
 * .redriveAllowPolicy(RedriveAllowPolicy.builder()
 * .redrivePermission(RedrivePermission.DENY_ALL)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class RedriveAllowPolicyDsl {
    private val cdkBuilder: RedriveAllowPolicy.Builder = RedriveAllowPolicy.builder()

    private val _sourceQueues: MutableList<IQueue> = mutableListOf()

    /**
     * @param redrivePermission Permission settings for source queues that can designate this queue
     *   as their dead-letter queue.
     */
    public fun redrivePermission(redrivePermission: RedrivePermission) {
        cdkBuilder.redrivePermission(redrivePermission)
    }

    /**
     * @param sourceQueues Source queues that can designate this queue as their dead-letter queue.
     *   When `redrivePermission` is set to `RedrivePermission.BY_QUEUE`, this parameter is
     *   required.
     *
     * You can specify up to 10 source queues. To allow more than 10 source queues to specify
     * dead-letter queues, set the `redrivePermission` to `RedrivePermission.ALLOW_ALL`.
     *
     * When `redrivePermission` is either `RedrivePermission.ALLOW_ALL` or
     * `RedrivePermission.DENY_ALL`, this parameter cannot be set.
     */
    public fun sourceQueues(vararg sourceQueues: IQueue) {
        _sourceQueues.addAll(listOf(*sourceQueues))
    }

    /**
     * @param sourceQueues Source queues that can designate this queue as their dead-letter queue.
     *   When `redrivePermission` is set to `RedrivePermission.BY_QUEUE`, this parameter is
     *   required.
     *
     * You can specify up to 10 source queues. To allow more than 10 source queues to specify
     * dead-letter queues, set the `redrivePermission` to `RedrivePermission.ALLOW_ALL`.
     *
     * When `redrivePermission` is either `RedrivePermission.ALLOW_ALL` or
     * `RedrivePermission.DENY_ALL`, this parameter cannot be set.
     */
    public fun sourceQueues(sourceQueues: Collection<IQueue>) {
        _sourceQueues.addAll(sourceQueues)
    }

    public fun build(): RedriveAllowPolicy {
        if (_sourceQueues.isNotEmpty()) cdkBuilder.sourceQueues(_sourceQueues)
        return cdkBuilder.build()
    }
}
