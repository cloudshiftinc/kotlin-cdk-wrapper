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
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput
import kotlin.String

@CdkDslMarker
public class CfnApplicationOutputDestinationSchemaPropertyDsl {
    private val cdkBuilder: CfnApplicationOutput.DestinationSchemaProperty.Builder =
        CfnApplicationOutput.DestinationSchemaProperty.builder()

    public fun recordFormatType(recordFormatType: String) {
        cdkBuilder.recordFormatType(recordFormatType)
    }

    public fun build(): CfnApplicationOutput.DestinationSchemaProperty = cdkBuilder.build()
}
