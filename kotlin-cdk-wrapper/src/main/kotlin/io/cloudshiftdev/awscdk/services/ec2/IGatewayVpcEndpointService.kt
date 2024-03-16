@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * A service for a gateway VPC endpoint.
 */
public interface IGatewayVpcEndpointService {
  /**
   * The name of the service.
   */
  public fun name(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IGatewayVpcEndpointService):
        IGatewayVpcEndpointService = CdkObjectWrappers.wrap(cdkObject) as IGatewayVpcEndpointService

    internal fun unwrap(wrapped: IGatewayVpcEndpointService):
        software.amazon.awscdk.services.ec2.IGatewayVpcEndpointService = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IGatewayVpcEndpointService
  }
}
