@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.IDependable
import kotlin.String

/**
 * A client VPN endpoint.
 */
public interface IClientVpnEndpoint : IResource, IConnectable {
  /**
   * The endpoint ID.
   */
  public fun endpointId(): String

  /**
   * Dependable that can be depended upon to force target networks associations.
   */
  public fun targetNetworksAssociated(): IDependable

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IClientVpnEndpoint):
        IClientVpnEndpoint = CdkObjectWrappers.wrap(cdkObject) as IClientVpnEndpoint

    internal fun unwrap(wrapped: IClientVpnEndpoint):
        software.amazon.awscdk.services.ec2.IClientVpnEndpoint = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.IClientVpnEndpoint
  }
}
