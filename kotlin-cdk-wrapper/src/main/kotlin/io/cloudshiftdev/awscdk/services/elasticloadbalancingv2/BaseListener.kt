@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Base class for listeners.
 */
public abstract class BaseListener(
  cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.BaseListener,
) : Resource(cdkObject),
    IListener {
  /**
   * Set a non-standard attribute on the listener.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-listenerattribute.html)
   * @param key 
   * @param value
   */
  public open fun attribute(key: String) {
    unwrap(this).setAttribute(key)
  }

  /**
   * Set a non-standard attribute on the listener.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listener-listenerattribute.html)
   * @param key 
   * @param value
   */
  public open fun attribute(key: String, `value`: String) {
    unwrap(this).setAttribute(key, `value`)
  }

  /**
   * ARN of the listener.
   */
  public override fun listenerArn(): String = unwrap(this).getListenerArn()

  /**
   * Remove an attribute from the listener.
   *
   * @param key 
   */
  public open fun removeAttribute(key: String) {
    unwrap(this).removeAttribute(key)
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.BaseListener,
  ) : BaseListener(cdkObject)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.BaseListener):
        BaseListener = CdkObjectWrappers.wrap(cdkObject) as? BaseListener ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseListener):
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseListener = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticloadbalancingv2.BaseListener
  }
}
