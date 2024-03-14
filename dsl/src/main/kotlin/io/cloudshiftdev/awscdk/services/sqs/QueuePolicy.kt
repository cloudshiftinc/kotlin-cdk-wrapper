package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class QueuePolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sqs.QueuePolicy,
) : Resource(cdkObject) {
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
    init {

    }

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
        wrapped.cdkObject
  }
}
