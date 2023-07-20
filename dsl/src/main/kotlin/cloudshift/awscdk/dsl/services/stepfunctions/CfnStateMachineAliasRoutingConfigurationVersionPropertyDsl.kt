@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.CfnStateMachineAlias

@CdkDslMarker
public class CfnStateMachineAliasRoutingConfigurationVersionPropertyDsl {
  private val cdkBuilder: CfnStateMachineAlias.RoutingConfigurationVersionProperty.Builder =
      CfnStateMachineAlias.RoutingConfigurationVersionProperty.builder()

  public fun stateMachineVersionArn(stateMachineVersionArn: String) {
    cdkBuilder.stateMachineVersionArn(stateMachineVersionArn)
  }

  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): CfnStateMachineAlias.RoutingConfigurationVersionProperty = cdkBuilder.build()
}
