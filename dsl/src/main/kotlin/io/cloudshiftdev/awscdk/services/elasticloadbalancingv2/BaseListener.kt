package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Resource
import kotlin.String

public abstract class BaseListener internal constructor(
  private val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.BaseListener,
) : Resource(cdkObject), IListener {
  /**
   * ARN of the listener.
   */
  public override fun listenerArn(): String = unwrap(this).getListenerArn()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.BaseListener,
  ) : BaseListener(cdkObject)

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.BaseListener):
        BaseListener = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseListener):
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseListener = (wrapped as
        Wrapper).cdkObject
  }
}
