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
import software.constructs.Construct
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnAlertDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAlert.Builder = CfnAlert.Builder.create(scope, id)

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

    public fun build(): CfnAlert = cdkBuilder.build()
}
