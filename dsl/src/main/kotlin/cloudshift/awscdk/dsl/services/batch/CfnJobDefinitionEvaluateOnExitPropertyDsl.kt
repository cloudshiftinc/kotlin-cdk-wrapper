@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionEvaluateOnExitPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.EvaluateOnExitProperty.Builder =
      CfnJobDefinition.EvaluateOnExitProperty.builder()

  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  public fun onExitCode(onExitCode: String) {
    cdkBuilder.onExitCode(onExitCode)
  }

  public fun onReason(onReason: String) {
    cdkBuilder.onReason(onReason)
  }

  public fun onStatusReason(onStatusReason: String) {
    cdkBuilder.onStatusReason(onStatusReason)
  }

  public fun build(): CfnJobDefinition.EvaluateOnExitProperty = cdkBuilder.build()
}
