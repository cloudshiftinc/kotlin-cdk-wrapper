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
public class CfnPipelineParameterValuePropertyDsl {
    private val cdkBuilder: CfnPipeline.ParameterValueProperty.Builder =
        CfnPipeline.ParameterValueProperty.builder()

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
    }

    public fun build(): CfnPipeline.ParameterValueProperty = cdkBuilder.build()
}
