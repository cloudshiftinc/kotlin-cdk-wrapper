@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * A connection handler for client VPN endpoints.
 */
public interface IClientVpnConnectionHandler {
  /**
   * The ARN of the function.
   */
  public fun functionArn(): String

  /**
   * The name of the function.
   */
  public fun functionName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IClientVpnConnectionHandler):
        IClientVpnConnectionHandler = CdkObjectWrappers.wrap(cdkObject) as
        IClientVpnConnectionHandler

    internal fun unwrap(wrapped: IClientVpnConnectionHandler):
        software.amazon.awscdk.services.ec2.IClientVpnConnectionHandler = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IClientVpnConnectionHandler
  }
}
