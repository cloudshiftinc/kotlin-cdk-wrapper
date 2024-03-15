@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator.endpoints

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface NetworkLoadBalancerEndpointProps {
  public fun weight(): Number? = unwrap(this).getWeight()

  @CdkDslMarker
  public interface Builder {
    public fun weight(weight: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpointProps.Builder
        =
        software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpointProps.builder()

    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public fun build():
        software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpointProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpointProps,
  ) : CdkObject(cdkObject), NetworkLoadBalancerEndpointProps {
    override fun weight(): Number? = unwrap(this).getWeight()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkLoadBalancerEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpointProps):
        NetworkLoadBalancerEndpointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkLoadBalancerEndpointProps):
        software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpointProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpointProps
  }
}