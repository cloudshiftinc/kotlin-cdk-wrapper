@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents an API Gateway VpcLink.
 */
public interface IVpcLink : IResource {
  /**
   * Physical ID of the VpcLink resource.
   */
  public fun vpcLinkId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IVpcLink): IVpcLink =
        CdkObjectWrappers.wrap(cdkObject) as IVpcLink

    internal fun unwrap(wrapped: IVpcLink): software.amazon.awscdk.services.apigateway.IVpcLink =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.IVpcLink
  }
}
