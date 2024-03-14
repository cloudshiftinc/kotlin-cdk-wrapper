package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnQueueInlinePolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sqs.CfnQueueInlinePolicy,
) : CfnResource(cdkObject), IInspectable {
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun policyDocument(): Any = unwrap(this).getPolicyDocument()

  public open fun policyDocument(`value`: Any) {
    unwrap(this).setPolicyDocument(`value`)
  }

  public open fun queue(): String = unwrap(this).getQueue()

  public open fun queue(`value`: String) {
    unwrap(this).setQueue(`value`)
  }

  public interface Builder {
    public fun policyDocument(policyDocument: Any) {
    }

    public fun queue(queue: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sqs.CfnQueueInlinePolicy.Builder =
        software.amazon.awscdk.services.sqs.CfnQueueInlinePolicy.Builder.create(scope, id)

    public override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    public override fun queue(queue: String) {
      cdkBuilder.queue(queue)
    }

    public fun build(): software.amazon.awscdk.services.sqs.CfnQueueInlinePolicy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnQueueInlinePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnQueueInlinePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.CfnQueueInlinePolicy):
        CfnQueueInlinePolicy = CfnQueueInlinePolicy(cdkObject)

    internal fun unwrap(wrapped: CfnQueueInlinePolicy):
        software.amazon.awscdk.services.sqs.CfnQueueInlinePolicy = wrapped.cdkObject
  }
}
