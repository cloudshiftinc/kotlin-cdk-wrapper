@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnQueuePolicyProps {
  public fun policyDocument(): Any

  public fun queues(): List<String>

  @CdkDslMarker
  public interface Builder {
    public fun policyDocument(policyDocument: Any)

    public fun queues(queues: List<String>)

    public fun queues(vararg queues: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sqs.CfnQueuePolicyProps.Builder =
        software.amazon.awscdk.services.sqs.CfnQueuePolicyProps.builder()

    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    override fun queues(queues: List<String>) {
      cdkBuilder.queues(queues)
    }

    override fun queues(vararg queues: String): Unit = queues(queues.toList())

    public fun build(): software.amazon.awscdk.services.sqs.CfnQueuePolicyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sqs.CfnQueuePolicyProps,
  ) : CdkObject(cdkObject), CfnQueuePolicyProps {
    override fun policyDocument(): Any = unwrap(this).getPolicyDocument()

    override fun queues(): List<String> = unwrap(this).getQueues()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnQueuePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.CfnQueuePolicyProps):
        CfnQueuePolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnQueuePolicyProps):
        software.amazon.awscdk.services.sqs.CfnQueuePolicyProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sqs.CfnQueuePolicyProps
  }
}
