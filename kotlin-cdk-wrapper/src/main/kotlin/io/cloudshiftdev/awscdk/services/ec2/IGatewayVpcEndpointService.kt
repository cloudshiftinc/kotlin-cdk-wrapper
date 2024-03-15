@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public interface IGatewayVpcEndpointService {
  public fun name(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.IGatewayVpcEndpointService,
  ) : CdkObject(cdkObject), IGatewayVpcEndpointService {
    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IGatewayVpcEndpointService):
        IGatewayVpcEndpointService = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IGatewayVpcEndpointService):
        software.amazon.awscdk.services.ec2.IGatewayVpcEndpointService = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IGatewayVpcEndpointService
  }
}
