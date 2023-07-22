@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnMitigationAction

/**
 * Parameters used when defining a mitigation action that enable AWS IoT Core logging.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * EnableIoTLoggingParamsProperty enableIoTLoggingParamsProperty =
 * EnableIoTLoggingParamsProperty.builder()
 * .logLevel("logLevel")
 * .roleArnForLogging("roleArnForLogging")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-enableiotloggingparams.html)
 */
@CdkDslMarker
public class CfnMitigationActionEnableIoTLoggingParamsPropertyDsl {
  private val cdkBuilder: CfnMitigationAction.EnableIoTLoggingParamsProperty.Builder =
      CfnMitigationAction.EnableIoTLoggingParamsProperty.builder()

  /**
   * @param logLevel Specifies the type of information to be logged. 
   */
  public fun logLevel(logLevel: String) {
    cdkBuilder.logLevel(logLevel)
  }

  /**
   * @param roleArnForLogging The Amazon Resource Name (ARN) of the IAM role used for logging. 
   */
  public fun roleArnForLogging(roleArnForLogging: String) {
    cdkBuilder.roleArnForLogging(roleArnForLogging)
  }

  public fun build(): CfnMitigationAction.EnableIoTLoggingParamsProperty = cdkBuilder.build()
}
