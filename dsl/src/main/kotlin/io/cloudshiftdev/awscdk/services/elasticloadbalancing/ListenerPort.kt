package io.cloudshiftdev.awscdk.services.elasticloadbalancing

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable

public open class ListenerPort internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancing.ListenerPort,
) : CdkObject(cdkObject), IConnectable {
  /**
   * The network connections associated with this resource.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancing.ListenerPort):
        ListenerPort = ListenerPort(cdkObject)

    internal fun unwrap(wrapped: ListenerPort):
        software.amazon.awscdk.services.elasticloadbalancing.ListenerPort = wrapped.cdkObject
  }
}
