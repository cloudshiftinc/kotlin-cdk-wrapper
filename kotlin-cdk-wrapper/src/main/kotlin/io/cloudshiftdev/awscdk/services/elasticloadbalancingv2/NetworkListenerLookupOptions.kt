@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface NetworkListenerLookupOptions : BaseListenerLookupOptions {
  public fun listenerProtocol(): Protocol? = unwrap(this).getListenerProtocol()?.let(Protocol::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun listenerPort(listenerPort: Number)

    public fun listenerProtocol(listenerProtocol: Protocol)

    public fun loadBalancerArn(loadBalancerArn: String)

    public fun loadBalancerTags(loadBalancerTags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions.builder()

    override fun listenerPort(listenerPort: Number) {
      cdkBuilder.listenerPort(listenerPort)
    }

    override fun listenerProtocol(listenerProtocol: Protocol) {
      cdkBuilder.listenerProtocol(listenerProtocol.let(Protocol::unwrap))
    }

    override fun loadBalancerArn(loadBalancerArn: String) {
      cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    override fun loadBalancerTags(loadBalancerTags: Map<String, String>) {
      cdkBuilder.loadBalancerTags(loadBalancerTags)
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions,
  ) : CdkObject(cdkObject), NetworkListenerLookupOptions {
    override fun listenerPort(): Number? = unwrap(this).getListenerPort()

    override fun listenerProtocol(): Protocol? =
        unwrap(this).getListenerProtocol()?.let(Protocol::wrap)

    override fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

    override fun loadBalancerTags(): Map<String, String> = unwrap(this).getLoadBalancerTags() ?:
        emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkListenerLookupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions):
        NetworkListenerLookupOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkListenerLookupOptions):
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions
  }
}
