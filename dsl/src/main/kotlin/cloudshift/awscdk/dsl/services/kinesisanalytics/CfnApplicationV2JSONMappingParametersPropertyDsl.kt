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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
import kotlin.String

@CdkDslMarker
public class CfnApplicationV2JSONMappingParametersPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.JSONMappingParametersProperty.Builder =
        CfnApplicationV2.JSONMappingParametersProperty.builder()

    public fun recordRowPath(recordRowPath: String) {
        cdkBuilder.recordRowPath(recordRowPath)
    }

    public fun build(): CfnApplicationV2.JSONMappingParametersProperty = cdkBuilder.build()
}
