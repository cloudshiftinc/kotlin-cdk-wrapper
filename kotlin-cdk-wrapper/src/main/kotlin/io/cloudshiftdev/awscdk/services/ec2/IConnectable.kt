@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject

public interface IConnectable {
  public fun connections(): Connections

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.IConnectable,
  ) : CdkObject(cdkObject), IConnectable {
    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IConnectable): IConnectable =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IConnectable): software.amazon.awscdk.services.ec2.IConnectable =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IConnectable
  }
}