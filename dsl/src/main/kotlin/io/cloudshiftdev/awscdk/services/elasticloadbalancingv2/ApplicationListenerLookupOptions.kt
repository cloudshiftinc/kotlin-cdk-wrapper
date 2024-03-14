package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface ApplicationListenerLookupOptions : BaseListenerLookupOptions {
  public fun listenerArn(): String? = unwrap(this).getListenerArn()

  public fun listenerProtocol(): ApplicationProtocol? =
      unwrap(this).getListenerProtocol()?.let(ApplicationProtocol::wrap)

  public interface Builder {
    public fun listenerArn(listenerArn: String)

    public fun listenerPort(listenerPort: Number)

    public fun listenerProtocol(listenerProtocol: ApplicationProtocol)

    public fun loadBalancerArn(loadBalancerArn: String)

    public fun loadBalancerTags(loadBalancerTags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerLookupOptions.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerLookupOptions.builder()

    override fun listenerArn(listenerArn: String) {
      cdkBuilder.listenerArn(listenerArn)
    }

    override fun listenerPort(listenerPort: Number) {
      cdkBuilder.listenerPort(listenerPort)
    }

    override fun listenerProtocol(listenerProtocol: ApplicationProtocol) {
      cdkBuilder.listenerProtocol(listenerProtocol.let(ApplicationProtocol::unwrap))
    }

    override fun loadBalancerArn(loadBalancerArn: String) {
      cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    override fun loadBalancerTags(loadBalancerTags: Map<String, String>) {
      cdkBuilder.loadBalancerTags(loadBalancerTags)
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerLookupOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerLookupOptions,
  ) : ApplicationListenerLookupOptions {
    override fun listenerArn(): String? = unwrap(this).getListenerArn()

    override fun listenerPort(): Number? = unwrap(this).getListenerPort()

    override fun listenerProtocol(): ApplicationProtocol? =
        unwrap(this).getListenerProtocol()?.let(ApplicationProtocol::wrap)

    override fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

    override fun loadBalancerTags(): Map<String, String> = unwrap(this).getLoadBalancerTags() ?:
        emptyMap()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationListenerLookupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerLookupOptions):
        ApplicationListenerLookupOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationListenerLookupOptions):
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerLookupOptions =
        (wrapped as Wrapper).cdkObject
  }
}
