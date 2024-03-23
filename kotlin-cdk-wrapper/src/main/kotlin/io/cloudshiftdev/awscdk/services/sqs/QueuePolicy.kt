@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 * import io.cloudshiftdev.awscdk.services.sqs.*;
 * Queue queue;
 * QueuePolicy queuePolicy = QueuePolicy.Builder.create(this, "MyQueuePolicy")
 * .queues(List.of(queue))
 * .build();
 * ```
 */
public open class QueuePolicy(
  cdkObject: software.amazon.awscdk.services.sqs.QueuePolicy,
) : Resource(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: QueuePolicyProps,
  ) :
      this(software.amazon.awscdk.services.sqs.QueuePolicy(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(QueuePolicyProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: QueuePolicyProps.Builder.() -> Unit,
  ) : this(scope, id, QueuePolicyProps(props)
  )

  /**
   * The IAM policy document for this policy.
   */
  public open fun document(): PolicyDocument = unwrap(this).getDocument().let(PolicyDocument::wrap)

  /**
   * Not currently supported by AWS CloudFormation.
   *
   * This attribute temporarily existed in CloudFormation, and then was removed again.
   */
  public open fun queuePolicyId(): String = unwrap(this).getQueuePolicyId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sqs.QueuePolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The set of queues this policy applies to.
     *
     * @param queues The set of queues this policy applies to. 
     */
    public fun queues(queues: List<IQueue>)

    /**
     * The set of queues this policy applies to.
     *
     * @param queues The set of queues this policy applies to. 
     */
    public fun queues(vararg queues: IQueue)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sqs.QueuePolicy.Builder =
        software.amazon.awscdk.services.sqs.QueuePolicy.Builder.create(scope, id)

    /**
     * The set of queues this policy applies to.
     *
     * @param queues The set of queues this policy applies to. 
     */
    override fun queues(queues: List<IQueue>) {
      cdkBuilder.queues(queues.map(IQueue::unwrap))
    }

    /**
     * The set of queues this policy applies to.
     *
     * @param queues The set of queues this policy applies to. 
     */
    override fun queues(vararg queues: IQueue): Unit = queues(queues.toList())

    public fun build(): software.amazon.awscdk.services.sqs.QueuePolicy = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): QueuePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return QueuePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.QueuePolicy): QueuePolicy =
        QueuePolicy(cdkObject)

    internal fun unwrap(wrapped: QueuePolicy): software.amazon.awscdk.services.sqs.QueuePolicy =
        wrapped.cdkObject as software.amazon.awscdk.services.sqs.QueuePolicy
  }
}
