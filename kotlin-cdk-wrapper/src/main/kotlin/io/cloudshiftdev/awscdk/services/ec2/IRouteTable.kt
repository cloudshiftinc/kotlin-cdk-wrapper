@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public interface IRouteTable {
  public fun routeTableId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.IRouteTable,
  ) : CdkObject(cdkObject), IRouteTable {
    override fun routeTableId(): String = unwrap(this).getRouteTableId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IRouteTable): IRouteTable =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IRouteTable): software.amazon.awscdk.services.ec2.IRouteTable =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IRouteTable
  }
}
