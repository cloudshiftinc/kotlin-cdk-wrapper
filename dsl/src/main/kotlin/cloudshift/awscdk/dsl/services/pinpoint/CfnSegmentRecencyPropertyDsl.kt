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
import kotlin.String

@CdkDslMarker
public class CfnSegmentRecencyPropertyDsl {
    private val cdkBuilder: CfnSegment.RecencyProperty.Builder = CfnSegment.RecencyProperty.builder()

    public fun duration(duration: String) {
        cdkBuilder.duration(duration)
    }

    public fun recencyType(recencyType: String) {
        cdkBuilder.recencyType(recencyType)
    }

    public fun build(): CfnSegment.RecencyProperty = cdkBuilder.build()
}
