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
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2
import kotlin.String

@CdkDslMarker
public class CfnApplicationOutputV2DestinationSchemaPropertyDsl {
    private val cdkBuilder: CfnApplicationOutputV2.DestinationSchemaProperty.Builder =
        CfnApplicationOutputV2.DestinationSchemaProperty.builder()

    public fun recordFormatType(recordFormatType: String) {
        cdkBuilder.recordFormatType(recordFormatType)
    }

    public fun build(): CfnApplicationOutputV2.DestinationSchemaProperty = cdkBuilder.build()
}
