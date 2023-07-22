@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudformation.CfnTypeActivation

/**
 * Contains logging configuration information for an extension.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudformation.*;
 * LoggingConfigProperty loggingConfigProperty = LoggingConfigProperty.builder()
 * .logGroupName("logGroupName")
 * .logRoleArn("logRoleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-typeactivation-loggingconfig.html)
 */
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
