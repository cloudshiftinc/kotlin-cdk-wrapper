@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * Properties to reference an existing listener.
 */
public interface INetworkListener : IListener {
  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.INetworkListener):
        INetworkListener = CdkObjectWrappers.wrap(cdkObject) as INetworkListener

    internal fun unwrap(wrapped: INetworkListener):
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkListener = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkListener
  }
}
