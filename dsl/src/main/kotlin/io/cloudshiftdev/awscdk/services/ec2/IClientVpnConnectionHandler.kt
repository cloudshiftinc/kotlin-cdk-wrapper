package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String

public interface IClientVpnConnectionHandler {
  public fun functionArn(): String

  public fun functionName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.IClientVpnConnectionHandler,
  ) : IClientVpnConnectionHandler {
    override fun functionArn(): String = unwrap(this).getFunctionArn()

    override fun functionName(): String = unwrap(this).getFunctionName()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IClientVpnConnectionHandler):
        IClientVpnConnectionHandler = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IClientVpnConnectionHandler):
        software.amazon.awscdk.services.ec2.IClientVpnConnectionHandler = (wrapped as
        Wrapper).cdkObject
  }
}
