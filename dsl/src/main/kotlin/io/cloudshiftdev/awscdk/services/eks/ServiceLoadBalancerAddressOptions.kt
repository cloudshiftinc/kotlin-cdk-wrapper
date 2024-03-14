package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface ServiceLoadBalancerAddressOptions {
  /**
   * The namespace the service belongs to.
   *
   * Default: 'default'
   */
  public fun namespace(): String? = unwrap(this).getNamespace()

  /**
   * Timeout for waiting on the load balancer address.
   *
   * Default: Duration.minutes(5)
   */
  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  /**
   * A builder for [ServiceLoadBalancerAddressOptions]
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
        software.amazon.awscdk.services.eks.ServiceLoadBalancerAddressOptions.Builder =
        software.amazon.awscdk.services.eks.ServiceLoadBalancerAddressOptions.builder()

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
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.ServiceLoadBalancerAddressOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.ServiceLoadBalancerAddressOptions,
  ) : CdkObject(cdkObject), ServiceLoadBalancerAddressOptions {
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
