@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3outposts.CfnEndpoint

@CdkDslMarker
public class CfnEndpointNetworkInterfacePropertyDsl {
  private val cdkBuilder: CfnEndpoint.NetworkInterfaceProperty.Builder =
      CfnEndpoint.NetworkInterfaceProperty.builder()

  public fun networkInterfaceId(networkInterfaceId: String) {
    cdkBuilder.networkInterfaceId(networkInterfaceId)
  }

  public fun build(): CfnEndpoint.NetworkInterfaceProperty = cdkBuilder.build()
}
