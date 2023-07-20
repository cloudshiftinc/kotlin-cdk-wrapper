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

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pinpoint.CfnSegment
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnSegmentSourceSegmentsPropertyDsl {
    private val cdkBuilder: CfnSegment.SourceSegmentsProperty.Builder =
        CfnSegment.SourceSegmentsProperty.builder()

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun version(version: Number) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnSegment.SourceSegmentsProperty = cdkBuilder.build()
}
