@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnApi

@CdkDslMarker
public class CfnApiCanarySettingPropertyDsl {
  private val cdkBuilder: CfnApi.CanarySettingProperty.Builder =
      CfnApi.CanarySettingProperty.builder()

  /**
   * @param deploymentId the value to be set.
   */
  public fun deploymentId(deploymentId: String) {
    cdkBuilder.deploymentId(deploymentId)
  }

  /**
   * @param percentTraffic the value to be set.
   */
  public fun percentTraffic(percentTraffic: Number) {
    cdkBuilder.percentTraffic(percentTraffic)
  }

  /**
   * @param stageVariableOverrides the value to be set.
   */
  public fun stageVariableOverrides(stageVariableOverrides: Map<String, String>) {
    cdkBuilder.stageVariableOverrides(stageVariableOverrides)
  }

  /**
   * @param stageVariableOverrides the value to be set.
   */
  public fun stageVariableOverrides(stageVariableOverrides: IResolvable) {
    cdkBuilder.stageVariableOverrides(stageVariableOverrides)
  }

  /**
   * @param useStageCache the value to be set.
   */
  public fun useStageCache(useStageCache: Boolean) {
    cdkBuilder.useStageCache(useStageCache)
  }

  /**
   * @param useStageCache the value to be set.
   */
  public fun useStageCache(useStageCache: IResolvable) {
    cdkBuilder.useStageCache(useStageCache)
  }

  public fun build(): CfnApi.CanarySettingProperty = cdkBuilder.build()
}
