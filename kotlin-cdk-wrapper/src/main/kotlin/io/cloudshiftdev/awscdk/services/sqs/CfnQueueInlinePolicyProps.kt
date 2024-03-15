@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnQueueInlinePolicyProps {
  public fun policyDocument(): Any

  public fun queue(): String

  @CdkDslMarker
  public interface Builder {
    public fun policyDocument(policyDocument: Any)

    public fun queue(queue: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sqs.CfnQueueInlinePolicyProps.Builder =
        software.amazon.awscdk.services.sqs.CfnQueueInlinePolicyProps.builder()

    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    override fun queue(queue: String) {
      cdkBuilder.queue(queue)
    }

    public fun build(): software.amazon.awscdk.services.sqs.CfnQueueInlinePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sqs.CfnQueueInlinePolicyProps,
  ) : CdkObject(cdkObject), CfnQueueInlinePolicyProps {
    override fun policyDocument(): Any = unwrap(this).getPolicyDocument()

    override fun queue(): String = unwrap(this).getQueue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnQueueInlinePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.CfnQueueInlinePolicyProps):
        CfnQueueInlinePolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnQueueInlinePolicyProps):
        software.amazon.awscdk.services.sqs.CfnQueueInlinePolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sqs.CfnQueueInlinePolicyProps
  }
}
