@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancing

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable

public open class ListenerPort internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancing.ListenerPort,
) : CdkObject(cdkObject), IConnectable {
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancing.ListenerPort):
        ListenerPort = ListenerPort(cdkObject)

    internal fun unwrap(wrapped: ListenerPort):
        software.amazon.awscdk.services.elasticloadbalancing.ListenerPort = wrapped.cdkObject
  }
}
