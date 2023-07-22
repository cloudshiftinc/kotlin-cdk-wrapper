@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sqs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sqs.IQueue
import software.amazon.awscdk.services.sqs.QueuePolicyProps

/**
 * Properties to associate SQS queues with a policy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sqs.*;
 * Queue queue;
 * QueuePolicyProps queuePolicyProps = QueuePolicyProps.builder()
 * .queues(List.of(queue))
 * .build();
 * ```
 */
@CdkDslMarker
public class QueuePolicyPropsDsl {
  private val cdkBuilder: QueuePolicyProps.Builder = QueuePolicyProps.builder()

  private val _queues: MutableList<IQueue> = mutableListOf()

  /**
   * @param queues The set of queues this policy applies to. 
   */
  public fun queues(vararg queues: IQueue) {
    _queues.addAll(listOf(*queues))
  }

  /**
   * @param queues The set of queues this policy applies to. 
   */
  public fun queues(queues: Collection<IQueue>) {
    _queues.addAll(queues)
  }

  public fun build(): QueuePolicyProps {
    if(_queues.isNotEmpty()) cdkBuilder.queues(_queues)
    return cdkBuilder.build()
  }
}
