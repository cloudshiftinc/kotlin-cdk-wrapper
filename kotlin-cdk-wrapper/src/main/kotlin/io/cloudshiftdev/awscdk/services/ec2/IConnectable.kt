@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * An object that has a Connections object.
 */
public interface IConnectable {
  /**
   * The network connections associated with this resource.
   */
  public fun connections(): Connections

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.IConnectable,
  ) : CdkObject(cdkObject), IConnectable {
    /**
     * The network connections associated with this resource.
     */
    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IConnectable): IConnectable =
        CdkObjectWrappers.wrap(cdkObject) as? IConnectable ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IConnectable): software.amazon.awscdk.services.ec2.IConnectable =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IConnectable
  }
}
