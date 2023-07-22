@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine

/**
 * Defines what execution history events are logged and where they are logged.
 *
 * Step Functions provides the log levels — `OFF` , `ALL` , `ERROR` , and `FATAL` . No event types
 * log when set to `OFF` and all event types do when set to `ALL` .
 *
 *
 * By default, the `level` is set to `OFF` . For more information see [Log
 * Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the AWS
 * Step Functions User Guide.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.*;
 * LoggingConfigurationProperty loggingConfigurationProperty =
 * LoggingConfigurationProperty.builder()
 * .destinations(List.of(LogDestinationProperty.builder()
 * .cloudWatchLogsLogGroup(CloudWatchLogsLogGroupProperty.builder()
 * .logGroupArn("logGroupArn")
 * .build())
 * .build()))
 * .includeExecutionData(false)
 * .level("level")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-loggingconfiguration.html)
 */
@CdkDslMarker
public class CfnStateMachineLoggingConfigurationPropertyDsl {
  private val cdkBuilder: CfnStateMachine.LoggingConfigurationProperty.Builder =
      CfnStateMachine.LoggingConfigurationProperty.builder()

  private val _destinations: MutableList<Any> = mutableListOf()

  /**
   * @param destinations An array of objects that describes where your execution history events will
   * be logged.
   * Limited to size 1. Required, if your log level is not set to `OFF` .
   */
  public fun destinations(vararg destinations: Any) {
    _destinations.addAll(listOf(*destinations))
  }

  /**
   * @param destinations An array of objects that describes where your execution history events will
   * be logged.
   * Limited to size 1. Required, if your log level is not set to `OFF` .
   */
  public fun destinations(destinations: Collection<Any>) {
    _destinations.addAll(destinations)
  }

  /**
   * @param destinations An array of objects that describes where your execution history events will
   * be logged.
   * Limited to size 1. Required, if your log level is not set to `OFF` .
   */
  public fun destinations(destinations: IResolvable) {
    cdkBuilder.destinations(destinations)
  }

  /**
   * @param includeExecutionData Determines whether execution data is included in your log.
   * When set to `false` , data is excluded.
   */
  public fun includeExecutionData(includeExecutionData: Boolean) {
    cdkBuilder.includeExecutionData(includeExecutionData)
  }

  /**
   * @param includeExecutionData Determines whether execution data is included in your log.
   * When set to `false` , data is excluded.
   */
  public fun includeExecutionData(includeExecutionData: IResolvable) {
    cdkBuilder.includeExecutionData(includeExecutionData)
  }

  /**
   * @param level Defines which category of execution history events are logged.
   */
  public fun level(level: String) {
    cdkBuilder.level(level)
  }

  public fun build(): CfnStateMachine.LoggingConfigurationProperty {
    if(_destinations.isNotEmpty()) cdkBuilder.destinations(_destinations)
    return cdkBuilder.build()
  }
}
