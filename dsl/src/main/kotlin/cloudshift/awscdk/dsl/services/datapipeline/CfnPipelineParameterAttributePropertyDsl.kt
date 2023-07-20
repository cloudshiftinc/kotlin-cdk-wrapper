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

package cloudshift.awscdk.dsl.services.datapipeline

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.datapipeline.CfnPipeline
import kotlin.String

@CdkDslMarker
public class CfnPipelineParameterAttributePropertyDsl {
    private val cdkBuilder: CfnPipeline.ParameterAttributeProperty.Builder =
        CfnPipeline.ParameterAttributeProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
    }

    public fun build(): CfnPipeline.ParameterAttributeProperty = cdkBuilder.build()
}
