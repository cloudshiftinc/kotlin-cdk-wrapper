@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotcoredeviceadvisor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotcoredeviceadvisor.CfnSuiteDefinition

@CdkDslMarker
public class CfnSuiteDefinitionDeviceUnderTestPropertyDsl {
  private val cdkBuilder: CfnSuiteDefinition.DeviceUnderTestProperty.Builder =
      CfnSuiteDefinition.DeviceUnderTestProperty.builder()

  /**
   * @param certificateArn the value to be set.
   */
  public fun certificateArn(certificateArn: String) {
    cdkBuilder.certificateArn(certificateArn)
  }

  /**
   * @param thingArn the value to be set.
   */
  public fun thingArn(thingArn: String) {
    cdkBuilder.thingArn(thingArn)
  }

  public fun build(): CfnSuiteDefinition.DeviceUnderTestProperty = cdkBuilder.build()
}
