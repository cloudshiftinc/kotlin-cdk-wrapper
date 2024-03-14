package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface BaseListenerLookupOptions {
  public fun listenerPort(): Number? = unwrap(this).getListenerPort()

  public fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

  public fun loadBalancerTags(): Map<String, String> = unwrap(this).getLoadBalancerTags() ?:
      emptyMap()

  public interface Builder {
    public fun listenerPort(listenerPort: Number)

    public fun loadBalancerArn(loadBalancerArn: String)

    public fun loadBalancerTags(loadBalancerTags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseListenerLookupOptions.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseListenerLookupOptions.builder()

    override fun listenerPort(listenerPort: Number) {
      cdkBuilder.listenerPort(listenerPort)
    }

    override fun loadBalancerArn(loadBalancerArn: String) {
      cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    override fun loadBalancerTags(loadBalancerTags: Map<String, String>) {
      cdkBuilder.loadBalancerTags(loadBalancerTags)
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseListenerLookupOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseListenerLookupOptions,
  ) : BaseListenerLookupOptions {
    override fun listenerPort(): Number? = unwrap(this).getListenerPort()

    override fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

    override fun loadBalancerTags(): Map<String, String> = unwrap(this).getLoadBalancerTags() ?:
        emptyMap()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BaseListenerLookupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.BaseListenerLookupOptions):
        BaseListenerLookupOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseListenerLookupOptions):
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseListenerLookupOptions = (wrapped
        as Wrapper).cdkObject
  }
}
