@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * The virtual private gateway interface.
 */
public interface IVpnGateway : IResource {
  /**
   * The virtual private gateway Id.
   */
  public fun gatewayId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IVpnGateway): IVpnGateway =
        CdkObjectWrappers.wrap(cdkObject) as IVpnGateway

    internal fun unwrap(wrapped: IVpnGateway): software.amazon.awscdk.services.ec2.IVpnGateway =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IVpnGateway
  }
}
