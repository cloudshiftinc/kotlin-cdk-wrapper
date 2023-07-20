@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnDeployment

@CdkDslMarker
public class CfnDeploymentDeploymentCanarySettingsPropertyDsl {
  private val cdkBuilder: CfnDeployment.DeploymentCanarySettingsProperty.Builder =
      CfnDeployment.DeploymentCanarySettingsProperty.builder()

  public fun percentTraffic(percentTraffic: Number) {
    cdkBuilder.percentTraffic(percentTraffic)
  }

  public fun stageVariableOverrides(stageVariableOverrides: Map<String, String>) {
    cdkBuilder.stageVariableOverrides(stageVariableOverrides)
  }

  public fun stageVariableOverrides(stageVariableOverrides: IResolvable) {
    cdkBuilder.stageVariableOverrides(stageVariableOverrides)
  }

  public fun useStageCache(useStageCache: Boolean) {
    cdkBuilder.useStageCache(useStageCache)
  }

  public fun useStageCache(useStageCache: IResolvable) {
    cdkBuilder.useStageCache(useStageCache)
  }

  public fun build(): CfnDeployment.DeploymentCanarySettingsProperty = cdkBuilder.build()
}
