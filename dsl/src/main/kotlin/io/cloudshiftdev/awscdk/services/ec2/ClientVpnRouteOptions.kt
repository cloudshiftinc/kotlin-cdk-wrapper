package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String
import kotlin.Unit

public interface ClientVpnRouteOptions {
  public fun cidr(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun target(): ClientVpnRouteTarget

  public interface Builder {
    public fun cidr(cidr: String)

    public fun description(description: String)

    public fun target(target: ClientVpnRouteTarget)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.ClientVpnRouteOptions.Builder =
        software.amazon.awscdk.services.ec2.ClientVpnRouteOptions.builder()

    override fun cidr(cidr: String) {
      cdkBuilder.cidr(cidr)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun target(target: ClientVpnRouteTarget) {
      cdkBuilder.target(target.let(ClientVpnRouteTarget::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.ClientVpnRouteOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.ClientVpnRouteOptions,
  ) : ClientVpnRouteOptions {
    override fun cidr(): String = unwrap(this).getCidr()

    override fun description(): String? = unwrap(this).getDescription()

    override fun target(): ClientVpnRouteTarget =
        unwrap(this).getTarget().let(ClientVpnRouteTarget::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ClientVpnRouteOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ClientVpnRouteOptions):
        ClientVpnRouteOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClientVpnRouteOptions):
        software.amazon.awscdk.services.ec2.ClientVpnRouteOptions = (wrapped as Wrapper).cdkObject
  }
}
