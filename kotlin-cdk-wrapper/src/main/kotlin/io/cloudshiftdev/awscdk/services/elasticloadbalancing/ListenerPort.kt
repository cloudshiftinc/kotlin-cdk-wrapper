@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancing

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.Port

/**
 * Reference to a listener's port just created.
 *
 * This implements IConnectable with a default port (the port that an ELB
 * listener was just created on) for a given security group so that it can be
 * conveniently used just like any Connectable. E.g:
 *
 * const listener = elb.addListener(...);
 *
 * listener.connections.allowDefaultPortFromAnyIPv4();
 * // or
 * instance.connections.allowToDefaultPort(listener);
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancing.*;
 * Port port;
 * SecurityGroup securityGroup;
 * ListenerPort listenerPort = new ListenerPort(securityGroup, port);
 * ```
 */
public open class ListenerPort internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancing.ListenerPort,
) : CdkObject(cdkObject), IConnectable {
  public constructor(securityGroup: ISecurityGroup, defaultPort: Port) :
      this(software.amazon.awscdk.services.elasticloadbalancing.ListenerPort(ISecurityGroup.unwrap(securityGroup),
      Port.unwrap(defaultPort)))

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
