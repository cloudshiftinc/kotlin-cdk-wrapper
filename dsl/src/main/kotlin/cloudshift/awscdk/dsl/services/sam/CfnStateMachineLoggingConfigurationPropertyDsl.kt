@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnStateMachine

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-loggingconfiguration.html)
 */
@CdkDslMarker
public class CfnStateMachineLoggingConfigurationPropertyDsl {
  private val cdkBuilder: CfnStateMachine.LoggingConfigurationProperty.Builder =
      CfnStateMachine.LoggingConfigurationProperty.builder()

  private val _destinations: MutableList<Any> = mutableListOf()

  /**
   * @param destinations the value to be set. 
   */
  public fun destinations(vararg destinations: Any) {
    _destinations.addAll(listOf(*destinations))
  }

  /**
   * @param destinations the value to be set. 
   */
  public fun destinations(destinations: Collection<Any>) {
    _destinations.addAll(destinations)
  }

  /**
   * @param destinations the value to be set. 
   */
  public fun destinations(destinations: IResolvable) {
    cdkBuilder.destinations(destinations)
  }

  /**
   * @param includeExecutionData the value to be set. 
   */
  public fun includeExecutionData(includeExecutionData: Boolean) {
    cdkBuilder.includeExecutionData(includeExecutionData)
  }

  /**
   * @param includeExecutionData the value to be set. 
   */
  public fun includeExecutionData(includeExecutionData: IResolvable) {
    cdkBuilder.includeExecutionData(includeExecutionData)
  }

  /**
   * @param level the value to be set. 
   */
  public fun level(level: String) {
    cdkBuilder.level(level)
  }

  public fun build(): CfnStateMachine.LoggingConfigurationProperty {
    if(_destinations.isNotEmpty()) cdkBuilder.destinations(_destinations)
    return cdkBuilder.build()
  }
}
