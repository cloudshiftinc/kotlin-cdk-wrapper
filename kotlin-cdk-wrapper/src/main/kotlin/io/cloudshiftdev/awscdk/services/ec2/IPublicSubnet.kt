@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 *
 */
public interface IPublicSubnet : ISubnet {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IPublicSubnet): IPublicSubnet =
        CdkObjectWrappers.wrap(cdkObject) as IPublicSubnet

    internal fun unwrap(wrapped: IPublicSubnet): software.amazon.awscdk.services.ec2.IPublicSubnet =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IPublicSubnet
  }
}
