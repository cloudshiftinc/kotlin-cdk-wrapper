@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * An abstract route table.
 */
public interface IRouteTable {
  /**
   * Route table ID.
   */
  public fun routeTableId(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.IRouteTable,
  ) : CdkObject(cdkObject), IRouteTable {
    /**
     * Route table ID.
     */
    override fun routeTableId(): String = unwrap(this).getRouteTableId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IRouteTable): IRouteTable =
        CdkObjectWrappers.wrap(cdkObject) as? IRouteTable ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IRouteTable): software.amazon.awscdk.services.ec2.IRouteTable =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IRouteTable
  }
}
