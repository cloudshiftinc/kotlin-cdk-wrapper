@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Options for fetching an IngressLoadBalancerAddress.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * IngressLoadBalancerAddressOptions ingressLoadBalancerAddressOptions =
 * IngressLoadBalancerAddressOptions.builder()
 * .namespace("namespace")
 * .timeout(Duration.minutes(30))
 * .build();
 * ```
 */
public interface IngressLoadBalancerAddressOptions : ServiceLoadBalancerAddressOptions {
  /**
   * A builder for [IngressLoadBalancerAddressOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param namespace The namespace the service belongs to.
     */
    public fun namespace(namespace: String)

    /**
     * @param timeout Timeout for waiting on the load balancer address.
     */
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.eks.IngressLoadBalancerAddressOptions.Builder =
        software.amazon.awscdk.services.eks.IngressLoadBalancerAddressOptions.builder()

    /**
     * @param namespace The namespace the service belongs to.
     */
    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    /**
     * @param timeout Timeout for waiting on the load balancer address.
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.IngressLoadBalancerAddressOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eks.IngressLoadBalancerAddressOptions,
  ) : CdkObject(cdkObject), IngressLoadBalancerAddressOptions {
    /**
     * The namespace the service belongs to.
     *
     * Default: 'default'
     */
    override fun namespace(): String? = unwrap(this).getNamespace()

    /**
     * Timeout for waiting on the load balancer address.
     *
     * Default: Duration.minutes(5)
     */
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): IngressLoadBalancerAddressOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.eks.IngressLoadBalancerAddressOptions):
        IngressLoadBalancerAddressOptions = CdkObjectWrappers.wrap(cdkObject) as?
        IngressLoadBalancerAddressOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IngressLoadBalancerAddressOptions):
        software.amazon.awscdk.services.eks.IngressLoadBalancerAddressOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.eks.IngressLoadBalancerAddressOptions
  }
}
