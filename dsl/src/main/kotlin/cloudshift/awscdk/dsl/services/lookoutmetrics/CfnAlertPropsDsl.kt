@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAlert
import software.amazon.awscdk.services.lookoutmetrics.CfnAlertProps

@CdkDslMarker
public class CfnAlertPropsDsl {
  private val cdkBuilder: CfnAlertProps.Builder = CfnAlertProps.builder()

  /**
   * @param action Action that will be triggered when there is an alert. 
   */
  public fun action(action: IResolvable) {
    cdkBuilder.action(action)
  }

  /**
   * @param action Action that will be triggered when there is an alert. 
   */
  public fun action(action: CfnAlert.ActionProperty) {
    cdkBuilder.action(action)
  }

  /**
   * @param alertDescription A description of the alert.
   */
  public fun alertDescription(alertDescription: String) {
    cdkBuilder.alertDescription(alertDescription)
  }

  /**
   * @param alertName The name of the alert.
   */
  public fun alertName(alertName: String) {
    cdkBuilder.alertName(alertName)
  }

  /**
   * @param alertSensitivityThreshold An integer from 0 to 100 specifying the alert sensitivity
   * threshold. 
   */
  public fun alertSensitivityThreshold(alertSensitivityThreshold: Number) {
    cdkBuilder.alertSensitivityThreshold(alertSensitivityThreshold)
  }

  /**
   * @param anomalyDetectorArn The ARN of the detector to which the alert is attached. 
   */
  public fun anomalyDetectorArn(anomalyDetectorArn: String) {
    cdkBuilder.anomalyDetectorArn(anomalyDetectorArn)
  }

  public fun build(): CfnAlertProps = cdkBuilder.build()
}
