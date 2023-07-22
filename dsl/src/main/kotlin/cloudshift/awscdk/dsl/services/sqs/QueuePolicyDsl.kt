@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sqs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sqs.IQueue
import software.amazon.awscdk.services.sqs.QueuePolicy
import software.constructs.Construct

/**
 * The policy for an SQS Queue.
 *
 * Policies define the operations that are allowed on this resource.
 *
 * You almost never need to define this construct directly.
 *
 * All AWS resources that support resource policies have a method called
 * `addToResourcePolicy()`, which will automatically create a new resource
 * policy if one doesn't exist yet, otherwise it will add to the existing
 * policy.
 *
 * Prefer to use `addToResourcePolicy()` instead.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sqs.*;
 * Queue queue;
 * QueuePolicy queuePolicy = QueuePolicy.Builder.create(this, "MyQueuePolicy")
 * .queues(List.of(queue))
 * .build();
 * ```
 */
@CdkDslMarker
public class QueuePolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: QueuePolicy.Builder = QueuePolicy.Builder.create(scope, id)

  private val _queues: MutableList<IQueue> = mutableListOf()

  /**
   * The set of queues this policy applies to.
   *
   * @param queues The set of queues this policy applies to. 
   */
  public fun queues(vararg queues: IQueue) {
    _queues.addAll(listOf(*queues))
  }

  /**
   * The set of queues this policy applies to.
   *
   * @param queues The set of queues this policy applies to. 
   */
  public fun queues(queues: Collection<IQueue>) {
    _queues.addAll(queues)
  }

  public fun build(): QueuePolicy {
    if(_queues.isNotEmpty()) cdkBuilder.queues(_queues)
    return cdkBuilder.build()
  }
}
