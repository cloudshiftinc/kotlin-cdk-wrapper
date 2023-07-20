@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@CdkDslMarker
public class CfnAnomalyDetectorAppFlowConfigPropertyDsl {
  private val cdkBuilder: CfnAnomalyDetector.AppFlowConfigProperty.Builder =
      CfnAnomalyDetector.AppFlowConfigProperty.builder()

  public fun flowName(flowName: String) {
    cdkBuilder.flowName(flowName)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnAnomalyDetector.AppFlowConfigProperty = cdkBuilder.build()
}
