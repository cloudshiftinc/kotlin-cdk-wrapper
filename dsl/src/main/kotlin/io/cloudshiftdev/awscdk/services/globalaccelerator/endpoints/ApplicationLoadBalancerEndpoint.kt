package io.cloudshiftdev.awscdk.services.globalaccelerator.endpoints

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.globalaccelerator.IEndpoint
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer as CloudshiftdevAwscdkServicesElasticloadbalancingv2IApplicationLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer as AmazonAwscdkServicesElasticloadbalancingv2IApplicationLoadBalancer

public open class ApplicationLoadBalancerEndpoint internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.globalaccelerator.endpoints.ApplicationLoadBalancerEndpoint,
) : CdkObject(cdkObject), IEndpoint {
  /**
   * The region where the endpoint is located.
   *
   * If the region cannot be determined, `undefined` is returned
   */
  public override fun region(): String? = unwrap(this).getRegion()

  /**
   * Render the endpoint to an endpoint configuration.
   */
  public override fun renderEndpointConfiguration(): Any =
      unwrap(this).renderEndpointConfiguration()

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.globalaccelerator.endpoints.ApplicationLoadBalancerEndpoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Forward the client IP address in an `X-Forwarded-For` header.
     *
     * GlobalAccelerator will create Network Interfaces in your VPC in order
     * to preserve the client IP address.
     *
     * Client IP address preservation is supported only in specific AWS Regions.
     * See the GlobalAccelerator Developer Guide for a list.
     *
     * Default: true if available
     *
     * @param preserveClientIp Forward the client IP address in an `X-Forwarded-For` header. 
     */
    public fun preserveClientIp(preserveClientIp: Boolean)

    /**
     * Endpoint weight across all endpoints in the group.
     *
     * Must be a value between 0 and 255.
     *
     * Default: 128
     *
     * @param weight Endpoint weight across all endpoints in the group. 
     */
    public fun weight(weight: Number)
  }

  private class BuilderImpl(
    loadBalancer: AmazonAwscdkServicesElasticloadbalancingv2IApplicationLoadBalancer,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.endpoints.ApplicationLoadBalancerEndpoint.Builder
        =
        software.amazon.awscdk.services.globalaccelerator.endpoints.ApplicationLoadBalancerEndpoint.Builder.create(loadBalancer)

    /**
     * Forward the client IP address in an `X-Forwarded-For` header.
     *
     * GlobalAccelerator will create Network Interfaces in your VPC in order
     * to preserve the client IP address.
     *
     * Client IP address preservation is supported only in specific AWS Regions.
     * See the GlobalAccelerator Developer Guide for a list.
     *
     * Default: true if available
     *
     * @param preserveClientIp Forward the client IP address in an `X-Forwarded-For` header. 
     */
    override fun preserveClientIp(preserveClientIp: Boolean) {
      cdkBuilder.preserveClientIp(preserveClientIp)
    }

    /**
     * Endpoint weight across all endpoints in the group.
     *
     * Must be a value between 0 and 255.
     *
     * Default: 128
     *
     * @param weight Endpoint weight across all endpoints in the group. 
     */
    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public fun build():
        software.amazon.awscdk.services.globalaccelerator.endpoints.ApplicationLoadBalancerEndpoint
        = cdkBuilder.build()
  }

  public companion object {
    public operator
        fun invoke(loadBalancer: CloudshiftdevAwscdkServicesElasticloadbalancingv2IApplicationLoadBalancer,
        block: Builder.() -> Unit = {}): ApplicationLoadBalancerEndpoint {
      val builderImpl =
          BuilderImpl(CloudshiftdevAwscdkServicesElasticloadbalancingv2IApplicationLoadBalancer.unwrap(loadBalancer))
      return ApplicationLoadBalancerEndpoint(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.endpoints.ApplicationLoadBalancerEndpoint):
        ApplicationLoadBalancerEndpoint = ApplicationLoadBalancerEndpoint(cdkObject)

    internal fun unwrap(wrapped: ApplicationLoadBalancerEndpoint):
        software.amazon.awscdk.services.globalaccelerator.endpoints.ApplicationLoadBalancerEndpoint
        = wrapped.cdkObject
  }
}
