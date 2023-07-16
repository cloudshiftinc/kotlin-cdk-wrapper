@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVPNConnection
import software.constructs.Construct

@CdkDslMarker
public class CfnVPNConnectionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVPNConnection.Builder = CfnVPNConnection.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _vpnTunnelOptionsSpecifications: MutableList<Any> = mutableListOf()

  public fun customerGatewayId(customerGatewayId: String) {
    cdkBuilder.customerGatewayId(customerGatewayId)
  }

  public fun staticRoutesOnly(staticRoutesOnly: Boolean) {
    cdkBuilder.staticRoutesOnly(staticRoutesOnly)
  }

  public fun staticRoutesOnly(staticRoutesOnly: IResolvable) {
    cdkBuilder.staticRoutesOnly(staticRoutesOnly)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun transitGatewayId(transitGatewayId: String) {
    cdkBuilder.transitGatewayId(transitGatewayId)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun vpnGatewayId(vpnGatewayId: String) {
    cdkBuilder.vpnGatewayId(vpnGatewayId)
  }

  public fun vpnTunnelOptionsSpecifications(vararg vpnTunnelOptionsSpecifications: Any) {
    _vpnTunnelOptionsSpecifications.addAll(listOf(*vpnTunnelOptionsSpecifications))
  }

  public fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: Collection<Any>) {
    _vpnTunnelOptionsSpecifications.addAll(vpnTunnelOptionsSpecifications)
  }

  public fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: IResolvable) {
    cdkBuilder.vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications)
  }

  public fun build(): CfnVPNConnection {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_vpnTunnelOptionsSpecifications.isNotEmpty())
        cdkBuilder.vpnTunnelOptionsSpecifications(_vpnTunnelOptionsSpecifications)
    return cdkBuilder.build()
  }
}
