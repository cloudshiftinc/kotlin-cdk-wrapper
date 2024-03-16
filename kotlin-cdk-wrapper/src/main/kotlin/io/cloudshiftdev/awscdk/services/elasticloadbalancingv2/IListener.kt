@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Base interface for listeners.
 */
public interface IListener : IResource {
  /**
   * ARN of the listener.
   */
  public fun listenerArn(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IListener):
        IListener = CdkObjectWrappers.wrap(cdkObject) as IListener

    internal fun unwrap(wrapped: IListener):
        software.amazon.awscdk.services.elasticloadbalancingv2.IListener = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticloadbalancingv2.IListener
  }
}
