@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IInstance
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer
import kotlin.String

/**
 * Represents the VPC origin endpoint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * ApplicationLoadBalancer applicationLoadBalancer;
 * VpcOriginEndpoint vpcOriginEndpoint =
 * VpcOriginEndpoint.applicationLoadBalancer(applicationLoadBalancer);
 * ```
 */
public abstract class VpcOriginEndpoint(
  cdkObject: software.amazon.awscdk.services.cloudfront.VpcOriginEndpoint,
) : CdkObject(cdkObject) {
  /**
   * The domain name of the CloudFront VPC origin endpoint configuration.
   *
   * Default: - No domain name configured
   */
  public open fun domainName(): String? = unwrap(this).getDomainName()

  /**
   * The ARN of the CloudFront VPC origin endpoint configuration.
   */
  public open fun endpointArn(): String = unwrap(this).getEndpointArn()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.VpcOriginEndpoint,
  ) : VpcOriginEndpoint(cdkObject)

  public companion object {
    public fun applicationLoadBalancer(alb: IApplicationLoadBalancer): VpcOriginEndpoint =
        software.amazon.awscdk.services.cloudfront.VpcOriginEndpoint.applicationLoadBalancer(alb.let(IApplicationLoadBalancer.Companion::unwrap)).let(VpcOriginEndpoint::wrap)

    public fun ec2Instance(instance: IInstance): VpcOriginEndpoint =
        software.amazon.awscdk.services.cloudfront.VpcOriginEndpoint.ec2Instance(instance.let(IInstance.Companion::unwrap)).let(VpcOriginEndpoint::wrap)

    public fun networkLoadBalancer(nlb: INetworkLoadBalancer): VpcOriginEndpoint =
        software.amazon.awscdk.services.cloudfront.VpcOriginEndpoint.networkLoadBalancer(nlb.let(INetworkLoadBalancer.Companion::unwrap)).let(VpcOriginEndpoint::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.VpcOriginEndpoint):
        VpcOriginEndpoint = CdkObjectWrappers.wrap(cdkObject) as? VpcOriginEndpoint ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcOriginEndpoint):
        software.amazon.awscdk.services.cloudfront.VpcOriginEndpoint = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.VpcOriginEndpoint
  }
}
