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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping
import kotlin.Number

@CdkDslMarker
public class CfnEventSourceMappingScalingConfigPropertyDsl {
    private val cdkBuilder: CfnEventSourceMapping.ScalingConfigProperty.Builder =
        CfnEventSourceMapping.ScalingConfigProperty.builder()

    public fun maximumConcurrency(maximumConcurrency: Number) {
        cdkBuilder.maximumConcurrency(maximumConcurrency)
    }

    public fun build(): CfnEventSourceMapping.ScalingConfigProperty = cdkBuilder.build()
}
