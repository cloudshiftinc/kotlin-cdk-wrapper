@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * A VPC endpoint service.
 */
public interface IVpcEndpointService : IResource {
  /**
   * The id of the VPC Endpoint Service that clients use to connect to, like
   * vpce-svc-xxxxxxxxxxxxxxxx.
   */
  public fun vpcEndpointServiceId(): String

  /**
   * The service name of the VPC Endpoint Service that clients use to connect to, like
   * com.amazonaws.vpce.<region>.vpce-svc-xxxxxxxxxxxxxxxx.
   */
  public fun vpcEndpointServiceName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IVpcEndpointService):
        IVpcEndpointService = CdkObjectWrappers.wrap(cdkObject) as IVpcEndpointService

    internal fun unwrap(wrapped: IVpcEndpointService):
        software.amazon.awscdk.services.ec2.IVpcEndpointService = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.IVpcEndpointService
  }
}
