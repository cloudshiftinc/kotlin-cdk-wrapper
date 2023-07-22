@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnMitigationAction

@CdkDslMarker
public class CfnMitigationActionUpdateDeviceCertificateParamsPropertyDsl {
  private val cdkBuilder: CfnMitigationAction.UpdateDeviceCertificateParamsProperty.Builder =
      CfnMitigationAction.UpdateDeviceCertificateParamsProperty.builder()

  /**
   * @param action The action that you want to apply to the device certificate. 
   * The only supported value is `DEACTIVATE` .
   */
  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  public fun build(): CfnMitigationAction.UpdateDeviceCertificateParamsProperty = cdkBuilder.build()
}
