package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String

public interface IClientVpnConnectionHandler {
  /**
   * The ARN of the function.
   */
  public fun functionArn(): String

  /**
   * The name of the function.
   */
  public fun functionName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.IClientVpnConnectionHandler,
  ) : IClientVpnConnectionHandler {
    /**
     * The ARN of the function.
     */
    override fun functionArn(): String = unwrap(this).getFunctionArn()

    /**
     * The name of the function.
     */
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
