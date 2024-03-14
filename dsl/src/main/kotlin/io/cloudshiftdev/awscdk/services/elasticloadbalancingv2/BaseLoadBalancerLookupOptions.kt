package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface BaseLoadBalancerLookupOptions {
  public fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

  public fun loadBalancerTags(): Map<String, String> = unwrap(this).getLoadBalancerTags() ?:
      emptyMap()

  public interface Builder {
    public fun loadBalancerArn(loadBalancerArn: String)

    public fun loadBalancerTags(loadBalancerTags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerLookupOptions.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerLookupOptions.builder()

    override fun loadBalancerArn(loadBalancerArn: String) {
      cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    override fun loadBalancerTags(loadBalancerTags: Map<String, String>) {
      cdkBuilder.loadBalancerTags(loadBalancerTags)
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerLookupOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerLookupOptions,
  ) : BaseLoadBalancerLookupOptions {
    override fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

    override fun loadBalancerTags(): Map<String, String> = unwrap(this).getLoadBalancerTags() ?:
        emptyMap()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BaseLoadBalancerLookupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerLookupOptions):
        BaseLoadBalancerLookupOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseLoadBalancerLookupOptions):
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerLookupOptions =
        (wrapped as Wrapper).cdkObject
  }
}
