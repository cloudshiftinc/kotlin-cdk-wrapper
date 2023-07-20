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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import kotlin.Number

@CdkDslMarker
public class CfnVirtualNodeOutlierDetectionPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.OutlierDetectionProperty.Builder =
        CfnVirtualNode.OutlierDetectionProperty.builder()

    public fun baseEjectionDuration(baseEjectionDuration: IResolvable) {
        cdkBuilder.baseEjectionDuration(baseEjectionDuration)
    }

    public fun baseEjectionDuration(baseEjectionDuration: CfnVirtualNode.DurationProperty) {
        cdkBuilder.baseEjectionDuration(baseEjectionDuration)
    }

    public fun interval(interval: IResolvable) {
        cdkBuilder.interval(interval)
    }

    public fun interval(interval: CfnVirtualNode.DurationProperty) {
        cdkBuilder.interval(interval)
    }

    public fun maxEjectionPercent(maxEjectionPercent: Number) {
        cdkBuilder.maxEjectionPercent(maxEjectionPercent)
    }

    public fun maxServerErrors(maxServerErrors: Number) {
        cdkBuilder.maxServerErrors(maxServerErrors)
    }

    public fun build(): CfnVirtualNode.OutlierDetectionProperty = cdkBuilder.build()
}
