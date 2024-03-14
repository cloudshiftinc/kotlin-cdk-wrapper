package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface AddNetworkActionProps {
  /**
   * Action to perform.
   */
  public fun action(): NetworkListenerAction

  /**
   * A builder for [AddNetworkActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param action Action to perform. 
     */
    public fun action(action: NetworkListenerAction)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps.builder()

    /**
     * @param action Action to perform. 
     */
    override fun action(action: NetworkListenerAction) {
      cdkBuilder.action(action.let(NetworkListenerAction::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps,
  ) : AddNetworkActionProps {
    /**
     * Action to perform.
     */
    override fun action(): NetworkListenerAction =
        unwrap(this).getAction().let(NetworkListenerAction::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AddNetworkActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps):
        AddNetworkActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddNetworkActionProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps = (wrapped as
        Wrapper).cdkObject
  }
}
