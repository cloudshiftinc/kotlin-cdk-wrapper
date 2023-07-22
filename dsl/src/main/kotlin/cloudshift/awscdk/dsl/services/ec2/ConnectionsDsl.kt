@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.Connections
import software.amazon.awscdk.services.ec2.IPeer
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.Port

@CdkDslMarker
public class ConnectionsDsl {
  private val cdkBuilder: Connections.Builder = Connections.Builder.create()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  /**
   * Default port range for initiating connections to and from this object.
   *
   * Default: - No default port
   *
   * @param defaultPort Default port range for initiating connections to and from this object. 
   */
  public fun defaultPort(defaultPort: PortDsl.() -> Unit = {}) {
    val builder = PortDsl()
    builder.apply(defaultPort)
    cdkBuilder.defaultPort(builder.build())
  }

  /**
   * Default port range for initiating connections to and from this object.
   *
   * Default: - No default port
   *
   * @param defaultPort Default port range for initiating connections to and from this object. 
   */
  public fun defaultPort(defaultPort: Port) {
    cdkBuilder.defaultPort(defaultPort)
  }

  /**
   * Class that represents the rule by which others can connect to this connectable.
   *
   * This object is required, but will be derived from securityGroup if that is passed.
   *
   * Default: Derived from securityGroup if set.
   *
   * @param peer Class that represents the rule by which others can connect to this connectable. 
   */
  public fun peer(peer: IPeer) {
    cdkBuilder.peer(peer)
  }

  /**
   * What securityGroup(s) this object is managing connections for.
   *
   * Default: No security groups
   *
   * @param securityGroups What securityGroup(s) this object is managing connections for. 
   */
  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  /**
   * What securityGroup(s) this object is managing connections for.
   *
   * Default: No security groups
   *
   * @param securityGroups What securityGroup(s) this object is managing connections for. 
   */
  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  public fun build(): Connections {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
