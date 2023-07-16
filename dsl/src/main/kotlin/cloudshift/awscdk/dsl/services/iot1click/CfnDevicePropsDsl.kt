@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot1click

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot1click.CfnDeviceProps

@CdkDslMarker
public class CfnDevicePropsDsl {
  private val cdkBuilder: CfnDeviceProps.Builder = CfnDeviceProps.builder()

  public fun deviceId(deviceId: String) {
    cdkBuilder.deviceId(deviceId)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnDeviceProps = cdkBuilder.build()
}
