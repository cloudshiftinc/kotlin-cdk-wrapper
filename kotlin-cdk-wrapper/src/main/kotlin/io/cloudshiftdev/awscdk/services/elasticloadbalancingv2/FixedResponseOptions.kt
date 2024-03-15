@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface FixedResponseOptions {
  public fun contentType(): String? = unwrap(this).getContentType()

  public fun messageBody(): String? = unwrap(this).getMessageBody()

  @CdkDslMarker
  public interface Builder {
    public fun contentType(contentType: String)

    public fun messageBody(messageBody: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.FixedResponseOptions.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.FixedResponseOptions.builder()

    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    override fun messageBody(messageBody: String) {
      cdkBuilder.messageBody(messageBody)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.FixedResponseOptions
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.FixedResponseOptions,
  ) : CdkObject(cdkObject), FixedResponseOptions {
    override fun contentType(): String? = unwrap(this).getContentType()

    override fun messageBody(): String? = unwrap(this).getMessageBody()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FixedResponseOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.FixedResponseOptions):
        FixedResponseOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FixedResponseOptions):
        software.amazon.awscdk.services.elasticloadbalancingv2.FixedResponseOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.FixedResponseOptions
  }
}
