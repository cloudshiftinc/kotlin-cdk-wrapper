@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 *
 */
public interface IPrivateSubnet : ISubnet {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IPrivateSubnet): IPrivateSubnet
        = CdkObjectWrappers.wrap(cdkObject) as IPrivateSubnet

    internal fun unwrap(wrapped: IPrivateSubnet): software.amazon.awscdk.services.ec2.IPrivateSubnet
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IPrivateSubnet
  }
}
