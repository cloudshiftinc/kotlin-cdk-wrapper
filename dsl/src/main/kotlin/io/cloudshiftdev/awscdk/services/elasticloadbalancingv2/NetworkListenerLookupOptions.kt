package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface NetworkListenerLookupOptions : BaseListenerLookupOptions {
  public fun listenerProtocol(): Protocol? = unwrap(this).getListenerProtocol()?.let(Protocol::wrap)

  public interface Builder {
    public fun listenerPort(listenerPort: Number) {
    }

    public fun listenerProtocol(listenerProtocol: Protocol) {
    }

    public fun loadBalancerArn(loadBalancerArn: String) {
    }

    public fun loadBalancerTags(loadBalancerTags: Map<String, String>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions.builder()

    public override fun listenerPort(listenerPort: Number) {
      cdkBuilder.listenerPort(listenerPort)
    }

    public override fun listenerProtocol(listenerProtocol: Protocol) {
      cdkBuilder.listenerProtocol(listenerProtocol.let(Protocol::unwrap))
    }

    public override fun loadBalancerArn(loadBalancerArn: String) {
      cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    public override fun loadBalancerTags(loadBalancerTags: Map<String, String>) {
      cdkBuilder.loadBalancerTags(loadBalancerTags)
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions,
  ) : NetworkListenerLookupOptions {
    public override fun listenerPort(): Number? = unwrap(this).getListenerPort()

    public override fun listenerProtocol(): Protocol? =
        unwrap(this).getListenerProtocol()?.let(Protocol::wrap)

    public override fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

    public override fun loadBalancerTags(): Map<String, String> = unwrap(this).getLoadBalancerTags()
        ?: emptyMap()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkListenerLookupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions):
        NetworkListenerLookupOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkListenerLookupOptions):
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions =
        (wrapped as Wrapper).cdkObject
  }
}
