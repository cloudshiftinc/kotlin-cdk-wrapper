@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.ClientVpnRoute
import software.amazon.awscdk.services.ec2.ClientVpnRouteTarget
import software.amazon.awscdk.services.ec2.IClientVpnEndpoint
import software.constructs.Construct

@CdkDslMarker
public class ClientVpnRouteDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: ClientVpnRoute.Builder = ClientVpnRoute.Builder.create(scope, id)

  public fun cidr(cidr: String) {
    cdkBuilder.cidr(cidr)
  }

  public fun clientVpnEndpoint(clientVpnEndpoint: IClientVpnEndpoint) {
    cdkBuilder.clientVpnEndpoint(clientVpnEndpoint)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun target(target: ClientVpnRouteTarget) {
    cdkBuilder.target(target)
  }

  public fun build(): ClientVpnRoute = cdkBuilder.build()
}
