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

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appflow.CfnFlow
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnFlowAggregationConfigPropertyDsl {
    private val cdkBuilder: CfnFlow.AggregationConfigProperty.Builder =
        CfnFlow.AggregationConfigProperty.builder()

    public fun aggregationType(aggregationType: String) {
        cdkBuilder.aggregationType(aggregationType)
    }

    public fun targetFileSize(targetFileSize: Number) {
        cdkBuilder.targetFileSize(targetFileSize)
    }

    public fun build(): CfnFlow.AggregationConfigProperty = cdkBuilder.build()
}
