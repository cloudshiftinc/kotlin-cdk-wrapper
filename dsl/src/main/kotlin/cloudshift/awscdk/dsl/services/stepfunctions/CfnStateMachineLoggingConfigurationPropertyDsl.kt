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
