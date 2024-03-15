@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface PortOverride {
  public fun endpointPort(): Number

  public fun listenerPort(): Number

  @CdkDslMarker
  public interface Builder {
    public fun endpointPort(endpointPort: Number)

    public fun listenerPort(listenerPort: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.globalaccelerator.PortOverride.Builder =
        software.amazon.awscdk.services.globalaccelerator.PortOverride.builder()

    override fun endpointPort(endpointPort: Number) {
      cdkBuilder.endpointPort(endpointPort)
    }

    override fun listenerPort(listenerPort: Number) {
      cdkBuilder.listenerPort(listenerPort)
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.PortOverride =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.globalaccelerator.PortOverride,
  ) : CdkObject(cdkObject), PortOverride {
    override fun endpointPort(): Number = unwrap(this).getEndpointPort()

    override fun listenerPort(): Number = unwrap(this).getListenerPort()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PortOverride {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.PortOverride):
        PortOverride = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PortOverride):
        software.amazon.awscdk.services.globalaccelerator.PortOverride = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.globalaccelerator.PortOverride
  }
}
