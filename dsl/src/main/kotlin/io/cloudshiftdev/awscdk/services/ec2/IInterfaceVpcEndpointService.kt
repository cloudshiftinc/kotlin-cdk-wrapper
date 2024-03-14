package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Boolean
import kotlin.Number
import kotlin.String

public interface IInterfaceVpcEndpointService {
  public fun name(): String

  public fun port(): Number

  public fun privateDnsDefault(): Boolean? = unwrap(this).getPrivateDnsDefault()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.IInterfaceVpcEndpointService,
  ) : IInterfaceVpcEndpointService {
    override fun name(): String = unwrap(this).getName()

    override fun port(): Number = unwrap(this).getPort()

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
