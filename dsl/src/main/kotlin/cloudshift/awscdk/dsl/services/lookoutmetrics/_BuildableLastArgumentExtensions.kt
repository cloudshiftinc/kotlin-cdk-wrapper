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

import software.amazon.awscdk.services.lookoutmetrics.CfnAlert
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector
import kotlin.Unit

public inline fun CfnAlert.setAction(block: CfnAlertActionPropertyDsl.() -> Unit = {}) {
    val builder = CfnAlertActionPropertyDsl()
    builder.apply(block)
    return setAction(builder.build())
}

public inline fun CfnAnomalyDetector.setAnomalyDetectorConfig(
    block: CfnAnomalyDetectorAnomalyDetectorConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnAnomalyDetectorAnomalyDetectorConfigPropertyDsl()
    builder.apply(block)
    return setAnomalyDetectorConfig(builder.build())
}
