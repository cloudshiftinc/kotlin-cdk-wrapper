@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ec2.AddRouteOptions
import software.amazon.awscdk.services.ec2.RouterType

@CdkDslMarker
public class AddRouteOptionsDsl {
  private val cdkBuilder: AddRouteOptions.Builder = AddRouteOptions.builder()

  public fun destinationCidrBlock(destinationCidrBlock: String) {
    cdkBuilder.destinationCidrBlock(destinationCidrBlock)
  }

  public fun destinationIpv6CidrBlock(destinationIpv6CidrBlock: String) {
    cdkBuilder.destinationIpv6CidrBlock(destinationIpv6CidrBlock)
  }

  public fun enablesInternetConnectivity(enablesInternetConnectivity: Boolean) {
    cdkBuilder.enablesInternetConnectivity(enablesInternetConnectivity)
  }

  public fun routerId(routerId: String) {
    cdkBuilder.routerId(routerId)
  }

  public fun routerType(routerType: RouterType) {
    cdkBuilder.routerType(routerType)
  }

  public fun build(): AddRouteOptions = cdkBuilder.build()
}
