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

  public fun destinations(vararg destinations: Any) {
    _destinations.addAll(listOf(*destinations))
  }

  public fun destinations(destinations: Collection<Any>) {
    _destinations.addAll(destinations)
  }

  public fun destinations(destinations: IResolvable) {
    cdkBuilder.destinations(destinations)
  }

  public fun includeExecutionData(includeExecutionData: Boolean) {
    cdkBuilder.includeExecutionData(includeExecutionData)
  }

  public fun includeExecutionData(includeExecutionData: IResolvable) {
    cdkBuilder.includeExecutionData(includeExecutionData)
  }

  public fun level(level: String) {
    cdkBuilder.level(level)
  }

  public fun build(): CfnStateMachine.LoggingConfigurationProperty {
    if(_destinations.isNotEmpty()) cdkBuilder.destinations(_destinations)
    return cdkBuilder.build()
  }
}
