@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnMitigationAction

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
