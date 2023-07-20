@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnGateway

@CdkDslMarker
public class CfnGatewayGreengrassV2PropertyDsl {
  private val cdkBuilder: CfnGateway.GreengrassV2Property.Builder =
      CfnGateway.GreengrassV2Property.builder()

  public fun coreDeviceThingName(coreDeviceThingName: String) {
    cdkBuilder.coreDeviceThingName(coreDeviceThingName)
  }

  public fun build(): CfnGateway.GreengrassV2Property = cdkBuilder.build()
}
