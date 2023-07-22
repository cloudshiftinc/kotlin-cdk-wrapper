@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnTypeActivation

@CdkDslMarker
public class CfnTypeActivationLoggingConfigPropertyDsl {
  private val cdkBuilder: CfnTypeActivation.LoggingConfigProperty.Builder =
      CfnTypeActivation.LoggingConfigProperty.builder()

  /**
   * @param logGroupName The Amazon CloudWatch Logs group to which CloudFormation sends error
   * logging information when invoking the extension's handlers.
   */
  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  /**
   * @param logRoleArn The Amazon Resource Name (ARN) of the role that CloudFormation should assume
   * when sending log entries to CloudWatch Logs.
   */
  public fun logRoleArn(logRoleArn: String) {
    cdkBuilder.logRoleArn(logRoleArn)
  }

  public fun build(): CfnTypeActivation.LoggingConfigProperty = cdkBuilder.build()
}
