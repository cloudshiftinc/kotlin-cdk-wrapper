package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface NetworkLoadBalancerLookupOptions : BaseLoadBalancerLookupOptions {
  public interface Builder {
    public fun loadBalancerArn(loadBalancerArn: String)

    public fun loadBalancerTags(loadBalancerTags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerLookupOptions.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerLookupOptions.builder()

    override fun loadBalancerArn(loadBalancerArn: String) {
      cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    override fun loadBalancerTags(loadBalancerTags: Map<String, String>) {
      cdkBuilder.loadBalancerTags(loadBalancerTags)
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerLookupOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerLookupOptions,
  ) : NetworkLoadBalancerLookupOptions {
    override fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

    override fun loadBalancerTags(): Map<String, String> = unwrap(this).getLoadBalancerTags() ?:
        emptyMap()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkLoadBalancerLookupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerLookupOptions):
        NetworkLoadBalancerLookupOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkLoadBalancerLookupOptions):
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerLookupOptions =
        (wrapped as Wrapper).cdkObject
  }
}
