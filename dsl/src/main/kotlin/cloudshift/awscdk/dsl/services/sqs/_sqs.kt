@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sqs

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sqs.CfnQueue
import software.amazon.awscdk.services.sqs.CfnQueuePolicy
import software.amazon.awscdk.services.sqs.CfnQueuePolicyProps
import software.amazon.awscdk.services.sqs.CfnQueueProps
import software.amazon.awscdk.services.sqs.DeadLetterQueue
import software.amazon.awscdk.services.sqs.Queue
import software.amazon.awscdk.services.sqs.QueueAttributes
import software.amazon.awscdk.services.sqs.QueuePolicy
import software.amazon.awscdk.services.sqs.QueuePolicyProps
import software.amazon.awscdk.services.sqs.QueueProps
import software.constructs.Construct

public object sqs {
  public inline fun cfnQueue(
    scope: Construct,
    id: String,
    block: CfnQueueDsl.() -> Unit = {},
  ): CfnQueue {
    val builder = CfnQueueDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnQueuePolicy(
    scope: Construct,
    id: String,
    block: CfnQueuePolicyDsl.() -> Unit = {},
  ): CfnQueuePolicy {
    val builder = CfnQueuePolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnQueuePolicyProps(block: CfnQueuePolicyPropsDsl.() -> Unit = {}):
      CfnQueuePolicyProps {
    val builder = CfnQueuePolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnQueueProps(block: CfnQueuePropsDsl.() -> Unit = {}): CfnQueueProps {
    val builder = CfnQueuePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun deadLetterQueue(block: DeadLetterQueueDsl.() -> Unit = {}): DeadLetterQueue {
    val builder = DeadLetterQueueDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun queue(
    scope: Construct,
    id: String,
    block: QueueDsl.() -> Unit = {},
  ): Queue {
    val builder = QueueDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun queueAttributes(block: QueueAttributesDsl.() -> Unit = {}): QueueAttributes {
    val builder = QueueAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun queuePolicy(
    scope: Construct,
    id: String,
    block: QueuePolicyDsl.() -> Unit = {},
  ): QueuePolicy {
    val builder = QueuePolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun queuePolicyProps(block: QueuePolicyPropsDsl.() -> Unit = {}): QueuePolicyProps {
    val builder = QueuePolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun queueProps(block: QueuePropsDsl.() -> Unit = {}): QueueProps {
    val builder = QueuePropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
