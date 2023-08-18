@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.lookoutmetrics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAlert
import software.constructs.Construct

/**
 * The `AWS::LookoutMetrics::Alert` type creates an alert for an anomaly detector.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lookoutmetrics.*;
 * CfnAlert cfnAlert = CfnAlert.Builder.create(this, "MyCfnAlert")
 * .action(ActionProperty.builder()
 * .lambdaConfiguration(LambdaConfigurationProperty.builder()
 * .lambdaArn("lambdaArn")
 * .roleArn("roleArn")
 * .build())
 * .snsConfiguration(SNSConfigurationProperty.builder()
 * .roleArn("roleArn")
 * .snsTopicArn("snsTopicArn")
 * .build())
 * .build())
 * .alertSensitivityThreshold(123)
 * .anomalyDetectorArn("anomalyDetectorArn")
 * // the properties below are optional
 * .alertDescription("alertDescription")
 * .alertName("alertName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html)
 */
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
     *
     * @param action Action that will be triggered when there is an alert.
     */
    public fun action(action: IResolvable) {
        cdkBuilder.action(action)
    }

    /**
     * Action that will be triggered when there is an alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-action)
     *
     * @param action Action that will be triggered when there is an alert.
     */
    public fun action(action: CfnAlert.ActionProperty) {
        cdkBuilder.action(action)
    }

    /**
     * A description of the alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-alertdescription)
     *
     * @param alertDescription A description of the alert.
     */
    public fun alertDescription(alertDescription: String) {
        cdkBuilder.alertDescription(alertDescription)
    }

    /**
     * The name of the alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-alertname)
     *
     * @param alertName The name of the alert.
     */
    public fun alertName(alertName: String) {
        cdkBuilder.alertName(alertName)
    }

    /**
     * An integer from 0 to 100 specifying the alert sensitivity threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-alertsensitivitythreshold)
     *
     * @param alertSensitivityThreshold An integer from 0 to 100 specifying the alert sensitivity
     *   threshold.
     */
    public fun alertSensitivityThreshold(alertSensitivityThreshold: Number) {
        cdkBuilder.alertSensitivityThreshold(alertSensitivityThreshold)
    }

    /**
     * The ARN of the detector to which the alert is attached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lookoutmetrics-alert.html#cfn-lookoutmetrics-alert-anomalydetectorarn)
     *
     * @param anomalyDetectorArn The ARN of the detector to which the alert is attached.
     */
    public fun anomalyDetectorArn(anomalyDetectorArn: String) {
        cdkBuilder.anomalyDetectorArn(anomalyDetectorArn)
    }

    public fun build(): CfnAlert = cdkBuilder.build()
}
