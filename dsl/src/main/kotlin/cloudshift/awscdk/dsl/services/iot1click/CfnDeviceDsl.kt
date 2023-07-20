@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot1click

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot1click.CfnDevice
import software.constructs.Construct

@CdkDslMarker
public class CfnDeviceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDevice.Builder = CfnDevice.Builder.create(scope, id)

  public fun deviceId(deviceId: String) {
    cdkBuilder.deviceId(deviceId)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnDevice = cdkBuilder.build()
}
