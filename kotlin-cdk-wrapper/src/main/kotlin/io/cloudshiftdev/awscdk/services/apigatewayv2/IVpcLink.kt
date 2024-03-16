@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.String

/**
 * Represents an API Gateway VpcLink.
 */
public interface IVpcLink : IResource {
  /**
   * The VPC to which this VPC Link is associated with.
   */
  public fun vpc(): IVpc

  /**
   * Physical ID of the VpcLink resource.
   */
  public fun vpcLinkId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IVpcLink): IVpcLink =
        CdkObjectWrappers.wrap(cdkObject) as IVpcLink

    internal fun unwrap(wrapped: IVpcLink): software.amazon.awscdk.services.apigatewayv2.IVpcLink =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.IVpcLink
  }
}
