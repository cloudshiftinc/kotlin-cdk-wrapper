@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * A gateway VPC endpoint.
 */
public interface IGatewayVpcEndpoint : IVpcEndpoint {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IGatewayVpcEndpoint):
        IGatewayVpcEndpoint = CdkObjectWrappers.wrap(cdkObject) as IGatewayVpcEndpoint

    internal fun unwrap(wrapped: IGatewayVpcEndpoint):
        software.amazon.awscdk.services.ec2.IGatewayVpcEndpoint = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.IGatewayVpcEndpoint
  }
}
