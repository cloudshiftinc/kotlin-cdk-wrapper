@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnMitigationAction

/**
 * Parameters to define a mitigation action that changes the state of the device certificate to
 * inactive.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * UpdateDeviceCertificateParamsProperty updateDeviceCertificateParamsProperty =
 * UpdateDeviceCertificateParamsProperty.builder()
 * .action("action")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-updatedevicecertificateparams.html)
 */
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
