@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * An interface VPC endpoint.
 */
public interface IInterfaceVpcEndpoint : IVpcEndpoint, IConnectable {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IInterfaceVpcEndpoint):
        IInterfaceVpcEndpoint = CdkObjectWrappers.wrap(cdkObject) as IInterfaceVpcEndpoint

    internal fun unwrap(wrapped: IInterfaceVpcEndpoint):
        software.amazon.awscdk.services.ec2.IInterfaceVpcEndpoint = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.IInterfaceVpcEndpoint
  }
}
