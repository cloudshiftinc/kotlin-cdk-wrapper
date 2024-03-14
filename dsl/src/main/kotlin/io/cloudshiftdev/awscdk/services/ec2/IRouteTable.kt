package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String

public interface IRouteTable {
  /**
   * Route table ID.
   */
  public fun routeTableId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.IRouteTable,
  ) : IRouteTable {
    /**
     * Route table ID.
     */
    override fun routeTableId(): String = unwrap(this).getRouteTableId()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IRouteTable): IRouteTable =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IRouteTable): software.amazon.awscdk.services.ec2.IRouteTable =
        (wrapped as Wrapper).cdkObject
  }
}
