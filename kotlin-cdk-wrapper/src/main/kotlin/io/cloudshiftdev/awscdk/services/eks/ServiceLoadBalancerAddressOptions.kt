@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface ServiceLoadBalancerAddressOptions {
  public fun namespace(): String? = unwrap(this).getNamespace()

  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun namespace(namespace: String)

    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.eks.ServiceLoadBalancerAddressOptions.Builder =
        software.amazon.awscdk.services.eks.ServiceLoadBalancerAddressOptions.builder()

    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.ServiceLoadBalancerAddressOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.ServiceLoadBalancerAddressOptions,
  ) : CdkObject(cdkObject), ServiceLoadBalancerAddressOptions {
    override fun namespace(): String? = unwrap(this).getNamespace()

    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServiceLoadBalancerAddressOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.eks.ServiceLoadBalancerAddressOptions):
        ServiceLoadBalancerAddressOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServiceLoadBalancerAddressOptions):
        software.amazon.awscdk.services.eks.ServiceLoadBalancerAddressOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.eks.ServiceLoadBalancerAddressOptions
  }
}
