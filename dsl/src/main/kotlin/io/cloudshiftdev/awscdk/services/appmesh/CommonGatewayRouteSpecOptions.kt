package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Number
import kotlin.Unit

public interface CommonGatewayRouteSpecOptions {
  public fun priority(): Number? = unwrap(this).getPriority()

  public interface Builder {
    public fun priority(priority: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions.Builder =
        software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions.builder()

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions,
  ) : CommonGatewayRouteSpecOptions {
    override fun priority(): Number? = unwrap(this).getPriority()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CommonGatewayRouteSpecOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions):
        CommonGatewayRouteSpecOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonGatewayRouteSpecOptions):
        software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions = (wrapped as
        Wrapper).cdkObject
  }
}
