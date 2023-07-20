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

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.greengrassv2.CfnDeployment
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnDeploymentIoTJobAbortCriteriaPropertyDsl {
    private val cdkBuilder: CfnDeployment.IoTJobAbortCriteriaProperty.Builder =
        CfnDeployment.IoTJobAbortCriteriaProperty.builder()

    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    public fun failureType(failureType: String) {
        cdkBuilder.failureType(failureType)
    }

    public fun minNumberOfExecutedThings(minNumberOfExecutedThings: Number) {
        cdkBuilder.minNumberOfExecutedThings(minNumberOfExecutedThings)
    }

    public fun thresholdPercentage(thresholdPercentage: Number) {
        cdkBuilder.thresholdPercentage(thresholdPercentage)
    }

    public fun build(): CfnDeployment.IoTJobAbortCriteriaProperty = cdkBuilder.build()
}
