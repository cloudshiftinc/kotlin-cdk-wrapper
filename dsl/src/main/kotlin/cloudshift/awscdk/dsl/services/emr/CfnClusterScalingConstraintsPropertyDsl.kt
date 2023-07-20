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

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.emr.CfnCluster
import kotlin.Number

@CdkDslMarker
public class CfnClusterScalingConstraintsPropertyDsl {
    private val cdkBuilder: CfnCluster.ScalingConstraintsProperty.Builder =
        CfnCluster.ScalingConstraintsProperty.builder()

    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    public fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
    }

    public fun build(): CfnCluster.ScalingConstraintsProperty = cdkBuilder.build()
}
