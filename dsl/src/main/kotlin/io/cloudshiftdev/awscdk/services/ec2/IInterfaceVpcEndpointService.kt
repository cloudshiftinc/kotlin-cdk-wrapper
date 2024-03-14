package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Boolean
import kotlin.Number
import kotlin.String

public interface IInterfaceVpcEndpointService {
  /**
   * The name of the service.
   */
  public fun name(): String

  /**
   * The port of the service.
   */
  public fun port(): Number

  /**
   * Whether Private DNS is supported by default.
   */
  public fun privateDnsDefault(): Boolean? = unwrap(this).getPrivateDnsDefault()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.IInterfaceVpcEndpointService,
  ) : IInterfaceVpcEndpointService {
    /**
     * The name of the service.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The port of the service.
     */
    override fun port(): Number = unwrap(this).getPort()

    /**
     * Whether Private DNS is supported by default.
     */
    override fun privateDnsDefault(): Boolean? = unwrap(this).getPrivateDnsDefault()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IInterfaceVpcEndpointService):
        IInterfaceVpcEndpointService = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IInterfaceVpcEndpointService):
        software.amazon.awscdk.services.ec2.IInterfaceVpcEndpointService = (wrapped as
        Wrapper).cdkObject
  }
}
