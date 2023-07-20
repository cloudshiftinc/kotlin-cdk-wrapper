@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.evidently.CfnExperiment

@CdkDslMarker
public class CfnExperimentRunningStatusObjectPropertyDsl {
  private val cdkBuilder: CfnExperiment.RunningStatusObjectProperty.Builder =
      CfnExperiment.RunningStatusObjectProperty.builder()

  public fun analysisCompleteTime(analysisCompleteTime: String) {
    cdkBuilder.analysisCompleteTime(analysisCompleteTime)
  }

  public fun desiredState(desiredState: String) {
    cdkBuilder.desiredState(desiredState)
  }

  public fun reason(reason: String) {
    cdkBuilder.reason(reason)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnExperiment.RunningStatusObjectProperty = cdkBuilder.build()
}
