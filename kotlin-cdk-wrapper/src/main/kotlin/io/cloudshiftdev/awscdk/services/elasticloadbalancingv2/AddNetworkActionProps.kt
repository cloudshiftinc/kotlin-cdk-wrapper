@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface AddNetworkActionProps {
  public fun action(): NetworkListenerAction

  @CdkDslMarker
  public interface Builder {
    public fun action(action: NetworkListenerAction)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps.builder()

    override fun action(action: NetworkListenerAction) {
      cdkBuilder.action(action.let(NetworkListenerAction::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps,
  ) : CdkObject(cdkObject), AddNetworkActionProps {
    override fun action(): NetworkListenerAction =
        unwrap(this).getAction().let(NetworkListenerAction::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddNetworkActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps):
        AddNetworkActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddNetworkActionProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps
  }
}
