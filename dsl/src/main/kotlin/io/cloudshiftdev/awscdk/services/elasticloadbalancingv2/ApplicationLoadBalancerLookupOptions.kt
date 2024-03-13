package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface ApplicationLoadBalancerLookupOptions : BaseLoadBalancerLookupOptions {
  public interface Builder {
    public fun loadBalancerArn(loadBalancerArn: String) {
    }

    public fun loadBalancerTags(loadBalancerTags: Map<String, String>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerLookupOptions.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerLookupOptions.builder()

    public override fun loadBalancerArn(loadBalancerArn: String) {
      cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    public override fun loadBalancerTags(loadBalancerTags: Map<String, String>) {
      cdkBuilder.loadBalancerTags(loadBalancerTags)
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerLookupOptions
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerLookupOptions,
  ) : ApplicationLoadBalancerLookupOptions {
    public override fun loadBalancerArn(): String? = unwrap(this).getLoadBalancerArn()

    public override fun loadBalancerTags(): Map<String, String> = unwrap(this).getLoadBalancerTags()
        ?: emptyMap()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}):
        ApplicationLoadBalancerLookupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerLookupOptions):
        ApplicationLoadBalancerLookupOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationLoadBalancerLookupOptions):
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerLookupOptions
        = (wrapped as Wrapper).cdkObject
  }
}
