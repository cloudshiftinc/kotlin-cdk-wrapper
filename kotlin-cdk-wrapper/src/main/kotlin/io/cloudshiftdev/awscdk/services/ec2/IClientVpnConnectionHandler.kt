@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public interface IClientVpnConnectionHandler {
  public fun functionArn(): String

  public fun functionName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.IClientVpnConnectionHandler,
  ) : CdkObject(cdkObject), IClientVpnConnectionHandler {
    override fun functionArn(): String = unwrap(this).getFunctionArn()

    override fun functionName(): String = unwrap(this).getFunctionName()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IClientVpnConnectionHandler):
        IClientVpnConnectionHandler = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IClientVpnConnectionHandler):
        software.amazon.awscdk.services.ec2.IClientVpnConnectionHandler = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IClientVpnConnectionHandler
  }
}
