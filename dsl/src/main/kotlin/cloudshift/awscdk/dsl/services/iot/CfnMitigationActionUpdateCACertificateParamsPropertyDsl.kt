@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnMitigationAction

/**
 * Parameters to define a mitigation action that changes the state of the CA certificate to
 * inactive.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * UpdateCACertificateParamsProperty updateCACertificateParamsProperty =
 * UpdateCACertificateParamsProperty.builder()
 * .action("action")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-updatecacertificateparams.html)
 */
@CdkDslMarker
public class CfnMitigationActionUpdateCACertificateParamsPropertyDsl {
  private val cdkBuilder: CfnMitigationAction.UpdateCACertificateParamsProperty.Builder =
      CfnMitigationAction.UpdateCACertificateParamsProperty.builder()

  /**
   * @param action The action that you want to apply to the CA certificate. 
   * The only supported value is `DEACTIVATE` .
   */
  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  public fun build(): CfnMitigationAction.UpdateCACertificateParamsProperty = cdkBuilder.build()
}
