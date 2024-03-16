@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * Represents gateway response resource.
 */
public interface IGatewayResponse : IResource {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IGatewayResponse):
        IGatewayResponse = CdkObjectWrappers.wrap(cdkObject) as IGatewayResponse

    internal fun unwrap(wrapped: IGatewayResponse):
        software.amazon.awscdk.services.apigateway.IGatewayResponse = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.IGatewayResponse
  }
}
