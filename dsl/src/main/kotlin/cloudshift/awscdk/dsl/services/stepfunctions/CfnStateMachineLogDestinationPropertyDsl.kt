@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine

/**
 * Defines a destination for `LoggingConfiguration` .
 *
 *
 * For more information on logging with `EXPRESS` workflows, see [Logging Express Workflows Using
 * CloudWatch Logs](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html) .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.*;
 * LogDestinationProperty logDestinationProperty = LogDestinationProperty.builder()
 * .cloudWatchLogsLogGroup(CloudWatchLogsLogGroupProperty.builder()
 * .logGroupArn("logGroupArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-logdestination.html)
 */
@CdkDslMarker
public class CfnStateMachineLogDestinationPropertyDsl {
  private val cdkBuilder: CfnStateMachine.LogDestinationProperty.Builder =
      CfnStateMachine.LogDestinationProperty.builder()

  /**
   * @param cloudWatchLogsLogGroup An object describing a CloudWatch log group.
   * For more information, see
   * [AWS::Logs::LogGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html)
   * in the AWS CloudFormation User Guide.
   */
  public fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: IResolvable) {
    cdkBuilder.cloudWatchLogsLogGroup(cloudWatchLogsLogGroup)
  }

  /**
   * @param cloudWatchLogsLogGroup An object describing a CloudWatch log group.
   * For more information, see
   * [AWS::Logs::LogGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loggroup.html)
   * in the AWS CloudFormation User Guide.
   */
  public
      fun cloudWatchLogsLogGroup(cloudWatchLogsLogGroup: CfnStateMachine.CloudWatchLogsLogGroupProperty) {
    cdkBuilder.cloudWatchLogsLogGroup(cloudWatchLogsLogGroup)
  }

  public fun build(): CfnStateMachine.LogDestinationProperty = cdkBuilder.build()
}
