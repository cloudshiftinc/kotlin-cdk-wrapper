@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAlert
import software.constructs.Construct

@CdkDslMarker
public class CfnAlertDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAlert.Builder = CfnAlert.Builder.create(scope, id)

  /**
   * Action that will be triggered when there is an alert.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-action)
   * @param action Action that will be triggered when there is an alert. 
   */
  public fun action(action: IResolvable) {
    cdkBuilder.action(action)
  }

  /**
   * Action that will be triggered when there is an alert.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-action)
   * @param action Action that will be triggered when there is an alert. 
   */
  public fun action(action: CfnAlert.ActionProperty) {
    cdkBuilder.action(action)
  }

  /**
   * A description of the alert.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-alertdescription)
   * @param alertDescription A description of the alert. 
   */
  public fun alertDescription(alertDescription: String) {
    cdkBuilder.alertDescription(alertDescription)
  }

  /**
   * The name of the alert.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-alertname)
   * @param alertName The name of the alert. 
   */
  public fun alertName(alertName: String) {
    cdkBuilder.alertName(alertName)
  }

  /**
   * An integer from 0 to 100 specifying the alert sensitivity threshold.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-alertsensitivitythreshold)
   * @param alertSensitivityThreshold An integer from 0 to 100 specifying the alert sensitivity
   * threshold. 
   */
  public fun alertSensitivityThreshold(alertSensitivityThreshold: Number) {
    cdkBuilder.alertSensitivityThreshold(alertSensitivityThreshold)
  }

  /**
   * The ARN of the detector to which the alert is attached.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-anomalydetectorarn)
   * @param anomalyDetectorArn The ARN of the detector to which the alert is attached. 
   */
  public fun anomalyDetectorArn(anomalyDetectorArn: String) {
    cdkBuilder.anomalyDetectorArn(anomalyDetectorArn)
  }

  public fun build(): CfnAlert = cdkBuilder.build()
}
