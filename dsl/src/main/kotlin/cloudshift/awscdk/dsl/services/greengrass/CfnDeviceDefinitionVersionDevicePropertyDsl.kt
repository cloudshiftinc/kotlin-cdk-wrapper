@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion

@CdkDslMarker
public class CfnDeviceDefinitionVersionDevicePropertyDsl {
  private val cdkBuilder: CfnDeviceDefinitionVersion.DeviceProperty.Builder =
      CfnDeviceDefinitionVersion.DeviceProperty.builder()

  public fun certificateArn(certificateArn: String) {
    cdkBuilder.certificateArn(certificateArn)
  }

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun syncShadow(syncShadow: Boolean) {
    cdkBuilder.syncShadow(syncShadow)
  }

  public fun syncShadow(syncShadow: IResolvable) {
    cdkBuilder.syncShadow(syncShadow)
  }

  public fun thingArn(thingArn: String) {
    cdkBuilder.thingArn(thingArn)
  }

  public fun build(): CfnDeviceDefinitionVersion.DeviceProperty = cdkBuilder.build()
}
