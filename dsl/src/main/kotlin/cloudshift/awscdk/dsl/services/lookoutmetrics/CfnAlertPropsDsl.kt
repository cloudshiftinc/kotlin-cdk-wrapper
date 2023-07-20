@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAlert
import software.amazon.awscdk.services.lookoutmetrics.CfnAlertProps
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnAlertPropsDsl {
    private val cdkBuilder: CfnAlertProps.Builder = CfnAlertProps.builder()

    public fun action(action: IResolvable) {
        cdkBuilder.action(action)
    }

    public fun action(action: CfnAlert.ActionProperty) {
        cdkBuilder.action(action)
    }

    public fun alertDescription(alertDescription: String) {
        cdkBuilder.alertDescription(alertDescription)
    }

    public fun alertName(alertName: String) {
        cdkBuilder.alertName(alertName)
    }

    public fun alertSensitivityThreshold(alertSensitivityThreshold: Number) {
        cdkBuilder.alertSensitivityThreshold(alertSensitivityThreshold)
    }

    public fun anomalyDetectorArn(anomalyDetectorArn: String) {
        cdkBuilder.anomalyDetectorArn(anomalyDetectorArn)
    }

    public fun build(): CfnAlertProps = cdkBuilder.build()
}
