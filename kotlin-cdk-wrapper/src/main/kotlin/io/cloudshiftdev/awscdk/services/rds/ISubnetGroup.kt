@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Interface for a subnet group.
 */
public interface ISubnetGroup : IResource {
  /**
   * The name of the subnet group.
   */
  public fun subnetGroupName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ISubnetGroup): ISubnetGroup =
        CdkObjectWrappers.wrap(cdkObject) as ISubnetGroup

    internal fun unwrap(wrapped: ISubnetGroup): software.amazon.awscdk.services.rds.ISubnetGroup =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.rds.ISubnetGroup
  }
}
