package io.cloudshiftdev.awscdk.services.globalaccelerator

import kotlin.Number
import kotlin.Unit

public interface PortOverride {
  public fun endpointPort(): Number

  public fun listenerPort(): Number

  public interface Builder {
    public fun endpointPort(endpointPort: Number) {
    }

    public fun listenerPort(listenerPort: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.globalaccelerator.PortOverride.Builder =
        software.amazon.awscdk.services.globalaccelerator.PortOverride.builder()

    public override fun endpointPort(endpointPort: Number) {
      cdkBuilder.endpointPort(endpointPort)
    }

    public override fun listenerPort(listenerPort: Number) {
      cdkBuilder.listenerPort(listenerPort)
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.PortOverride =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.globalaccelerator.PortOverride,
  ) : PortOverride {
    public override fun endpointPort(): Number = unwrap(this).getEndpointPort()

    public override fun listenerPort(): Number = unwrap(this).getListenerPort()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): PortOverride {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.PortOverride):
        PortOverride = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PortOverride):
        software.amazon.awscdk.services.globalaccelerator.PortOverride = (wrapped as
        Wrapper).cdkObject
  }
}
