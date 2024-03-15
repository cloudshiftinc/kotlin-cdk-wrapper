@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Base class for listeners.
 */
public abstract class BaseListener internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.BaseListener,
) : Resource(cdkObject), IListener {
  /**
   * ARN of the listener.
   */
  public override fun listenerArn(): String = unwrap(this).getListenerArn()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.BaseListener,
  ) : BaseListener(cdkObject)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.BaseListener):
        BaseListener = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseListener):
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseListener = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticloadbalancingv2.BaseListener
  }
}
