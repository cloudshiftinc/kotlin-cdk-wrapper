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

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAlert
import software.amazon.awscdk.services.lookoutmetrics.CfnAlertProps

/**
 * Properties for defining a `CfnAlert`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lookoutmetrics.*;
 * CfnAlertProps cfnAlertProps = CfnAlertProps.builder()
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
public class CfnAlertPropsDsl {
    private val cdkBuilder: CfnAlertProps.Builder = CfnAlertProps.builder()

    /** @param action Action that will be triggered when there is an alert. */
    public fun action(action: IResolvable) {
        cdkBuilder.action(action)
    }

    /** @param action Action that will be triggered when there is an alert. */
    public fun action(action: CfnAlert.ActionProperty) {
        cdkBuilder.action(action)
    }

    /** @param alertDescription A description of the alert. */
    public fun alertDescription(alertDescription: String) {
        cdkBuilder.alertDescription(alertDescription)
    }

    /** @param alertName The name of the alert. */
    public fun alertName(alertName: String) {
        cdkBuilder.alertName(alertName)
    }

    /**
     * @param alertSensitivityThreshold An integer from 0 to 100 specifying the alert sensitivity
     *   threshold.
     */
    public fun alertSensitivityThreshold(alertSensitivityThreshold: Number) {
        cdkBuilder.alertSensitivityThreshold(alertSensitivityThreshold)
    }

    /** @param anomalyDetectorArn The ARN of the detector to which the alert is attached. */
    public fun anomalyDetectorArn(anomalyDetectorArn: String) {
        cdkBuilder.anomalyDetectorArn(anomalyDetectorArn)
    }

    public fun build(): CfnAlertProps = cdkBuilder.build()
}
