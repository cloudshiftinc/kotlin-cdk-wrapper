@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator.endpoints

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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
  public override fun region(): String? = unwrap(this).getRegion()

  public override fun renderEndpointConfiguration(): Any =
      unwrap(this).renderEndpointConfiguration()

  @CdkDslMarker
  public interface Builder {
    public fun preserveClientIp(preserveClientIp: Boolean)

    public fun weight(weight: Number)
  }

  private class BuilderImpl(
    loadBalancer: AmazonAwscdkServicesElasticloadbalancingv2IApplicationLoadBalancer,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.endpoints.ApplicationLoadBalancerEndpoint.Builder
        =
        software.amazon.awscdk.services.globalaccelerator.endpoints.ApplicationLoadBalancerEndpoint.Builder.create(loadBalancer)

    override fun preserveClientIp(preserveClientIp: Boolean) {
      cdkBuilder.preserveClientIp(preserveClientIp)
    }

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
