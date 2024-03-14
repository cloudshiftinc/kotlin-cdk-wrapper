package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnQueuePolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sqs.CfnQueuePolicy,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun policyDocument(): Any = unwrap(this).getPolicyDocument()

  public open fun policyDocument(`value`: Any) {
    unwrap(this).setPolicyDocument(`value`)
  }

  public open fun queues(): List<String> = unwrap(this).getQueues()

  public open fun queues(`value`: List<String>) {
    unwrap(this).setQueues(`value`)
  }

  public open fun queues(vararg `value`: String): Unit = queues(`value`.toList())

  public interface Builder {
    public fun policyDocument(policyDocument: Any)

    public fun queues(queues: List<String>)

    public fun queues(vararg queues: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sqs.CfnQueuePolicy.Builder =
        software.amazon.awscdk.services.sqs.CfnQueuePolicy.Builder.create(scope, id)

    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    override fun queues(queues: List<String>) {
      cdkBuilder.queues(queues)
    }

    override fun queues(vararg queues: String): Unit = queues(queues.toList())

    public fun build(): software.amazon.awscdk.services.sqs.CfnQueuePolicy = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnQueuePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnQueuePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.CfnQueuePolicy): CfnQueuePolicy
        = CfnQueuePolicy(cdkObject)

    internal fun unwrap(wrapped: CfnQueuePolicy): software.amazon.awscdk.services.sqs.CfnQueuePolicy
        = wrapped.cdkObject
  }
}
