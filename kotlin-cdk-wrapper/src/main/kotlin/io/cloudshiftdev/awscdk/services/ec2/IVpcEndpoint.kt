@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * A VPC endpoint.
 */
public interface IVpcEndpoint : IResource {
  /**
   * The VPC endpoint identifier.
   */
  public fun vpcEndpointId(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IVpcEndpoint): IVpcEndpoint =
        CdkObjectWrappers.wrap(cdkObject) as IVpcEndpoint

    internal fun unwrap(wrapped: IVpcEndpoint): software.amazon.awscdk.services.ec2.IVpcEndpoint =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IVpcEndpoint
  }
}
