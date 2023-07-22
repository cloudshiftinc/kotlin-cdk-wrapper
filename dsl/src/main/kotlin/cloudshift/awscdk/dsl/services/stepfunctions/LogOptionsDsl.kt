@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.stepfunctions.LogLevel
import software.amazon.awscdk.services.stepfunctions.LogOptions

@CdkDslMarker
public class LogOptionsDsl {
  private val cdkBuilder: LogOptions.Builder = LogOptions.builder()

  /**
   * @param destination The log group where the execution history events will be logged. 
   */
  public fun destination(destination: ILogGroup) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param includeExecutionData Determines whether execution data is included in your log.
   */
  public fun includeExecutionData(includeExecutionData: Boolean) {
    cdkBuilder.includeExecutionData(includeExecutionData)
  }

  /**
   * @param level Defines which category of execution history events are logged.
   */
  public fun level(level: LogLevel) {
    cdkBuilder.level(level)
  }

  public fun build(): LogOptions = cdkBuilder.build()
}
